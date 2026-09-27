package com.polymarket.chartlogic;

import com.socure.docv.capturesdk.api.Keys;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBG\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010/\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JK\u00108\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0082 J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\"0>2\u0006\u0010?\u001a\u00020$H\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\"0>2\u0006\u0010?\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0016\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00148F¢\u0006\u0006\u001a\u0004\b;\u00104¨\u0006B"}, d2 = {"Lcom/polymarket/chartlogic/ChartSeriesSnapshot;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "normalizationContext", "Lcom/polymarket/chartlogic/ChartNormalizationContext;", "endNormalizedY", "", "renderModel", "Lcom/polymarket/chartlogic/ChartRenderModel;", "rawPoints", "", "Lcom/polymarket/chartlogic/ChartTimeSeriesPoint;", "latestValue", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/chartlogic/ChartNormalizationContext;DLcom/polymarket/chartlogic/ChartRenderModel;Ljava/util/List;D)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getNormalizationContext", "()Lcom/polymarket/chartlogic/ChartNormalizationContext;", "Swift_normalizationContext", "getEndNormalizedY", "()D", "Swift_endNormalizedY", "getRenderModel", "()Lcom/polymarket/chartlogic/ChartRenderModel;", "Swift_renderModel", "getRawPoints", "()Ljava/util/List;", "Swift_rawPoints", "getLatestValue", "Swift_latestValue", "Swift_constructor_0", "renderPoints", "Lcom/polymarket/chartlogic/ChartPoint;", "getRenderPoints", "Swift_renderPoints", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartSeriesSnapshot implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChartSeriesSnapshot(String str, String str2, ChartNormalizationContext chartNormalizationContext, double d, ChartRenderModel chartRenderModel, List<ChartTimeSeriesPoint> list, double d2) {
        str.getClass();
        str2.getClass();
        chartNormalizationContext.getClass();
        chartRenderModel.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, chartNormalizationContext, d, chartRenderModel, list, d2);
    }

    private final native long Swift_constructor_0(String id, String name, ChartNormalizationContext normalizationContext, double endNormalizedY, ChartRenderModel renderModel, List<ChartTimeSeriesPoint> rawPoints, double latestValue);

    private final native double Swift_endNormalizedY(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native double Swift_latestValue(long Swift_peer);

    private final native String Swift_name(long Swift_peer);

    private final native ChartNormalizationContext Swift_normalizationContext(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<ChartTimeSeriesPoint> Swift_rawPoints(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native ChartRenderModel Swift_renderModel(long Swift_peer);

    private final native List<ChartPoint> Swift_renderPoints(long Swift_peer);

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

    public final double getEndNormalizedY() {
        return Swift_endNormalizedY(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final double getLatestValue() {
        return Swift_latestValue(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final ChartNormalizationContext getNormalizationContext() {
        return Swift_normalizationContext(this.Swift_peer);
    }

    public final List<ChartTimeSeriesPoint> getRawPoints() {
        return Swift_rawPoints(this.Swift_peer);
    }

    public final ChartRenderModel getRenderModel() {
        return Swift_renderModel(this.Swift_peer);
    }

    public final List<ChartPoint> getRenderPoints() {
        return Swift_renderPoints(this.Swift_peer);
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

    public ChartSeriesSnapshot(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
