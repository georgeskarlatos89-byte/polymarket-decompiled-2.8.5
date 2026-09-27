package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wuj extends AbstractList implements RandomAccess, t4b {
    public final q4b a;

    public wuj(q4b q4bVar) {
        this.a = q4bVar;
    }

    @Override // defpackage.t4b
    public final gw1 Y(int i) {
        return this.a.Y(i);
    }

    @Override // defpackage.t4b
    public final void a0(skb skbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t4b
    public final List e() {
        return Collections.unmodifiableList(this.a.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        vuj vujVar = new vuj(0);
        vujVar.b = this.a.iterator();
        return vujVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        uuj uujVar = new uuj(0);
        uujVar.b = this.a.listIterator(i);
        return uujVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.t4b
    public final wuj g() {
        return this;
    }
}
