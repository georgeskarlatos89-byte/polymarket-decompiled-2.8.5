package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x24 extends x17 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public x24(i34 i34Var) {
        super(i34Var);
        this.p = new RectF();
        this.q = new Pair(new w17(), new w17());
    }

    @Override // defpackage.x17
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width() / k();
        float height = rect.height() / k();
        i34 i34Var = (i34) this.a;
        float f2 = (i34Var.r / 2.0f) + i34Var.s;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (i34Var.t != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f = i34Var.a * f;
        this.g = Math.min(r9 / 2, i34Var.a()) * f;
        this.h = i34Var.l * f;
        int i = i34Var.r;
        int i2 = i34Var.a;
        float f4 = (i - i2) / 2.0f;
        this.i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && i34Var.g == 2) || (z2 && i34Var.h == 1)) {
                this.i = f4 + f5;
            } else if ((z && i34Var.g == 1) || (z2 && i34Var.h == 2)) {
                this.i = f4 - f5;
            }
        }
        if (z2 && i34Var.h == 3) {
            this.o = f;
        } else {
            this.o = 1.0f;
        }
    }

    @Override // defpackage.x17
    public final void c(Canvas canvas, Paint paint, v17 v17Var, int i) {
        int a = ven.a(v17Var.c, i);
        canvas.save();
        canvas.rotate(v17Var.g);
        this.n = v17Var.h;
        float f = v17Var.a;
        float f2 = v17Var.b;
        int i2 = v17Var.d;
        i(canvas, paint, f, f2, a, i2, i2, v17Var.e, v17Var.f, true);
        canvas.restore();
    }

    @Override // defpackage.x17
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int a = ven.a(i, i2);
        this.n = false;
        i(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.x17
    public final int e() {
        return k();
    }

    @Override // defpackage.x17
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x17
    public final void g() {
        int i;
        int i2;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            if (i4 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i4++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        i34 i34Var = (i34) this.a;
        boolean b = i34Var.b(this.n);
        PathMeasure pathMeasure = this.d;
        if (b) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            if (this.n) {
                i2 = i34Var.j;
            } else {
                i2 = i34Var.k;
            }
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / i2) / 2.0f)) * 2;
            this.j = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < max; i5++) {
                w17 w17Var = new w17();
                float f4 = i5;
                pathMeasure.getPosTan(this.j * f4, w17Var.a, w17Var.b);
                w17 w17Var2 = new w17();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), w17Var2.a, w17Var2.b);
                arrayList.add(w17Var);
                w17Var2.a(f2 * 2.0f);
                arrayList.add(w17Var2);
            }
            arrayList.add((w17) arrayList.get(0));
            w17 w17Var3 = (w17) arrayList.get(0);
            float[] fArr = w17Var3.a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i6 = 1;
            while (i6 < arrayList.size()) {
                w17 w17Var4 = (w17) arrayList.get(i6);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = w17Var3.a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i3, fArr3, i3, i);
                System.arraycopy(w17Var3.b, i3, new float[i], i3, i);
                new Matrix();
                float[] fArr4 = w17Var4.a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i3, fArr5, i3, i);
                System.arraycopy(w17Var4.b, i3, new float[i], i3, i);
                new Matrix();
                char c2 = c;
                float atan2 = (float) Math.atan2(r6[c], r6[i3]);
                double d = fArr3[i3];
                double d2 = f6;
                int i7 = i3;
                double d3 = atan2;
                fArr3[i7] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                float f7 = -f6;
                double d4 = f7;
                double atan22 = (float) Math.atan2(r11[c2], r11[i7]);
                fArr5[i7] = (float) ((Math.cos(atan22) * d4) + fArr5[i7]);
                float sin = (float) ((Math.sin(atan22) * d4) + fArr5[c2]);
                fArr5[c2] = sin;
                float f8 = fArr3[i7];
                float f9 = fArr3[c2];
                float f10 = fArr5[i7];
                float[] fArr6 = w17Var4.a;
                path.cubicTo(f8, f9, f10, sin, fArr6[i7], fArr6[c2]);
                i6++;
                w17Var3 = w17Var4;
                c = c2;
                i3 = i7;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i3);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        boolean z2;
        Paint.Cap cap;
        int i4;
        float f6;
        float f7;
        Canvas canvas2;
        if (f2 >= f) {
            f5 = f2 - f;
        } else {
            f5 = (f2 + 1.0f) - f;
        }
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f9 = f8 + f5;
            if (f9 > 1.0f) {
                i(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                i(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = f5 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f5 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float i5 = pfn.i(1.0f - this.o, 1.0f, f8);
        float i6 = pfn.i(0.0f, this.o, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((i6 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f12 = (i5 * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            i34 i34Var = (i34) this.a;
            if (i34Var.b(this.n) && z && f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f);
            float f13 = this.g * 2.0f;
            float f14 = degrees * 2.0f;
            PathMeasure pathMeasure = this.d;
            if (degrees3 < f14) {
                float f15 = degrees3 / f14;
                float f16 = (degrees * f15) + f12;
                w17 w17Var = new w17();
                if (!z2) {
                    w17Var.c(f16 + 90.0f);
                    w17Var.a(-this.i);
                } else {
                    float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                    float f17 = this.h * f3;
                    float f18 = this.i;
                    if (f18 != this.m || f17 != this.k) {
                        this.k = f17;
                        this.m = f18;
                        g();
                    }
                    pathMeasure.getPosTan(length, w17Var.a, w17Var.b);
                }
                paint.setStyle(Paint.Style.FILL);
                j(canvas, paint, w17Var, f13, this.f, f15);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (i34Var.c()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f19 = f12 + degrees;
            float f20 = degrees3 - f14;
            Pair pair = this.q;
            ((w17) pair.first).b();
            ((w17) pair.second).b();
            if (!z2) {
                ((w17) pair.first).c(f19 + 90.0f);
                ((w17) pair.first).a(-this.i);
                ((w17) pair.second).c(f19 + f20 + 90.0f);
                ((w17) pair.second).a(-this.i);
                float f21 = this.i;
                float f22 = -f21;
                RectF rectF = this.p;
                rectF.set(f22, f22, f21, f21);
                canvas.drawArc(rectF, f19, f20, false, paint);
                canvas2 = canvas;
            } else {
                float f23 = f19 / 360.0f;
                float f24 = f20 / 360.0f;
                float f25 = this.h * f3;
                if (this.n) {
                    i4 = i34Var.j;
                } else {
                    i4 = i34Var.k;
                }
                float f26 = this.i;
                if (f26 != this.m || f25 != this.k || i4 != this.l) {
                    this.k = f25;
                    this.l = i4;
                    this.m = f26;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float a = qfn.a(f24, 0.0f, 1.0f);
                if (i34Var.b(this.n)) {
                    f6 = 1.0f;
                    float f27 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                    f23 += f27;
                    f7 = 0.0f - (f27 * 360.0f);
                } else {
                    f6 = 1.0f;
                    f7 = 0.0f;
                }
                float f28 = f23 % f6;
                float length2 = (pathMeasure.getLength() * f28) / 2.0f;
                float length3 = (pathMeasure.getLength() * (f28 + a)) / 2.0f;
                pathMeasure.getSegment(length2, length3, path, true);
                w17 w17Var2 = (w17) pair.first;
                w17Var2.b();
                pathMeasure.getPosTan(length2, w17Var2.a, w17Var2.b);
                w17 w17Var3 = (w17) pair.second;
                w17Var3.b();
                pathMeasure.getPosTan(length3, w17Var3.a, w17Var3.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setRotate(f7);
                w17Var2.c(f7);
                w17Var3.c(f7);
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            if (!i34Var.c() && this.g > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                j(canvas2, paint, (w17) pair.first, f13, this.f, 1.0f);
                j(canvas, paint, (w17) pair.second, f13, this.f, 1.0f);
            }
        }
    }

    public final void j(Canvas canvas, Paint paint, w17 w17Var, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.g * min) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = w17Var.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(x17.h(w17Var.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int k() {
        q91 q91Var = this.a;
        return (((i34) q91Var).s * 2) + ((i34) q91Var).r;
    }

    @Override // defpackage.x17
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
    }
}
