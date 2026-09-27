package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 ]2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001]B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u00104\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u00108\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010:\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010<\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010?\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010B\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010D\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010G\u001a\u0002062\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010J\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010M\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0013\u0010P\u001a\u0004\u0018\u00010-2\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010S\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0011\u0010V\u001a\u00020-2\u0006\u00101\u001a\u00020-H\u0082 J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[H\u0082 R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b5\u00107R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010;\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0011\u0010=\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b>\u00107R\u0011\u0010@\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0011\u0010C\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bC\u00107R\u0011\u0010E\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bF\u00107R\u0011\u0010H\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0011\u0010K\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bL\u0010/R\u0013\u0010N\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\bO\u0010/R\u0011\u0010Q\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bR\u0010/R\u0011\u0010T\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bU\u0010/j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006^"}, d2 = {"Lcom/polymarket/data/ESportsSlug;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "nfl", "nba", "epl", "nhl", "cbb", "cfb", "mlb", "ucl", "uel", "ipl", "mls", "fifawc", "fwc", "laliga", "wnba", "ufc", "golf", "f1", "tennis", "atp", "wta", "itf", "masters", "chess", "boxing", "esports", "soccer", "ncaab", "itfm", "itfw", "itfme", "itfwo", "atpcq", "tableTennis", "kbo", "npb", "fibawcq", "unknown", "rawValue", "", "getRawValue", "()Ljava/lang/String;", "Swift_rawValue", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "isFootball", "", "()Z", "Swift_isFootball", "isSoccer", "Swift_isSoccer", "isWorldCup", "Swift_isWorldCup", "hasFeaturedTournamentLayout", "getHasFeaturedTournamentLayout", "Swift_hasFeaturedTournamentLayout", "hasTeamScreen", "getHasTeamScreen", "Swift_hasTeamScreen", "isTennis", "Swift_isTennis", "usesIndividualNames", "getUsesIndividualNames", "Swift_usesIndividualNames", "displayName", "getDisplayName", "Swift_displayName", "iconAssetName", "getIconAssetName", "Swift_iconAssetName", "sportGlyphAssetName", "getSportGlyphAssetName", "Swift_sportGlyphAssetName", "defaultSpreadSuffix", "getDefaultSpreadSuffix", "Swift_defaultSpreadSuffix", "defaultTotalSuffix", "getDefaultTotalSuffix", "Swift_defaultTotalSuffix", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportsSlug implements CaseIterable, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ESportsSlug[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ESportsSlug nfl = new ESportsSlug("nfl", 0);
    public static final ESportsSlug nba = new ESportsSlug("nba", 1);
    public static final ESportsSlug epl = new ESportsSlug("epl", 2);
    public static final ESportsSlug nhl = new ESportsSlug("nhl", 3);
    public static final ESportsSlug cbb = new ESportsSlug("cbb", 4);
    public static final ESportsSlug cfb = new ESportsSlug("cfb", 5);
    public static final ESportsSlug mlb = new ESportsSlug("mlb", 6);
    public static final ESportsSlug ucl = new ESportsSlug("ucl", 7);
    public static final ESportsSlug uel = new ESportsSlug("uel", 8);
    public static final ESportsSlug ipl = new ESportsSlug("ipl", 9);
    public static final ESportsSlug mls = new ESportsSlug("mls", 10);
    public static final ESportsSlug fifawc = new ESportsSlug("fifawc", 11);
    public static final ESportsSlug fwc = new ESportsSlug("fwc", 12);
    public static final ESportsSlug laliga = new ESportsSlug("laliga", 13);
    public static final ESportsSlug wnba = new ESportsSlug("wnba", 14);
    public static final ESportsSlug ufc = new ESportsSlug("ufc", 15);
    public static final ESportsSlug golf = new ESportsSlug("golf", 16);
    public static final ESportsSlug f1 = new ESportsSlug("f1", 17);
    public static final ESportsSlug tennis = new ESportsSlug("tennis", 18);
    public static final ESportsSlug atp = new ESportsSlug("atp", 19);
    public static final ESportsSlug wta = new ESportsSlug("wta", 20);
    public static final ESportsSlug itf = new ESportsSlug("itf", 21);
    public static final ESportsSlug masters = new ESportsSlug("masters", 22);
    public static final ESportsSlug chess = new ESportsSlug("chess", 23);
    public static final ESportsSlug boxing = new ESportsSlug("boxing", 24);
    public static final ESportsSlug esports = new ESportsSlug("esports", 25);
    public static final ESportsSlug soccer = new ESportsSlug("soccer", 26);
    public static final ESportsSlug ncaab = new ESportsSlug("ncaab", 27);
    public static final ESportsSlug itfm = new ESportsSlug("itfm", 28);
    public static final ESportsSlug itfw = new ESportsSlug("itfw", 29);
    public static final ESportsSlug itfme = new ESportsSlug("itfme", 30);
    public static final ESportsSlug itfwo = new ESportsSlug("itfwo", 31);
    public static final ESportsSlug atpcq = new ESportsSlug("atpcq", 32);
    public static final ESportsSlug tableTennis = new ESportsSlug("tableTennis", 33);
    public static final ESportsSlug kbo = new ESportsSlug("kbo", 34);
    public static final ESportsSlug npb = new ESportsSlug("npb", 35);
    public static final ESportsSlug fibawcq = new ESportsSlug("fibawcq", 36);
    public static final ESportsSlug unknown = new ESportsSlug("unknown", 37);

    private static final /* synthetic */ ESportsSlug[] $values() {
        return new ESportsSlug[]{nfl, nba, epl, nhl, cbb, cfb, mlb, ucl, uel, ipl, mls, fifawc, fwc, laliga, wnba, ufc, golf, f1, tennis, atp, wta, itf, masters, chess, boxing, esports, soccer, ncaab, itfm, itfw, itfme, itfwo, atpcq, tableTennis, kbo, npb, fibawcq, unknown};
    }

    static {
        ESportsSlug[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ESportsSlug(String str, int i) {
    }

    private final native String Swift_defaultSpreadSuffix(String name);

    private final native String Swift_defaultTotalSuffix(String name);

    private final native String Swift_displayName(String name);

    private final native boolean Swift_hasFeaturedTournamentLayout(String name);

    private final native boolean Swift_hasTeamScreen(String name);

    private final native String Swift_iconAssetName(String name);

    private final native String Swift_id(String name);

    private final native boolean Swift_isFootball(String name);

    private final native boolean Swift_isSoccer(String name);

    private final native boolean Swift_isTennis(String name);

    private final native boolean Swift_isWorldCup(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_rawValue(String name);

    private final native String Swift_sportGlyphAssetName(String name);

    private final native boolean Swift_usesIndividualNames(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ESportsSlug valueOf(String str) {
        return (ESportsSlug) Enum.valueOf(ESportsSlug.class, str);
    }

    public static ESportsSlug[] values() {
        return (ESportsSlug[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDefaultSpreadSuffix() {
        return Swift_defaultSpreadSuffix(name());
    }

    public final String getDefaultTotalSuffix() {
        return Swift_defaultTotalSuffix(name());
    }

    public final String getDisplayName() {
        return Swift_displayName(name());
    }

    public final boolean getHasFeaturedTournamentLayout() {
        return Swift_hasFeaturedTournamentLayout(name());
    }

    public final boolean getHasTeamScreen() {
        return Swift_hasTeamScreen(name());
    }

    public final String getIconAssetName() {
        return Swift_iconAssetName(name());
    }

    public final String getId() {
        return Swift_id(name());
    }

    public final String getRawValue() {
        return Swift_rawValue(name());
    }

    public final String getSportGlyphAssetName() {
        return Swift_sportGlyphAssetName(name());
    }

    public final boolean getUsesIndividualNames() {
        return Swift_usesIndividualNames(name());
    }

    public final boolean isFootball() {
        return Swift_isFootball(name());
    }

    public final boolean isSoccer() {
        return Swift_isSoccer(name());
    }

    public final boolean isTennis() {
        return Swift_isTennis(name());
    }

    public final boolean isWorldCup() {
        return Swift_isWorldCup(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0082 J&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J)\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0082 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/ESportsSlug$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/ESportsSlug;", "<init>", "()V", "resolve", "raw", "", "Swift_Companion_resolve_0", "sportEventSlugs", "", "getSportEventSlugs", "()Ljava/util/Set;", "Swift_Companion_sportEventSlugs", TicketDetailDestinationKt.LAUNCHED_FROM, "ticker", "slug", "seriesSlug", "Swift_Companion_from_1", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<ESportsSlug> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ESportsSlug Swift_Companion_from_1(String ticker, String slug, String seriesSlug);

        private final native ESportsSlug Swift_Companion_resolve_0(String raw);

        private final native Set<String> Swift_Companion_sportEventSlugs();

        public final ESportsSlug from(String ticker, String slug, String seriesSlug) {
            return Swift_Companion_from_1(ticker, slug, seriesSlug);
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<ESportsSlug> getAllCases() {
            return ArrayKt.arrayOf(ESportsSlug.nfl, ESportsSlug.nba, ESportsSlug.epl, ESportsSlug.nhl, ESportsSlug.cbb, ESportsSlug.cfb, ESportsSlug.mlb, ESportsSlug.ucl, ESportsSlug.uel, ESportsSlug.ipl, ESportsSlug.mls, ESportsSlug.fifawc, ESportsSlug.fwc, ESportsSlug.laliga, ESportsSlug.wnba, ESportsSlug.ufc, ESportsSlug.golf, ESportsSlug.f1, ESportsSlug.tennis, ESportsSlug.atp, ESportsSlug.wta, ESportsSlug.itf, ESportsSlug.masters, ESportsSlug.chess, ESportsSlug.boxing, ESportsSlug.esports, ESportsSlug.soccer, ESportsSlug.ncaab, ESportsSlug.itfm, ESportsSlug.itfw, ESportsSlug.itfme, ESportsSlug.itfwo, ESportsSlug.atpcq, ESportsSlug.tableTennis, ESportsSlug.kbo, ESportsSlug.npb, ESportsSlug.fibawcq, ESportsSlug.unknown);
        }

        public final Set<String> getSportEventSlugs() {
            return Swift_Companion_sportEventSlugs();
        }

        public final ESportsSlug resolve(String raw) {
            raw.getClass();
            return Swift_Companion_resolve_0(raw);
        }

        private Companion() {
        }
    }
}
