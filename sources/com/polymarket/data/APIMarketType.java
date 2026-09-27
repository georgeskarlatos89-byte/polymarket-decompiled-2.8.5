package com.polymarket.data;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001 B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006!"}, d2 = {"Lcom/polymarket/data/APIMarketType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "award", "drawableOutcome", "futures", "moneyline", "props", "spreads", "totals", "unknown", "showsSideBadge", "", "getShowsSideBadge", "()Z", "Swift_showsSideBadge", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIMarketType implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ APIMarketType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final APIMarketType award = new APIMarketType("award", 0, "award", null, 2, null);
    public static final APIMarketType drawableOutcome = new APIMarketType("drawableOutcome", 1, "drawable_outcome", null, 2, null);
    public static final APIMarketType futures = new APIMarketType("futures", 2, "futures", null, 2, null);
    public static final APIMarketType moneyline = new APIMarketType("moneyline", 3, "moneyline", null, 2, null);
    public static final APIMarketType props = new APIMarketType("props", 4, "props", null, 2, null);
    public static final APIMarketType spreads = new APIMarketType("spreads", 5, "spreads", null, 2, null);
    public static final APIMarketType totals = new APIMarketType("totals", 6, "totals", null, 2, null);
    public static final APIMarketType unknown = new APIMarketType("unknown", 7, "unknown", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ APIMarketType[] $values() {
        return new APIMarketType[]{award, drawableOutcome, futures, moneyline, props, spreads, totals, unknown};
    }

    static {
        APIMarketType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ APIMarketType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native boolean Swift_showsSideBadge(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static APIMarketType valueOf(String str) {
        return (APIMarketType) Enum.valueOf(APIMarketType.class, str);
    }

    public static APIMarketType[] values() {
        return (APIMarketType[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final boolean getShowsSideBadge() {
        return Swift_showsSideBadge(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APIMarketType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APIMarketType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APIMarketType init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1996407456:
                    if (!rawValue.equals("spreads")) {
                        return null;
                    }
                    return APIMarketType.spreads;
                case -1712820044:
                    if (rawValue.equals("moneyline")) {
                        return APIMarketType.moneyline;
                    }
                    return null;
                case -867922513:
                    if (rawValue.equals("totals")) {
                        return APIMarketType.totals;
                    }
                    return null;
                case -503567600:
                    if (rawValue.equals("futures")) {
                        return APIMarketType.futures;
                    }
                    return null;
                case -284840886:
                    if (rawValue.equals("unknown")) {
                        return APIMarketType.unknown;
                    }
                    return null;
                case 93223517:
                    if (rawValue.equals("award")) {
                        return APIMarketType.award;
                    }
                    return null;
                case 106940784:
                    if (rawValue.equals("props")) {
                        return APIMarketType.props;
                    }
                    return null;
                case 1460973745:
                    if (rawValue.equals("drawable_outcome")) {
                        return APIMarketType.drawableOutcome;
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

    private APIMarketType(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
