package com.polymarket.chartlogic;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u0013BC\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00103\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00105\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J7\u00106\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 JG\u00107\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020!092\u0006\u0010:\u001a\u00020#H\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020!092\u0006\u0010:\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010%R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010%¨\u0006="}, d2 = {"Lcom/polymarket/chartlogic/ChartSnapshotOptions;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "chartWidth", "", "sampling", "Lcom/polymarket/chartlogic/ChartSampling;", "minimumVisibleHorizontalRun", "previousNormalizationContext", "Lcom/polymarket/chartlogic/ChartNormalizationContext;", "yAxisMode", "Lcom/polymarket/chartlogic/ChartYAxisMode;", "(DLcom/polymarket/chartlogic/ChartSampling;DLcom/polymarket/chartlogic/ChartNormalizationContext;Lcom/polymarket/chartlogic/ChartYAxisMode;)V", "axisMinimumVisualRange", "axisPaddingRatio", "(DLcom/polymarket/chartlogic/ChartSampling;DLcom/polymarket/chartlogic/ChartNormalizationContext;Lcom/polymarket/chartlogic/ChartYAxisMode;DD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getChartWidth", "()D", "Swift_chartWidth", "getSampling", "()Lcom/polymarket/chartlogic/ChartSampling;", "Swift_sampling", "getMinimumVisibleHorizontalRun", "Swift_minimumVisibleHorizontalRun", "getPreviousNormalizationContext", "()Lcom/polymarket/chartlogic/ChartNormalizationContext;", "Swift_previousNormalizationContext", "getYAxisMode", "()Lcom/polymarket/chartlogic/ChartYAxisMode;", "Swift_yAxisMode", "getAxisMinimumVisualRange", "Swift_axisMinimumVisualRange", "getAxisPaddingRatio", "Swift_axisPaddingRatio", "Swift_constructor_0", "Swift_constructor_1", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartSnapshotOptions implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChartSnapshotOptions(double d, ChartSampling chartSampling, double d2, ChartNormalizationContext chartNormalizationContext, ChartYAxisMode chartYAxisMode) {
        chartSampling.getClass();
        chartYAxisMode.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(d, chartSampling, d2, chartNormalizationContext, chartYAxisMode);
    }

    private final native double Swift_axisMinimumVisualRange(long Swift_peer);

    private final native double Swift_axisPaddingRatio(long Swift_peer);

    private final native double Swift_chartWidth(long Swift_peer);

    private final native long Swift_constructor_0(double chartWidth, ChartSampling sampling, double minimumVisibleHorizontalRun, ChartNormalizationContext previousNormalizationContext, ChartYAxisMode yAxisMode);

    private final native long Swift_constructor_1(double chartWidth, ChartSampling sampling, double minimumVisibleHorizontalRun, ChartNormalizationContext previousNormalizationContext, ChartYAxisMode yAxisMode, double axisMinimumVisualRange, double axisPaddingRatio);

    private final native double Swift_minimumVisibleHorizontalRun(long Swift_peer);

    private final native ChartNormalizationContext Swift_previousNormalizationContext(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ChartSampling Swift_sampling(long Swift_peer);

    private final native ChartYAxisMode Swift_yAxisMode(long Swift_peer);

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
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final double getAxisMinimumVisualRange() {
        return Swift_axisMinimumVisualRange(this.Swift_peer);
    }

    public final double getAxisPaddingRatio() {
        return Swift_axisPaddingRatio(this.Swift_peer);
    }

    public final double getChartWidth() {
        return Swift_chartWidth(this.Swift_peer);
    }

    public final double getMinimumVisibleHorizontalRun() {
        return Swift_minimumVisibleHorizontalRun(this.Swift_peer);
    }

    public final ChartNormalizationContext getPreviousNormalizationContext() {
        return Swift_previousNormalizationContext(this.Swift_peer);
    }

    public final ChartSampling getSampling() {
        return Swift_sampling(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ChartYAxisMode getYAxisMode() {
        return Swift_yAxisMode(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ChartSnapshotOptions(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ChartSnapshotOptions(double d, ChartSampling chartSampling, double d2, ChartNormalizationContext chartNormalizationContext, ChartYAxisMode chartYAxisMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, chartSampling, d2, chartNormalizationContext, (i & 16) != 0 ? ChartYAxisMode.unitRange : chartYAxisMode);
    }

    public ChartSnapshotOptions(double d, ChartSampling chartSampling, double d2, ChartNormalizationContext chartNormalizationContext, ChartYAxisMode chartYAxisMode, double d3, double d4) {
        chartSampling.getClass();
        chartYAxisMode.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(d, chartSampling, d2, chartNormalizationContext, chartYAxisMode, d3, d4);
    }
}
