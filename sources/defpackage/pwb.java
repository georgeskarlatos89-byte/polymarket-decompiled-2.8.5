package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pwb extends ValueAnimator implements Choreographer.FrameCallback {
    public mvb l;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public float j = -2.14748365E9f;
    public float k = 2.14748365E9f;
    public boolean m = false;

    public final float a() {
        mvb mvbVar = this.l;
        if (mvbVar == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = mvbVar.l;
        return (f - f2) / (mvbVar.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public final float b() {
        mvb mvbVar = this.l;
        if (mvbVar == null) {
            return 0.0f;
        }
        float f = this.k;
        if (f == 2.14748365E9f) {
            return mvbVar.m;
        }
        return f;
    }

    public final float c() {
        mvb mvbVar = this.l;
        if (mvbVar == null) {
            return 0.0f;
        }
        float f = this.j;
        if (f == -2.14748365E9f) {
            return mvbVar.l;
        }
        return f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        if (this.d < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float c;
        float b;
        boolean z = false;
        if (this.m) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        mvb mvbVar = this.l;
        if (mvbVar != null && this.m) {
            no0 no0Var = hua.a;
            long j2 = this.f;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = ((float) j3) / ((1.0E9f / mvbVar.n) / Math.abs(this.d));
            float f = this.g;
            if (d()) {
                abs = -abs;
            }
            float f2 = f + abs;
            float c2 = c();
            float b2 = b();
            PointF pointF = tgc.a;
            if (f2 >= c2 && f2 <= b2) {
                z = true;
            }
            float b3 = tgc.b(f2, c(), b());
            this.g = b3;
            this.h = b3;
            this.f = j;
            if (!z) {
                if (getRepeatCount() != -1 && this.i >= getRepeatCount()) {
                    if (this.d < 0.0f) {
                        b = c();
                    } else {
                        b = b();
                    }
                    this.g = b;
                    this.h = b;
                    g(true);
                    f();
                    e(d());
                } else {
                    if (getRepeatMode() == 2) {
                        this.e = !this.e;
                        this.d = -this.d;
                    } else {
                        if (d()) {
                            c = b();
                        } else {
                            c = c();
                        }
                        this.g = c;
                        this.h = c;
                    }
                    this.f = j;
                    f();
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.i++;
                }
            } else {
                f();
            }
            if (this.l != null) {
                float f3 = this.h;
                float f4 = this.j;
                if (f3 < f4 || f3 > this.k) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.k), Float.valueOf(this.h)));
                }
            }
            no0 no0Var2 = hua.a;
        }
    }

    public final void e(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c;
        float b;
        float c2;
        if (this.l == null) {
            return 0.0f;
        }
        if (d()) {
            c = b() - this.h;
            b = b();
            c2 = c();
        } else {
            c = this.h - c();
            b = b();
            c2 = c();
        }
        return c / (b - c2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.l == null) {
            return 0L;
        }
        return r2.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f) {
        if (this.g == f) {
            return;
        }
        float b = tgc.b(f, c(), b());
        this.g = b;
        this.h = b;
        this.f = 0L;
        f();
    }

    public final void i(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            mvb mvbVar = this.l;
            if (mvbVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = mvbVar.l;
            }
            if (mvbVar == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = mvbVar.m;
            }
            float b = tgc.b(f, f3, f4);
            float b2 = tgc.b(f2, f3, f4);
            if (b == this.j && b2 == this.k) {
                return;
            }
            this.j = b;
            this.k = b2;
            h((int) tgc.b(this.h, b, b2));
            return;
        }
        omf.j("minFrame (", f, ") must be <= maxFrame (", f2, ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.e) {
            this.e = false;
            this.d = -this.d;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
