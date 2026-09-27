package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z09 implements Iterator, xja {
    public final eah a;
    public final int b;
    public int c;
    public final int d;

    public z09(eah eahVar, int i, int i2) {
        this.a = eahVar;
        this.b = i2;
        this.c = i;
        this.d = eahVar.i;
        if (eahVar.h) {
            gah.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        eah eahVar = this.a;
        int i = eahVar.i;
        int i2 = this.d;
        if (i != i2) {
            gah.e();
        }
        int i3 = this.c;
        this.c = eahVar.b[(i3 * 5) + 3] + i3;
        return new fah(eahVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
