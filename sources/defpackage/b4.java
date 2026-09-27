package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b4 extends t3 implements ListIterator {
    public final /* synthetic */ c4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(c4 c4Var, int i) {
        super(c4Var, ((List) c4Var.c).listIterator(i));
        this.e = c4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        c4 c4Var = this.e;
        boolean isEmpty = c4Var.isEmpty();
        c().add(obj);
        ((aoc) c4Var.g).e++;
        if (isEmpty) {
            c4Var.a();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(c4 c4Var) {
        super(c4Var);
        this.e = c4Var;
    }
}
