package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vuj implements Iterator {
    public final /* synthetic */ int a;
    public Iterator b;

    public vuj(int i, Iterator it) {
        this.a = i;
        switch (i) {
            case 4:
                it.getClass();
                this.b = it;
                return;
            default:
                it.getClass();
                this.b = it;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            case 2:
                return this.b.hasNext();
            case 3:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (String) this.b.next();
            case 1:
                return (String) this.b.next();
            case 2:
                return (String) this.b.next();
            case 3:
                return ((Map.Entry) this.b.next()).getValue();
            default:
                return ((Map.Entry) this.b.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException("Remove not supported");
            case 3:
                this.b.remove();
                return;
            default:
                this.b.remove();
                return;
        }
    }

    public /* synthetic */ vuj(int i) {
        this.a = i;
    }

    public vuj(cgl cglVar) {
        this.a = 2;
        this.b = cglVar.a.keySet().iterator();
    }
}
