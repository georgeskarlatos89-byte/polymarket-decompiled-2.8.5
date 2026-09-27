package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001JB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0016J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010@\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?¨\u0006K"}, d2 = {"Lcom/polymarket/data/EAmericanState;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "alabama", "alaska", "arizona", "arkansas", "california", "colorado", "connecticut", "delaware", "districtOfColumbia", "florida", "georgia", "hawaii", "idaho", "illinois", "indiana", "iowa", "kansas", "kentucky", "louisiana", "maine", "maryland", "massachusetts", "michigan", "minnesota", "mississippi", "missouri", "montana", "nebraska", "nevada", "newHampshire", "newJersey", "newMexico", "newYork", "northCarolina", "northDakota", "ohio", "oklahoma", "oregon", "pennsylvania", "puertoRico", "rhodeIsland", "southCarolina", "southDakota", "tennessee", "texas", "utah", "vermont", "virginia", "washington", "westVirginia", "wisconsin", "wyoming", "displayName", "getDisplayName", "Swift_displayName", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EAmericanState implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EAmericanState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EAmericanState alabama = new EAmericanState("alabama", 0, "AL", null, 2, null);
    public static final EAmericanState alaska = new EAmericanState("alaska", 1, "AK", null, 2, null);
    public static final EAmericanState arizona = new EAmericanState("arizona", 2, "AZ", null, 2, null);
    public static final EAmericanState arkansas = new EAmericanState("arkansas", 3, "AR", null, 2, null);
    public static final EAmericanState california = new EAmericanState("california", 4, "CA", null, 2, null);
    public static final EAmericanState colorado = new EAmericanState("colorado", 5, "CO", null, 2, null);
    public static final EAmericanState connecticut = new EAmericanState("connecticut", 6, "CT", null, 2, null);
    public static final EAmericanState delaware = new EAmericanState("delaware", 7, "DE", null, 2, null);
    public static final EAmericanState districtOfColumbia = new EAmericanState("districtOfColumbia", 8, "DC", null, 2, null);
    public static final EAmericanState florida = new EAmericanState("florida", 9, "FL", null, 2, null);
    public static final EAmericanState georgia = new EAmericanState("georgia", 10, "GA", null, 2, null);
    public static final EAmericanState hawaii = new EAmericanState("hawaii", 11, "HI", null, 2, null);
    public static final EAmericanState idaho = new EAmericanState("idaho", 12, "ID", null, 2, null);
    public static final EAmericanState illinois = new EAmericanState("illinois", 13, "IL", null, 2, null);
    public static final EAmericanState indiana = new EAmericanState("indiana", 14, "IN", null, 2, null);
    public static final EAmericanState iowa = new EAmericanState("iowa", 15, "IA", null, 2, null);
    public static final EAmericanState kansas = new EAmericanState("kansas", 16, "KS", null, 2, null);
    public static final EAmericanState kentucky = new EAmericanState("kentucky", 17, "KY", null, 2, null);
    public static final EAmericanState louisiana = new EAmericanState("louisiana", 18, "LA", null, 2, null);
    public static final EAmericanState maine = new EAmericanState("maine", 19, "ME", null, 2, null);
    public static final EAmericanState maryland = new EAmericanState("maryland", 20, "MD", null, 2, null);
    public static final EAmericanState massachusetts = new EAmericanState("massachusetts", 21, "MA", null, 2, null);
    public static final EAmericanState michigan = new EAmericanState("michigan", 22, "MI", null, 2, null);
    public static final EAmericanState minnesota = new EAmericanState("minnesota", 23, "MN", null, 2, null);
    public static final EAmericanState mississippi = new EAmericanState("mississippi", 24, "MS", null, 2, null);
    public static final EAmericanState missouri = new EAmericanState("missouri", 25, "MO", null, 2, null);
    public static final EAmericanState montana = new EAmericanState("montana", 26, "MT", null, 2, null);
    public static final EAmericanState nebraska = new EAmericanState("nebraska", 27, "NE", null, 2, null);
    public static final EAmericanState nevada = new EAmericanState("nevada", 28, "NV", null, 2, null);
    public static final EAmericanState newHampshire = new EAmericanState("newHampshire", 29, "NH", null, 2, null);
    public static final EAmericanState newJersey = new EAmericanState("newJersey", 30, "NJ", null, 2, null);
    public static final EAmericanState newMexico = new EAmericanState("newMexico", 31, "NM", null, 2, null);
    public static final EAmericanState newYork = new EAmericanState("newYork", 32, "NY", null, 2, null);
    public static final EAmericanState northCarolina = new EAmericanState("northCarolina", 33, "NC", null, 2, null);
    public static final EAmericanState northDakota = new EAmericanState("northDakota", 34, "ND", null, 2, null);
    public static final EAmericanState ohio = new EAmericanState("ohio", 35, "OH", null, 2, null);
    public static final EAmericanState oklahoma = new EAmericanState("oklahoma", 36, "OK", null, 2, null);
    public static final EAmericanState oregon = new EAmericanState("oregon", 37, "OR", null, 2, null);
    public static final EAmericanState pennsylvania = new EAmericanState("pennsylvania", 38, "PA", null, 2, null);
    public static final EAmericanState puertoRico = new EAmericanState("puertoRico", 39, "PR", null, 2, null);
    public static final EAmericanState rhodeIsland = new EAmericanState("rhodeIsland", 40, "RI", null, 2, null);
    public static final EAmericanState southCarolina = new EAmericanState("southCarolina", 41, "SC", null, 2, null);
    public static final EAmericanState southDakota = new EAmericanState("southDakota", 42, "SD", null, 2, null);
    public static final EAmericanState tennessee = new EAmericanState("tennessee", 43, "TN", null, 2, null);
    public static final EAmericanState texas = new EAmericanState("texas", 44, "TX", null, 2, null);
    public static final EAmericanState utah = new EAmericanState("utah", 45, "UT", null, 2, null);
    public static final EAmericanState vermont = new EAmericanState("vermont", 46, "VT", null, 2, null);
    public static final EAmericanState virginia = new EAmericanState("virginia", 47, "VA", null, 2, null);
    public static final EAmericanState washington = new EAmericanState("washington", 48, "WA", null, 2, null);
    public static final EAmericanState westVirginia = new EAmericanState("westVirginia", 49, "WV", null, 2, null);
    public static final EAmericanState wisconsin = new EAmericanState("wisconsin", 50, "WI", null, 2, null);
    public static final EAmericanState wyoming = new EAmericanState("wyoming", 51, "WY", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ EAmericanState[] $values() {
        return new EAmericanState[]{alabama, alaska, arizona, arkansas, california, colorado, connecticut, delaware, districtOfColumbia, florida, georgia, hawaii, idaho, illinois, indiana, iowa, kansas, kentucky, louisiana, maine, maryland, massachusetts, michigan, minnesota, mississippi, missouri, montana, nebraska, nevada, newHampshire, newJersey, newMexico, newYork, northCarolina, northDakota, ohio, oklahoma, oregon, pennsylvania, puertoRico, rhodeIsland, southCarolina, southDakota, tennessee, texas, utah, vermont, virginia, washington, westVirginia, wisconsin, wyoming};
    }

    static {
        EAmericanState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EAmericanState(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native String Swift_displayName(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EAmericanState valueOf(String str) {
        return (EAmericanState) Enum.valueOf(EAmericanState.class, str);
    }

    public static EAmericanState[] values() {
        return (EAmericanState[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getDisplayName() {
        return Swift_displayName(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0082 J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EAmericanState$Companion;", "", "<init>", "()V", "displayName", "", "forCode", "Swift_Companion_displayName_0", ApiConstant.KEY_CODE, "init", "Lcom/polymarket/data/EAmericanState;", "rawValue", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_displayName_0(String code);

        public final String displayName(String forCode) {
            return Swift_Companion_displayName_0(forCode);
        }

        public final EAmericanState init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case 2090:
                    if (!rawValue.equals("AK")) {
                        return null;
                    }
                    return EAmericanState.alaska;
                case 2091:
                    if (rawValue.equals("AL")) {
                        return EAmericanState.alabama;
                    }
                    return null;
                case 2097:
                    if (rawValue.equals("AR")) {
                        return EAmericanState.arkansas;
                    }
                    return null;
                case 2105:
                    if (rawValue.equals("AZ")) {
                        return EAmericanState.arizona;
                    }
                    return null;
                case 2142:
                    if (rawValue.equals("CA")) {
                        return EAmericanState.california;
                    }
                    return null;
                case 2156:
                    if (rawValue.equals("CO")) {
                        return EAmericanState.colorado;
                    }
                    return null;
                case 2161:
                    if (rawValue.equals("CT")) {
                        return EAmericanState.connecticut;
                    }
                    return null;
                case 2175:
                    if (rawValue.equals("DC")) {
                        return EAmericanState.districtOfColumbia;
                    }
                    return null;
                case 2177:
                    if (rawValue.equals("DE")) {
                        return EAmericanState.delaware;
                    }
                    return null;
                case 2246:
                    if (rawValue.equals("FL")) {
                        return EAmericanState.florida;
                    }
                    return null;
                case 2266:
                    if (rawValue.equals("GA")) {
                        return EAmericanState.georgia;
                    }
                    return null;
                case 2305:
                    if (rawValue.equals("HI")) {
                        return EAmericanState.hawaii;
                    }
                    return null;
                case 2328:
                    if (rawValue.equals("IA")) {
                        return EAmericanState.iowa;
                    }
                    return null;
                case 2331:
                    if (rawValue.equals("ID")) {
                        return EAmericanState.idaho;
                    }
                    return null;
                case 2339:
                    if (rawValue.equals("IL")) {
                        return EAmericanState.illinois;
                    }
                    return null;
                case 2341:
                    if (rawValue.equals("IN")) {
                        return EAmericanState.indiana;
                    }
                    return null;
                case 2408:
                    if (rawValue.equals("KS")) {
                        return EAmericanState.kansas;
                    }
                    return null;
                case 2414:
                    if (rawValue.equals("KY")) {
                        return EAmericanState.kentucky;
                    }
                    return null;
                case 2421:
                    if (rawValue.equals("LA")) {
                        return EAmericanState.louisiana;
                    }
                    return null;
                case 2452:
                    if (rawValue.equals("MA")) {
                        return EAmericanState.massachusetts;
                    }
                    return null;
                case 2455:
                    if (rawValue.equals("MD")) {
                        return EAmericanState.maryland;
                    }
                    return null;
                case 2456:
                    if (rawValue.equals("ME")) {
                        return EAmericanState.maine;
                    }
                    return null;
                case 2460:
                    if (rawValue.equals("MI")) {
                        return EAmericanState.michigan;
                    }
                    return null;
                case 2465:
                    if (rawValue.equals("MN")) {
                        return EAmericanState.minnesota;
                    }
                    return null;
                case 2466:
                    if (rawValue.equals("MO")) {
                        return EAmericanState.missouri;
                    }
                    return null;
                case 2470:
                    if (rawValue.equals("MS")) {
                        return EAmericanState.mississippi;
                    }
                    return null;
                case 2471:
                    if (rawValue.equals("MT")) {
                        return EAmericanState.montana;
                    }
                    return null;
                case 2485:
                    if (rawValue.equals("NC")) {
                        return EAmericanState.northCarolina;
                    }
                    return null;
                case 2486:
                    if (rawValue.equals("ND")) {
                        return EAmericanState.northDakota;
                    }
                    return null;
                case 2487:
                    if (rawValue.equals("NE")) {
                        return EAmericanState.nebraska;
                    }
                    return null;
                case 2490:
                    if (rawValue.equals("NH")) {
                        return EAmericanState.newHampshire;
                    }
                    return null;
                case 2492:
                    if (rawValue.equals("NJ")) {
                        return EAmericanState.newJersey;
                    }
                    return null;
                case 2495:
                    if (rawValue.equals("NM")) {
                        return EAmericanState.newMexico;
                    }
                    return null;
                case 2504:
                    if (rawValue.equals("NV")) {
                        return EAmericanState.nevada;
                    }
                    return null;
                case 2507:
                    if (rawValue.equals("NY")) {
                        return EAmericanState.newYork;
                    }
                    return null;
                case 2521:
                    if (rawValue.equals("OH")) {
                        return EAmericanState.ohio;
                    }
                    return null;
                case 2524:
                    if (rawValue.equals("OK")) {
                        return EAmericanState.oklahoma;
                    }
                    return null;
                case 2531:
                    if (rawValue.equals("OR")) {
                        return EAmericanState.oregon;
                    }
                    return null;
                case 2545:
                    if (rawValue.equals("PA")) {
                        return EAmericanState.pennsylvania;
                    }
                    return null;
                case 2562:
                    if (rawValue.equals("PR")) {
                        return EAmericanState.puertoRico;
                    }
                    return null;
                case 2615:
                    if (rawValue.equals("RI")) {
                        return EAmericanState.rhodeIsland;
                    }
                    return null;
                case 2640:
                    if (rawValue.equals("SC")) {
                        return EAmericanState.southCarolina;
                    }
                    return null;
                case 2641:
                    if (rawValue.equals("SD")) {
                        return EAmericanState.southDakota;
                    }
                    return null;
                case 2682:
                    if (rawValue.equals("TN")) {
                        return EAmericanState.tennessee;
                    }
                    return null;
                case 2692:
                    if (rawValue.equals("TX")) {
                        return EAmericanState.texas;
                    }
                    return null;
                case 2719:
                    if (rawValue.equals("UT")) {
                        return EAmericanState.utah;
                    }
                    return null;
                case 2731:
                    if (rawValue.equals("VA")) {
                        return EAmericanState.virginia;
                    }
                    return null;
                case 2750:
                    if (rawValue.equals("VT")) {
                        return EAmericanState.vermont;
                    }
                    return null;
                case 2762:
                    if (rawValue.equals("WA")) {
                        return EAmericanState.washington;
                    }
                    return null;
                case 2770:
                    if (rawValue.equals("WI")) {
                        return EAmericanState.wisconsin;
                    }
                    return null;
                case 2783:
                    if (rawValue.equals("WV")) {
                        return EAmericanState.westVirginia;
                    }
                    return null;
                case 2786:
                    if (rawValue.equals("WY")) {
                        return EAmericanState.wyoming;
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

    private EAmericanState(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
