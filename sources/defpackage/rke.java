package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rke implements Iterator, xja {
    public final /* synthetic */ int a;
    public Object b;
    public final Map c;
    public int d;

    public /* synthetic */ rke(Object obj, Map map, int i) {
        this.a = i;
        this.b = obj;
        this.c = map;
    }

    public gib a() {
        if (hasNext()) {
            Object obj = this.c.get(this.b);
            if (obj != null) {
                gib gibVar = (gib) obj;
                this.d++;
                this.b = gibVar.c;
                return gibVar;
            }
            throw new ConcurrentModificationException(ix2.o(new StringBuilder("Hash code of a key ("), this.b, ") has changed after it was added to the persistent map."));
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Map map = this.c;
        switch (i) {
            case 0:
                if (this.d >= map.size()) {
                    return false;
                }
                return true;
            default:
                if (this.d >= map.size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return a();
            default:
                if (hasNext()) {
                    Object obj = this.b;
                    this.d++;
                    Object obj2 = this.c.get(obj);
                    if (obj2 != null) {
                        this.b = ((hib) obj2).b;
                        return obj;
                    }
                    throw new ConcurrentModificationException(woa.o("Hash code of an element (", obj, ") has changed after it was added to the persistent set."));
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
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
