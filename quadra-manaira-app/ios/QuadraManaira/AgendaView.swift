import SwiftUI

struct HomeView: View {
    let me: Profile
    @State private var alerts: [Alert]?
    @State private var conversations: [Conversation]?

    var body: some View {
        let visible = conversations?.filter { !me.blocked.contains($0.otherId) }
        TabView {
            AgendaView(me: me)
                .tabItem { Label("Agenda", systemImage: "calendar") }
            MuralView(me: me)
                .tabItem { Label("Mural", systemImage: "text.bubble") }
            ConversationsView(me: me, conversations: visible)
                .tabItem { Label("Conversas", systemImage: "bubble.left.and.bubble.right") }
                .badge(visible?.filter { $0.unread > 0 }.count ?? 0)
            AlertsView(me: me, alerts: alerts)
                .tabItem { Label("Alertas", systemImage: "bell") }
                .badge(alerts?.filter { !$0.read }.count ?? 0)
            ProfileView(me: me)
                .tabItem { Label("Perfil", systemImage: "person") }
        }
        .task(id: me.id) { for await a in Repo.alerts(me.id) { alerts = a } }
        .task(id: me.id) { for await c in Repo.conversations(me.id) { conversations = c } }
        .task(id: me.id) {
            AppDelegate.askForPush()
            await Repo.registerDevice()
        }
    }
}

/// Aviso curto que some sozinho.
struct Toast: ViewModifier {
    @Binding var text: String?
    func body(content: Content) -> some View {
        content.overlay(alignment: .bottom) {
            if let text {
                Text(text)
                    .padding(.horizontal, 16).padding(.vertical, 12)
                    .foregroundStyle(.white)
                    .background(Palette.tinta.opacity(0.92), in: Capsule())
                    .padding(.bottom, 90)
                    .transition(.move(edge: .bottom).combined(with: .opacity))
                    .task(id: text) {
                        try? await Task.sleep(for: .seconds(3))
                        withAnimation { self.text = nil }
                    }
            }
        }
        .animation(.snappy, value: text)
    }
}

extension View {
    func toast(_ text: Binding<String?>) -> some View { modifier(Toast(text: text)) }
}

private struct StartTime: Identifiable { let id: String }

struct AgendaView: View {
    let me: Profile
    @State private var bookings: [Booking]?
    @State private var day = Quadra.iso(Date())
    @State private var newAt: StartTime?
    @State private var toCancel: Booking?
    @State private var toast: String?
    @State private var showLocal = false

    var body: some View {
        let ofDay = bookings?.filter { $0.date == day } ?? []
        NavigationStack {
            VStack(spacing: 0) {
                WeatherBand { showLocal = true }
                DateStrip(selected: $day, busy: Set(bookings?.map(\.date) ?? []))
                Text(longDate(day)).font(.placar(22))
                    .frame(maxWidth: .infinity, alignment: .leading)
                    .padding(.horizontal, 20).padding(.bottom, 4)
                if bookings == nil {
                    ProgressView().frame(maxHeight: .infinity)
                } else {
                    DayTimeline(day: day, list: ofDay, myUid: me.id,
                                onFree: { newAt = StartTime(id: $0) },
                                onOpen: { if $0.organizerId == me.id { toCancel = $0 } })
                        .id(day) // trocar de dia refaz a animação dos blocos
                }
            }
            .background(Palette.concreto)
            .overlay(alignment: .bottomTrailing) {
                Button {
                    if let s = firstFreeStart(day: day, list: ofDay) { newAt = StartTime(id: s) } else { toast = "Não há horário livre neste dia." }
                } label: {
                    Label("Agendar", systemImage: "plus").font(.headline)
                        .padding(.horizontal, 22).padding(.vertical, 16)
                        .foregroundStyle(Palette.tinta)
                        .background(Palette.linha, in: RoundedRectangle(cornerRadius: 18, style: .continuous))
                        .shadow(color: .black.opacity(0.15), radius: 8, y: 4)
                }
                .padding(20)
            }
            .toast($toast)
            .toolbar(.hidden, for: .navigationBar)
            .navigationDestination(isPresented: $showLocal) { LocalView() }
            .sheet(item: $newAt) { s in
                BookingSheet(me: me, day: day, initialStart: s.id, dayBookings: ofDay) {
                    newAt = nil
                    toast = "Jogo agendado. Você recebe um lembrete 24 h antes."
                }
            }
            .alert("Cancelar seu jogo?", isPresented: Binding(get: { toCancel != nil }, set: { if !$0 { toCancel = nil } }), presenting: toCancel) { b in
                Button("Cancelar jogo", role: .destructive) {
                    Task {
                        do { try await Repo.cancel(b); toast = "Jogo cancelado. Horário liberado." } catch { toast = friendly(error) }
                    }
                }
                Button("Manter", role: .cancel) {}
            } message: { b in
                Text("\(b.sport.label) das \(b.start) às \(b.end). O horário fica livre para outra pessoa.")
            }
        }
        .task { for await b in Repo.bookings() { bookings = b } }
    }
}

