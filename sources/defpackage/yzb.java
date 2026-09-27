package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yzb extends d4 {
    public final xzb a;

    public yzb(xzb xzbVar) {
        this.a = xzbVar;
    }

    @Override // defpackage.o4
    public final int a() {
        return this.a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.d4
    public final boolean b(Map.Entry entry) {
        Object key = entry.getKey();
        xzb xzbVar = this.a;
        int g = xzbVar.g(key);
        if (g < 0) {
            return false;
        }
        Object[] objArr = xzbVar.b;
        objArr.getClass();
        return Intrinsics.areEqual(objArr[g], entry.getValue());
    }

    @Override // defpackage.d4
    public final boolean c(Map.Entry entry) {
        xzb xzbVar = this.a;
        xzbVar.c();
        int g = xzbVar.g(entry.getKey());
        if (g >= 0) {
            Object[] objArr = xzbVar.b;
            objArr.getClass();
            if (!Intrinsics.areEqual(objArr[g], entry.getValue())) {
                return false;
            }
            xzbVar.k(g);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.e(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new uzb(this.a, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.c();
        return super.retainAll(collection);
    }
}
