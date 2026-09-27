package com.polymarket.chartlogic;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB3\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010+\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010,J<\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u0013H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020\u0013H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006;"}, d2 = {"Lcom/polymarket/chartlogic/ChartRenderAnchor;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "role", "Lcom/polymarket/chartlogic/ChartRenderAnchorRole;", "point", "Lcom/polymarket/chartlogic/ChartPoint;", "sourceT", "", "sourceIndex", "", "(Ljava/lang/String;Lcom/polymarket/chartlogic/ChartRenderAnchorRole;Lcom/polymarket/chartlogic/ChartPoint;DLjava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getRole", "()Lcom/polymarket/chartlogic/ChartRenderAnchorRole;", "Swift_role", "getPoint", "()Lcom/polymarket/chartlogic/ChartPoint;", "Swift_point", "getSourceT", "()D", "Swift_sourceT", "getSourceIndex", "()Ljava/lang/Integer;", "Swift_sourceIndex", "(J)Ljava/lang/Integer;", "Swift_constructor_0", "(Ljava/lang/String;Lcom/polymarket/chartlogic/ChartRenderAnchorRole;Lcom/polymarket/chartlogic/ChartPoint;DLjava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartRenderAnchor implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChartRenderAnchor(String str, ChartRenderAnchorRole chartRenderAnchorRole, ChartPoint chartPoint, double d, Integer num) {
        str.getClass();
        chartRenderAnchorRole.getClass();
        chartPoint.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, chartRenderAnchorRole, chartPoint, d, num);
    }

    private final native long Swift_constructor_0(String id, ChartRenderAnchorRole role, ChartPoint point, double sourceT, Integer sourceIndex);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isequal(ChartRenderAnchor lhs, ChartRenderAnchor rhs);

    private final native ChartPoint Swift_point(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ChartRenderAnchorRole Swift_role(long Swift_peer);

    private final native Integer Swift_sourceIndex(long Swift_peer);

    private final native double Swift_sourceT(long Swift_peer);

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
        if (!(other instanceof ChartRenderAnchor)) {
            return false;
        }
        return Swift_isequal(this, (ChartRenderAnchor) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final ChartPoint getPoint() {
        return Swift_point(this.Swift_peer);
    }

    public final ChartRenderAnchorRole getRole() {
        return Swift_role(this.Swift_peer);
    }

    public final Integer getSourceIndex() {
        return Swift_sourceIndex(this.Swift_peer);
    }

    public final double getSourceT() {
        return Swift_sourceT(this.Swift_peer);
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

    public ChartRenderAnchor(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
