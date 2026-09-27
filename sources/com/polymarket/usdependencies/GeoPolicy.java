package com.polymarket.usdependencies;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0015\u0010\u001d\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\u001e\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001f\u001a\u00020 H\u0082 J\u0015\u0010+\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010,\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001f\u001a\u00020 H\u0082 J\u0015\u0010-\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010:\u001a\u00020\u0001H\u0016J\u0013\u0010;\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0000H\u0082 J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u0002000A2\u0006\u0010B\u001a\u00020\u0015H\u0016J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u0002000A2\u0006\u0010B\u001a\u00020\u0015H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R(\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0012\u0018\u00010/X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006E"}, d2 = {"Lcom/polymarket/usdependencies/GeoPolicy;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "newValue", "Lcom/polymarket/usdependencies/GeoAssurance;", "assurance", "getAssurance", "()Lcom/polymarket/usdependencies/GeoAssurance;", "setAssurance", "(Lcom/polymarket/usdependencies/GeoAssurance;)V", "Swift_assurance", "Swift_assurance_set", "value", "", "hasBaselineGate", "getHasBaselineGate", "()Z", "setHasBaselineGate", "(Z)V", "Swift_hasBaselineGate", "Swift_hasBaselineGate_set", "gatesLiquidation", "getGatesLiquidation", "setGatesLiquidation", "Swift_gatesLiquidation", "Swift_gatesLiquidation_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoPolicy implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private GeoPolicy(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native GeoAssurance Swift_assurance(long Swift_peer);

    private final native void Swift_assurance_set(long Swift_peer, GeoAssurance value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native boolean Swift_gatesLiquidation(long Swift_peer);

    private final native void Swift_gatesLiquidation_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasBaselineGate(long Swift_peer);

    private final native void Swift_hasBaselineGate_set(long Swift_peer, boolean value);

    private final native boolean Swift_isequal(GeoPolicy lhs, GeoPolicy rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GeoPolicy)) {
            return false;
        }
        return Swift_isequal(this, (GeoPolicy) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final GeoAssurance getAssurance() {
        return Swift_assurance(this.Swift_peer);
    }

    public final boolean getGatesLiquidation() {
        return Swift_gatesLiquidation(this.Swift_peer);
    }

    public final boolean getHasBaselineGate() {
        return Swift_hasBaselineGate(this.Swift_peer);
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

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new GeoPolicy(this);
    }

    public final void setAssurance(GeoAssurance geoAssurance) {
        geoAssurance.getClass();
        willmutate();
        try {
            Swift_assurance_set(this.Swift_peer, geoAssurance);
        } finally {
            didmutate();
        }
    }

    public final void setGatesLiquidation(boolean z) {
        willmutate();
        try {
            Swift_gatesLiquidation_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setHasBaselineGate(boolean z) {
        willmutate();
        try {
            Swift_hasBaselineGate_set(this.Swift_peer, z);
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\t\u0010\u000b\u001a\u00020\u0005H\u0082 J\t\u0010\u000e\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usdependencies/GeoPolicy$Companion;", "", "<init>", "()V", "ios", "Lcom/polymarket/usdependencies/GeoPolicy;", "getIos", "()Lcom/polymarket/usdependencies/GeoPolicy;", "Swift_Companion_ios", "android", "getAndroid", "Swift_Companion_android", "platformDefault", "getPlatformDefault", "Swift_Companion_platformDefault", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native GeoPolicy Swift_Companion_android();

        private final native GeoPolicy Swift_Companion_ios();

        private final native GeoPolicy Swift_Companion_platformDefault();

        public final GeoPolicy getAndroid() {
            return Swift_Companion_android();
        }

        public final GeoPolicy getIos() {
            return Swift_Companion_ios();
        }

        public final GeoPolicy getPlatformDefault() {
            return Swift_Companion_platformDefault();
        }

        private Companion() {
        }
    }

    public GeoPolicy(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
