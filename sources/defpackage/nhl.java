package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nhl extends qbj implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhl(AbstractList abstractList, ListIterator listIterator, int i) {
        super(1, listIterator);
        this.c = i;
        this.d = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qbj
    public final Object b(Object obj) {
        int i = this.c;
        AbstractList abstractList = this.d;
        switch (i) {
            case 0:
                return ((nvn) ((qkb) abstractList).c).zza(obj);
            default:
                return ((nvn) ((rkb) abstractList).c).zza(obj);
        }
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
        return b(((ListIterator) this.b).previous());
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
