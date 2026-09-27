package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b9b implements Iterator, xja {
    public final CharSequence a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b9b(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        int i3 = 2;
        if (this.e < 0) {
            this.b = 2;
            return false;
        }
        CharSequence charSequence = this.a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.c; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i = i4 + 1) >= charSequence.length() || charSequence.charAt(i) != '\n') {
                    i3 = 1;
                }
                length = i4;
                this.b = 1;
                this.e = i3;
                this.d = length;
                return true;
            }
        }
        i3 = -1;
        this.b = 1;
        this.e = i3;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 0;
            int i = this.d;
            int i2 = this.c;
            this.c = this.e + i;
            return this.a.subSequence(i2, i).toString();
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
