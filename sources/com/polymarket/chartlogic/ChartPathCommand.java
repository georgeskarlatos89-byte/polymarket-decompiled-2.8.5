package com.polymarket.chartlogic;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JE\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0082 J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001cH\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010!¨\u0006:"}, d2 = {"Lcom/polymarket/chartlogic/ChartPathCommand;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "kind", "Lcom/polymarket/chartlogic/ChartPathCommandKind;", "x", "", "y", "control1X", "control1Y", "control2X", "control2Y", "(Lcom/polymarket/chartlogic/ChartPathCommandKind;DDDDDD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getKind", "()Lcom/polymarket/chartlogic/ChartPathCommandKind;", "Swift_kind", "getX", "()D", "Swift_x", "getY", "Swift_y", "getControl1X", "Swift_control1X", "getControl1Y", "Swift_control1Y", "getControl2X", "Swift_control2X", "getControl2Y", "Swift_control2Y", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChartPathCommand implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChartPathCommand(ChartPathCommandKind chartPathCommandKind, double d, double d2, double d3, double d4, double d5, double d6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chartPathCommandKind, d, d2, r9, r11, r13, r15);
        double d7;
        double d8;
        double d9;
        double d10;
        if ((i & 8) != 0) {
            d7 = 0.0d;
        } else {
            d7 = d3;
        }
        if ((i & 16) != 0) {
            d8 = 0.0d;
        } else {
            d8 = d4;
        }
        if ((i & 32) != 0) {
            d9 = 0.0d;
        } else {
            d9 = d5;
        }
        if ((i & 64) != 0) {
            d10 = 0.0d;
        } else {
            d10 = d6;
        }
    }

    private final native long Swift_constructor_0(ChartPathCommandKind kind, double x, double y, double control1X, double control1Y, double control2X, double control2Y);

    private final native double Swift_control1X(long Swift_peer);

    private final native double Swift_control1Y(long Swift_peer);

    private final native double Swift_control2X(long Swift_peer);

    private final native double Swift_control2Y(long Swift_peer);

    private final native boolean Swift_isequal(ChartPathCommand lhs, ChartPathCommand rhs);

    private final native ChartPathCommandKind Swift_kind(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native double Swift_x(long Swift_peer);

    private final native double Swift_y(long Swift_peer);

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
        if (!(other instanceof ChartPathCommand)) {
            return false;
        }
        return Swift_isequal(this, (ChartPathCommand) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final double getControl1X() {
        return Swift_control1X(this.Swift_peer);
    }

    public final double getControl1Y() {
        return Swift_control1Y(this.Swift_peer);
    }

    public final double getControl2X() {
        return Swift_control2X(this.Swift_peer);
    }

    public final double getControl2Y() {
        return Swift_control2Y(this.Swift_peer);
    }

    public final ChartPathCommandKind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final double getX() {
        return Swift_x(this.Swift_peer);
    }

    public final double getY() {
        return Swift_y(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/chartlogic/ChartPathCommand$Companion;", "", "<init>", "()V", "moveTo", "Lcom/polymarket/chartlogic/ChartPathCommand;", "point", "Lcom/polymarket/chartlogic/ChartPoint;", "Swift_Companion_moveTo_1", "lineTo", "Swift_Companion_lineTo_2", "cubicTo", "control1", "control2", "end", "Swift_Companion_cubicTo_3", "ChartLogic"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ChartPathCommand Swift_Companion_cubicTo_3(ChartPoint control1, ChartPoint control2, ChartPoint end);

        private final native ChartPathCommand Swift_Companion_lineTo_2(ChartPoint point);

        private final native ChartPathCommand Swift_Companion_moveTo_1(ChartPoint point);

        public final ChartPathCommand cubicTo(ChartPoint control1, ChartPoint control2, ChartPoint end) {
            control1.getClass();
            control2.getClass();
            end.getClass();
            return Swift_Companion_cubicTo_3(control1, control2, end);
        }

        public final ChartPathCommand lineTo(ChartPoint point) {
            point.getClass();
            return Swift_Companion_lineTo_2(point);
        }

        public final ChartPathCommand moveTo(ChartPoint point) {
            point.getClass();
            return Swift_Companion_moveTo_1(point);
        }

        private Companion() {
        }
    }

    public ChartPathCommand(ChartPathCommandKind chartPathCommandKind, double d, double d2, double d3, double d4, double d5, double d6) {
        chartPathCommandKind.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(chartPathCommandKind, d, d2, d3, d4, d5, d6);
    }

    public ChartPathCommand(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
