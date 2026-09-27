package com.polymarket.data;

import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003]^_B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010$\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010%\u001a\u00020\u001dH\u0082 J\u0015\u0010)\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010,\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010/\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00102\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00107\u001a\u0002042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0011\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0000H\u0096\u0002J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0000H\u0082 J\u0013\u0010>\u001a\u00020;2\b\u00109\u001a\u0004\u0018\u00010?H\u0096\u0002J\u0019\u0010@\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0000H\u0082 J\u0015\u0010C\u001a\u00020;2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010F\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001a\u0010G\u001a\u0002042\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020;J%\u0010K\u001a\u0002042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020;H\u0082 J\u0015\u0010L\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0082 J\b\u0010X\u001a\u00020\u0002H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020?0Z2\u0006\u0010[\u001a\u00020\u0016H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020?0Z2\u0006\u0010[\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0011\u0010-\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0011\u00100\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u0010(R\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010A\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010(R(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0013\u0018\u00010NX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006`"}, d2 = {"Lcom/polymarket/data/EAmount;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "valueDouble", "", "getValueDouble", "()D", "Swift_valueDouble", "newValue", "Lcom/polymarket/data/EAmount$Currency;", "currency", "getCurrency", "()Lcom/polymarket/data/EAmount$Currency;", "setCurrency", "(Lcom/polymarket/data/EAmount$Currency;)V", "Swift_currency", "Swift_currency_set", "value", "rounded", "getRounded", "()Lcom/polymarket/data/EAmount;", "Swift_rounded", "roundedToWhole", "getRoundedToWhole", "Swift_roundedToWhole", "roundedDown", "getRoundedDown", "Swift_roundedDown", "scaled", "getScaled", "Swift_scaled", "apiString", "", "getApiString", "()Ljava/lang/String;", "Swift_apiString", "compareTo", "other", "Swift_islessthan", "", "lhs", "rhs", "equals", "", "Swift_isequal", "isPositive", "()Z", "Swift_isPositive", "absolute", "getAbsolute", "Swift_absolute", "formatted", "formatType", "Lcom/polymarket/data/EAmount$FormatType;", "withSign", "Swift_formatted_0", "Swift_constructor_5", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Currency", "FormatType", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EAmount implements Comparable<EAmount>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EAmount(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_5(mutableStruct);
    }

    private final native EAmount Swift_absolute(long Swift_peer);

    private final native String Swift_apiString(long Swift_peer);

    private final native long Swift_constructor_5(MutableStruct copy);

    private final native Currency Swift_currency(long Swift_peer);

    private final native void Swift_currency_set(long Swift_peer, Currency value);

    private final native String Swift_formatted_0(long Swift_peer, FormatType formatType, boolean withSign);

    private final native boolean Swift_isPositive(long Swift_peer);

    private final native boolean Swift_isequal(EAmount lhs, EAmount rhs);

    private final native boolean Swift_islessthan(EAmount lhs, EAmount rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native EAmount Swift_rounded(long Swift_peer);

    private final native EAmount Swift_roundedDown(long Swift_peer);

    private final native EAmount Swift_roundedToWhole(long Swift_peer);

    private final native EAmount Swift_scaled(long Swift_peer);

    private final native double Swift_valueDouble(long Swift_peer);

    private static final boolean compareTo$islessthan(EAmount eAmount, EAmount eAmount2, EAmount eAmount3) {
        return eAmount.Swift_islessthan(eAmount2, eAmount3);
    }

    public static /* synthetic */ String formatted$default(EAmount eAmount, FormatType formatType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            formatType = FormatType.INSTANCE.getDefault();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return eAmount.formatted(formatType, z);
    }

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(EAmount other) {
        other.getClass();
        if (Intrinsics.areEqual(this, other)) {
            return 0;
        }
        if (compareTo$islessthan(this, this, other)) {
            return -1;
        }
        return 1;
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof EAmount)) {
            return false;
        }
        return Swift_isequal(this, (EAmount) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String formatted(FormatType formatType, boolean withSign) {
        formatType.getClass();
        return Swift_formatted_0(this.Swift_peer, formatType, withSign);
    }

    public final EAmount getAbsolute() {
        return Swift_absolute(this.Swift_peer);
    }

    public final String getApiString() {
        return Swift_apiString(this.Swift_peer);
    }

    public final Currency getCurrency() {
        return Swift_currency(this.Swift_peer);
    }

    public final EAmount getRounded() {
        return Swift_rounded(this.Swift_peer);
    }

    public final EAmount getRoundedDown() {
        return Swift_roundedDown(this.Swift_peer);
    }

    public final EAmount getRoundedToWhole() {
        return Swift_roundedToWhole(this.Swift_peer);
    }

    public final EAmount getScaled() {
        return Swift_scaled(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final double getValueDouble() {
        return Swift_valueDouble(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isPositive() {
        return Swift_isPositive(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EAmount(this);
    }

    public final void setCurrency(Currency currency) {
        currency.getClass();
        willmutate();
        try {
            Swift_currency_set(this.Swift_peer, currency);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001$B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0082 J\u0011\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dj\u0002\b\fj\u0002\b\r¨\u0006%"}, d2 = {"Lcom/polymarket/data/EAmount$Currency;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "USD", "USDC", AppsFlyerProperties.CURRENCY_CODE, "getCurrencyCode", "Swift_currencyCode", Keys.KEY_NAME, "decimalPlaces", "", "getDecimalPlaces", "()I", "Swift_decimalPlaces", "symbol", "getSymbol", "Swift_symbol", "supportsDecimalPlaces", "", "getSupportsDecimalPlaces", "()Z", "Swift_supportsDecimalPlaces", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Currency implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Currency[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Currency USD = new Currency("USD", 0, "USD", null, 2, null);
        public static final Currency USDC = new Currency("USDC", 1, "USDC", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Currency[] $values() {
            return new Currency[]{USD, USDC};
        }

        static {
            Currency[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Currency(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native String Swift_currencyCode(String name);

        private final native int Swift_decimalPlaces(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native boolean Swift_supportsDecimalPlaces(String name);

        private final native String Swift_symbol(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Currency valueOf(String str) {
            return (Currency) Enum.valueOf(Currency.class, str);
        }

        public static Currency[] values() {
            return (Currency[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getCurrencyCode() {
            return Swift_currencyCode(name());
        }

        public final int getDecimalPlaces() {
            return Swift_decimalPlaces(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final boolean getSupportsDecimalPlaces() {
            return Swift_supportsDecimalPlaces(name());
        }

        public final String getSymbol() {
            return Swift_symbol(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EAmount$Currency$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EAmount$Currency;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Currency init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "USD")) {
                    return Currency.USD;
                }
                if (Intrinsics.areEqual(rawValue, "USDC")) {
                    return Currency.USDC;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Currency(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\r\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "DefaultCase", "WholeOnlyCase", "WithDecimalsCase", "WithDecimalsIfNeededCase", "CompactCase", "CompactCleanCase", "KeylineCompactCase", "CentsWholeCase", "CentsOnePlaceCase", "CentsAdaptiveCase", "CentsCase", "PercentWholeCase", "DisplayOddsCase", "Companion", "Lcom/polymarket/data/EAmount$FormatType$CentsAdaptiveCase;", "Lcom/polymarket/data/EAmount$FormatType$CentsCase;", "Lcom/polymarket/data/EAmount$FormatType$CentsOnePlaceCase;", "Lcom/polymarket/data/EAmount$FormatType$CentsWholeCase;", "Lcom/polymarket/data/EAmount$FormatType$CompactCase;", "Lcom/polymarket/data/EAmount$FormatType$CompactCleanCase;", "Lcom/polymarket/data/EAmount$FormatType$DefaultCase;", "Lcom/polymarket/data/EAmount$FormatType$DisplayOddsCase;", "Lcom/polymarket/data/EAmount$FormatType$KeylineCompactCase;", "Lcom/polymarket/data/EAmount$FormatType$PercentWholeCase;", "Lcom/polymarket/data/EAmount$FormatType$WholeOnlyCase;", "Lcom/polymarket/data/EAmount$FormatType$WithDecimalsCase;", "Lcom/polymarket/data/EAmount$FormatType$WithDecimalsIfNeededCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class FormatType implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: default, reason: not valid java name */
        private static final FormatType f3default = new DefaultCase();
        private static final FormatType wholeOnly = new WholeOnlyCase();
        private static final FormatType withDecimals = new WithDecimalsCase();
        private static final FormatType compact = new CompactCase();
        private static final FormatType compactClean = new CompactCleanCase();
        private static final FormatType keylineCompact = new KeylineCompactCase();
        private static final FormatType centsWhole = new CentsWholeCase();
        private static final FormatType centsOnePlace = new CentsOnePlaceCase();
        private static final FormatType centsAdaptive = new CentsAdaptiveCase();
        private static final FormatType percentWhole = new PercentWholeCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CentsAdaptiveCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CentsAdaptiveCase extends FormatType {
            public CentsAdaptiveCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CentsCase;", "Lcom/polymarket/data/EAmount$FormatType;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "places", "getPlaces", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CentsCase extends FormatType {
            private final int associated0;
            private final int places;

            public CentsCase(int i) {
                super(null);
                this.associated0 = i;
                this.places = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }

            public final int getPlaces() {
                return this.places;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CentsOnePlaceCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CentsOnePlaceCase extends FormatType {
            public CentsOnePlaceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CentsWholeCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CentsWholeCase extends FormatType {
            public CentsWholeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CompactCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CompactCase extends FormatType {
            public CompactCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$CompactCleanCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CompactCleanCase extends FormatType {
            public CompactCleanCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$DefaultCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DefaultCase extends FormatType {
            public DefaultCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$DisplayOddsCase;", "Lcom/polymarket/data/EAmount$FormatType;", "associated0", "Lcom/polymarket/data/OddsFormat;", "<init>", "(Lcom/polymarket/data/OddsFormat;)V", "getAssociated0", "()Lcom/polymarket/data/OddsFormat;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DisplayOddsCase extends FormatType {
            private final OddsFormat associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayOddsCase(OddsFormat oddsFormat) {
                super(null);
                oddsFormat.getClass();
                this.associated0 = oddsFormat;
            }

            public final OddsFormat getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$KeylineCompactCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class KeylineCompactCase extends FormatType {
            public KeylineCompactCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$PercentWholeCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class PercentWholeCase extends FormatType {
            public PercentWholeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$WholeOnlyCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WholeOnlyCase extends FormatType {
            public WholeOnlyCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$WithDecimalsCase;", "Lcom/polymarket/data/EAmount$FormatType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithDecimalsCase extends FormatType {
            public WithDecimalsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$WithDecimalsIfNeededCase;", "Lcom/polymarket/data/EAmount$FormatType;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WithDecimalsIfNeededCase extends FormatType {
            private final double associated0;

            public WithDecimalsIfNeededCase(double d) {
                super(null);
                this.associated0 = d;
            }

            public final double getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ FormatType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ FormatType access$getCentsAdaptive$cp() {
            return centsAdaptive;
        }

        public static final /* synthetic */ FormatType access$getCentsOnePlace$cp() {
            return centsOnePlace;
        }

        public static final /* synthetic */ FormatType access$getCentsWhole$cp() {
            return centsWhole;
        }

        public static final /* synthetic */ FormatType access$getCompact$cp() {
            return compact;
        }

        public static final /* synthetic */ FormatType access$getCompactClean$cp() {
            return compactClean;
        }

        public static final /* synthetic */ FormatType access$getDefault$cp() {
            return f3default;
        }

        public static final /* synthetic */ FormatType access$getKeylineCompact$cp() {
            return keylineCompact;
        }

        public static final /* synthetic */ FormatType access$getPercentWhole$cp() {
            return percentWhole;
        }

        public static final /* synthetic */ FormatType access$getWholeOnly$cp() {
            return wholeOnly;
        }

        public static final /* synthetic */ FormatType access$getWithDecimals$cp() {
            return withDecimals;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007¨\u0006\""}, d2 = {"Lcom/polymarket/data/EAmount$FormatType$Companion;", "", "<init>", "()V", "default", "Lcom/polymarket/data/EAmount$FormatType;", "getDefault", "()Lcom/polymarket/data/EAmount$FormatType;", "wholeOnly", "getWholeOnly", "withDecimals", "getWithDecimals", "withDecimalsIfNeeded", "associated0", "", "compact", "getCompact", "compactClean", "getCompactClean", "keylineCompact", "getKeylineCompact", "centsWhole", "getCentsWhole", "centsOnePlace", "getCentsOnePlace", "centsAdaptive", "getCentsAdaptive", "cents", "places", "", "percentWhole", "getPercentWhole", "displayOdds", "Lcom/polymarket/data/OddsFormat;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ FormatType withDecimalsIfNeeded$default(Companion companion, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = 100.0d;
                }
                return companion.withDecimalsIfNeeded(d);
            }

            public final FormatType cents(int places) {
                return new CentsCase(places);
            }

            public final FormatType displayOdds(OddsFormat associated0) {
                associated0.getClass();
                return new DisplayOddsCase(associated0);
            }

            public final FormatType getCentsAdaptive() {
                return FormatType.access$getCentsAdaptive$cp();
            }

            public final FormatType getCentsOnePlace() {
                return FormatType.access$getCentsOnePlace$cp();
            }

            public final FormatType getCentsWhole() {
                return FormatType.access$getCentsWhole$cp();
            }

            public final FormatType getCompact() {
                return FormatType.access$getCompact$cp();
            }

            public final FormatType getCompactClean() {
                return FormatType.access$getCompactClean$cp();
            }

            public final FormatType getDefault() {
                return FormatType.access$getDefault$cp();
            }

            public final FormatType getKeylineCompact() {
                return FormatType.access$getKeylineCompact$cp();
            }

            public final FormatType getPercentWhole() {
                return FormatType.access$getPercentWhole$cp();
            }

            public final FormatType getWholeOnly() {
                return FormatType.access$getWholeOnly$cp();
            }

            public final FormatType getWithDecimals() {
                return FormatType.access$getWithDecimals$cp();
            }

            public final FormatType withDecimalsIfNeeded(double associated0) {
                return new WithDecimalsIfNeededCase(associated0);
            }

            private Companion() {
            }
        }

        private FormatType() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0006\u0010\u0010\u001a\u00020\u0005J\t\u0010\u0011\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EAmount$Companion;", "", "<init>", "()V", "zeroUSD", "Lcom/polymarket/data/EAmount;", "getZeroUSD", "()Lcom/polymarket/data/EAmount;", "Swift_Companion_zeroUSD", "usd", "double", "", "Swift_Companion_usd_1", "value", "usdc", "Swift_Companion_usdc_2", "mockUSD", "Swift_Companion_mockUSD_3", "mock", "Swift_Companion_mock_4", "Currency", "Lcom/polymarket/data/EAmount$Currency;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EAmount Swift_Companion_mockUSD_3();

        private final native EAmount Swift_Companion_mock_4(double value);

        private final native EAmount Swift_Companion_usd_1(double value);

        private final native EAmount Swift_Companion_usdc_2(double value);

        private final native EAmount Swift_Companion_zeroUSD();

        public final Currency Currency(String rawValue) {
            rawValue.getClass();
            return Currency.INSTANCE.init(rawValue);
        }

        public final EAmount getZeroUSD() {
            return Swift_Companion_zeroUSD();
        }

        public final EAmount mock(double r1) {
            return Swift_Companion_mock_4(r1);
        }

        public final EAmount mockUSD() {
            return Swift_Companion_mockUSD_3();
        }

        public final EAmount usd(double r1) {
            return Swift_Companion_usd_1(r1);
        }

        public final EAmount usdc(double r1) {
            return Swift_Companion_usdc_2(r1);
        }

        private Companion() {
        }
    }

    public EAmount(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(EAmount eAmount) {
        return compareTo2(eAmount);
    }
}
