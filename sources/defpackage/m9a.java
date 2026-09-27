package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m9a implements Iterator {
    public final Iterator a;
    public boolean b;
    public Object c;

    public m9a(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b && !this.a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        brn.r("Can't remove after you've peeked at next", !this.b);
        this.a.remove();
    }
}
