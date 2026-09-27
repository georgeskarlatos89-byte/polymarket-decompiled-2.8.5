package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vah implements Iterator {
    public boolean a;
    public final int b;
    public final /* synthetic */ wah c;

    public vah(wah wahVar) {
        this.c = wahVar;
        this.b = wah.b(wahVar);
    }

    public final void a() {
        wah wahVar = this.c;
        int c = wah.c(wahVar);
        int i = this.b;
        if (c == i) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + wah.d(wahVar) + "; expected: " + i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a) {
            this.a = true;
            a();
            return this.c.b;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.c.clear();
    }
}
