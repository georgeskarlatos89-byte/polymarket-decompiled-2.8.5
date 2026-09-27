package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ee7 extends LinkedHashSet {
    public static final ee7 a;

    static {
        new ee7(fe7.d, fe7.e, fe7.f);
        a = new ee7(fe7.i, fe7.j, fe7.k);
    }

    public ee7(fn... fnVarArr) {
        for (fn fnVar : fnVarArr) {
            super.add(fnVar);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
