package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class m3 implements ListIterator, xja {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ m3(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            default:
                if (this.b < this.c) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                    return true;
                }
                return false;
            default:
                if (this.b > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                i = this.b;
                break;
            default:
                i = this.b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
