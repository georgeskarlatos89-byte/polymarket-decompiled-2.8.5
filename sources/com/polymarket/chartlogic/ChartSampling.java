package com.polymarket.chartlogic;

import com.socure.docv.capturesdk.common.utils.BlurConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0016\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bJ%\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0082 J\u001e\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\rJ-\u0010$\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\rH\u0082 J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bJ%\u0010'\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0082 J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0019\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\rH\u0016J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+002\u0006\u00101\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00064"}, d2 = {"Lcom/polymarket/chartlogic/ChartSampling;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "window", "", "bucketCount", "", "(DI)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getWindow", "()D", "Swift_window", "getBucketCount", "()I", "Swift_bucketCount", "Swift_constructor_0", "effectiveBucketCount", "chartWidth", "minimumVisibleHorizontalRun", "Swift_effectiveBucketCount_2", "nestedBucketCount", "fidelityMultiplier", "Swift_nestedBucketCount_3", "scrubSampling", "baseMinimumVisibleHorizontalRun", "Swift_scrubSampling_4", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartSampling implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int scrubFidelityMultiplier = 2;
    private long Swift_peer;

    public ChartSampling(double d, int i) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(d, i);
    }

    private final native int Swift_bucketCount(long Swift_peer);

    private final native long Swift_constructor_0(double window, int bucketCount);

    private final native int Swift_effectiveBucketCount_2(long Swift_peer, double chartWidth, double minimumVisibleHorizontalRun);

    private final native boolean Swift_isequal(ChartSampling lhs, ChartSampling rhs);

    private final native int Swift_nestedBucketCount_3(long Swift_peer, double chartWidth, double minimumVisibleHorizontalRun, int fidelityMultiplier);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ChartSampling Swift_scrubSampling_4(long Swift_peer, double chartWidth, double baseMinimumVisibleHorizontalRun);

    private final native double Swift_window(long Swift_peer);

    public static final /* synthetic */ int access$getScrubFidelityMultiplier$cp() {
        return scrubFidelityMultiplier;
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

    public final int effectiveBucketCount(double chartWidth, double minimumVisibleHorizontalRun) {
        return Swift_effectiveBucketCount_2(this.Swift_peer, chartWidth, minimumVisibleHorizontalRun);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartSampling)) {
            return false;
        }
        return Swift_isequal(this, (ChartSampling) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getBucketCount() {
        return Swift_bucketCount(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final double getWindow() {
        return Swift_window(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final int nestedBucketCount(double chartWidth, double minimumVisibleHorizontalRun, int fidelityMultiplier) {
        return Swift_nestedBucketCount_3(this.Swift_peer, chartWidth, minimumVisibleHorizontalRun, fidelityMultiplier);
    }

    public final ChartSampling scrubSampling(double chartWidth, double baseMinimumVisibleHorizontalRun) {
        return Swift_scrubSampling_4(this.Swift_peer, chartWidth, baseMinimumVisibleHorizontalRun);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082 R\u0014\u0010\u000b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/polymarket/chartlogic/ChartSampling$Companion;", "", "<init>", "()V", "dynamic", "Lcom/polymarket/chartlogic/ChartSampling;", "window", "", "bucketCount", "", "Swift_Companion_dynamic_1", "scrubFidelityMultiplier", "getScrubFidelityMultiplier", "()I", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartSampling Swift_Companion_dynamic_1(double window, int bucketCount);

        public static /* synthetic */ ChartSampling dynamic$default(Companion companion, double d, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = 1800.0d;
            }
            if ((i2 & 2) != 0) {
                i = BlurConstants.H_BD;
            }
            return companion.dynamic(d, i);
        }

        public final ChartSampling dynamic(double window, int bucketCount) {
            return Swift_Companion_dynamic_1(window, bucketCount);
        }

        public final int getScrubFidelityMultiplier() {
            return ChartSampling.access$getScrubFidelityMultiplier$cp();
        }

        private Companion() {
        }
    }

    public ChartSampling(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
