package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class is8 implements Cloneable {
    public final ts8 a;
    public ts8 b;

    public is8(ts8 ts8Var) {
        this.a = ts8Var;
        if (!ts8Var.g()) {
            this.b = ts8Var.i();
        } else {
            dmk.v("Default instance must be immutable.");
            throw null;
        }
    }

    public final ts8 a() {
        ts8 b = b();
        b.getClass();
        if (ts8.f(b, true)) {
            return b;
        }
        throw new cuj();
    }

    public final ts8 b() {
        boolean g = this.b.g();
        ts8 ts8Var = this.b;
        if (!g) {
            return ts8Var;
        }
        ts8Var.getClass();
        zff zffVar = zff.c;
        zffVar.getClass();
        zffVar.a(ts8Var.getClass()).b(ts8Var);
        ts8Var.h();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            ts8 i = this.a.i();
            ts8 ts8Var = this.b;
            zff zffVar = zff.c;
            zffVar.getClass();
            zffVar.a(i.getClass()).a(i, ts8Var);
            this.b = i;
        }
    }

    public final Object clone() {
        is8 is8Var = (is8) this.a.c(qs8.NEW_BUILDER);
        is8Var.b = b();
        return is8Var;
    }
}
