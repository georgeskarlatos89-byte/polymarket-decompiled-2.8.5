package com.polymarket.chartlogic;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bJ\u001d\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010'\u001a\u00020\u000bH\u0082 J\u000e\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bJ\u001d\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010+\u001a\u00020\u000bH\u0082 J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\u001d\u0010/\u001a\u00020-2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u00100\u001a\u00020-H\u0082 J\u000e\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bJ\u001d\u00103\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010'\u001a\u00020\u000bH\u0082 J\u000e\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bJ\u001d\u00106\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010+\u001a\u00020\u000bH\u0082 J\u000e\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020-J\u001d\u00109\u001a\u00020-2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u00100\u001a\u00020-H\u0082 J8\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020-0;2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0017JA\u0010A\u001a\b\u0012\u0004\u0012\u00020<0;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u0017H\u0082 JB\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020EJQ\u0010F\u001a\b\u0012\u0004\u0012\u00020<0;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020EH\u0082 J$\u0010G\u001a\b\u0012\u0004\u0012\u00020-0;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020-0;2\b\b\u0002\u0010?\u001a\u00020\u000bJ1\u0010H\u001a\b\u0012\u0004\u0012\u00020-0;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010?\u001a\u00020\u000bH\u0082 J*\u0010G\u001a\b\u0012\u0004\u0012\u00020-0;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000bJ9\u0010I\u001a\b\u0012\u0004\u0012\u00020-0;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020-0;2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000bH\u0082 J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00190K2\u0006\u0010L\u001a\u00020\u001bH\u0016J\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00190K2\u0006\u0010L\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006O"}, d2 = {"Lcom/polymarket/chartlogic/ChartGeometry;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "width", "", "height", "verticalPadding", "(DDD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getWidth", "()D", "Swift_width", "getHeight", "Swift_height", "getVerticalPadding", "Swift_verticalPadding", "Swift_constructor_0", "chartX", "forNormalizedX", "Swift_chartX_1", "x", "chartY", "forNormalizedY", "Swift_chartY_2", "y", "chartPoint", "Lcom/polymarket/chartlogic/ChartPoint;", "forNormalized", "Swift_chartPoint_3", "point", "normalizedX", "forChartX", "Swift_normalizedX_4", "normalizedY", "forChartY", "Swift_normalizedY_5", "normalizedPoint", "forChart", "Swift_normalizedPoint_6", "makePath", "", "Lcom/polymarket/chartlogic/ChartPathCommand;", TicketDetailDestinationKt.LAUNCHED_FROM, "curveFactor", "minimumVisibleHorizontalRun", "appliesVisualStabilization", "Swift_makePath_7", "points", "minimumVisibleVerticalMove", "pathStyle", "Lcom/polymarket/chartlogic/ChartPathStyle;", "Swift_makePath_8", "visualRenderPoints", "Swift_visualRenderPoints_9", "Swift_visualRenderPoints_10", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartGeometry implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final double defaultVerticalPadding = 16.0d;
    private long Swift_peer;

    public ChartGeometry(double d, double d2, double d3) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(d, d2, d3);
    }

    private final native ChartPoint Swift_chartPoint_3(long Swift_peer, ChartPoint point);

    private final native double Swift_chartX_1(long Swift_peer, double x);

    private final native double Swift_chartY_2(long Swift_peer, double y);

    private final native long Swift_constructor_0(double width, double height, double verticalPadding);

    private final native double Swift_height(long Swift_peer);

    private final native List<ChartPathCommand> Swift_makePath_7(long Swift_peer, List<ChartPoint> points, double curveFactor, double minimumVisibleHorizontalRun, boolean appliesVisualStabilization);

    private final native List<ChartPathCommand> Swift_makePath_8(long Swift_peer, List<ChartPoint> points, double curveFactor, double minimumVisibleHorizontalRun, boolean appliesVisualStabilization, double minimumVisibleVerticalMove, ChartPathStyle pathStyle);

    private final native ChartPoint Swift_normalizedPoint_6(long Swift_peer, ChartPoint point);

    private final native double Swift_normalizedX_4(long Swift_peer, double x);

    private final native double Swift_normalizedY_5(long Swift_peer, double y);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_verticalPadding(long Swift_peer);

    private final native List<ChartPoint> Swift_visualRenderPoints_10(long Swift_peer, List<ChartPoint> points, double minimumVisibleHorizontalRun, double minimumVisibleVerticalMove);

    private final native List<ChartPoint> Swift_visualRenderPoints_9(long Swift_peer, List<ChartPoint> points, double minimumVisibleHorizontalRun);

    private final native double Swift_width(long Swift_peer);

    public static final /* synthetic */ double access$getDefaultVerticalPadding$cp() {
        return defaultVerticalPadding;
    }

    public static /* synthetic */ List makePath$default(ChartGeometry chartGeometry, List list, double d, double d2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 1.0d;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = INSTANCE.getDefaultMinimumVisibleHorizontalRun();
        }
        double d4 = d2;
        if ((i & 8) != 0) {
            z = true;
        }
        return chartGeometry.makePath(list, d3, d4, z);
    }

    public static /* synthetic */ List visualRenderPoints$default(ChartGeometry chartGeometry, List list, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = INSTANCE.getDefaultMinimumVisibleHorizontalRun();
        }
        return chartGeometry.visualRenderPoints(list, d);
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

    public final ChartPoint chartPoint(ChartPoint forNormalized) {
        forNormalized.getClass();
        return Swift_chartPoint_3(this.Swift_peer, forNormalized);
    }

    public final double chartX(double forNormalizedX) {
        return Swift_chartX_1(this.Swift_peer, forNormalizedX);
    }

    public final double chartY(double forNormalizedY) {
        return Swift_chartY_2(this.Swift_peer, forNormalizedY);
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

    public final double getHeight() {
        return Swift_height(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
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

    public final List<ChartPathCommand> makePath(List<ChartPoint> from, double curveFactor, double minimumVisibleHorizontalRun, boolean appliesVisualStabilization, double minimumVisibleVerticalMove, ChartPathStyle pathStyle) {
        from.getClass();
        pathStyle.getClass();
        return Swift_makePath_8(this.Swift_peer, from, curveFactor, minimumVisibleHorizontalRun, appliesVisualStabilization, minimumVisibleVerticalMove, pathStyle);
    }

    public final ChartPoint normalizedPoint(ChartPoint forChart) {
        forChart.getClass();
        return Swift_normalizedPoint_6(this.Swift_peer, forChart);
    }

    public final double normalizedX(double forChartX) {
        return Swift_normalizedX_4(this.Swift_peer, forChartX);
    }

    public final double normalizedY(double forChartY) {
        return Swift_normalizedY_5(this.Swift_peer, forChartY);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final List<ChartPoint> visualRenderPoints(List<ChartPoint> from, double minimumVisibleHorizontalRun, double minimumVisibleVerticalMove) {
        from.getClass();
        return Swift_visualRenderPoints_10(this.Swift_peer, from, minimumVisibleHorizontalRun, minimumVisibleVerticalMove);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\n\u001a\u00020\u0005H\u0082 J\t\u0010\r\u001a\u00020\u0005H\u0082 J#\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082 ¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0082 J\u001c\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/polymarket/chartlogic/ChartGeometry$Companion;", "", "<init>", "()V", "defaultVerticalPadding", "", "getDefaultVerticalPadding", "()D", "defaultMinimumVisibleHorizontalRun", "getDefaultMinimumVisibleHorizontalRun", "Swift_Companion_defaultMinimumVisibleHorizontalRun", "defaultMinimumVisibleVerticalMove", "getDefaultMinimumVisibleVerticalMove", "Swift_Companion_defaultMinimumVisibleVerticalMove", "sampledY", "at", "in_", "", "Lcom/polymarket/chartlogic/ChartPathCommand;", "(DLjava/util/List;)Ljava/lang/Double;", "Swift_Companion_sampledY_11", "x", "commands", "steppedY", "Lcom/polymarket/chartlogic/ChartPoint;", "Swift_Companion_steppedY_12", "points", "interpolatedY", "Swift_Companion_interpolatedY_13", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native double Swift_Companion_defaultMinimumVisibleHorizontalRun();

        private final native double Swift_Companion_defaultMinimumVisibleVerticalMove();

        private final native double Swift_Companion_interpolatedY_13(double x, List<ChartPoint> points);

        private final native Double Swift_Companion_sampledY_11(double x, List<ChartPathCommand> commands);

        private final native double Swift_Companion_steppedY_12(double x, List<ChartPoint> points);

        public final double getDefaultMinimumVisibleHorizontalRun() {
            return Swift_Companion_defaultMinimumVisibleHorizontalRun();
        }

        public final double getDefaultMinimumVisibleVerticalMove() {
            return Swift_Companion_defaultMinimumVisibleVerticalMove();
        }

        public final double getDefaultVerticalPadding() {
            return ChartGeometry.access$getDefaultVerticalPadding$cp();
        }

        public final double interpolatedY(double at, List<ChartPoint> in_) {
            in_.getClass();
            return Swift_Companion_interpolatedY_13(at, in_);
        }

        public final Double sampledY(double at, List<ChartPathCommand> in_) {
            in_.getClass();
            return Swift_Companion_sampledY_11(at, in_);
        }

        public final double steppedY(double at, List<ChartPoint> in_) {
            in_.getClass();
            return Swift_Companion_steppedY_12(at, in_);
        }

        private Companion() {
        }
    }

    public final List<ChartPoint> visualRenderPoints(List<ChartPoint> from, double minimumVisibleHorizontalRun) {
        from.getClass();
        return Swift_visualRenderPoints_9(this.Swift_peer, from, minimumVisibleHorizontalRun);
    }

    public ChartGeometry(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ChartGeometry(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? defaultVerticalPadding : d3);
    }

    public final List<ChartPathCommand> makePath(List<ChartPoint> from, double curveFactor, double minimumVisibleHorizontalRun, boolean appliesVisualStabilization) {
        from.getClass();
        return Swift_makePath_7(this.Swift_peer, from, curveFactor, minimumVisibleHorizontalRun, appliesVisualStabilization);
    }
}
