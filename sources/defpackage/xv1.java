package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xv1 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final int c;
    public final /* synthetic */ Object d;

    public xv1(i7l i7lVar) {
        this.a = 4;
        this.d = i7lVar;
        this.b = 0;
        this.c = i7lVar.b();
    }

    public byte a() {
        try {
            byte[] bArr = ((skb) this.d).b;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            ahh.i(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        int i2 = this.c;
        switch (i) {
            case 0:
                if (this.b >= i2) {
                    return false;
                }
                return true;
            case 1:
                if (this.b >= i2) {
                    return false;
                }
                return true;
            case 2:
                if (this.b >= i2 || !((Iterator) this.d).hasNext()) {
                    return false;
                }
                return true;
            case 3:
                if (this.b >= i2) {
                    return false;
                }
                return true;
            case 4:
                if (this.b >= i2) {
                    return false;
                }
                return true;
            case 5:
                if (this.b >= i2) {
                    return false;
                }
                return true;
            default:
                if (this.b >= i2) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 < i2) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((cw1) obj).i(i3));
                }
                dmk.t();
                return null;
            case 1:
                int i4 = this.b;
                if (i4 < i2) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((dw1) obj).h(i4));
                }
                dmk.t();
                return null;
            case 2:
                if (hasNext()) {
                    this.b++;
                    return ((Iterator) obj).next();
                }
                dmk.t();
                return null;
            case 3:
                return Byte.valueOf(a());
            case 4:
                int i5 = this.b;
                if (i5 < i2) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((i7l) obj).a(i5));
                }
                dmk.t();
                return null;
            case 5:
                int i6 = this.b;
                if (i6 < i2) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((d7m) obj).b(i6));
                }
                dmk.t();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i2) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((inm) obj).b(i7));
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
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                ((Iterator) this.d).remove();
                return;
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public xv1(d7m d7mVar) {
        this.a = 5;
        this.d = d7mVar;
        this.b = 0;
        this.c = d7mVar.d();
    }

    public xv1(inm inmVar) {
        this.a = 6;
        this.d = inmVar;
        this.b = 0;
        this.c = inmVar.c();
    }

    public xv1(dw1 dw1Var) {
        this.a = 1;
        this.d = dw1Var;
        this.b = 0;
        this.c = dw1Var.size();
    }

    public xv1(cw1 cw1Var) {
        this.a = 0;
        this.d = cw1Var;
        this.b = 0;
        this.c = cw1Var.size();
    }

    public xv1(skb skbVar) {
        this.a = 3;
        this.d = skbVar;
        this.b = 0;
        this.c = skbVar.b.length;
    }

    public xv1(int i, Iterator it) {
        this.a = 2;
        this.c = i;
        this.d = it;
    }
}
