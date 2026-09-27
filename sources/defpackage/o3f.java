package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o3f {
    public static final s3f i = s3f.FILL_CENTER;
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public s3f h;

    public final void a(Size size, int i2, Rect rect) {
        Matrix matrix;
        if (!f()) {
            return;
        }
        Matrix matrix2 = new Matrix();
        if (!f()) {
            matrix = null;
        } else {
            Matrix matrix3 = new Matrix(this.d);
            matrix3.postConcat(c(size, i2));
            matrix = matrix3;
        }
        matrix.invert(matrix2);
        Matrix matrix4 = new Matrix();
        matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix4);
    }

    public final Size b() {
        if (kbj.c(this.c)) {
            return new Size(this.b.height(), this.b.width());
        }
        return new Size(this.b.width(), this.b.height());
    }

    public final Matrix c(Size size, int i2) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        grn.g(null, f());
        if (kbj.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size b = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, b.getWidth(), b.getHeight());
            Matrix matrix = new Matrix();
            s3f s3fVar = this.h;
            switch (n3f.a[s3fVar.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    o9n.b("PreviewTransform", "Unexpected crop rect: " + s3fVar);
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (s3fVar != s3f.FIT_CENTER && s3fVar != s3f.FIT_START && s3fVar != s3f.FIT_END) {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            } else {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            }
            matrix.mapRect(rectF3);
            if (i2 == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix a = kbj.a(new RectF(this.b), rectF, this.c, false);
        if (this.f && this.g) {
            boolean c = kbj.c(this.c);
            Rect rect = this.b;
            if (c) {
                a.preScale(1.0f, -1.0f, rect.centerX(), this.b.centerY());
                return a;
            }
            a.preScale(-1.0f, 1.0f, rect.centerX(), this.b.centerY());
        }
        return a;
    }

    public final Matrix d() {
        int i2;
        grn.g(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        if (!this.g) {
            i2 = this.c;
        } else {
            i2 = -rkn.d(this.e);
        }
        return kbj.a(rectF, rectF, i2, false);
    }

    public final RectF e(Size size, int i2) {
        grn.g(null, f());
        Matrix c = c(size, i2);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        c.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        boolean z;
        if (this.g && this.e == -1) {
            z = false;
        } else {
            z = true;
        }
        if (this.b != null && this.a != null && z) {
            return true;
        }
        return false;
    }
}