func fitsSlot(day: String, start: Int, duration: Int, bookings: [Booking], now: Date = Date()) -> Bool {
    start + duration <= Quadra.close
        && bookingError(day: day, start: hhmm(start), end: hhmm(start + duration), now: now) == nil
        && !bookings.contains { overlaps(start, start + duration, minutes($0.start), minutes($0.end)) }
}

private func firstFreeStart(day: String, list: [Booking]) -> String? {
    stride(from: Quadra.open, to: Quadra.close, by: 30).first { fitsSlot(day: day, start: $0, duration: 30, bookings: list) }.map(hhmm)
}

/// Faixa do mar: clima na praia agora e a hora em que o sol nasceu (João Pessoa é onde ele nasce primeiro nas Américas).
private struct WeatherBand: View {
    let onLocal: () -> Void
    @State private var weather: Weather?
    @State private var failed = false

    var body: some View {
        HStack(alignment: .bottom) {
            VStack(alignment: .leading, spacing: 2) {
                Text("Praia de Manaíra").font(.placar(22))
                Group {
                    if let w = weather {
                        HStack(alignment: .bottom, spacing: 12) {
                            Text("\(w.tempC)°").font(.placar(56, relativeTo: .largeTitle))
                            VStack(alignment: .leading) {
                                Text(w.condition).fontWeight(.semibold)
                                Text("Vento de \(w.windKmh) km/h. Sol nasceu às \(w.sunrise).").font(.caption)
                            }
                            .padding(.bottom, 8)
                        }
                    } else {
                        Text(failed ? "Sem dados do clima agora." : "Olhando o céu…")
                    }
                }
                .frame(minHeight: 64, alignment: .bottomLeading) // a faixa não pula quando o clima chega
            }
            Spacer()
            Button(action: onLocal) { Image(systemName: "mappin.and.ellipse").font(.title2) }
                .accessibilityLabel("Como chegar na quadra")
                .padding(.bottom, 12)
        }
        .foregroundStyle(.white)
        .padding(.horizontal, 20).padding(.top, 8).padding(.bottom, 16)
        .background(Palette.blocoMeu.ignoresSafeArea(edges: .top))
        .task {
            do { weather = try await Repo.weather() } catch { failed = true }
        }
    }
}

private struct DateStrip: View {
    @Binding var selected: String
    let busy: Set<String>

    var body: some View {
        let today = Date()
        let days = (0..<14).compactMap { Quadra.calendar.date(byAdding: .day, value: $0, to: today) }
        ScrollView(.horizontal, showsIndicators: false) {
            HStack(spacing: 8) {
                ForEach(days, id: \.self) { d in
                    let iso = Quadra.iso(d)
                    let on = iso == selected
                    Button { selected = iso } label: {
                        VStack(spacing: 2) {
                            Text(iso == Quadra.iso(today) ? "Hoje" : weekday(d)).font(.caption.weight(.medium))
                            Text("\(Quadra.calendar.component(.day, from: d))").font(.placar(26))
                            // Ponto amarelo = já tem jogo marcado no dia.
                            Circle().fill(busy.contains(iso) ? Palette.linha : .clear).frame(width: 6, height: 6)
                        }
                        .frame(width: 54).padding(.vertical, 8)
                        .foregroundStyle(on ? .white : .primary)
                        .background(on ? Palette.mar : Palette.painel, in: RoundedRectangle(cornerRadius: 16, style: .continuous))
                    }
                    .buttonStyle(.plain)
                    .accessibilityAddTraits(on ? .isSelected : [])
                }
            }
            .padding(.horizontal, 16).padding(.vertical, 12)
        }
    }
}

