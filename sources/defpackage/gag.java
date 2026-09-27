package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gag implements Iterator {
    public final d9d a;
    public xv1 b;
    public int c;

    public gag(hag hagVar) {
        d9d d9dVar = new d9d(hagVar);
        this.a = d9dVar;
        this.b = new xv1(d9dVar.a());
        this.c = hagVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = new xv1(this.a.a());
        }
        this.c--;
        return Byte.valueOf(this.b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
