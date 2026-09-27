package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e5h extends Drawable {
    public final zh1 a = new zh1(this, 3);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public d5h f;

    public e5h() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        d5h d5hVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (d5hVar = this.f) != null && d5hVar.o && getCallback() != null) {
            this.e.start();
        }
    }

    public final void b() {
        d5h d5hVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (d5hVar = this.f) != null) {
            int i = d5hVar.g;
            if (i <= 0) {
                i = Math.round(d5hVar.i * width);
            }
            d5h d5hVar2 = this.f;
            int i2 = d5hVar2.h;
            if (i2 <= 0) {
                i2 = Math.round(d5hVar2.j * height);
            }
            d5h d5hVar3 = this.f;
            boolean z = true;
            if (d5hVar3.f != 1) {
                int i3 = d5hVar3.c;
                if (i3 != 1 && i3 != 3) {
                    z = false;
                }
                if (z) {
                    i = 0;
                }
                if (!z) {
                    i2 = 0;
                }
                d5h d5hVar4 = this.f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i, i2, d5hVar4.b, d5hVar4.a, Shader.TileMode.CLAMP);
            } else {
                float max = (float) (Math.max(i, i2) / Math.sqrt(2.0d));
                d5h d5hVar5 = this.f;
                radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, max, d5hVar5.b, d5hVar5.a, Shader.TileMode.CLAMP);
            }
            this.b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float a;
        float a2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f.m));
                Rect rect = this.c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.e;
                float f2 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i = this.f.c;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            float f3 = -height;
                            a2 = ix2.a(height, f3, f, f3);
                        } else {
                            a = ix2.a(-width, width, f, width);
                        }
                    } else {
                        a2 = ix2.a(-height, height, f, height);
                    }
                    f2 = a2;
                    a = 0.0f;
                } else {
                    float f4 = -width;
                    a = ix2.a(width, f4, f, f4);
                }
                Matrix matrix = this.d;
                matrix.reset();
                matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f2, a);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        d5h d5hVar = this.f;
        if (d5hVar != null) {
            if (d5hVar.n || d5hVar.p) {
                return -3;
            }
            return -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
