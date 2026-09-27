package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fr9 extends jr9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ jr9 e;

    public fr9(jr9 jr9Var, int i, int i2) {
        this.e = jr9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.jr9
    public final jr9 B(int i, int i2) {
        brn.o(i, i2, this.d);
        int i3 = this.c;
        return this.e.B(i + i3, i2 + i3);
    }

    @Override // defpackage.xq9
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.xq9
    public final int d() {
        return this.e.f() + this.c + this.d;
    }

    @Override // defpackage.xq9
    public final int f() {
        return this.e.f() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        brn.k(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return true;
    }

    @Override // defpackage.jr9, defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return q(0);
    }

    @Override // defpackage.jr9, java.util.List
    public final ListIterator listIterator() {
        return q(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.jr9, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return B(i, i2);
    }

    @Override // defpackage.jr9, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return q(i);
    }
}
