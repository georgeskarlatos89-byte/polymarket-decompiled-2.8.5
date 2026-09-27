package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.polymarket.android.R;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import io.sentry.android.core.m0;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class pa1 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final oa1 i;
    public final SnackbarContentLayout j;
    public ma1 k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final AccessibilityManager t;
    public static final xv7 v = na0.b;
    public static final LinearInterpolator w = na0.a;
    public static final xv7 x = na0.d;
    public static final int[] z = {R.attr.snackbarStyle};
    public static final String A = pa1.class.getSimpleName();
    public static final Handler y = new Handler(Looper.getMainLooper(), new ia1(0));
    public final ja1 l = new ja1(this, 0);
    public final la1 u = new la1(this);

    public pa1(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i;
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.g = viewGroup;
                this.j = snackbarContentLayout;
                this.h = context;
                o2n.c(context, o2n.a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                oa1 oa1Var = (oa1) from.inflate(i, viewGroup, false);
                this.i = oa1Var;
                oa1.a(oa1Var, this);
                if (view instanceof SnackbarContentLayout) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    float actionTextColorAlpha = oa1Var.getActionTextColorAlpha();
                    if (actionTextColorAlpha != 1.0f) {
                        snackbarContentLayout2.b.setTextColor(ven.o(ven.q(snackbarContentLayout2.getContext(), uen.d(snackbarContentLayout2, R.attr.colorSurface)), actionTextColorAlpha, snackbarContentLayout2.b.getCurrentTextColor()));
                    }
                    snackbarContentLayout2.setMaxInlineActionWidth(oa1Var.getMaxInlineActionWidth());
                }
                oa1Var.addView(view);
                oa1Var.setAccessibilityLiveRegion(1);
                oa1Var.setImportantForAccessibility(1);
                oa1Var.setFitsSystemWindows(true);
                m4l m4lVar = new m4l(this);
                WeakHashMap weakHashMap = k9k.a;
                d9k.b(oa1Var, m4lVar);
                k9k.j(oa1Var, new ka1(this, 0));
                this.t = (AccessibilityManager) context.getSystemService("accessibility");
                this.c = uen.c(context, R.attr.motionDurationLong2, RadarSimpleLogBuffer.PURGE_AMOUNT);
                this.a = uen.c(context, R.attr.motionDurationLong2, 150);
                this.b = uen.c(context, R.attr.motionDurationMedium1, 75);
                this.d = rhn.c(context, R.attr.motionEasingEmphasizedInterpolator, w);
                this.f = rhn.c(context, R.attr.motionEasingEmphasizedInterpolator, x);
                this.e = rhn.c(context, R.attr.motionEasingEmphasizedInterpolator, v);
                return;
            }
            dmk.v("Transient bottom bar must have non-null callback");
            throw null;
        }
        dmk.v("Transient bottom bar must have non-null content");
        throw null;
    }

    public final void a(int i) {
        boolean z2;
        a7h g = a7h.g();
        la1 la1Var = this.u;
        synchronized (g.a) {
            try {
                if (g.m(la1Var)) {
                    g.b((rbh) g.c, i);
                } else {
                    rbh rbhVar = (rbh) g.d;
                    if (rbhVar != null && rbhVar.a.get() == la1Var) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        g.b((rbh) g.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View b() {
        ma1 ma1Var = this.k;
        if (ma1Var == null) {
            return null;
        }
        return (View) ma1Var.b.get();
    }

    public final void c() {
        a7h g = a7h.g();
        la1 la1Var = this.u;
        synchronized (g.a) {
            try {
                if (g.m(la1Var)) {
                    g.c = null;
                    if (((rbh) g.d) != null) {
                        g.A();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        a7h g = a7h.g();
        la1 la1Var = this.u;
        synchronized (g.a) {
            try {
                if (g.m(la1Var)) {
                    g.z((rbh) g.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        oa1 oa1Var = this.i;
        if (z2) {
            oa1Var.post(new ja1(this, 2));
            return;
        }
        if (oa1Var.getParent() != null) {
            oa1Var.setVisibility(0);
        }
        d();
    }

    public final void f() {
        int i;
        boolean z2;
        oa1 oa1Var = this.i;
        ViewGroup.LayoutParams layoutParams = oa1Var.getLayoutParams();
        boolean z3 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = A;
        if (!z3) {
            m0.p(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (oa1Var.j == null) {
            m0.p(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (oa1Var.getParent() != null) {
            if (b() != null) {
                i = this.p;
            } else {
                i = this.m;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = oa1Var.j;
            int i2 = rect.bottom + i;
            int i3 = rect.left + this.n;
            int i4 = rect.right + this.o;
            int i5 = rect.top;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                oa1Var.requestLayout();
            }
            if ((z2 || this.r != this.q) && this.q > 0) {
                ViewGroup.LayoutParams layoutParams2 = oa1Var.getLayoutParams();
                if ((layoutParams2 instanceof t65) && (((t65) layoutParams2).a instanceof SwipeDismissBehavior) && b() == null) {
                    ja1 ja1Var = this.l;
                    oa1Var.removeCallbacks(ja1Var);
                    oa1Var.post(ja1Var);
                }
            }
        }
    }
}
