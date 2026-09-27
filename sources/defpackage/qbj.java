package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class qbj implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;

    public qbj(int i, Iterator it) {
        this.a = i;
        switch (i) {
            case 1:
                it.getClass();
                this.b = it;
                return;
            default:
                it.getClass();
                this.b = it;
                return;
        }
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return a(this.b.next());
            default:
                return b(this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                this.b.remove();
                return;
        }
    }
}
