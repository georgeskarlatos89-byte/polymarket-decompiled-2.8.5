package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zol extends AbstractSet {
    public final int a;
    public final /* synthetic */ g6l b;

    public zol(g6l g6lVar, int i) {
        this.b = g6lVar;
        this.a = i;
    }

    public final int a() {
        return this.b.c[this.a + 1];
    }

    public final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        lki lkiVar;
        Object[] objArr = this.b.b;
        int b = b();
        int a = a();
        if (this.a == -1) {
            lkiVar = g6l.h;
        } else {
            lkiVar = mpl.b;
        }
        if (Arrays.binarySearch(objArr, b, a, obj, lkiVar) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e6l(this, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
