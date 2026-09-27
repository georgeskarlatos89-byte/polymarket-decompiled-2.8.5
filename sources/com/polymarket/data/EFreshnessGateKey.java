package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 (2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001(B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006)"}, d2 = {"Lcom/polymarket/data/EFreshnessGateKey;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "readCurrentUser", "promotionCampaigns", "homeFeed", "homeCategories", "sportsCategory", "tagCategory", "liveTab", "search", "notificationsFeed", "userOrders", "userPositions", "userActivity", "userProfileForeground", "calendarPnl", "tournamentStandings", "hub", "sportsTeamPicker", "comboBuilderEventList", "campaignOptIns", "premadeCombosRail", "gameSwitcher", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EFreshnessGateKey implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EFreshnessGateKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EFreshnessGateKey readCurrentUser = new EFreshnessGateKey("readCurrentUser", 0, "readCurrentUser", null, 2, null);
    public static final EFreshnessGateKey promotionCampaigns = new EFreshnessGateKey("promotionCampaigns", 1, "promotionCampaigns", null, 2, null);
    public static final EFreshnessGateKey homeFeed = new EFreshnessGateKey("homeFeed", 2, "homeFeed", null, 2, null);
    public static final EFreshnessGateKey homeCategories = new EFreshnessGateKey("homeCategories", 3, "homeCategories", null, 2, null);
    public static final EFreshnessGateKey sportsCategory = new EFreshnessGateKey("sportsCategory", 4, "sportsCategory", null, 2, null);
    public static final EFreshnessGateKey tagCategory = new EFreshnessGateKey("tagCategory", 5, "tagCategory", null, 2, null);
    public static final EFreshnessGateKey liveTab = new EFreshnessGateKey("liveTab", 6, "liveTab", null, 2, null);
    public static final EFreshnessGateKey search = new EFreshnessGateKey("search", 7, "search", null, 2, null);
    public static final EFreshnessGateKey notificationsFeed = new EFreshnessGateKey("notificationsFeed", 8, "notificationsFeed", null, 2, null);
    public static final EFreshnessGateKey userOrders = new EFreshnessGateKey("userOrders", 9, "userOrders", null, 2, null);
    public static final EFreshnessGateKey userPositions = new EFreshnessGateKey("userPositions", 10, "userPositions", null, 2, null);
    public static final EFreshnessGateKey userActivity = new EFreshnessGateKey("userActivity", 11, "userActivity", null, 2, null);
    public static final EFreshnessGateKey userProfileForeground = new EFreshnessGateKey("userProfileForeground", 12, "userProfileForeground", null, 2, null);
    public static final EFreshnessGateKey calendarPnl = new EFreshnessGateKey("calendarPnl", 13, "calendarPnl", null, 2, null);
    public static final EFreshnessGateKey tournamentStandings = new EFreshnessGateKey("tournamentStandings", 14, "tournamentStandings", null, 2, null);
    public static final EFreshnessGateKey hub = new EFreshnessGateKey("hub", 15, "hub", null, 2, null);
    public static final EFreshnessGateKey sportsTeamPicker = new EFreshnessGateKey("sportsTeamPicker", 16, "sportsTeamPicker", null, 2, null);
    public static final EFreshnessGateKey comboBuilderEventList = new EFreshnessGateKey("comboBuilderEventList", 17, "comboBuilderEventList", null, 2, null);
    public static final EFreshnessGateKey campaignOptIns = new EFreshnessGateKey("campaignOptIns", 18, "campaignOptIns", null, 2, null);
    public static final EFreshnessGateKey premadeCombosRail = new EFreshnessGateKey("premadeCombosRail", 19, "premadeCombosRail", null, 2, null);
    public static final EFreshnessGateKey gameSwitcher = new EFreshnessGateKey("gameSwitcher", 20, "gameSwitcher", null, 2, null);

    private static final /* synthetic */ EFreshnessGateKey[] $values() {
        return new EFreshnessGateKey[]{readCurrentUser, promotionCampaigns, homeFeed, homeCategories, sportsCategory, tagCategory, liveTab, search, notificationsFeed, userOrders, userPositions, userActivity, userProfileForeground, calendarPnl, tournamentStandings, hub, sportsTeamPicker, comboBuilderEventList, campaignOptIns, premadeCombosRail, gameSwitcher};
    }

    static {
        EFreshnessGateKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EFreshnessGateKey(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EFreshnessGateKey valueOf(String str) {
        return (EFreshnessGateKey) Enum.valueOf(EFreshnessGateKey.class, str);
    }

    public static EFreshnessGateKey[] values() {
        return (EFreshnessGateKey[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EFreshnessGateKey$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/EFreshnessGateKey;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<EFreshnessGateKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<EFreshnessGateKey> getAllCases() {
            return ArrayKt.arrayOf(EFreshnessGateKey.readCurrentUser, EFreshnessGateKey.promotionCampaigns, EFreshnessGateKey.homeFeed, EFreshnessGateKey.homeCategories, EFreshnessGateKey.sportsCategory, EFreshnessGateKey.tagCategory, EFreshnessGateKey.liveTab, EFreshnessGateKey.search, EFreshnessGateKey.notificationsFeed, EFreshnessGateKey.userOrders, EFreshnessGateKey.userPositions, EFreshnessGateKey.userActivity, EFreshnessGateKey.userProfileForeground, EFreshnessGateKey.calendarPnl, EFreshnessGateKey.tournamentStandings, EFreshnessGateKey.hub, EFreshnessGateKey.sportsTeamPicker, EFreshnessGateKey.comboBuilderEventList, EFreshnessGateKey.campaignOptIns, EFreshnessGateKey.premadeCombosRail, EFreshnessGateKey.gameSwitcher);
        }

        public final EFreshnessGateKey init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1766395541:
                    if (!rawValue.equals("campaignOptIns")) {
                        return null;
                    }
                    return EFreshnessGateKey.campaignOptIns;
                case -1759452501:
                    if (rawValue.equals("comboBuilderEventList")) {
                        return EFreshnessGateKey.comboBuilderEventList;
                    }
                    return null;
                case -1554826586:
                    if (rawValue.equals("notificationsFeed")) {
                        return EFreshnessGateKey.notificationsFeed;
                    }
                    return null;
                case -1243961672:
                    if (rawValue.equals("tagCategory")) {
                        return EFreshnessGateKey.tagCategory;
                    }
                    return null;
                case -961218147:
                    if (rawValue.equals("sportsCategory")) {
                        return EFreshnessGateKey.sportsCategory;
                    }
                    return null;
                case -906336856:
                    if (rawValue.equals("search")) {
                        return EFreshnessGateKey.search;
                    }
                    return null;
                case -681929919:
                    if (rawValue.equals("userProfileForeground")) {
                        return EFreshnessGateKey.userProfileForeground;
                    }
                    return null;
                case -623848225:
                    if (rawValue.equals("userPositions")) {
                        return EFreshnessGateKey.userPositions;
                    }
                    return null;
                case -486619363:
                    if (rawValue.equals("homeFeed")) {
                        return EFreshnessGateKey.homeFeed;
                    }
                    return null;
                case -212399569:
                    if (rawValue.equals("premadeCombosRail")) {
                        return EFreshnessGateKey.premadeCombosRail;
                    }
                    return null;
                case -169816997:
                    if (rawValue.equals("homeCategories")) {
                        return EFreshnessGateKey.homeCategories;
                    }
                    return null;
                case 103669:
                    if (rawValue.equals("hub")) {
                        return EFreshnessGateKey.hub;
                    }
                    return null;
                case 69952755:
                    if (rawValue.equals("gameSwitcher")) {
                        return EFreshnessGateKey.gameSwitcher;
                    }
                    return null;
                case 142626158:
                    if (rawValue.equals("readCurrentUser")) {
                        return EFreshnessGateKey.readCurrentUser;
                    }
                    return null;
                case 184278793:
                    if (rawValue.equals("liveTab")) {
                        return EFreshnessGateKey.liveTab;
                    }
                    return null;
                case 404262416:
                    if (rawValue.equals("calendarPnl")) {
                        return EFreshnessGateKey.calendarPnl;
                    }
                    return null;
                case 564537790:
                    if (rawValue.equals("tournamentStandings")) {
                        return EFreshnessGateKey.tournamentStandings;
                    }
                    return null;
                case 573230080:
                    if (rawValue.equals("promotionCampaigns")) {
                        return EFreshnessGateKey.promotionCampaigns;
                    }
                    return null;
                case 1093652010:
                    if (rawValue.equals("sportsTeamPicker")) {
                        return EFreshnessGateKey.sportsTeamPicker;
                    }
                    return null;
                case 1475344016:
                    if (rawValue.equals("userOrders")) {
                        return EFreshnessGateKey.userOrders;
                    }
                    return null;
                case 1871071226:
                    if (rawValue.equals("userActivity")) {
                        return EFreshnessGateKey.userActivity;
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

    private EFreshnessGateKey(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
