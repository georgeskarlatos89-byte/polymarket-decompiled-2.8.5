package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bkj implements Collection, xja {
    public final int[] a;

    public /* synthetic */ bkj(int[] iArr) {
        this.a = iArr;
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
        if (!(obj instanceof UInt)) {
            return false;
        }
        return ArraysKt.h(((UInt) obj).a, this.a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (!(obj instanceof UInt) || !ArraysKt.h(((UInt) obj).a, this.a)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof bkj) {
            if (!Intrinsics.areEqual(this.a, ((bkj) obj).a)) {
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
        return new i3(this.a, 4);
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
        return "UIntArray(storage=" + Arrays.toString(this.a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pel.f(this);
    }
}
