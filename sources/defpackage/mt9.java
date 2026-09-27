package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class mt9 implements Iterator, xja {
    public int a;
    public int b;
    public boolean c;

    public mt9(int i) {
        this.a = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a(this.b);
            this.b++;
            this.c = true;
            return a;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            b(i);
            this.a--;
            this.c = false;
            return;
        }
        dmk.n("Call next() before removing an element.");
    }
}
