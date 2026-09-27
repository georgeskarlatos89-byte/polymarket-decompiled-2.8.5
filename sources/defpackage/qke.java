package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qke implements Iterator, xja {
    public final /* synthetic */ int a;
    public final rke b;

    public qke(lke lkeVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rke(lkeVar.d, lkeVar.f, 0);
                return;
            case 2:
                this.b = new rke(lkeVar.d, lkeVar.f, 0);
                return;
            default:
                this.b = new rke(lkeVar.d, lkeVar.f, 0);
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        rke rkeVar = this.b;
        switch (i) {
            case 0:
                return rkeVar.hasNext();
            case 1:
                return rkeVar.hasNext();
            default:
                return rkeVar.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        rke rkeVar = this.b;
        switch (i) {
            case 0:
                return new f0c(1, rkeVar.b, rkeVar.a().a);
            case 1:
                Object obj = rkeVar.b;
                rkeVar.a();
                return obj;
            default:
                return rkeVar.a().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
