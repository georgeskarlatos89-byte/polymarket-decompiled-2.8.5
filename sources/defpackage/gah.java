package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gah {
    public static final eah a(dil dilVar) {
        eah eahVar;
        if (dilVar instanceof eah) {
            eahVar = (eah) dilVar;
        } else {
            eahVar = null;
        }
        if (eahVar != null) {
            return eahVar;
        }
        uq4.b("Inconsistent composition");
        f05.c();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int c = c(arrayList, i, i2);
        if (c >= 0) {
            return c;
        }
        return -(c + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((nr8) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int d = Intrinsics.d(i5, i);
            if (d < 0) {
                i3 = i4 + 1;
            } else if (d > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
