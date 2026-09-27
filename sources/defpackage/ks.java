package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ks implements t23 {
    public Canvas a = ls.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.t23
    public final void a(v20 v20Var, w30 w30Var) {
        this.a.drawBitmap(bcn.c(v20Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), w30Var.a);
    }

    @Override // defpackage.t23
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.t23
    public final void c(float f, long j, w30 w30Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, w30Var.a);
    }

    @Override // defpackage.t23
    public final void d(v20 v20Var, long j, long j2, long j3, long j4, w30 w30Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap c = bcn.c(v20Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(c, rect, rect2, w30Var.a);
    }

    @Override // defpackage.t23
    public final void e(mxd mxdVar, w30 w30Var) {
        Canvas canvas = this.a;
        if (mxdVar instanceof d40) {
            canvas.drawPath(((d40) mxdVar).a, mcn.c(w30Var));
        } else {
            py2.f("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.t23
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, w30 w30Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, w30Var.a);
    }

    @Override // defpackage.t23
    public final void g(long j, long j2, w30 w30Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), w30Var.a);
    }

    @Override // defpackage.t23
    public final void h(mxd mxdVar) {
        Canvas canvas = this.a;
        if (mxdVar instanceof d40) {
            canvas.clipPath(((d40) mxdVar).a, Region.Op.INTERSECT);
        } else {
            py2.f("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.t23
    public final void i(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.t23
    public final void j(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.t23
    public final void k() {
        this.a.restore();
    }

    @Override // defpackage.t23
    public final void l(zrf zrfVar, w30 w30Var) {
        this.a.saveLayer(zrfVar.a, zrfVar.b, zrfVar.c, zrfVar.d, mcn.c(w30Var), 31);
    }

    @Override // defpackage.t23
    public final void m() {
        this.a.enableZ();
    }

    @Override // defpackage.t23
    public final void n(float f, float f2, float f3, float f4, float f5, float f6, w30 w30Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, w30Var.a);
    }

    @Override // defpackage.t23
    public final void o(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.t23
    public final void p() {
        this.a.save();
    }

    @Override // defpackage.t23
    public final void q() {
        this.a.disableZ();
    }

    @Override // defpackage.t23
    public final void r(float f, float f2, float f3, float f4, w30 w30Var) {
        this.a.drawRect(f, f2, f3, f4, mcn.c(w30Var));
    }

    @Override // defpackage.t23
    public final void s(float[] fArr) {
        if (!vfn.d(fArr)) {
            Matrix matrix = new Matrix();
            gcn.c(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.t23
    public final void t() {
        this.a.skew(-0.15f, 0.0f);
    }
}
