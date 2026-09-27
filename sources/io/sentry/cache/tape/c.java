package io.sentry.cache.tape;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c implements Iterator {
    public final h a;
    public final /* synthetic */ d b;

    public c(d dVar, h hVar) {
        this.b = dVar;
        this.a = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.c.b((byte[]) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
