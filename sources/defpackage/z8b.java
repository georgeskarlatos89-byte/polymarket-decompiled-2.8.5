package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.g;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class z8b {
    public int a = -1;
    public RecyclerView b;
    public e c;
    public boolean d;
    public boolean e;
    public View f;
    public final ctf g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [ctf, java.lang.Object] */
    public z8b(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                dmk.v("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int b(View view, int i) {
        e eVar = this.c;
        if (eVar != null && eVar.d()) {
            tsf tsfVar = (tsf) view.getLayoutParams();
            return a(e.A(view) - ((ViewGroup.MarginLayoutParams) tsfVar).leftMargin, e.D(view) + ((ViewGroup.MarginLayoutParams) tsfVar).rightMargin, eVar.H(), eVar.n - eVar.I(), i);
        }
        return 0;
    }

    public int c(View view, int i) {
        e eVar = this.c;
        if (eVar != null && eVar.e()) {
            tsf tsfVar = (tsf) view.getLayoutParams();
            return a(e.E(view) - ((ViewGroup.MarginLayoutParams) tsfVar).topMargin, e.y(view) + ((ViewGroup.MarginLayoutParams) tsfVar).bottomMargin, eVar.J(), eVar.o - eVar.G(), i);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof dtf) {
            return ((dtf) obj).a(i);
        }
        m0.p("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + dtf.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        int i3 = -1;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.j0((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        ctf ctfVar = this.g;
        if (view != null) {
            this.b.getClass();
            g O = RecyclerView.O(view);
            if (O != null) {
                i3 = O.getLayoutPosition();
            }
            if (i3 == this.a) {
                View view2 = this.f;
                etf etfVar = recyclerView.u1;
                h(view2, ctfVar);
                ctfVar.a(recyclerView);
                i();
            } else {
                m0.d("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            etf etfVar2 = recyclerView.u1;
            if (this.b.n.v() == 0) {
                i();
            } else {
                int i4 = this.o;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.o = i5;
                int i6 = this.p;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF f3 = f(this.a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.k = f3;
                            this.o = (int) (f5 * 10000.0f);
                            this.p = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            ctfVar.a = (int) (this.o * 1.2f);
                            ctfVar.b = (int) (this.p * 1.2f);
                            ctfVar.c = (int) (e * 1.2f);
                            ctfVar.e = this.i;
                            ctfVar.f = true;
                        }
                    }
                    ctfVar.d = this.a;
                    i();
                }
            }
            if (ctfVar.d >= 0) {
                z = true;
            }
            ctfVar.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.r1.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, ctf ctfVar) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.k;
        int i2 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    i = 1;
                } else {
                    i = -1;
                }
                int b = b(view, i);
                pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        i2 = f2 > 0.0f ? 1 : -1;
                    }
                }
                int c = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b * b))) / 0.3356d);
                if (ceil <= 0) {
                    ctfVar.a = -b;
                    ctfVar.b = -c;
                    ctfVar.c = ceil;
                    ctfVar.e = this.j;
                    ctfVar.f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b2 = b(view, i);
        pointF = this.k;
        if (pointF != null) {
        }
        int c2 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.u1.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        e eVar = this.c;
        if (eVar.e == this) {
            eVar.e = null;
        }
        this.c = null;
        this.b = null;
    }
}
