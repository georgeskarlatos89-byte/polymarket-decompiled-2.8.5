package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h7g extends m4 {
    public final ArrayList a;

    public h7g(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.m4
    public final int a() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(b.l(i, this), obj);
    }

    @Override // defpackage.m4
    public final Object b(int i) {
        return this.a.remove(b.k(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(b.k(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new g7g(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new g7g(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(b.k(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new g7g(this, i);
    }
}
