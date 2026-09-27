package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ei4 implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public ei4(gi4 gi4Var, byte b) {
        int i;
        this.e = gi4Var;
        this.b = gi4Var.f;
        if (gi4Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.c = i;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        int i2 = -1;
        AbstractMap abstractMap = this.e;
        Object obj = null;
        switch (i) {
            case 0:
                gi4 gi4Var = (gi4) abstractMap;
                if (gi4Var.f == this.b) {
                    if (hasNext()) {
                        int i3 = this.c;
                        this.d = i3;
                        obj = a(i3);
                        int i4 = this.c + 1;
                        if (i4 < gi4Var.g) {
                            i2 = i4;
                        }
                        this.c = i2;
                    } else {
                        dmk.t();
                    }
                } else {
                    f27.g();
                }
                return obj;
            case 1:
                gi4 gi4Var2 = (gi4) abstractMap;
                if (gi4Var2.f == this.b) {
                    if (hasNext()) {
                        int i5 = this.c;
                        this.d = i5;
                        obj = b(i5);
                        int i6 = this.c + 1;
                        if (i6 < gi4Var2.g) {
                            i2 = i6;
                        }
                        this.c = i2;
                    } else {
                        dmk.t();
                    }
                } else {
                    f27.g();
                }
                return obj;
            case 2:
                gi4 gi4Var3 = (gi4) abstractMap;
                if (gi4Var3.f == this.b) {
                    if (hasNext()) {
                        int i7 = this.c;
                        this.d = i7;
                        obj = b(i7);
                        int i8 = this.c + 1;
                        if (i8 < gi4Var3.g) {
                            i2 = i8;
                        }
                        this.c = i2;
                    } else {
                        dmk.t();
                    }
                } else {
                    f27.g();
                }
                return obj;
            default:
                gi4 gi4Var4 = (gi4) abstractMap;
                if (gi4Var4.f == this.b) {
                    if (hasNext()) {
                        int i9 = this.c;
                        this.d = i9;
                        obj = b(i9);
                        int i10 = this.c + 1;
                        if (i10 < gi4Var4.g) {
                            i2 = i10;
                        }
                        this.c = i2;
                    } else {
                        dmk.t();
                    }
                } else {
                    f27.g();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        boolean z = false;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                gi4 gi4Var = (gi4) abstractMap;
                if (gi4Var.f == this.b) {
                    if (this.d >= 0) {
                        z = true;
                    }
                    brn.r("no calls to next() since the last call to remove()", z);
                    this.b += 32;
                    int i2 = this.d;
                    Object obj = gi4.l;
                    gi4Var.remove(gi4Var.i()[i2]);
                    this.c--;
                    this.d = -1;
                    return;
                }
                f27.g();
                return;
            case 1:
                gi4 gi4Var2 = (gi4) abstractMap;
                int i3 = gi4Var2.f;
                int i4 = this.b;
                if (i3 == i4) {
                    int i5 = this.d;
                    if (i5 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i4 + 32;
                        gi4Var2.remove(gi4Var2.m()[i5]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    dmk.n("no calls to next() since the last call to remove()");
                    return;
                }
                f27.g();
                return;
            case 2:
                gi4 gi4Var3 = (gi4) abstractMap;
                int i6 = gi4Var3.f;
                int i7 = this.b;
                if (i6 == i7) {
                    int i8 = this.d;
                    if (i8 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i7 + 32;
                        Object[] objArr = gi4Var3.d;
                        objArr.getClass();
                        gi4Var3.remove(objArr[i8]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    dmk.n("no calls to next() since the last call to remove()");
                    return;
                }
                f27.g();
                return;
            default:
                gi4 gi4Var4 = (gi4) abstractMap;
                if (gi4Var4.f == this.b) {
                    if (this.d >= 0) {
                        z = true;
                    }
                    scn.d("no calls to next() since the last call to remove()", z);
                    this.b += 32;
                    gi4Var4.remove(gi4Var4.m()[this.d]);
                    this.c--;
                    this.d = -1;
                    return;
                }
                f27.g();
                return;
        }
    }

    public ei4(gi4 gi4Var, char c) {
        this.e = gi4Var;
        this.b = gi4Var.f;
        this.c = gi4Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public ei4(gi4 gi4Var, int i) {
        this.e = gi4Var;
        this.b = gi4Var.f;
        this.c = gi4Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public ei4(gi4 gi4Var) {
        this.e = gi4Var;
        this.b = gi4Var.f;
        this.c = gi4Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
