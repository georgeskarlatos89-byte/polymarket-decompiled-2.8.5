package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d40 implements mxd {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public d40(Path path) {
        this.a = path;
    }

    public final void d(mxd mxdVar, long j) {
        if (mxdVar instanceof d40) {
            this.a.addPath(((d40) mxdVar).a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            return;
        }
        py2.f("Unable to obtain android.graphics.Path");
    }

    public final void e(zrf zrfVar) {
        float f = zrfVar.a;
        float f2 = zrfVar.b;
        float f3 = zrfVar.c;
        float f4 = zrfVar.d;
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.set(f, f2, f3, f4);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.arcTo(rectF2, 180.0f, 90.0f, false);
    }

    public final void f() {
        this.a.close();
    }

    public final void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final zrf h() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new zrf(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void i(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void j(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean k(mxd mxdVar, mxd mxdVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (mxdVar instanceof d40) {
            Path path = ((d40) mxdVar).a;
            if (mxdVar2 instanceof d40) {
                return this.a.op(path, ((d40) mxdVar2).a, op);
            }
            py2.f("Unable to obtain android.graphics.Path");
            return false;
        }
        py2.f("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void l() {
        this.a.reset();
    }

    public final void m() {
        this.a.rewind();
    }

    public final void n(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    public final void o(float[] fArr) {
        Matrix matrix = this.d;
        if (matrix == null) {
            matrix = new Matrix();
            this.d = matrix;
        }
        gcn.c(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void p(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
