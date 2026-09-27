package com.polymarket.usviewmodels;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001%B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/PositionCardSurface;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "homePositionsCarousel", "eventCardPositionStack", "eventPositionsCarousel", "eventPositionsSheet", "sportsEventDetailSection", "standardEventDetailSection", "profilePortfolioRow", "chatAttachmentCard", "chatInputCarousel", "squadsPositionCard", "comboDetailSheet", "tournamentGameCard", "receiptDetail", "tradeEntrySource", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "getTradeEntrySource", "()Lcom/polymarket/usviewmodels/TradeEntrySource;", "Swift_tradeEntrySource", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PositionCardSurface implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PositionCardSurface[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final PositionCardSurface homePositionsCarousel = new PositionCardSurface("homePositionsCarousel", 0, "home_positions_carousel", null, 2, null);
    public static final PositionCardSurface eventCardPositionStack = new PositionCardSurface("eventCardPositionStack", 1, "event_card_position_stack", null, 2, null);
    public static final PositionCardSurface eventPositionsCarousel = new PositionCardSurface("eventPositionsCarousel", 2, "event_positions_carousel", null, 2, null);
    public static final PositionCardSurface eventPositionsSheet = new PositionCardSurface("eventPositionsSheet", 3, "event_positions_sheet", null, 2, null);
    public static final PositionCardSurface sportsEventDetailSection = new PositionCardSurface("sportsEventDetailSection", 4, "sports_event_detail_section", null, 2, null);
    public static final PositionCardSurface standardEventDetailSection = new PositionCardSurface("standardEventDetailSection", 5, "standard_event_detail_section", null, 2, null);
    public static final PositionCardSurface profilePortfolioRow = new PositionCardSurface("profilePortfolioRow", 6, "profile_portfolio_row", null, 2, null);
    public static final PositionCardSurface chatAttachmentCard = new PositionCardSurface("chatAttachmentCard", 7, "chat_attachment_card", null, 2, null);
    public static final PositionCardSurface chatInputCarousel = new PositionCardSurface("chatInputCarousel", 8, "chat_input_carousel", null, 2, null);
    public static final PositionCardSurface squadsPositionCard = new PositionCardSurface("squadsPositionCard", 9, "squads_position_card", null, 2, null);
    public static final PositionCardSurface comboDetailSheet = new PositionCardSurface("comboDetailSheet", 10, "combo_detail_sheet", null, 2, null);
    public static final PositionCardSurface tournamentGameCard = new PositionCardSurface("tournamentGameCard", 11, "tournament_game_card", null, 2, null);
    public static final PositionCardSurface receiptDetail = new PositionCardSurface("receiptDetail", 12, "receipt_detail", null, 2, null);

    private static final /* synthetic */ PositionCardSurface[] $values() {
        return new PositionCardSurface[]{homePositionsCarousel, eventCardPositionStack, eventPositionsCarousel, eventPositionsSheet, sportsEventDetailSection, standardEventDetailSection, profilePortfolioRow, chatAttachmentCard, chatInputCarousel, squadsPositionCard, comboDetailSheet, tournamentGameCard, receiptDetail};
    }

    static {
        PositionCardSurface[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ PositionCardSurface(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native TradeEntrySource Swift_tradeEntrySource(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static PositionCardSurface valueOf(String str) {
        return (PositionCardSurface) Enum.valueOf(PositionCardSurface.class, str);
    }

    public static PositionCardSurface[] values() {
        return (PositionCardSurface[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final TradeEntrySource getTradeEntrySource() {
        return Swift_tradeEntrySource(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PositionCardSurface$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/PositionCardSurface;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PositionCardSurface init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -2096641459:
                    if (!rawValue.equals("profile_portfolio_row")) {
                        return null;
                    }
                    return PositionCardSurface.profilePortfolioRow;
                case -2077551234:
                    if (rawValue.equals("standard_event_detail_section")) {
                        return PositionCardSurface.standardEventDetailSection;
                    }
                    return null;
                case -1240903227:
                    if (rawValue.equals("chat_attachment_card")) {
                        return PositionCardSurface.chatAttachmentCard;
                    }
                    return null;
                case -1034102276:
                    if (rawValue.equals("sports_event_detail_section")) {
                        return PositionCardSurface.sportsEventDetailSection;
                    }
                    return null;
                case -1000006148:
                    if (rawValue.equals("chat_input_carousel")) {
                        return PositionCardSurface.chatInputCarousel;
                    }
                    return null;
                case -934277600:
                    if (rawValue.equals("squads_position_card")) {
                        return PositionCardSurface.squadsPositionCard;
                    }
                    return null;
                case -883731353:
                    if (rawValue.equals("tournament_game_card")) {
                        return PositionCardSurface.tournamentGameCard;
                    }
                    return null;
                case -878909606:
                    if (rawValue.equals("event_positions_carousel")) {
                        return PositionCardSurface.eventPositionsCarousel;
                    }
                    return null;
                case -631950280:
                    if (rawValue.equals("receipt_detail")) {
                        return PositionCardSurface.receiptDetail;
                    }
                    return null;
                case -227676939:
                    if (rawValue.equals("home_positions_carousel")) {
                        return PositionCardSurface.homePositionsCarousel;
                    }
                    return null;
                case 350766850:
                    if (rawValue.equals("combo_detail_sheet")) {
                        return PositionCardSurface.comboDetailSheet;
                    }
                    return null;
                case 610573276:
                    if (rawValue.equals("event_card_position_stack")) {
                        return PositionCardSurface.eventCardPositionStack;
                    }
                    return null;
                case 672213413:
                    if (rawValue.equals("event_positions_sheet")) {
                        return PositionCardSurface.eventPositionsSheet;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private PositionCardSurface(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
