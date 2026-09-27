package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jnf implements o1f, Serializable {
    public static final jnf c = new jnf(zk5.d, zk5.c);
    public final bl5 a;
    public final bl5 b;

    public jnf(bl5 bl5Var, bl5 bl5Var2) {
        bl5Var.getClass();
        this.a = bl5Var;
        bl5Var2.getClass();
        this.b = bl5Var2;
        if (bl5Var.a(bl5Var2) <= 0 && bl5Var != zk5.c && bl5Var2 != zk5.d) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        bl5Var.b(sb);
        sb.append("..");
        bl5Var2.c(sb);
        dmk.v("Invalid range: ".concat(sb.toString()));
        throw null;
    }

    public static jnf a(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        zk5 zk5Var = new zk5(comparable, 2);
        comparable2.getClass();
        return new jnf(zk5Var, new bl5(comparable2));
    }

    @Override // defpackage.o1f
    public final boolean apply(Object obj) {
        return b((Comparable) obj);
    }

    public final boolean b(Comparable comparable) {
        comparable.getClass();
        if (this.a.d(comparable) && !this.b.d(comparable)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jnf) {
            jnf jnfVar = (jnf) obj;
            if (this.a.equals(jnfVar.a) && this.b.equals(jnfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }
}
