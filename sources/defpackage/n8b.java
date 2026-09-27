package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n8b extends x17 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.x17
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float e = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - e) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        y8b y8bVar = (y8b) this.a;
        if (y8bVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        this.g = y8bVar.a * f;
        this.h = Math.min(r0 / 2, y8bVar.a()) * f;
        this.j = y8bVar.l * f;
        this.i = Math.min(y8bVar.a / 2.0f, y8bVar.e()) * f;
        if (z || z2) {
            if ((z && y8bVar.g == 2) || (z2 && y8bVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && y8bVar.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * y8bVar.a) / 2.0f);
            }
        }
        if (z2 && y8bVar.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.x17
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        float f;
        int a = ven.a(i, i2);
        this.m = false;
        y8b y8bVar = (y8b) this.a;
        int min = Math.min(y8bVar.t, y8bVar.a);
        if (min > 0 && a != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(a);
            Integer num = y8bVar.u;
            if (num != null) {
                f = (y8bVar.t / 2.0f) + num.floatValue();
            } else {
                f = this.g / 2.0f;
            }
            float[] fArr = {(this.f / 2.0f) - f, 0.0f};
            float f2 = min;
            j(canvas, paint, new w17(fArr, new float[]{1.0f, 0.0f}), f2, f2, (this.h * f2) / this.g, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override // defpackage.x17
    public final void c(Canvas canvas, Paint paint, v17 v17Var, int i) {
        int a = ven.a(v17Var.c, i);
        this.m = v17Var.h;
        float f = v17Var.a;
        float f2 = v17Var.b;
        int i2 = v17Var.d;
        i(canvas, paint, f, f2, a, i2, i2, v17Var.e, v17Var.f, true);
    }

    @Override // defpackage.x17
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int a = ven.a(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.x17
    public final int e() {
        q91 q91Var = this.a;
        return (((y8b) q91Var).l * 2) + ((y8b) q91Var).a;
    }

    @Override // defpackage.x17
    public final int f() {
        return -1;
    }

    @Override // defpackage.x17
    public final void g() {
        int i;
        Path path = this.b;
        path.rewind();
        y8b y8bVar = (y8b) this.a;
        if (y8bVar.b(this.m)) {
            if (this.m) {
                i = y8bVar.j;
            } else {
                i = y8bVar.k;
            }
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        boolean z2;
        Paint.Cap cap;
        y8b y8bVar;
        int i4;
        float f7;
        Canvas canvas2;
        Pair pair = this.o;
        float a = qfn.a(f, 0.0f, 1.0f);
        float a2 = qfn.a(f2, 0.0f, 1.0f);
        float i5 = pfn.i(1.0f - this.n, 1.0f, a);
        float i6 = pfn.i(1.0f - this.n, 1.0f, a2);
        int a3 = (int) ((qfn.a(i5, 0.0f, 0.01f) * i2) / 0.01f);
        int a4 = (int) (((1.0f - qfn.a(i6, 0.99f, 1.0f)) * i3) / 0.01f);
        float f8 = this.f;
        int i7 = (int) ((i5 * f8) + a3);
        int i8 = (int) ((i6 * f8) - a4);
        float f9 = this.h;
        float f10 = this.i;
        if (f9 != f10) {
            float max = Math.max(f9, f10);
            float f11 = this.f;
            float f12 = max / f11;
            f5 = pfn.i(this.h, this.i, qfn.a(i7 / f11, 0.0f, f12) / f12);
            float f13 = this.h;
            float f14 = this.i;
            float f15 = this.f;
            f6 = pfn.i(f13, f14, qfn.a((f15 - i8) / f15, 0.0f, f12) / f12);
        } else {
            f5 = f9;
            f6 = f5;
        }
        float f16 = (-this.f) / 2.0f;
        y8b y8bVar2 = (y8b) this.a;
        if (y8bVar2.b(this.m) && z && f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i7 <= i8) {
            float f17 = i7 + f5;
            float f18 = i8 - f6;
            float f19 = f5 * 2.0f;
            float f20 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((w17) pair.first).b();
            ((w17) pair.second).b();
            ((w17) pair.first).e(f17 + f16);
            ((w17) pair.second).e(f18 + f16);
            if (i7 == 0 && f18 + f6 < f17 + f5) {
                w17 w17Var = (w17) pair.first;
                float f21 = this.g;
                j(canvas, paint, w17Var, f19, f21, f5, (w17) pair.second, f20, f21, f6, true);
                return;
            }
            if (f17 - f5 > f18 - f6) {
                w17 w17Var2 = (w17) pair.second;
                float f22 = this.g;
                j(canvas, paint, w17Var2, f20, f22, f6, (w17) pair.first, f19, f22, f5, false);
                return;
            }
            float f23 = f6;
            paint.setStyle(Paint.Style.STROKE);
            if (y8bVar2.c()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            if (!z2) {
                float[] fArr = ((w17) pair.first).a;
                float f24 = fArr[0];
                float f25 = fArr[1];
                float[] fArr2 = ((w17) pair.second).a;
                canvas.drawLine(f24, f25, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                y8bVar = y8bVar2;
            } else {
                float f26 = this.f;
                float f27 = f17 / f26;
                float f28 = f18 / f26;
                y8bVar = y8bVar2;
                if (this.m) {
                    i4 = y8bVar.j;
                } else {
                    i4 = y8bVar.k;
                }
                if (i4 != this.l) {
                    this.l = i4;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f29 = (-this.f) / 2.0f;
                boolean b = y8bVar.b(this.m);
                if (b) {
                    float f30 = this.f;
                    f7 = 1.0f;
                    float f31 = this.k;
                    float f32 = f30 / f31;
                    float f33 = f4 / f32;
                    float f34 = f32 / (f32 + 1.0f);
                    f27 = (f27 + f33) * f34;
                    f28 = (f28 + f33) * f34;
                    f29 -= f31 * f4;
                } else {
                    f7 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f27;
                float length2 = pathMeasure.getLength() * f28;
                pathMeasure.getSegment(length, length2, path, true);
                w17 w17Var3 = (w17) pair.first;
                w17Var3.b();
                pathMeasure.getPosTan(length, w17Var3.a, w17Var3.b);
                w17 w17Var4 = (w17) pair.second;
                w17Var4.b();
                pathMeasure.getPosTan(length2, w17Var4.a, w17Var4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f29, 0.0f);
                w17Var3.e(f29);
                w17Var4.e(f29);
                if (b) {
                    float f35 = this.j * f3;
                    matrix.postScale(f7, f35);
                    w17Var3.d(f35);
                    w17Var4.d(f35);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            if (!y8bVar.c()) {
                if (f17 > 0.0f && f5 > 0.0f) {
                    j(canvas2, paint, (w17) pair.first, f19, this.g, f5, null, 0.0f, 0.0f, 0.0f, false);
                }
                if (f18 < this.f && f23 > 0.0f) {
                    j(canvas, paint, (w17) pair.second, f20, this.g, f23, null, 0.0f, 0.0f, 0.0f, false);
                }
            }
        }
    }

    public final void j(Canvas canvas, Paint paint, w17 w17Var, float f, float f2, float f3, w17 w17Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float min = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (w17Var2 != null) {
            float[] fArr = w17Var2.b;
            float[] fArr2 = w17Var2.a;
            float min2 = Math.min(f5, this.g);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - min3) - (w17Var.a[0] - f3);
                if (f13 > 0.0f) {
                    w17Var2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + min3) - (w17Var.a[0] + f3);
                if (f14 < 0.0f) {
                    w17Var2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(x17.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-x17.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = w17Var.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(x17.h(w17Var.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = w17Var.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(x17.h(w17Var.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
