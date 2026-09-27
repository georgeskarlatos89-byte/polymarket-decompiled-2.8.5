package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class lfd {
    public Object[] a;
    public int b;

    public lfd(int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object[] objArr;
        if (i == 0) {
            objArr = mfd.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final Object a() {
        if (!d()) {
            return this.a[0];
        }
        ahh.i("ObjectList is empty.");
        return null;
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lfd) {
            lfd lfdVar = (lfd) obj;
            int i = lfdVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = lfdVar.a;
                IntRange k = lnf.k(0, i2);
                int i3 = k.a;
                int i4 = k.b;
                if (i3 <= i4) {
                    while (Intrinsics.areEqual(objArr[i3], objArr2[i3])) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder o = ace.o(i, "Index ", " must be in 0..");
        o.append(this.b - 1);
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final String toString() {
        kfd kfdVar = new kfd(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(kfdVar.a(obj));
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}
