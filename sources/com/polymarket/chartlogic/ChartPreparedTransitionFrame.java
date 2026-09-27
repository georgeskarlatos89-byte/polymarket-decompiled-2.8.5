package com.polymarket.chartlogic;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBM\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00103\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JQ\u00104\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020 062\u0006\u00107\u001a\u00020\"H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020 062\u0006\u00107\u001a\u00020\"H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010$R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010$R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006:"}, d2 = {"Lcom/polymarket/chartlogic/ChartPreparedTransitionFrame;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "progress", "", "points", "", "Lcom/polymarket/chartlogic/ChartPoint;", "pathCommands", "Lcom/polymarket/chartlogic/ChartPathCommand;", "curve", "lineWidth", "minimumVisibleHorizontalRun", "usesFinalDisplayModel", "", "(DLjava/util/List;Ljava/util/List;DDDZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getProgress", "()D", "Swift_progress", "getPoints", "()Ljava/util/List;", "Swift_points", "getPathCommands", "Swift_pathCommands", "getCurve", "Swift_curve", "getLineWidth", "Swift_lineWidth", "getMinimumVisibleHorizontalRun", "Swift_minimumVisibleHorizontalRun", "getUsesFinalDisplayModel", "()Z", "Swift_usesFinalDisplayModel", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartPreparedTransitionFrame implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChartPreparedTransitionFrame(double d, List<ChartPoint> list, List<ChartPathCommand> list2, double d2, double d3, double d4, boolean z) {
        list.getClass();
        list2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(d, list, list2, d2, d3, d4, z);
    }

    private final native long Swift_constructor_0(double progress, List<ChartPoint> points, List<ChartPathCommand> pathCommands, double curve, double lineWidth, double minimumVisibleHorizontalRun, boolean usesFinalDisplayModel);

    private final native double Swift_curve(long Swift_peer);

    private final native double Swift_lineWidth(long Swift_peer);

    private final native double Swift_minimumVisibleHorizontalRun(long Swift_peer);

    private final native List<ChartPathCommand> Swift_pathCommands(long Swift_peer);

    private final native List<ChartPoint> Swift_points(long Swift_peer);

    private final native double Swift_progress(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_usesFinalDisplayModel(long Swift_peer);

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

    public final double getCurve() {
        return Swift_curve(this.Swift_peer);
    }

    public final double getLineWidth() {
        return Swift_lineWidth(this.Swift_peer);
    }

    public final double getMinimumVisibleHorizontalRun() {
        return Swift_minimumVisibleHorizontalRun(this.Swift_peer);
    }

    public final List<ChartPathCommand> getPathCommands() {
        return Swift_pathCommands(this.Swift_peer);
    }

    public final List<ChartPoint> getPoints() {
        return Swift_points(this.Swift_peer);
    }

    public final double getProgress() {
        return Swift_progress(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final boolean getUsesFinalDisplayModel() {
        return Swift_usesFinalDisplayModel(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ChartPreparedTransitionFrame(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
