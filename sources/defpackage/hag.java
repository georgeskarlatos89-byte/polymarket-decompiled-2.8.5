package defpackage;

import com.appsflyer.internal.l;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hag extends gw1 {
    public static final int[] h;
    public final int b;
    public final gw1 c;
    public final gw1 d;
    public final int e;
    public final int f;
    public int g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(bd0.API_PRIORITY_OTHER));
        h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = h;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public hag(gw1 gw1Var, gw1 gw1Var2) {
        this.c = gw1Var;
        this.d = gw1Var2;
        int size = gw1Var.size();
        this.e = size;
        this.b = gw1Var2.size() + size;
        this.f = Math.max(gw1Var.f(), gw1Var2.f()) + 1;
    }

    @Override // defpackage.gw1
    public final void d(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        gw1 gw1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            gw1Var.d(i, i2, i3, bArr);
            return;
        }
        gw1 gw1Var2 = this.d;
        if (i >= i5) {
            gw1Var2.d(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        gw1Var.d(i, i2, i6, bArr);
        gw1Var2.d(0, i2 + i6, i3 - i6, bArr);
    }

    public final boolean equals(Object obj) {
        boolean t;
        int m;
        if (obj != this) {
            if (obj instanceof gw1) {
                gw1 gw1Var = (gw1) obj;
                int size = gw1Var.size();
                int i = this.b;
                if (i == size) {
                    if (i != 0) {
                        if (this.g == 0 || (m = gw1Var.m()) == 0 || this.g == m) {
                            d9d d9dVar = new d9d(this);
                            skb a = d9dVar.a();
                            d9d d9dVar2 = new d9d(gw1Var);
                            skb a2 = d9dVar2.a();
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                int length = a.b.length - i2;
                                int length2 = a2.b.length - i3;
                                int min = Math.min(length, length2);
                                if (i2 == 0) {
                                    t = a.t(a2, i3, min);
                                } else {
                                    t = a2.t(a, i2, min);
                                }
                                if (!t) {
                                    break;
                                }
                                i4 += min;
                                if (i4 >= i) {
                                    if (i4 == i) {
                                        return true;
                                    }
                                    l.o();
                                    return false;
                                }
                                if (min == length) {
                                    a = d9dVar.a();
                                    i2 = 0;
                                } else {
                                    i2 += min;
                                }
                                if (min == length2) {
                                    a2 = d9dVar2.a();
                                    i3 = 0;
                                } else {
                                    i3 += min;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.gw1
    public final int f() {
        return this.f;
    }

    @Override // defpackage.gw1
    public final boolean h() {
        if (this.b >= h[this.f]) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i == 0) {
            int i2 = this.b;
            i = k(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.g = i;
        }
        return i;
    }

    @Override // defpackage.gw1
    public final boolean i() {
        int l = this.c.l(0, 0, this.e);
        gw1 gw1Var = this.d;
        if (gw1Var.l(l, 0, gw1Var.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gag(this);
    }

    @Override // defpackage.gw1
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        gw1 gw1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return gw1Var.k(i, i2, i3);
        }
        gw1 gw1Var2 = this.d;
        if (i2 >= i5) {
            return gw1Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return gw1Var2.k(gw1Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.gw1
    public final int l(int i, int i2, int i3) {
        int i4 = i2 + i3;
        gw1 gw1Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return gw1Var.l(i, i2, i3);
        }
        gw1 gw1Var2 = this.d;
        if (i2 >= i5) {
            return gw1Var2.l(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return gw1Var2.l(gw1Var.l(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.gw1
    public final int m() {
        return this.g;
    }

    @Override // defpackage.gw1
    public final String q() {
        return new String(n(), "UTF-8");
    }

    @Override // defpackage.gw1
    public final void s(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        gw1 gw1Var = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            gw1Var.s(outputStream, i, i2);
            return;
        }
        gw1 gw1Var2 = this.d;
        if (i >= i4) {
            gw1Var2.s(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        gw1Var.s(outputStream, i, i5);
        gw1Var2.s(outputStream, 0, i2 - i5);
    }

    @Override // defpackage.gw1
    public final int size() {
        return this.b;
    }
}
