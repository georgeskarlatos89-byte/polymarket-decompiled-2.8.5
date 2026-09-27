package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import com.polymarket.android.R;
import defpackage.ace;
import defpackage.dmk;
import defpackage.dtf;
import defpackage.etf;
import defpackage.jlf;
import defpackage.s93;
import defpackage.t93;
import defpackage.tsf;
import defpackage.u93;
import defpackage.ul0;
import defpackage.up1;
import defpackage.v93;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends e implements dtf {
    public final ul0 p;
    public up1 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new u93();
        this.r = new s93(this, 0);
        this.p = new ul0(4);
        t0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlf.f);
            obtainStyledAttributes.getInt(0, 0);
            t0();
            L0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void F0(RecyclerView recyclerView, int i) {
        t93 t93Var = new t93(this, recyclerView.getContext());
        t93Var.a = i;
        G0(t93Var);
    }

    public final float I0(float f, float f2) {
        if (K0()) {
            return f - f2;
        }
        return f + f2;
    }

    public final boolean J0() {
        if (this.q.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean K0() {
        if (J0() && this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void L0(int i) {
        v93 v93Var;
        if (i != 0 && i != 1) {
            dmk.v(ace.f(i, "invalid orientation:"));
            return;
        }
        c(null);
        up1 up1Var = this.q;
        if (up1Var != null && i == up1Var.b) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                v93Var = new v93(this, 0);
            } else {
                dmk.v("invalid orientation");
                return;
            }
        } else {
            v93Var = new v93(this, 1);
        }
        this.q = v93Var;
        t0();
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean O() {
        return true;
    }

    @Override // androidx.recyclerview.widget.e
    public final void V(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ul0 ul0Var = this.p;
        float f = ul0Var.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ul0Var.a = f;
        float f2 = ul0Var.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ul0Var.b = f2;
        t0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // androidx.recyclerview.widget.e
    public final void W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0028, code lost:
    
        if (r7 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0032, code lost:
    
        if (K0() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0036, code lost:
    
        if (r7 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003f, code lost:
    
        if (K0() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // androidx.recyclerview.widget.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i, f fVar, etf etfVar) {
        char c;
        if (v() != 0) {
            int i2 = this.q.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i == 130) {
                                }
                                c = 0;
                            } else {
                                if (i2 == 0) {
                                }
                                c = 0;
                            }
                        }
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                    if (c != 0) {
                        int i3 = 0;
                        if (c == 65535) {
                            if (e.K(view) != 0) {
                                int K = e.K(u(0)) - 1;
                                if (K >= 0 && K < F()) {
                                    this.q.m();
                                    throw null;
                                }
                                if (K0()) {
                                    i3 = v() - 1;
                                }
                                return u(i3);
                            }
                        } else if (e.K(view) != F() - 1) {
                            int K2 = e.K(u(v() - 1)) + 1;
                            if (K2 >= 0 && K2 < F()) {
                                this.q.m();
                                throw null;
                            }
                            if (!K0()) {
                                i3 = v() - 1;
                            }
                            return u(i3);
                        }
                    }
                }
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(e.K(u(0)));
            accessibilityEvent.setToIndex(e.K(u(v() - 1)));
        }
    }

    @Override // defpackage.dtf
    public final PointF a(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.e
    public final void c0(int i, int i2) {
        F();
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean d() {
        return J0();
    }

    @Override // androidx.recyclerview.widget.e
    public final void d0() {
        F();
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean e() {
        return !J0();
    }

    @Override // androidx.recyclerview.widget.e
    public final void f0(int i, int i2) {
        F();
    }

    @Override // androidx.recyclerview.widget.e
    public final void h0(f fVar, etf etfVar) {
        int i;
        if (etfVar.b() > 0) {
            if (J0()) {
                i = this.n;
            } else {
                i = this.o;
            }
            if (i > 0.0f) {
                K0();
                fVar.d(0);
                dmk.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        o0(fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final void i0(etf etfVar) {
        if (v() == 0) {
            return;
        }
        e.K(u(0));
    }

    @Override // androidx.recyclerview.widget.e
    public final int j(etf etfVar) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int k(etf etfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int l(etf etfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int m(etf etfVar) {
        v();
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int n(etf etfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int o(etf etfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final tsf r() {
        return new tsf(-2, -2);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.e
    public final int u0(int i, etf etfVar, f fVar) {
        if (!J0() || v() == 0 || i == 0) {
            return 0;
        }
        fVar.d(0);
        dmk.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final int w0(int i, etf etfVar, f fVar) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        fVar.d(0);
        dmk.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.e
    public final void z(Rect rect, View view) {
        RecyclerView.P(rect, view);
        rect.centerY();
        if (J0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.e
    public final void v0(int i) {
    }

    public CarouselLayoutManager() {
        ul0 ul0Var = new ul0(4);
        new u93();
        this.r = new s93(this, 0);
        this.p = ul0Var;
        t0();
        L0(0);
    }
}
