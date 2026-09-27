package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xuj extends AbstractList implements s4b, RandomAccess {
    public final r4b a;

    public xuj(r4b r4bVar) {
        this.a = r4bVar;
    }

    @Override // defpackage.s4b
    public final void S0(fw1 fw1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s4b
    public final List e() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.s4b
    public final Object h1(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        vuj vujVar = new vuj(1);
        vujVar.b = this.a.iterator();
        return vujVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        uuj uujVar = new uuj(1);
        uujVar.b = this.a.listIterator(i);
        return uujVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.s4b
    public final s4b g() {
        return this;
    }
}
