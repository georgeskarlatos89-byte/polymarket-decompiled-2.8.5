package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z7g extends l3 implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int e;

    public z7g(Object[] objArr, int i) {
        this.b = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.c = objArr.length;
                this.e = i;
                return;
            } else {
                f27.i(objArr.length, ace.o(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
                throw null;
            }
        }
        f27.q(ace.f(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h3 h3Var = l3.a;
        int size = size();
        h3Var.getClass();
        h3.b(i, size);
        return this.b[(this.d + i) % this.c];
    }

    @Override // defpackage.o1
    public final int getSize() {
        return this.e;
    }

    @Override // defpackage.l3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new y7g(this);
    }

    public final void removeFirst(int i) {
        if (i >= 0) {
            if (i <= size()) {
                if (i > 0) {
                    int i2 = this.d;
                    int i3 = this.c;
                    int i4 = (i2 + i) % i3;
                    Object[] objArr = this.b;
                    if (i2 > i4) {
                        Arrays.fill(objArr, i2, i3, (Object) null);
                        Arrays.fill(objArr, 0, i4, (Object) null);
                    } else {
                        Arrays.fill(objArr, i2, i4, (Object) null);
                    }
                    this.d = i4;
                    this.e = size() - i;
                    return;
                }
                return;
            }
            f27.i(size(), ace.o(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        f27.q(ace.f(i, "n shouldn't be negative but it is "));
    }

    @Override // defpackage.o1, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.b;
            if (i3 >= size || i >= this.c) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // defpackage.o1, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
