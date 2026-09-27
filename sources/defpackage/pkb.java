package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pkb extends qbj implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkb(AbstractList abstractList, ListIterator listIterator, int i) {
        super(0, listIterator);
        this.c = i;
        this.d = abstractList;
    }

    @Override // defpackage.qbj
    public final Object a(Object obj) {
        int i = this.c;
        AbstractList abstractList = this.d;
        switch (i) {
            case 0:
                return ((op8) ((qkb) abstractList).c).apply(obj);
            default:
                return ((op8) ((rkb) abstractList).c).apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
