package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pxd extends soa {
    public Path q;
    public final soa r;

    public pxd(mvb mvbVar, soa soaVar) {
        super(mvbVar, (PointF) soaVar.b, (PointF) soaVar.c, soaVar.d, soaVar.e, soaVar.f, soaVar.g, soaVar.h);
        this.r = soaVar;
        d();
    }

    public final void d() {
        boolean z;
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        if (obj2 != null && obj3 != null) {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
                if (obj3 == null && (obj = this.c) != null && !z) {
                    PointF pointF2 = (PointF) obj3;
                    PointF pointF3 = (PointF) obj;
                    soa soaVar = this.r;
                    PointF pointF4 = soaVar.o;
                    PointF pointF5 = soaVar.p;
                    Matrix matrix = z1k.a;
                    Path path = new Path();
                    path.moveTo(pointF2.x, pointF2.y);
                    if (pointF4 != null && pointF5 != null && (pointF4.length() != 0.0f || pointF5.length() != 0.0f)) {
                        float f = pointF4.x + pointF2.x;
                        float f2 = pointF2.y + pointF4.y;
                        float f3 = pointF3.x;
                        float f4 = f3 + pointF5.x;
                        float f5 = pointF3.y;
                        path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
                    } else {
                        path.lineTo(pointF3.x, pointF3.y);
                    }
                    this.q = path;
                    return;
                }
                return;
            }
        }
        z = false;
        if (obj3 == null) {
        }
    }
}
