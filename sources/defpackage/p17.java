package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class p17 extends Drawable implements Animatable {
    public static final le3 m = new le3(9, Float.class, "growFraction");
    public final Context a;
    public final q91 b;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList g;
    public boolean h;
    public float i;
    public int k;
    public final float f = -1.0f;
    public final Paint j = new Paint();
    public final Rect l = new Rect();
    public za0 c = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [za0, java.lang.Object] */
    public p17(Context context, q91 q91Var) {
        this.a = context;
        this.b = q91Var;
        setAlpha(255);
    }

    public static /* synthetic */ void a(p17 p17Var) {
        super.setVisible(false, false);
    }

    public final float b() {
        q91 q91Var = this.b;
        if (q91Var.g != 0 || q91Var.h != 0) {
            return this.i;
        }
        return 1.0f;
    }

    public final float c() {
        int i;
        float f = this.f;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof vp6;
        q91 q91Var = this.b;
        if (q91Var.b(z) && q91Var.m != 0) {
            za0 za0Var = this.c;
            ContentResolver contentResolver = this.a.getContentResolver();
            za0Var.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                if (z) {
                    i = q91Var.j;
                } else {
                    i = q91Var.k;
                }
                int i2 = (int) (((i * 1000.0f) / q91Var.m) * f2);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i2)) / i2;
                if (uptimeMillis < 0.0f) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean z4;
        za0 za0Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        za0Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z3 && f > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return e(z, z2, z4);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z4;
        ObjectAnimator objectAnimator3 = this.d;
        le3 le3Var = m;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, le3Var, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(500L);
            this.d.setInterpolator(na0.b);
            ObjectAnimator objectAnimator4 = this.d;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                dmk.v("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.d = objectAnimator4;
            objectAnimator4.addListener(new o17(this, 0));
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, le3Var, 1.0f, 0.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.e.setInterpolator(na0.b);
            ObjectAnimator objectAnimator5 = this.e;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                dmk.v("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.e = objectAnimator5;
            objectAnimator5.addListener(new o17(this, 1));
        }
        if (isVisible() || z) {
            if (z) {
                objectAnimator = this.d;
            } else {
                objectAnimator = this.e;
            }
            if (z) {
                objectAnimator2 = this.e;
            } else {
                objectAnimator2 = this.d;
            }
            if (!z3) {
                if (objectAnimator2.isRunning()) {
                    boolean z5 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.h = z5;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z6 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.h = z6;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z && !super.setVisible(z, false)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                q91 q91Var = this.b;
                if (!z ? q91Var.h != 0 : q91Var.g != 0) {
                    if (!z2 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z4;
                    }
                    objectAnimator.start();
                    return z4;
                }
                boolean z7 = this.h;
                this.h = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.h = z7;
                return z4;
            }
        }
        return false;
    }

    public final void f(o91 o91Var) {
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.contains(o91Var)) {
            this.g.remove(o91Var);
            if (this.g.isEmpty()) {
                this.g = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
