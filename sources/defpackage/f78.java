package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f78 {
    public final SparseBooleanArray a;

    public f78(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        pfn.c(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f78) {
                f78 f78Var = (f78) obj;
                SparseBooleanArray sparseBooleanArray = f78Var.a;
                int i = u1k.a;
                SparseBooleanArray sparseBooleanArray2 = this.a;
                if (i < 24) {
                    if (sparseBooleanArray2.size() == sparseBooleanArray.size()) {
                        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                            if (a(i2) == f78Var.a(i2)) {
                            }
                        }
                        return true;
                    }
                } else {
                    return sparseBooleanArray2.equals(sparseBooleanArray);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = u1k.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + a(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
