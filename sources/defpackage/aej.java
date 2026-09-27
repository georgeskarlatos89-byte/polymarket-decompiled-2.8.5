package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class aej implements Iterator, xja {
    public final /* synthetic */ int a;
    public Object[] b;
    public int c;
    public int d;

    public aej(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = zdj.e.d;
                return;
            default:
                this.b = ydj.e.d;
                return;
        }
    }

    public void a(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.d < this.c) {
                    return true;
                }
                return false;
            default:
                if (this.d < this.c) {
                    return true;
                }
                return false;
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
