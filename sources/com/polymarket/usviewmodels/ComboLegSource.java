package com.polymarket.usviewmodels;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001fB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/ComboLegSource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "eventCell", "railCard", "railPill", "playerPropsSheet", "eventDetailPrimary", "eventDetailGameLine", "eventDetailPlayerPropRow", "eventDetailPopularCard", "playersTabCard", "tagPropCard", "tradeSheet", "conflictAutofix", "conflictRestore", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComboLegSource implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ComboLegSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ComboLegSource eventCell = new ComboLegSource("eventCell", 0, "event_cell", null, 2, null);
    public static final ComboLegSource railCard = new ComboLegSource("railCard", 1, "rail_card", null, 2, null);
    public static final ComboLegSource railPill = new ComboLegSource("railPill", 2, "rail_pill", null, 2, null);
    public static final ComboLegSource playerPropsSheet = new ComboLegSource("playerPropsSheet", 3, "player_props_sheet", null, 2, null);
    public static final ComboLegSource eventDetailPrimary = new ComboLegSource("eventDetailPrimary", 4, "event_detail_primary", null, 2, null);
    public static final ComboLegSource eventDetailGameLine = new ComboLegSource("eventDetailGameLine", 5, "event_detail_game_line", null, 2, null);
    public static final ComboLegSource eventDetailPlayerPropRow = new ComboLegSource("eventDetailPlayerPropRow", 6, "event_detail_player_prop_row", null, 2, null);
    public static final ComboLegSource eventDetailPopularCard = new ComboLegSource("eventDetailPopularCard", 7, "event_detail_popular_card", null, 2, null);
    public static final ComboLegSource playersTabCard = new ComboLegSource("playersTabCard", 8, "players_tab_card", null, 2, null);
    public static final ComboLegSource tagPropCard = new ComboLegSource("tagPropCard", 9, "tag_prop_card", null, 2, null);
    public static final ComboLegSource tradeSheet = new ComboLegSource("tradeSheet", 10, "trade_sheet", null, 2, null);
    public static final ComboLegSource conflictAutofix = new ComboLegSource("conflictAutofix", 11, "conflict_autofix", null, 2, null);
    public static final ComboLegSource conflictRestore = new ComboLegSource("conflictRestore", 12, "conflict_restore", null, 2, null);

    private static final /* synthetic */ ComboLegSource[] $values() {
        return new ComboLegSource[]{eventCell, railCard, railPill, playerPropsSheet, eventDetailPrimary, eventDetailGameLine, eventDetailPlayerPropRow, eventDetailPopularCard, playersTabCard, tagPropCard, tradeSheet, conflictAutofix, conflictRestore};
    }

    static {
        ComboLegSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ComboLegSource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ComboLegSource valueOf(String str) {
        return (ComboLegSource) Enum.valueOf(ComboLegSource.class, str);
    }

    public static ComboLegSource[] values() {
        return (ComboLegSource[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboLegSource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/ComboLegSource;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ComboLegSource init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1984948540:
                    if (!rawValue.equals("trade_sheet")) {
                        return null;
                    }
                    return ComboLegSource.tradeSheet;
                case -1522598759:
                    if (rawValue.equals("conflict_autofix")) {
                        return ComboLegSource.conflictAutofix;
                    }
                    return null;
                case -932602696:
                    if (rawValue.equals("event_detail_game_line")) {
                        return ComboLegSource.eventDetailGameLine;
                    }
                    return null;
                case -862772889:
                    if (rawValue.equals("players_tab_card")) {
                        return ComboLegSource.playersTabCard;
                    }
                    return null;
                case -756132963:
                    if (rawValue.equals("rail_card")) {
                        return ComboLegSource.railCard;
                    }
                    return null;
                case -755738170:
                    if (rawValue.equals("rail_pill")) {
                        return ComboLegSource.railPill;
                    }
                    return null;
                case -735318849:
                    if (rawValue.equals("event_detail_popular_card")) {
                        return ComboLegSource.eventDetailPopularCard;
                    }
                    return null;
                case 221229857:
                    if (rawValue.equals("conflict_restore")) {
                        return ComboLegSource.conflictRestore;
                    }
                    return null;
                case 983850983:
                    if (rawValue.equals("event_cell")) {
                        return ComboLegSource.eventCell;
                    }
                    return null;
                case 993879410:
                    if (rawValue.equals("player_props_sheet")) {
                        return ComboLegSource.playerPropsSheet;
                    }
                    return null;
                case 1607938547:
                    if (rawValue.equals("event_detail_player_prop_row")) {
                        return ComboLegSource.eventDetailPlayerPropRow;
                    }
                    return null;
                case 1636153351:
                    if (rawValue.equals("tag_prop_card")) {
                        return ComboLegSource.tagPropCard;
                    }
                    return null;
                case 1756962905:
                    if (rawValue.equals("event_detail_primary")) {
                        return ComboLegSource.eventDetailPrimary;
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

    private ComboLegSource(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
