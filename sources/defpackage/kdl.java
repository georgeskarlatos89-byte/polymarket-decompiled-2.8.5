package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kdl extends t3 implements ListIterator {
    public final /* synthetic */ c4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdl(c4 c4Var, int i) {
        super(c4Var, ((List) c4Var.c).listIterator(i), (char) 0);
        this.e = c4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        c4 c4Var = this.e;
        boolean isEmpty = c4Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((eel) c4Var.g).d++;
        if (isEmpty) {
            c4Var.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdl(c4 c4Var) {
        super(c4Var, (char) 0);
        this.e = c4Var;
    }
}
