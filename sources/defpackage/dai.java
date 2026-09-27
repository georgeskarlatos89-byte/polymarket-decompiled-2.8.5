package defpackage;

import java.util.ListIterator;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dai implements ListIterator, xja {
    public final /* synthetic */ Ref.b a;
    public final /* synthetic */ eai b;

    public dai(Ref.b bVar, eai eaiVar) {
        this.a = bVar;
        this.b = eaiVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.a.a < this.b.d - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.a.a >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Ref.b bVar = this.a;
        int i = bVar.a + 1;
        eai eaiVar = this.b;
        edh.e(i, eaiVar.d);
        bVar.a = i;
        return eaiVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Ref.b bVar = this.a;
        int i = bVar.a;
        eai eaiVar = this.b;
        edh.e(i, eaiVar.d);
        bVar.a = i - 1;
        return eaiVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
