package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bl5 implements Comparable, Serializable {
    public final Comparable a;

    public bl5(Comparable comparable) {
        this.a = comparable;
    }

    public int a(bl5 bl5Var) {
        if (bl5Var == zk5.d) {
            return 1;
        }
        if (bl5Var == zk5.c) {
            return -1;
        }
        Comparable comparable = bl5Var.a;
        jnf jnfVar = jnf.c;
        int compareTo = this.a.compareTo(comparable);
        if (compareTo != 0) {
            return compareTo;
        }
        return Boolean.compare(this instanceof al5, bl5Var instanceof al5);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((bl5) obj);
    }

    public abstract boolean d(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof bl5) {
            try {
                if (a((bl5) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
