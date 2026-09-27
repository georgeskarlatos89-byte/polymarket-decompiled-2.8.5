package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class g91 {
    public final d91 c;
    public x4 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public g91(List list) {
        d91 e91Var;
        d91 d91Var;
        if (list.isEmpty()) {
            d91Var = new azk(24);
        } else {
            if (list.size() == 1) {
                e91Var = new f91(list);
            } else {
                e91Var = new e91(list);
            }
            d91Var = e91Var;
        }
        this.c = d91Var;
    }

    public final void a(c91 c91Var) {
        this.a.add(c91Var);
    }

    public final soa b() {
        no0 no0Var = hua.a;
        return this.c.i();
    }

    public float c() {
        float f = this.h;
        if (f == -1.0f) {
            float u = this.c.u();
            this.h = u;
            return u;
        }
        return f;
    }

    public final float d() {
        Interpolator interpolator;
        soa b = b();
        if (b != null && !b.c() && (interpolator = b.d) != null) {
            return interpolator.getInterpolation(e());
        }
        return 0.0f;
    }

    public final float e() {
        if (!this.b) {
            soa b = b();
            if (b.c()) {
                return 0.0f;
            }
            return (this.d - b.b()) / (b.a() - b.b());
        }
        return 0.0f;
    }

    public Object f() {
        Object g;
        float e = e();
        if (this.e == null && this.c.g(e) && !l()) {
            return this.f;
        }
        soa b = b();
        Interpolator interpolator = b.e;
        Interpolator interpolator2 = b.f;
        if (interpolator != null && interpolator2 != null) {
            g = h(b, e, interpolator.getInterpolation(e), interpolator2.getInterpolation(e));
        } else {
            g = g(b, d());
        }
        this.f = g;
        return g;
    }

    public abstract Object g(soa soaVar, float f);

    public Object h(soa soaVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        no0 no0Var = hua.a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ((c91) arrayList.get(i)).a();
                i++;
            } else {
                no0 no0Var2 = hua.a;
                return;
            }
        }
    }

    public void j(float f) {
        no0 no0Var = hua.a;
        d91 d91Var = this.c;
        if (!d91Var.isEmpty()) {
            float f2 = this.g;
            if (f2 == -1.0f) {
                f2 = d91Var.l();
                this.g = f2;
            }
            float f3 = f2;
            if (f < f2) {
                if (f3 == -1.0f) {
                    f = d91Var.l();
                    this.g = f;
                } else {
                    f = f3;
                }
            } else if (f > c()) {
                f = c();
            }
            if (f != this.d) {
                this.d = f;
                if (d91Var.j(f)) {
                    i();
                }
            }
        }
    }

    public final void k(x4 x4Var) {
        x4 x4Var2 = this.e;
        if (x4Var2 != null) {
            x4Var2.getClass();
        }
        this.e = x4Var;
    }

    public boolean l() {
        return false;
    }
}
