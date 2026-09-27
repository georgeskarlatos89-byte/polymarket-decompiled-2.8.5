package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nt1 extends rmd implements Serializable {
    public final op8 a;
    public final rmd b;

    public nt1(op8 op8Var, rmd rmdVar) {
        op8Var.getClass();
        this.a = op8Var;
        this.b = rmdVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        op8 op8Var = this.a;
        return this.b.compare(op8Var.apply(obj), op8Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof nt1) {
                nt1 nt1Var = (nt1) obj;
                if (this.a.equals(nt1Var.a) && this.b.equals(nt1Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
