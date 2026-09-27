package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xsc extends rmd implements Serializable {
    public static final xsc b = new xsc(0);
    public static final xsc c = new xsc(1);
    public static final xsc d = new xsc(2);
    public final /* synthetic */ int a;

    public /* synthetic */ xsc(int i) {
        this.a = i;
    }

    @Override // defpackage.rmd
    public rmd a() {
        switch (this.a) {
            case 0:
                return d;
            case 1:
            default:
                return super.a();
            case 2:
                return b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 1:
                jnf jnfVar = (jnf) obj;
                jnf jnfVar2 = (jnf) obj2;
                return ni4.a.b(jnfVar.a, jnfVar2.a).b(jnfVar.b, jnfVar2.b).f();
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Ordering.natural()";
            case 1:
            default:
                return super.toString();
            case 2:
                return "Ordering.natural().reverse()";
        }
    }
}
