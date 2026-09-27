package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bs4 extends rmd implements Serializable {
    public final Comparator[] a;

    public bs4(nt1 nt1Var, nt1 nt1Var2) {
        this.a = new Comparator[]{nt1Var, nt1Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bs4) {
            return Arrays.equals(this.a, ((bs4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return woa.r(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
