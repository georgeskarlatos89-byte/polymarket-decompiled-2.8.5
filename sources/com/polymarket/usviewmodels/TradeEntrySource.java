package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u00014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016J\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/TradeEntrySource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "chatPositionCard", "chatPositionCarousel", "eventCard", "eventDetail", "positionBuyMore", "profilePosition", "searchResults", "orderBook", "deeplink", "liveTrade", "comboBuilder", "squadPositionCard", "squadPopularCard", "squadMemberProfile", "squadChatCard", "chatComboViewer", "noLiquiditySheet", "homePositionsCarousel", "eventCardPositionStack", "eventPositionsCarousel", "eventPositionsSheet", "sportsEventDetailSection", "standardEventDetailSection", "profilePortfolioRow", "chatAttachmentCard", "chatInputCarousel", "squadsPositionCard", "comboDetailSheet", "tournamentGameCard", "receiptDetail", "premadeComboHome", "premadeComboSports", "premadeComboFeed", "premadeComboDeeplink", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TradeEntrySource implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TradeEntrySource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final TradeEntrySource chatPositionCard = new TradeEntrySource("chatPositionCard", 0, "chat_position_card", null, 2, null);
    public static final TradeEntrySource chatPositionCarousel = new TradeEntrySource("chatPositionCarousel", 1, "chat_position_carousel", null, 2, null);
    public static final TradeEntrySource eventCard = new TradeEntrySource("eventCard", 2, "event_card", null, 2, null);
    public static final TradeEntrySource eventDetail = new TradeEntrySource("eventDetail", 3, "event_detail", null, 2, null);
    public static final TradeEntrySource positionBuyMore = new TradeEntrySource("positionBuyMore", 4, "position_buy_more", null, 2, null);
    public static final TradeEntrySource profilePosition = new TradeEntrySource("profilePosition", 5, "profile_position", null, 2, null);
    public static final TradeEntrySource searchResults = new TradeEntrySource("searchResults", 6, MetricTracker.Place.SEARCH_RESULTS, null, 2, null);
    public static final TradeEntrySource orderBook = new TradeEntrySource("orderBook", 7, "order_book", null, 2, null);
    public static final TradeEntrySource deeplink = new TradeEntrySource("deeplink", 8, "deeplink", null, 2, null);
    public static final TradeEntrySource liveTrade = new TradeEntrySource("liveTrade", 9, "live_trade", null, 2, null);
    public static final TradeEntrySource comboBuilder = new TradeEntrySource("comboBuilder", 10, "combo_builder", null, 2, null);
    public static final TradeEntrySource squadPositionCard = new TradeEntrySource("squadPositionCard", 11, "squad_position_card", null, 2, null);
    public static final TradeEntrySource squadPopularCard = new TradeEntrySource("squadPopularCard", 12, "squad_popular_card", null, 2, null);
    public static final TradeEntrySource squadMemberProfile = new TradeEntrySource("squadMemberProfile", 13, "squad_member_profile", null, 2, null);
    public static final TradeEntrySource squadChatCard = new TradeEntrySource("squadChatCard", 14, "squad_chat_card", null, 2, null);
    public static final TradeEntrySource chatComboViewer = new TradeEntrySource("chatComboViewer", 15, "chat_combo_viewer", null, 2, null);
    public static final TradeEntrySource noLiquiditySheet = new TradeEntrySource("noLiquiditySheet", 16, "no_liquidity_sheet", null, 2, null);
    public static final TradeEntrySource homePositionsCarousel = new TradeEntrySource("homePositionsCarousel", 17, "home_positions_carousel", null, 2, null);
    public static final TradeEntrySource eventCardPositionStack = new TradeEntrySource("eventCardPositionStack", 18, "event_card_position_stack", null, 2, null);
    public static final TradeEntrySource eventPositionsCarousel = new TradeEntrySource("eventPositionsCarousel", 19, "event_positions_carousel", null, 2, null);
    public static final TradeEntrySource eventPositionsSheet = new TradeEntrySource("eventPositionsSheet", 20, "event_positions_sheet", null, 2, null);
    public static final TradeEntrySource sportsEventDetailSection = new TradeEntrySource("sportsEventDetailSection", 21, "sports_event_detail_section", null, 2, null);
    public static final TradeEntrySource standardEventDetailSection = new TradeEntrySource("standardEventDetailSection", 22, "standard_event_detail_section", null, 2, null);
    public static final TradeEntrySource profilePortfolioRow = new TradeEntrySource("profilePortfolioRow", 23, "profile_portfolio_row", null, 2, null);
    public static final TradeEntrySource chatAttachmentCard = new TradeEntrySource("chatAttachmentCard", 24, "chat_attachment_card", null, 2, null);
    public static final TradeEntrySource chatInputCarousel = new TradeEntrySource("chatInputCarousel", 25, "chat_input_carousel", null, 2, null);
    public static final TradeEntrySource squadsPositionCard = new TradeEntrySource("squadsPositionCard", 26, "squads_position_card", null, 2, null);
    public static final TradeEntrySource comboDetailSheet = new TradeEntrySource("comboDetailSheet", 27, "combo_detail_sheet", null, 2, null);
    public static final TradeEntrySource tournamentGameCard = new TradeEntrySource("tournamentGameCard", 28, "tournament_game_card", null, 2, null);
    public static final TradeEntrySource receiptDetail = new TradeEntrySource("receiptDetail", 29, "receipt_detail", null, 2, null);
    public static final TradeEntrySource premadeComboHome = new TradeEntrySource("premadeComboHome", 30, "premade_combo_home", null, 2, null);
    public static final TradeEntrySource premadeComboSports = new TradeEntrySource("premadeComboSports", 31, "premade_combo_sports", null, 2, null);
    public static final TradeEntrySource premadeComboFeed = new TradeEntrySource("premadeComboFeed", 32, "premade_combo_feed", null, 2, null);
    public static final TradeEntrySource premadeComboDeeplink = new TradeEntrySource("premadeComboDeeplink", 33, "premade_combo_deeplink", null, 2, null);

    private static final /* synthetic */ TradeEntrySource[] $values() {
        return new TradeEntrySource[]{chatPositionCard, chatPositionCarousel, eventCard, eventDetail, positionBuyMore, profilePosition, searchResults, orderBook, deeplink, liveTrade, comboBuilder, squadPositionCard, squadPopularCard, squadMemberProfile, squadChatCard, chatComboViewer, noLiquiditySheet, homePositionsCarousel, eventCardPositionStack, eventPositionsCarousel, eventPositionsSheet, sportsEventDetailSection, standardEventDetailSection, profilePortfolioRow, chatAttachmentCard, chatInputCarousel, squadsPositionCard, comboDetailSheet, tournamentGameCard, receiptDetail, premadeComboHome, premadeComboSports, premadeComboFeed, premadeComboDeeplink};
    }

    static {
        TradeEntrySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ TradeEntrySource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TradeEntrySource valueOf(String str) {
        return (TradeEntrySource) Enum.valueOf(TradeEntrySource.class, str);
    }

    public static TradeEntrySource[] values() {
        return (TradeEntrySource[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TradeEntrySource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TradeEntrySource init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -2096641459:
                    if (!rawValue.equals("profile_portfolio_row")) {
                        return null;
                    }
                    return TradeEntrySource.profilePortfolioRow;
                case -2077551234:
                    if (rawValue.equals("standard_event_detail_section")) {
                        return TradeEntrySource.standardEventDetailSection;
                    }
                    return null;
                case -2047948950:
                    if (rawValue.equals("chat_combo_viewer")) {
                        return TradeEntrySource.chatComboViewer;
                    }
                    return null;
                case -2012095916:
                    if (rawValue.equals("no_liquidity_sheet")) {
                        return TradeEntrySource.noLiquiditySheet;
                    }
                    return null;
                case -1496944700:
                    if (rawValue.equals("position_buy_more")) {
                        return TradeEntrySource.positionBuyMore;
                    }
                    return null;
                case -1470201567:
                    if (rawValue.equals("squad_position_card")) {
                        return TradeEntrySource.squadPositionCard;
                    }
                    return null;
                case -1240903227:
                    if (rawValue.equals("chat_attachment_card")) {
                        return TradeEntrySource.chatAttachmentCard;
                    }
                    return null;
                case -1034102276:
                    if (rawValue.equals("sports_event_detail_section")) {
                        return TradeEntrySource.sportsEventDetailSection;
                    }
                    return null;
                case -1000006148:
                    if (rawValue.equals("chat_input_carousel")) {
                        return TradeEntrySource.chatInputCarousel;
                    }
                    return null;
                case -934277600:
                    if (rawValue.equals("squads_position_card")) {
                        return TradeEntrySource.squadsPositionCard;
                    }
                    return null;
                case -928256521:
                    if (rawValue.equals("premade_combo_sports")) {
                        return TradeEntrySource.premadeComboSports;
                    }
                    return null;
                case -883731353:
                    if (rawValue.equals("tournament_game_card")) {
                        return TradeEntrySource.tournamentGameCard;
                    }
                    return null;
                case -878909606:
                    if (rawValue.equals("event_positions_carousel")) {
                        return TradeEntrySource.eventPositionsCarousel;
                    }
                    return null;
                case -631950280:
                    if (rawValue.equals("receipt_detail")) {
                        return TradeEntrySource.receiptDetail;
                    }
                    return null;
                case -534659234:
                    if (rawValue.equals("premade_combo_deeplink")) {
                        return TradeEntrySource.premadeComboDeeplink;
                    }
                    return null;
                case -316502385:
                    if (rawValue.equals("chat_position_carousel")) {
                        return TradeEntrySource.chatPositionCarousel;
                    }
                    return null;
                case -227676939:
                    if (rawValue.equals("home_positions_carousel")) {
                        return TradeEntrySource.homePositionsCarousel;
                    }
                    return null;
                case 690331:
                    if (rawValue.equals("squad_popular_card")) {
                        return TradeEntrySource.squadPopularCard;
                    }
                    return null;
                case 166762431:
                    if (rawValue.equals("chat_position_card")) {
                        return TradeEntrySource.chatPositionCard;
                    }
                    return null;
                case 350766850:
                    if (rawValue.equals("combo_detail_sheet")) {
                        return TradeEntrySource.comboDetailSheet;
                    }
                    return null;
                case 523928489:
                    if (rawValue.equals("squad_member_profile")) {
                        return TradeEntrySource.squadMemberProfile;
                    }
                    return null;
                case 610573276:
                    if (rawValue.equals("event_card_position_stack")) {
                        return TradeEntrySource.eventCardPositionStack;
                    }
                    return null;
                case 616849814:
                    if (rawValue.equals("event_detail")) {
                        return TradeEntrySource.eventDetail;
                    }
                    return null;
                case 629233382:
                    if (rawValue.equals("deeplink")) {
                        return TradeEntrySource.deeplink;
                    }
                    return null;
                case 672213413:
                    if (rawValue.equals("event_positions_sheet")) {
                        return TradeEntrySource.eventPositionsSheet;
                    }
                    return null;
                case 755879226:
                    if (rawValue.equals("order_book")) {
                        return TradeEntrySource.orderBook;
                    }
                    return null;
                case 768090578:
                    if (rawValue.equals("squad_chat_card")) {
                        return TradeEntrySource.squadChatCard;
                    }
                    return null;
                case 909053695:
                    if (rawValue.equals("profile_position")) {
                        return TradeEntrySource.profilePosition;
                    }
                    return null;
                case 914835990:
                    if (rawValue.equals("premade_combo_feed")) {
                        return TradeEntrySource.premadeComboFeed;
                    }
                    return null;
                case 914905431:
                    if (rawValue.equals("premade_combo_home")) {
                        return TradeEntrySource.premadeComboHome;
                    }
                    return null;
                case 983847317:
                    if (rawValue.equals("event_card")) {
                        return TradeEntrySource.eventCard;
                    }
                    return null;
                case 1214358609:
                    if (rawValue.equals("live_trade")) {
                        return TradeEntrySource.liveTrade;
                    }
                    return null;
                case 1252597855:
                    if (rawValue.equals(MetricTracker.Place.SEARCH_RESULTS)) {
                        return TradeEntrySource.searchResults;
                    }
                    return null;
                case 1613715946:
                    if (rawValue.equals("combo_builder")) {
                        return TradeEntrySource.comboBuilder;
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

    private TradeEntrySource(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
