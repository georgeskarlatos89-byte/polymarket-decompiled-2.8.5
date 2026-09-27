package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qq9 implements Iterator {
    public final /* synthetic */ int a;
    public final h3k[] b;
    public int c = 0;

    public /* synthetic */ qq9(h3k[] h3kVarArr, int i) {
        this.a = i;
        this.b = h3kVarArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        h3k[] h3kVarArr = this.b;
        switch (i) {
            case 0:
                if (this.c == h3kVarArr.length) {
                    return false;
                }
                return true;
            default:
                if (this.c >= h3kVarArr.length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        h3k[] h3kVarArr = this.b;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 < h3kVarArr.length) {
                    this.c = i2 + 1;
                    return h3kVarArr[i2];
                }
                dmk.t();
                return null;
            default:
                int i3 = this.c;
                if (i3 < h3kVarArr.length) {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(h3kVarArr[i3], h3kVarArr[i3 + 1]);
                    this.c += 2;
                    return simpleImmutableEntry;
                }
                dmk.t();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
