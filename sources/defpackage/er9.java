package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class er9 extends jr9 {
    public final transient jr9 c;

    public er9(jr9 jr9Var) {
        this.c = jr9Var;
    }

    @Override // defpackage.jr9
    public final jr9 B(int i, int i2) {
        jr9 jr9Var = this.c;
        brn.o(i, i2, jr9Var.size());
        return jr9Var.B(jr9Var.size() - i2, jr9Var.size() - i).w();
    }

    @Override // defpackage.jr9, defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jr9 jr9Var = this.c;
        brn.k(i, jr9Var.size());
        return jr9Var.get((jr9Var.size() - 1) - i);
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return this.c.h();
    }

    @Override // defpackage.jr9, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.jr9, defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return q(0);
    }

    @Override // defpackage.jr9, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.jr9, java.util.List
    public final ListIterator listIterator() {
        return q(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.jr9, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return B(i, i2);
    }

    @Override // defpackage.jr9
    public final jr9 w() {
        return this.c;
    }

    @Override // defpackage.jr9, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return q(i);
    }
}
