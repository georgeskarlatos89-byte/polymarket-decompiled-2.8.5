package defpackage;

import com.polymarket.chartlogic.ChartPreparedTransitionFrame;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nh {
    public final double a;
    public final ChartPreparedTransitionFrame b;
    public final d40 c;

    public nh(double d, ChartPreparedTransitionFrame chartPreparedTransitionFrame, d40 d40Var) {
        this.a = d;
        this.b = chartPreparedTransitionFrame;
        this.c = d40Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nh) {
                nh nhVar = (nh) obj;
                if (Double.compare(this.a, nhVar.a) != 0 || !Intrinsics.areEqual(this.b, nhVar.b) || !Intrinsics.areEqual(this.c, nhVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "AdvancedFrame(progress=" + this.a + ", frame=" + this.b + ", path=" + this.c + ")";
    }
}