/// O dia da quadra, das 06:00 às 22:00, desenhado como as linhas do piso. Os jogos "crescem" no lugar
/// quando o dia aparece; tocar num espaço livre abre o agendamento já naquele horário.
private struct DayTimeline: View {
    let day: String
    let list: [Booking]
    let myUid: String
    let onFree: (String) -> Void
    let onOpen: (Booking) -> Void
    private let hour: CGFloat = 64
    private let hours = (Quadra.close - Quadra.open) / 60

    var body: some View {
        let isToday = day == Quadra.iso(Date())
        let nowMin = isToday ? Quadra.nowMinutes() : -1
        ScrollViewReader { proxy in
            ScrollView {
                HStack(alignment: .top, spacing: 8) {
                    VStack(spacing: 0) {
                        ForEach(Quadra.open / 60..<Quadra.close / 60, id: \.self) { h in
                            Text(hhmm(h * 60)).font(.placar(16, relativeTo: .caption)).foregroundStyle(Palette.apagado)
                                .frame(height: hour, alignment: .top).offset(y: -9).id(h)
                        }
                    }
                    .frame(width: 48)
                    ZStack(alignment: .topLeading) {
                        Canvas { ctx, size in
                            if nowMin > Quadra.open {
                                let h = CGFloat(min(nowMin, Quadra.close) - Quadra.open) / 60 * hour
                                ctx.fill(Path(CGRect(x: 0, y: 0, width: size.width, height: h)), with: .color(Palette.passado.opacity(0.6)))
                            }
                            for i in 0...hours {
                                ctx.fill(Path(CGRect(x: 0, y: CGFloat(i) * hour, width: size.width, height: 1)), with: .color(Palette.traco))
                            }
                        }
                        .contentShape(Rectangle())
                        .onTapGesture { loc in
                            let m = Quadra.open + Int(loc.y / hour * 60) / 30 * 30
                            if m >= nowMin, m < Quadra.close, !list.contains(where: { overlaps(m, m + 30, minutes($0.start), minutes($0.end)) }) {
                                onFree(hhmm(m))
                            }
                        }
                        ForEach(Array(list.enumerated()), id: \.element.id) { i, b in
                            GrowingBlock(b: b, index: i, mine: b.organizerId == myUid, hour: hour) { onOpen(b) }
                        }
                        if nowMin >= Quadra.open, nowMin <= Quadra.close {
                            // Linha amarela do "agora".
                            Rectangle().fill(Palette.linha).frame(height: 2)
                                .offset(y: CGFloat(nowMin - Quadra.open) / 60 * hour - 1)
                                .allowsHitTesting(false)
                        }
                    }
                    .frame(height: hour * CGFloat(hours))
                }
                .padding(.leading, 12).padding(.trailing, 16).padding(.top, 8).padding(.bottom, 100)
            }
            .onAppear { proxy.scrollTo(isToday ? max(nowMin / 60 - 1, Quadra.open / 60) : 17, anchor: .top) }
        }
    }
}

/// O bloco cresce de cima para baixo ao aparecer, em cascata (índice × 60 ms). Sem animação se o
/// sistema pede movimento reduzido.
private struct GrowingBlock: View {
    let b: Booking
    let index: Int
    let mine: Bool
    let hour: CGFloat
    let action: () -> Void
    @State private var shown = false
    @Environment(\.accessibilityReduceMotion) private var reduceMotion

