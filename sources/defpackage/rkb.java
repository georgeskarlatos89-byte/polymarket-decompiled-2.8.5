package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rkb extends AbstractSequentialList implements Serializable {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final Object c;

    public rkb(List list, op8 op8Var) {
        list.getClass();
        this.b = list;
        op8Var.getClass();
        this.c = op8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return this.b.isEmpty();
            default:
                return this.b.isEmpty();
        }
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new pkb(this, this.b.listIterator(i), 1);
            default:
                return new nhl(this, this.b.listIterator(i), 1);
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.subList(i, i2).clear();
                return;
            default:
                this.b.subList(i, i2).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return this.b.size();
        }
    }

    public rkb(List list, nvn nvnVar) {
        list.getClass();
        this.b = list;
        this.c = nvnVar;
    }
}
