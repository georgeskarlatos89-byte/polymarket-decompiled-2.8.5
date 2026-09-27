package com.polymarket.chartlogic;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u008b\u0001\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\b\u0010\u001cB\u0093\u0001\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\b\u0010\u001fB\u009b\u0001\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b\b\u0010!J\u0006\u0010&\u001a\u00020'J\u0015\u0010(\u001a\u00020'2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\u001bH\u0016J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00109\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010;\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010=\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010?\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010A\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010C\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010E\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010G\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010I\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010L\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010O\u001a\u00020\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010Q\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u008f\u0001\u0010R\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\u0097\u0001\u0010S\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J\u009f\u0001\u0010T\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0082 J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020,0V2\u0006\u0010W\u001a\u00020\u001bH\u0016J\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020,0V2\u0006\u0010W\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u00106R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b<\u00106R\u0011\u0010\u0014\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b>\u00106R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b@\u00106R\u0011\u0010\u0016\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bB\u00106R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bD\u00106R\u0011\u0010\u0018\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bF\u00106R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bH\u00106R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010 \u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bP\u00106¨\u0006Z"}, d2 = {"Lcom/polymarket/chartlogic/ChartTransitionFrameRequest;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "fromPoints", "", "Lcom/polymarket/chartlogic/ChartPoint;", "toPoints", "finalPoints", "fromCurve", "", "toCurve", "fromLineWidth", "toLineWidth", "fromMinimumVisibleHorizontalRun", "toMinimumVisibleHorizontalRun", "pointCompletionProgress", "width", "height", "verticalPadding", "frameCount", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;DDDDDDDDDDI)V", "pathStyle", "Lcom/polymarket/chartlogic/ChartPathStyle;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;DDDDDDDDDDILcom/polymarket/chartlogic/ChartPathStyle;)V", "minimumVisibleVerticalMove", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;DDDDDDDDDDILcom/polymarket/chartlogic/ChartPathStyle;D)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getFromPoints", "()Ljava/util/List;", "Swift_fromPoints", "getToPoints", "Swift_toPoints", "getFinalPoints", "Swift_finalPoints", "getFromCurve", "()D", "Swift_fromCurve", "getToCurve", "Swift_toCurve", "getFromLineWidth", "Swift_fromLineWidth", "getToLineWidth", "Swift_toLineWidth", "getFromMinimumVisibleHorizontalRun", "Swift_fromMinimumVisibleHorizontalRun", "getToMinimumVisibleHorizontalRun", "Swift_toMinimumVisibleHorizontalRun", "getPointCompletionProgress", "Swift_pointCompletionProgress", "getWidth", "Swift_width", "getHeight", "Swift_height", "getVerticalPadding", "Swift_verticalPadding", "getFrameCount", "()I", "Swift_frameCount", "getPathStyle", "()Lcom/polymarket/chartlogic/ChartPathStyle;", "Swift_pathStyle", "getMinimumVisibleVerticalMove", "Swift_minimumVisibleVerticalMove", "Swift_constructor_0", "Swift_constructor_1", "Swift_constructor_2", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartTransitionFrameRequest implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ChartTransitionFrameRequest(List<ChartPoint> list, List<ChartPoint> list2, List<ChartPoint> list3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i, ChartPathStyle chartPathStyle) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        chartPathStyle.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(list, list2, list3, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, i, chartPathStyle);
    }

    private final native long Swift_constructor_0(List<ChartPoint> fromPoints, List<ChartPoint> toPoints, List<ChartPoint> finalPoints, double fromCurve, double toCurve, double fromLineWidth, double toLineWidth, double fromMinimumVisibleHorizontalRun, double toMinimumVisibleHorizontalRun, double pointCompletionProgress, double width, double height, double verticalPadding, int frameCount);

    private final native long Swift_constructor_1(List<ChartPoint> fromPoints, List<ChartPoint> toPoints, List<ChartPoint> finalPoints, double fromCurve, double toCurve, double fromLineWidth, double toLineWidth, double fromMinimumVisibleHorizontalRun, double toMinimumVisibleHorizontalRun, double pointCompletionProgress, double width, double height, double verticalPadding, int frameCount, ChartPathStyle pathStyle);

    private final native long Swift_constructor_2(List<ChartPoint> fromPoints, List<ChartPoint> toPoints, List<ChartPoint> finalPoints, double fromCurve, double toCurve, double fromLineWidth, double toLineWidth, double fromMinimumVisibleHorizontalRun, double toMinimumVisibleHorizontalRun, double pointCompletionProgress, double width, double height, double verticalPadding, int frameCount, ChartPathStyle pathStyle, double minimumVisibleVerticalMove);

    private final native List<ChartPoint> Swift_finalPoints(long Swift_peer);

    private final native int Swift_frameCount(long Swift_peer);

    private final native double Swift_fromCurve(long Swift_peer);

    private final native double Swift_fromLineWidth(long Swift_peer);

    private final native double Swift_fromMinimumVisibleHorizontalRun(long Swift_peer);

    private final native List<ChartPoint> Swift_fromPoints(long Swift_peer);

    private final native double Swift_height(long Swift_peer);

    private final native double Swift_minimumVisibleVerticalMove(long Swift_peer);

    private final native ChartPathStyle Swift_pathStyle(long Swift_peer);

    private final native double Swift_pointCompletionProgress(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_toCurve(long Swift_peer);

    private final native double Swift_toLineWidth(long Swift_peer);

    private final native double Swift_toMinimumVisibleHorizontalRun(long Swift_peer);

    private final native List<ChartPoint> Swift_toPoints(long Swift_peer);

    private final native double Swift_verticalPadding(long Swift_peer);

    private final native double Swift_width(long Swift_peer);

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

    public final List<ChartPoint> getFinalPoints() {
        return Swift_finalPoints(this.Swift_peer);
    }

    public final int getFrameCount() {
        return Swift_frameCount(this.Swift_peer);
    }

    public final double getFromCurve() {
        return Swift_fromCurve(this.Swift_peer);
    }

    public final double getFromLineWidth() {
        return Swift_fromLineWidth(this.Swift_peer);
    }

    public final double getFromMinimumVisibleHorizontalRun() {
        return Swift_fromMinimumVisibleHorizontalRun(this.Swift_peer);
    }

    public final List<ChartPoint> getFromPoints() {
        return Swift_fromPoints(this.Swift_peer);
    }

    public final double getHeight() {
        return Swift_height(this.Swift_peer);
    }

    public final double getMinimumVisibleVerticalMove() {
        return Swift_minimumVisibleVerticalMove(this.Swift_peer);
    }

    public final ChartPathStyle getPathStyle() {
        return Swift_pathStyle(this.Swift_peer);
    }

    public final double getPointCompletionProgress() {
        return Swift_pointCompletionProgress(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final double getToCurve() {
        return Swift_toCurve(this.Swift_peer);
    }

    public final double getToLineWidth() {
        return Swift_toLineWidth(this.Swift_peer);
    }

    public final double getToMinimumVisibleHorizontalRun() {
        return Swift_toMinimumVisibleHorizontalRun(this.Swift_peer);
    }

    public final List<ChartPoint> getToPoints() {
        return Swift_toPoints(this.Swift_peer);
    }

    public final double getVerticalPadding() {
        return Swift_verticalPadding(this.Swift_peer);
    }

    public final double getWidth() {
        return Swift_width(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ChartTransitionFrameRequest(List<ChartPoint> list, List<ChartPoint> list2, List<ChartPoint> list3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list, list2, list3, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, i);
    }

    public ChartTransitionFrameRequest(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public ChartTransitionFrameRequest(List<ChartPoint> list, List<ChartPoint> list2, List<ChartPoint> list3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i, ChartPathStyle chartPathStyle, double d11) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        chartPathStyle.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(list, list2, list3, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, i, chartPathStyle, d11);
    }
}
