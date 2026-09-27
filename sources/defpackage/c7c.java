package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class c7c {
    public final long a;

    static {
        new c7c(new t68());
        u1k.G(0);
        u1k.G(1);
        u1k.G(2);
        u1k.G(3);
        u1k.G(4);
        u1k.G(5);
        u1k.G(6);
    }

    public c7c(t68 t68Var) {
        t68Var.getClass();
        int i = u1k.a;
        this.a = t68Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c7c) && this.a == ((c7c) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 29791;
    }
}
