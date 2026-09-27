package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class orm implements Cloneable {
    public final usm a;
    public usm b;

    public orm(usm usmVar) {
        this.a = usmVar;
        if (!usmVar.h()) {
            this.b = (usm) usmVar.j(4, null);
        } else {
            dmk.v("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(Object obj, Object obj2) {
        m1n.c.a(obj.getClass()).zzg(obj, obj2);
    }

    public final usm b() {
        usm c = c();
        if (usm.g(c, true)) {
            return c;
        }
        throw new q4n();
    }

    public usm c() {
        boolean h = this.b.h();
        usm usmVar = this.b;
        if (!h) {
            return usmVar;
        }
        usmVar.getClass();
        m1n.c.a(usmVar.getClass()).zzf(usmVar);
        usmVar.d();
        return this.b;
    }

    public final Object clone() {
        orm ormVar = (orm) this.a.j(5, null);
        ormVar.b = c();
        return ormVar;
    }

    public /* bridge */ jzm d() {
        return c();
    }

    public final void e() {
        if (!this.b.h()) {
            f();
        }
    }

    public void f() {
        usm usmVar = (usm) this.a.j(4, null);
        a(usmVar, this.b);
        this.b = usmVar;
    }
}
