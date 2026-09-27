package com.polymarket.data;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001d\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010\u001e\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0015\u0010\u001f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\u000fH\u0082 J\u0011\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0000H\u0096\u0002J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\u0013\u0010'\u001a\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020(0+2\u0006\u0010,\u001a\u00020\u0019H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020(0+2\u0006\u0010,\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/polymarket/data/EQuantity;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "double", "", "(D)V", "unguarded", "", "(Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "valueDouble", "getValueDouble", "()D", "Swift_valueDouble", "Swift_constructor_0", "Swift_constructor_1", "string", "compareTo", "other", "Swift_islessthan", "", "lhs", "rhs", "equals", "", "Swift_isequal", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EQuantity implements Comparable<EQuantity>, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public EQuantity(String str) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(str);
    }

    private final native long Swift_constructor_0(double r1);

    private final native long Swift_constructor_1(String string);

    private final native boolean Swift_isequal(EQuantity lhs, EQuantity rhs);

    private final native boolean Swift_islessthan(EQuantity lhs, EQuantity rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_valueDouble(long Swift_peer);

    private static final boolean compareTo$islessthan(EQuantity eQuantity, EQuantity eQuantity2, EQuantity eQuantity3) {
        return eQuantity.Swift_islessthan(eQuantity2, eQuantity3);
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
    public int compareTo2(EQuantity other) {
        other.getClass();
        if (Intrinsics.areEqual(this, other)) {
            return 0;
        }
        if (compareTo$islessthan(this, this, other)) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object other) {
        if (!(other instanceof EQuantity)) {
            return false;
        }
        return Swift_isequal(this, (EQuantity) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
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

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/data/EQuantity$Companion;", "", "<init>", "()V", "zeroValue", "Lcom/polymarket/data/EQuantity;", "getZeroValue", "()Lcom/polymarket/data/EQuantity;", "Swift_Companion_zeroValue", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EQuantity Swift_Companion_zeroValue();

        public final EQuantity getZeroValue() {
            return Swift_Companion_zeroValue();
        }

        private Companion() {
        }
    }

    public EQuantity(double d) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(d);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(EQuantity eQuantity) {
        return compareTo2(eQuantity);
    }

    public /* synthetic */ EQuantity(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConstantsKt.UNSET : d);
    }

    public EQuantity(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
