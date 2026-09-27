package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class le1 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public le1(int... iArr) {
        int i;
        int i2;
        List emptyList;
        this.a = iArr;
        Integer B = ArraysKt.B(0, iArr);
        if (B != null) {
            i = B.intValue();
        } else {
            i = -1;
        }
        this.b = i;
        Integer B2 = ArraysKt.B(1, iArr);
        if (B2 != null) {
            i2 = B2.intValue();
        } else {
            i2 = -1;
        }
        this.c = i2;
        Integer B3 = ArraysKt.B(2, iArr);
        this.d = B3 != null ? B3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                emptyList = CollectionsKt.M0(new k3(new rl0(iArr), 3, iArr.length));
            } else {
                dmk.v(sv6.o(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.e = emptyList;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.d >= i3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            le1 le1Var = (le1) obj;
            if (this.b == le1Var.b && this.c == le1Var.c && this.d == le1Var.d && Intrinsics.areEqual(this.e, le1Var.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return CollectionsKt.N(arrayList, ".", null, null, null, 62);
    }
}
