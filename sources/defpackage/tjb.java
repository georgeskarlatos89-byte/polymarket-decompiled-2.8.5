package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tjb implements View.OnTouchListener {
    public static final int q = ViewConfiguration.getTapTimeout();
    public final aw0 a;
    public final AccelerateInterpolator b;
    public final m27 c;
    public in8 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final m27 p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aw0] */
    public tjb(m27 m27Var) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f = 0L;
        this.a = obj;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.h = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.i = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr5;
        this.c = m27Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.g = q;
        obj.a = RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE;
        obj.b = RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE;
        this.p = m27Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b = b(this.e[i] * f2, 0.0f, this.f[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else if (c > 0.0f) {
            interpolation = accelerateInterpolator.getInterpolation(c);
        } else {
            f4 = 0.0f;
            if (f4 != 0.0f) {
                return 0.0f;
            }
            float f5 = this.h[i];
            float f6 = this.i[i];
            float f7 = this.j[i];
            float f8 = f5 * f3;
            if (f4 > 0.0f) {
                return b(f4 * f8, f6, f7);
            }
            return -b((-f4) * f8, f6, f7);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.n) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.l) {
            this.n = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        aw0 aw0Var = this.a;
        int i2 = (int) (currentAnimationTimeMillis - aw0Var.e);
        int i3 = aw0Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aw0Var.i = i;
        aw0Var.h = aw0Var.a(currentAnimationTimeMillis);
        aw0Var.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        m27 m27Var;
        int count;
        aw0 aw0Var = this.a;
        float f = aw0Var.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(aw0Var.c);
        if (abs != 0 && (count = (m27Var = this.p).getCount()) != 0) {
            int childCount = m27Var.getChildCount();
            int firstVisiblePosition = m27Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && m27Var.getChildAt(0).getTop() >= 0)) : !(i >= count && m27Var.getChildAt(childCount - 1).getBottom() <= m27Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.o) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.m = true;
            this.k = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            m27 m27Var = this.c;
            float a = a(x, width, m27Var.getWidth(), 0);
            float a2 = a(motionEvent.getY(), view.getHeight(), m27Var.getHeight(), 1);
            aw0 aw0Var = this.a;
            aw0Var.c = a;
            aw0Var.d = a2;
            if (!this.n && e()) {
                in8 in8Var = this.d;
                if (in8Var == null) {
                    in8Var = new in8(this, 4);
                    this.d = in8Var;
                }
                this.n = true;
                this.l = true;
                if (!this.k && (i = this.g) > 0) {
                    long j = i;
                    WeakHashMap weakHashMap = k9k.a;
                    m27Var.postOnAnimationDelayed(in8Var, j);
                } else {
                    in8Var.run();
                }
                this.k = true;
            }
        }
        return false;
    }
}
