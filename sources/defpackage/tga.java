package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tga implements Iterator, Cloneable {
    public final sfa a;
    public final Object[] b;
    public int c;

    public tga(sfa sfaVar, Object[] objArr, int i) {
        this.a = sfaVar;
        this.b = objArr;
        this.c = i;
    }

    public final Object clone() {
        return new tga(this.a, this.b, this.c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 1;
        return this.b[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
