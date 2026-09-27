package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kwg implements Iterator, xja {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c = true;

    public /* synthetic */ kwg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                dmk.t();
                return null;
            case 1:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                dmk.t();
                return null;
            default:
                if (this.c) {
                    this.c = false;
                    return ((ejd) obj).a;
                }
                dmk.t();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
