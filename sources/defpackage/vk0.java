package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vk0 extends m4 {
    public static final uk0 d = new uk0(null);
    public static final Object[] e = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public vk0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            dmk.v(ace.f(i, "Illegal Capacity: "));
            throw null;
        }
        this.b = objArr;
    }

    @Override // defpackage.m4
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3;
        h3 h3Var = l3.a;
        int i4 = this.c;
        h3Var.getClass();
        h3.c(i, i4);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m();
        d(this.c + 1);
        int l = l(this.a + i);
        int i5 = this.c;
        if (i < ((i5 + 1) >> 1)) {
            if (l == 0) {
                i2 = ArraysKt.z(this.b);
            } else {
                i2 = l - 1;
            }
            int i6 = this.a;
            if (i6 == 0) {
                i3 = ArraysKt.z(this.b);
            } else {
                i3 = i6 - 1;
            }
            int i7 = this.a;
            Object[] objArr = this.b;
            if (i2 >= i7) {
                objArr[i3] = objArr[i7];
                ArraysKt.l(i7, i7 + 1, i2 + 1, objArr, objArr);
            } else {
                ArraysKt.l(i7 - 1, i7, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                ArraysKt.l(0, 1, i2 + 1, objArr2, objArr2);
            }
            this.b[i2] = obj;
            this.a = i3;
        } else {
            int l2 = l(i5 + this.a);
            Object[] objArr3 = this.b;
            if (l < l2) {
                ArraysKt.l(l + 1, l, l2, objArr3, objArr3);
            } else {
                ArraysKt.l(1, 0, l2, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                ArraysKt.l(l + 1, l, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[l] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h3 h3Var = l3.a;
        int i2 = this.c;
        h3Var.getClass();
        h3.c(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        m();
        d(collection.size() + this.c);
        int l = l(this.c + this.a);
        int l2 = l(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.a;
            int i4 = i3 - size;
            Object[] objArr = this.b;
            if (l2 >= i3) {
                if (i4 >= 0) {
                    ArraysKt.l(i4, i3, l2, objArr, objArr);
                } else {
                    i4 += objArr.length;
                    int i5 = l2 - i3;
                    int length = objArr.length - i4;
                    if (length >= i5) {
                        ArraysKt.l(i4, i3, l2, objArr, objArr);
                    } else {
                        ArraysKt.l(i4, i3, i3 + length, objArr, objArr);
                        Object[] objArr2 = this.b;
                        ArraysKt.l(0, this.a + length, l2, objArr2, objArr2);
                    }
                }
            } else {
                ArraysKt.l(i4, i3, objArr.length, objArr, objArr);
                Object[] objArr3 = this.b;
                if (size >= l2) {
                    ArraysKt.l(objArr3.length - size, 0, l2, objArr3, objArr3);
                } else {
                    ArraysKt.l(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    ArraysKt.l(0, size, l2, objArr4, objArr4);
                }
            }
            this.a = i4;
            c(j(l2 - size), collection);
            return true;
        }
        int i6 = l2 + size;
        Object[] objArr5 = this.b;
        if (l2 < l) {
            int i7 = size + l;
            if (i7 <= objArr5.length) {
                ArraysKt.l(i6, l2, l, objArr5, objArr5);
            } else if (i6 >= objArr5.length) {
                ArraysKt.l(i6 - objArr5.length, l2, l, objArr5, objArr5);
            } else {
                int length2 = l - (i7 - objArr5.length);
                ArraysKt.l(0, length2, l, objArr5, objArr5);
                Object[] objArr6 = this.b;
                ArraysKt.l(i6, l2, length2, objArr6, objArr6);
            }
        } else {
            ArraysKt.l(size, 0, l, objArr5, objArr5);
            Object[] objArr7 = this.b;
            if (i6 >= objArr7.length) {
                ArraysKt.l(i6 - objArr7.length, l2, objArr7.length, objArr7, objArr7);
            } else {
                ArraysKt.l(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                Object[] objArr8 = this.b;
                ArraysKt.l(i6, l2, objArr8.length - size, objArr8, objArr8);
            }
        }
        c(l2, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        int i;
        m();
        d(this.c + 1);
        int i2 = this.a;
        if (i2 == 0) {
            i = ArraysKt.z(this.b);
        } else {
            i = i2 - 1;
        }
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        m();
        d(a() + 1);
        this.b[l(a() + this.a)] = obj;
        this.c = a() + 1;
    }

    @Override // defpackage.m4
    public final Object b(int i) {
        h3 h3Var = l3.a;
        int i2 = this.c;
        h3Var.getClass();
        h3.b(i, i2);
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m();
        int l = l(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[l];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (l >= i4) {
                ArraysKt.l(i4 + 1, i4, l, objArr, objArr);
            } else {
                ArraysKt.l(1, 0, l, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                ArraysKt.l(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = h(i6);
        } else {
            int l2 = l((a() - 1) + i4);
            Object[] objArr4 = this.b;
            if (l <= l2) {
                ArraysKt.l(l, l + 1, l2 + 1, objArr4, objArr4);
            } else {
                ArraysKt.l(l, l + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                ArraysKt.l(0, 1, l2 + 1, objArr5, objArr5);
            }
            this.b[l2] = null;
        }
        this.c--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.a, l(a() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == e) {
                if (i < 10) {
                    i = 10;
                }
                this.b = new Object[i];
                return;
            }
            h3 h3Var = l3.a;
            int length = objArr.length;
            h3Var.getClass();
            Object[] objArr2 = new Object[h3.e(length, i)];
            Object[] objArr3 = this.b;
            ArraysKt.l(0, this.a, objArr3.length, objArr3, objArr2);
            Object[] objArr4 = this.b;
            int length2 = objArr4.length;
            int i2 = this.a;
            ArraysKt.l(length2 - i2, 0, i2, objArr4, objArr2);
            this.a = 0;
            this.b = objArr2;
            return;
        }
        dmk.n("Deque is too big.");
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        ahh.i("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h3 h3Var = l3.a;
        int i2 = this.c;
        h3Var.getClass();
        h3.b(i, i2);
        return this.b[l(this.a + i)];
    }

    public final int h(int i) {
        if (i == ArraysKt.z(this.b)) {
            return 0;
        }
        return i + 1;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.b[l((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int l = l(a() + this.a);
        int i2 = this.a;
        if (i2 < l) {
            while (i2 < l) {
                if (Intrinsics.areEqual(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (!isEmpty() && (i2 = this.a) >= l) {
            int length = this.b.length;
            while (true) {
                if (i2 < length) {
                    if (Intrinsics.areEqual(obj, this.b[i2])) {
                        i = this.a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < l; i3++) {
                        if (Intrinsics.areEqual(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    public final void k(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            ArraysKt.r(i, i2, null, objArr);
        } else {
            ArraysKt.r(i, objArr.length, null, objArr);
            ArraysKt.r(0, i2, null, this.b);
        }
    }

    public final int l(int i) {
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.b[l((size() - 1) + this.a)];
        }
        ahh.i("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int z;
        int i;
        int l = l(a() + this.a);
        int i2 = this.a;
        if (i2 < l) {
            z = l - 1;
            if (i2 <= z) {
                while (!Intrinsics.areEqual(obj, this.b[z])) {
                    if (z != i2) {
                        z--;
                    }
                }
                i = this.a;
                return z - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= l) {
            while (true) {
                l--;
                Object[] objArr = this.b;
                if (-1 < l) {
                    if (Intrinsics.areEqual(obj, objArr[l])) {
                        z = l + this.b.length;
                        i = this.a;
                        break;
                    }
                } else {
                    z = ArraysKt.z(objArr);
                    int i3 = this.a;
                    if (i3 <= z) {
                        while (!Intrinsics.areEqual(obj, this.b[z])) {
                            if (z != i3) {
                                z--;
                            }
                        }
                        i = this.a;
                    }
                }
            }
            return z - i;
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int l;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int l2 = l(a() + this.a);
            int i = this.a;
            if (i < l2) {
                l = i;
                while (true) {
                    objArr = this.b;
                    if (i >= l2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.b[l] = obj;
                        l++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.r(l, l2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[l] = obj3;
                        l = h(l);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.c = j(l - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            m();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = h(i);
            this.c = a() - 1;
            return obj;
        }
        ahh.i("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            m();
            int l = l((size() - 1) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[l];
            objArr[l] = null;
            this.c = a() - 1;
            return obj;
        }
        ahh.i("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        h3 h3Var = l3.a;
        int i3 = this.c;
        h3Var.getClass();
        h3.d(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.c) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i);
            return;
        }
        m();
        int i5 = this.c - i2;
        int i6 = this.a;
        if (i < i5) {
            int l = l((i - 1) + i6);
            int l2 = l(this.a + (i2 - 1));
            while (i > 0) {
                int i7 = l + 1;
                int min = Math.min(i, Math.min(i7, l2 + 1));
                Object[] objArr = this.b;
                int i8 = l2 - min;
                int i9 = l - min;
                ArraysKt.l(i8 + 1, i9 + 1, i7, objArr, objArr);
                l = j(i9);
                l2 = j(i8);
                i -= min;
            }
            int l3 = l(this.a + i4);
            k(this.a, l3);
            this.a = l3;
        } else {
            int l4 = l(i6 + i2);
            int l5 = l(this.a + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - l4, objArr2.length - l5));
                Object[] objArr3 = this.b;
                int i11 = l4 + i2;
                ArraysKt.l(l5, l4, i11, objArr3, objArr3);
                l4 = l(i11);
                l5 = l(l5 + i2);
            }
            int l6 = l(this.c + this.a);
            k(j(l6 - i4), l6);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int l;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int l2 = l(a() + this.a);
            int i = this.a;
            if (i < l2) {
                l = i;
                while (true) {
                    objArr = this.b;
                    if (i >= l2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[l] = obj;
                        l++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.r(l, l2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[l] = obj3;
                        l = h(l);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.c = j(l - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h3 h3Var = l3.a;
        int i2 = this.c;
        h3Var.getClass();
        h3.b(i, i2);
        int l = l(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[l];
        objArr[l] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int l = l(this.c + this.a);
        int i2 = this.a;
        if (i2 < l) {
            ArraysKt.p(i2, l, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            ArraysKt.l(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            ArraysKt.l(objArr3.length - this.a, 0, l, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public vk0() {
        this.b = e;
    }

    public vk0(r3c r3cVar) {
        Object[] array = r3cVar.toArray(new Object[0]);
        this.b = array;
        this.c = array.length;
        if (array.length == 0) {
            this.b = e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m();
        d(collection.size() + a());
        c(l(a() + this.a), collection);
        return true;
    }
}
