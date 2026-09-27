package defpackage;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vpc extends lfd {
    public tpc c;

    public vpc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super((i2 & 1) != 0 ? 16 : i, null);
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(lfd lfdVar) {
        lfdVar.getClass();
        if (!lfdVar.d()) {
            int i = this.b + lfdVar.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                n(i, objArr);
            }
            ArraysKt.l(this.b, 0, lfdVar.b, lfdVar.a, this.a);
            this.b += lfdVar.b;
        }
    }

    public final void i(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            int i = this.b;
            int size = list.size() + i;
            Object[] objArr = this.a;
            if (objArr.length < size) {
                n(size, objArr);
            }
            Object[] objArr2 = this.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = list.get(i2);
            }
            this.b = list.size() + this.b;
        }
    }

    public final void j() {
        ArraysKt.r(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean k(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            l(c);
            return true;
        }
        return false;
    }

    public final Object l(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (i != i2 - 1) {
                ArraysKt.l(i, i + 1, i2, objArr, objArr);
            }
            int i3 = this.b - 1;
            this.b = i3;
            objArr[i3] = null;
            return obj;
        }
        f(i);
        throw null;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        Object[] objArr = this.a;
                        ArraysKt.l(i, i2, i3, objArr, objArr);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    ArraysKt.r(i5, i4, null, this.a);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        omf.e(this.b, m51.n(i, "Start (", i2, ") and end (", ") must be in 0.."));
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ArraysKt.l(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i >= 0 && i < this.b) {
            Object[] objArr = this.a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        f(i);
        throw null;
    }

    public final void p(int i) {
        StringBuilder o = ace.o(i, "Index ", " must be in 0..");
        o.append(this.b);
        throw new IndexOutOfBoundsException(o.toString());
    }

    public vpc() {
        this(0, 1, null);
    }
}
