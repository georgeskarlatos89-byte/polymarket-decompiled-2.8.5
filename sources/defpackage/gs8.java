package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class gs8 implements pdc, Cloneable {
    public final rs8 a;
    public rs8 b;

    public gs8(rs8 rs8Var) {
        this.a = rs8Var;
        if (!rs8Var.o()) {
            this.b = rs8Var.r();
        } else {
            dmk.v("Default instance must be immutable.");
            throw null;
        }
    }

    public static void f(Object obj, Object obj2) {
        xff xffVar = xff.c;
        xffVar.getClass();
        xffVar.a(obj.getClass()).a(obj, obj2);
    }

    public final rs8 b() {
        rs8 c = c();
        c.getClass();
        if (rs8.n(c, true)) {
            return c;
        }
        throw new auj();
    }

    public final rs8 c() {
        boolean o = this.b.o();
        rs8 rs8Var = this.b;
        if (!o) {
            return rs8Var;
        }
        rs8Var.getClass();
        xff xffVar = xff.c;
        xffVar.getClass();
        xffVar.a(rs8Var.getClass()).b(rs8Var);
        rs8Var.p();
        return this.b;
    }

    public final gs8 d() {
        gs8 q = this.a.q();
        q.b = c();
        return q;
    }

    public final void e() {
        if (!this.b.o()) {
            rs8 r = this.a.r();
            f(r, this.b);
            this.b = r;
        }
    }
}
