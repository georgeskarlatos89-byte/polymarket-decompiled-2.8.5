package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c9b implements Iterator, xja {
    public String a;
    public boolean b;
    public final /* synthetic */ tl0 c;

    public c9b(tl0 tl0Var) {
        this.c = tl0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.a;
        if (str == null && !this.b) {
            str = ((BufferedReader) this.c.b).readLine();
            this.a = str;
            if (str == null) {
                this.b = true;
            }
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.a;
            this.a = null;
            str.getClass();
            return str;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