    var body: some View {
        Button(action: action) {
            HStack(spacing: 0) {
                // Faixa amarela = jogo seu.
                Rectangle().fill(mine ? Palette.linha : .clear).frame(width: 6)
                VStack(alignment: .leading, spacing: 2) {
                    HStack(alignment: .firstTextBaseline) {
                        Text("\(b.sport.emoji) \(b.sport.label)").font(.placar(20, relativeTo: .headline))
                        Text("\(b.start)–\(b.end)").font(.placar(16, relativeTo: .subheadline)).opacity(0.8)
                    }
                    Text(mine ? "Seu jogo. Toque para cancelar." : "Com \(b.organizerName)" + (b.notes.isEmpty ? "" : ". \(b.notes)"))
                        .font(.caption).opacity(0.85).lineLimit(2)
                }
                .padding(.horizontal, 12).padding(.vertical, 6)
                Spacer(minLength: 0)
            }
            .foregroundStyle(.white)
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            .background(mine ? Palette.blocoMeu : Palette.marFundo)
            .clipShape(RoundedRectangle(cornerRadius: 12, style: .continuous))
        }
        .buttonStyle(.plain)
        .disabled(!mine)
        .accessibilityHint(mine ? "Cancelar jogo" : "")
        .frame(height: CGFloat(minutes(b.end) - minutes(b.start)) / 60 * hour - 4)
        .scaleEffect(x: 1, y: shown ? 1 : 0.01, anchor: .top)
        .opacity(shown ? 1 : 0)
        .offset(y: CGFloat(minutes(b.start) - Quadra.open) / 60 * hour + 2)
        .onAppear {
            if reduceMotion { shown = true } else {
                withAnimation(.easeOut(duration: 0.42).delay(Double(index) * 0.06)) { shown = true }
            }
        }
    }
}

private let DURATIONS = [30, 60, 90, 120, 150, 180]
private func durationLabel(_ m: Int) -> String { m < 60 ? "\(m) min" : m % 60 == 0 ? "\(m / 60) h" : "\(m / 60)h\(m % 60)" }

private struct BookingSheet: View {
    let me: Profile
    let day: String
    let dayBookings: [Booking]
    let onBooked: () -> Void
    @State private var start: Int
    @State private var duration: Int
    @State private var sport: Sport
    @State private var notes = ""
    @State private var busy = Busy()

    init(me: Profile, day: String, initialStart: String, dayBookings: [Booking], onBooked: @escaping () -> Void) {
        self.me = me
        self.day = day
        self.dayBookings = dayBookings
        self.onBooked = onBooked
        let s = minutes(initialStart)
        _start = State(initialValue: s)
        _duration = State(initialValue: DURATIONS.last { $0 <= 90 && fitsSlot(day: day, start: s, duration: $0, bookings: dayBookings) } ?? 30)
        _sport = State(initialValue: me.sport)
    }

    private func fits(_ s: Int, _ d: Int) -> Bool { fitsSlot(day: day, start: s, duration: d, bookings: dayBookings) }

    var body: some View {
        let starts = stride(from: Quadra.open, to: Quadra.close, by: 30).filter { fits($0, 30) }
        ScrollView {
            VStack(alignment: .leading, spacing: 16) {
                VStack(alignment: .leading, spacing: 2) {
                    Text("Agendar").font(.placar(30))
                    Text(longDate(day)).foregroundStyle(Palette.apagado)
                }
                Labeled(label: "Começa às") {
                    ScrollViewReader { proxy in
                        Chips(options: starts, selected: Binding(get: { start }, set: { s in
                            start = s
                            if !fits(s, duration) { duration = DURATIONS.last { ($0 <= duration && fits(s, $0)) || $0 == 30 } ?? 30 }
                        })) { hhmm($0) }
                        .onAppear { proxy.scrollTo(start, anchor: .center) }
                    }
                }
                Labeled(label: "Duração") {
                    Chips(options: DURATIONS, selected: $duration, label: durationLabel, enabled: { fits(start, $0) })
                }
                Labeled(label: "Modalidade") { SportChips(selected: $sport) }
                Labeled(label: "Recado para a galera (opcional)") {
                    TextField("Ex.: falta um para fechar o time", text: $notes, axis: .vertical)
                        .lineLimit(2...4).field()
                        .onChange(of: notes) { _, n in if n.count > 300 { notes = String(n.prefix(300)) } }
                }
                ErrorText(text: busy.error)
                BigButton(title: "Agendar das \(hhmm(start)) às \(hhmm(start + duration))", busy: busy.running) {
                    busy.run {
                        try await Repo.book(me: me, day: day, start: hhmm(start), end: hhmm(start + duration), sport: sport, notes: notes)
                        onBooked()
                    }
                }
                .disabled(!fits(start, duration))
            }
            .padding(20)
        }
        .presentationDetents([.large])
        .presentationDragIndicator(.visible)
    }
}
