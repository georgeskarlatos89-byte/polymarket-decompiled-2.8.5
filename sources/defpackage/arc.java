package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class arc {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        c(i, size);
    }

    public static final void b(int i, int i2, List list) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(m51.j(i, "Index ", i2, " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(sv6.j(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(m51.j(i, "Indices are out of order. fromIndex (", i2, ") is greater than toIndex (", ")."));
    }
}
