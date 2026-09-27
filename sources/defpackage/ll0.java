package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ll0 implements Collection, Set, yja, kka {
    public int[] a;
    public Object[] b;
    public int c;

    public ll0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i2 & 1) != 0 ? 0 : i;
        this.a = apl.a;
        this.b = apl.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i > 0) {
                ArraysKt.o(0, i, 6, iArr, iArr2);
                ArraysKt.p(0, i, 6, objArr, this.b);
            }
            if (i < i3) {
                int i5 = i + 1;
                ArraysKt.k(i, i5, i2, iArr, this.a);
                ArraysKt.l(i, i5, i2, objArr, this.b);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                ArraysKt.k(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                ArraysKt.l(i, i6, i2, objArr2, objArr2);
            }
            this.b[i3] = null;
        }
        if (i2 == this.c) {
            this.c = i3;
            return obj;
        }
        f27.g();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int b;
        int i2 = this.c;
        if (obj == null) {
            b = zen.b(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            b = zen.b(this, obj, hashCode);
        }
        if (b >= 0) {
            return false;
        }
        int i3 = ~b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 == this.c) {
                if (iArr2.length != 0) {
                    ArraysKt.o(0, iArr.length, 6, iArr, iArr2);
                    ArraysKt.p(0, objArr.length, 6, objArr, this.b);
                }
            } else {
                f27.g();
                return false;
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            ArraysKt.k(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            ArraysKt.l(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        f27.g();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i > 0) {
                ArraysKt.o(0, i, 6, iArr, iArr2);
                ArraysKt.p(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c == i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        f27.g();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.c;
        if (i != 0) {
            this.a = apl.a;
            this.b = apl.c;
            i = 0;
            this.c = 0;
        }
        if (i == 0) {
            return;
        }
        f27.g();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b;
        if (obj == null) {
            b = zen.b(this, null, 0);
        } else {
            b = zen.b(this, obj, obj.hashCode());
        }
        if (b < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new kl0(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b;
        if (obj == null) {
            b = zen.b(this, null, 0);
        } else {
            b = zen.b(this, obj, obj.hashCode());
        }
        if (b < 0) {
            return false;
        }
        a(b);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!CollectionsKt.x(collection, this.b[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ArraysKt.l(0, 0, this.c, this.b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ll0() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.q(this.b, 0, this.c);
    }
}
