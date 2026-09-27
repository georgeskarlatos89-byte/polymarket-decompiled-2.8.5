package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f6l extends AbstractSet {
    public final int a;
    public final /* synthetic */ g6l b;

    public f6l(g6l g6lVar, int i) {
        this.b = g6lVar;
        this.a = i;
    }

    public final int a() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    public final int b() {
        return this.b.c[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        lki lkiVar;
        int a = a();
        int b = b();
        if (this.a == -1) {
            lkiVar = g6l.g;
        } else {
            lkiVar = i6l.b;
        }
        if (Arrays.binarySearch(this.b.b, a, b, obj, lkiVar) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e6l(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b() - a();
    }
}
