package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k9a implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (!it2.hasNext()) {
                while (true) {
                    Iterator it3 = this.c;
                    if (it3 != null && it3.hasNext()) {
                        it = this.c;
                        break;
                    }
                    ArrayDeque arrayDeque = this.d;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.c = (Iterator) this.d.removeFirst();
                }
                it = null;
                this.c = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.b = it4;
                if (it4 instanceof k9a) {
                    k9a k9aVar = (k9a) it4;
                    this.b = k9aVar.b;
                    ArrayDeque arrayDeque2 = this.d;
                    if (arrayDeque2 == null) {
                        arrayDeque2 = new ArrayDeque();
                        this.d = arrayDeque2;
                    }
                    arrayDeque2.addFirst(this.c);
                    if (k9aVar.d != null) {
                        while (!k9aVar.d.isEmpty()) {
                            this.d.addFirst((Iterator) k9aVar.d.removeLast());
                        }
                    }
                    this.c = k9aVar.c;
                }
            } else {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it != null) {
            it.remove();
            this.a = null;
        } else {
            dmk.n("no calls to next() since the last call to remove()");
        }
    }
}
