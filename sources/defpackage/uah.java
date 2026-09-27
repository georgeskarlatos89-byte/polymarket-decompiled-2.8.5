package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uah implements Iterator {
    public static final uah b = new uah(0);
    public final /* synthetic */ int a;

    public /* synthetic */ uah(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
