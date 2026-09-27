package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ujj implements Collection, xja {
    public final byte[] a;

    public /* synthetic */ ujj(byte[] bArr) {
        this.a = bArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof UByte)) {
            return false;
        }
        byte b = ((UByte) obj).a;
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (b == bArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof UByte) {
                    byte b = ((UByte) obj).a;
                    byte[] bArr = this.a;
                    int length = bArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (b == bArr[i]) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof ujj) {
            if (!Intrinsics.areEqual(this.a, ((ujj) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i3(this.a, 3);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pel.g(this, objArr);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pel.f(this);
    }
}
