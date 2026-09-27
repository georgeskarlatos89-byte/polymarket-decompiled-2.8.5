package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dzg extends o4 implements Set, Serializable {
    private static final czg b = new czg(null);
    public static final dzg c;
    public final xzb a;

    static {
        xzb.n.getClass();
        c = new dzg(xzb.o);
    }

    public dzg() {
        this.a = new xzb();
    }

    @Override // defpackage.o4
    public final int a() {
        return this.a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xzb xzbVar = this.a;
        xzbVar.getClass();
        return new uzb(xzbVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        xzb xzbVar = this.a;
        xzbVar.c();
        int g = xzbVar.g(obj);
        if (g < 0) {
            return false;
        }
        xzbVar.k(g);
        return true;
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

    public dzg(xzb xzbVar) {
        xzbVar.getClass();
        this.a = xzbVar;
    }
}
