package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g34 extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final xv7 h = new xv7();
    public static final int[] i = {-16777216};
    public final f34 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public g34(Context context) {
        context.getClass();
        this.c = context.getResources();
        f34 f34Var = new f34();
        this.a = f34Var;
        f34Var.i = i;
        f34Var.a(0);
        f34Var.h = 2.5f;
        f34Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d34(this, f34Var));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new e34(this, f34Var));
        this.d = ofFloat;
    }

    public static void d(float f, f34 f34Var) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = f34Var.i;
            int i2 = f34Var.j;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            f34Var.u = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r1) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r3) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r4) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r2))));
            return;
        }
        f34Var.u = f34Var.i[f34Var.j];
    }

    public final void a(float f, f34 f34Var, boolean z) {
        float f2;
        if (this.f) {
            d(f, f34Var);
            float floor = (float) (Math.floor(f34Var.m / 0.8f) + 1.0d);
            float f3 = f34Var.k;
            float f4 = f34Var.l;
            f34Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            f34Var.f = f4;
            float f5 = f34Var.m;
            f34Var.g = ix2.a(floor, f5, f, f5);
            return;
        }
        if (f == 1.0f && !z) {
            return;
        }
        float f6 = f34Var.m;
        float f7 = f34Var.k;
        xv7 xv7Var = h;
        if (f < 0.5f) {
            f2 = (xv7Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
        } else {
            float f8 = f7 + 0.79f;
            f7 = f8 - (((1.0f - xv7Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            f2 = f8;
        }
        float f9 = (0.20999998f * f) + f6;
        float f10 = (f + this.e) * 216.0f;
        f34Var.e = f7;
        f34Var.f = f2;
        f34Var.g = f9;
        this.b = f10;
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        f34 f34Var = this.a;
        f34Var.h = f6;
        f34Var.b.setStrokeWidth(f6);
        f34Var.q = f * f5;
        f34Var.a(0);
        f34Var.r = (int) (f3 * f5);
        f34Var.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        f34 f34Var = this.a;
        Paint paint = f34Var.b;
        RectF rectF = f34Var.a;
        float f = f34Var.q;
        float f2 = (f34Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((f34Var.r * f34Var.p) / 2.0f, f34Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = f34Var.e;
        float f4 = f34Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((f34Var.f + f4) * 360.0f) - f5;
        paint.setColor(f34Var.u);
        paint.setAlpha(f34Var.t);
        float f7 = f34Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f34Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = f34Var.c;
        if (f34Var.n) {
            Path path = f34Var.o;
            if (path == null) {
                Path path2 = new Path();
                f34Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (f34Var.r * f34Var.p) / 2.0f;
            f34Var.o.moveTo(0.0f, 0.0f);
            f34Var.o.lineTo(f34Var.r * f34Var.p, 0.0f);
            Path path3 = f34Var.o;
            float f10 = f34Var.r;
            float f11 = f34Var.p;
            path3.lineTo((f10 * f11) / 2.0f, f34Var.s * f11);
            f34Var.o.offset((rectF.centerX() + min) - f9, (f34Var.h / 2.0f) + rectF.centerY());
            f34Var.o.close();
            paint2.setColor(f34Var.u);
            paint2.setAlpha(f34Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(f34Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        f34 f34Var = this.a;
        float f = f34Var.e;
        f34Var.k = f;
        float f2 = f34Var.f;
        f34Var.l = f2;
        f34Var.m = f34Var.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        f34Var.a(0);
        f34Var.k = 0.0f;
        f34Var.l = 0.0f;
        f34Var.m = 0.0f;
        f34Var.e = 0.0f;
        f34Var.f = 0.0f;
        f34Var.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        f34 f34Var = this.a;
        if (f34Var.n) {
            f34Var.n = false;
        }
        f34Var.a(0);
        f34Var.k = 0.0f;
        f34Var.l = 0.0f;
        f34Var.m = 0.0f;
        f34Var.e = 0.0f;
        f34Var.f = 0.0f;
        f34Var.g = 0.0f;
        invalidateSelf();
    }
}
