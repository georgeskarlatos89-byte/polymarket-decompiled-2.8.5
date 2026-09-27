package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class o7a extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public o7a(int i, int i2, int[] iArr) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            while (true) {
                if (i < this.c) {
                    if (this.a[i] == intValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o7a) {
            o7a o7aVar = (o7a) obj;
            int size = size();
            if (o7aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != o7aVar.a[o7aVar.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        brn.k(i, size());
        return Integer.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            int i2 = i;
            while (true) {
                if (i2 < this.c) {
                    if (this.a[i2] == intValue) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.c;
            while (true) {
                i2--;
                i = this.b;
                if (i2 >= i) {
                    if (this.a[i2] == intValue) {
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        brn.k(i, size());
        int i2 = this.b + i;
        int[] iArr = this.a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        brn.o(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.b;
        return new o7a(i + i3, i3 + i2, this.a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.a;
        int i = this.b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
