package com.polymarket.chartlogic;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0082 J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u00063"}, d2 = {"Lcom/polymarket/chartlogic/ChartBucketLayout;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "bucketCount", "", "minT", "", "maxT", "normalizationMinT", "normalizationMaxT", "(IDDDD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getBucketCount", "()I", "Swift_bucketCount", "getMinT", "()D", "Swift_minT", "getMaxT", "Swift_maxT", "getNormalizationMinT", "Swift_normalizationMinT", "getNormalizationMaxT", "Swift_normalizationMaxT", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartBucketLayout implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public ChartBucketLayout(int i, double d, double d2, double d3, double d4) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(i, d, d2, d3, d4);
    }

    private final native int Swift_bucketCount(long Swift_peer);

    private final native long Swift_constructor_0(int bucketCount, double minT, double maxT, double normalizationMinT, double normalizationMaxT);

    private final native boolean Swift_isequal(ChartBucketLayout lhs, ChartBucketLayout rhs);

    private final native double Swift_maxT(long Swift_peer);

    private final native double Swift_minT(long Swift_peer);

    private final native double Swift_normalizationMaxT(long Swift_peer);

    private final native double Swift_normalizationMinT(long Swift_peer);

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

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartBucketLayout)) {
            return false;
        }
        return Swift_isequal(this, (ChartBucketLayout) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getBucketCount() {
        return Swift_bucketCount(this.Swift_peer);
    }

    public final double getMaxT() {
        return Swift_maxT(this.Swift_peer);
    }

    public final double getMinT() {
        return Swift_minT(this.Swift_peer);
    }

    public final double getNormalizationMaxT() {
        return Swift_normalizationMaxT(this.Swift_peer);
    }

    public final double getNormalizationMinT() {
        return Swift_normalizationMinT(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ+\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¨\u0006\r"}, d2 = {"Lcom/polymarket/chartlogic/ChartBucketLayout$Companion;", "", "<init>", "()V", "make", "Lcom/polymarket/chartlogic/ChartBucketLayout;", "sampling", "Lcom/polymarket/chartlogic/ChartSampling;", "chartWidth", "", "minimumVisibleHorizontalRun", "referenceMaxT", "Swift_Companion_make_1", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartBucketLayout Swift_Companion_make_1(ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun, double referenceMaxT);

        public final ChartBucketLayout make(ChartSampling sampling, double chartWidth, double minimumVisibleHorizontalRun, double referenceMaxT) {
            sampling.getClass();
            return Swift_Companion_make_1(sampling, chartWidth, minimumVisibleHorizontalRun, referenceMaxT);
        }

        private Companion() {
        }
    }

    public ChartBucketLayout(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
