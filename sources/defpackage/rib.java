package defpackage;

import com.appsflyer.internal.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rib extends m4 implements List, RandomAccess, Serializable {
    private static final qib d = new qib(null);
    public static final rib e;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        rib ribVar = new rib(0);
        ribVar.c = true;
        e = ribVar;
    }

    public rib(int i) {
        if (i >= 0) {
            this.a = new Object[i];
        } else {
            dmk.v("capacity must be non-negative.");
            throw null;
        }
    }

    public static final /* synthetic */ int c(rib ribVar) {
        return ((AbstractList) ribVar).modCount;
    }

    @Override // defpackage.m4
    public final int a() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.c(i, i2);
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.c(i, i2);
        int size = collection.size();
        d(i, collection, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m4
    public final Object b(int i) {
        h();
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.b(i, i2);
        return j(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.b);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.a;
                int i = this.b;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.areEqual(objArr[i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.b(i, i2);
        return this.a[i];
    }

    public final void h() {
        if (!this.c) {
            return;
        }
        l.g();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    public final void i(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 >= 0) {
            Object[] objArr = this.a;
            if (i3 > objArr.length) {
                h3 h3Var = l3.a;
                int length = objArr.length;
                h3Var.getClass();
                int e2 = h3.e(length, i3);
                Object[] objArr2 = this.a;
                objArr2.getClass();
                objArr = Arrays.copyOf(objArr2, e2);
                this.a = objArr;
            }
            ArraysKt.l(i + i2, i, this.b, objArr, objArr);
            this.b += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (Intrinsics.areEqual(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        ArraysKt.l(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        ArraysKt.l(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        f8n.c(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ArraysKt.l(i + i4, i2 + i, this.b, objArr, objArr);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        f8n.c(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.c(i, i2);
        return new i89(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        if (l(0, this.b, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        if (l(0, this.b, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        h3 h3Var = l3.a;
        int i2 = this.b;
        h3Var.getClass();
        h3.b(i, i2);
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        h3 h3Var = l3.a;
        int i3 = this.b;
        h3Var.getClass();
        h3.d(i, i2, i3);
        return new pib(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.b;
        Object[] objArr2 = this.a;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ArraysKt.l(0, 0, i, objArr2, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return f8n.d(this.a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ rib(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public rib() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.b;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        d(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ArraysKt.q(this.a, 0, this.b);
    }
}
