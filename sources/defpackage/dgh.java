package defpackage;

import androidx.collection.SparseArrayCompat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dgh {
    private static final Object a = new Object();

    public static final /* synthetic */ void a(SparseArrayCompat sparseArrayCompat) {
        d(sparseArrayCompat);
    }

    public static final /* synthetic */ Object b() {
        return a;
    }

    public static final <E> E c(SparseArrayCompat<E> sparseArrayCompat, int i) {
        E e;
        sparseArrayCompat.getClass();
        int a2 = apl.a(sparseArrayCompat.size, i, sparseArrayCompat.keys);
        if (a2 >= 0 && (e = (E) sparseArrayCompat.values[a2]) != a) {
            return e;
        }
        return null;
    }

    private static final <E> void d(SparseArrayCompat<E> sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i2;
    }
}
