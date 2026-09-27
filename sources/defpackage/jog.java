package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jog extends iw1 {
    public final transient byte[][] e;
    public final transient int[] f;

    public jog(byte[][] bArr, int[] iArr) {
        super(iw1.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.iw1
    public final String a() {
        return v().a();
    }

    @Override // defpackage.iw1
    public final iw1 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new iw1(digest);
    }

    @Override // defpackage.iw1
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.iw1
    public final String e() {
        return v().e();
    }

    @Override // defpackage.iw1
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iw1) {
                iw1 iw1Var = (iw1) obj;
                if (iw1Var.d() == d() && n(0, iw1Var, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.iw1
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return v().f(i, bArr);
    }

    @Override // defpackage.iw1
    public final byte[] h() {
        return s();
    }

    @Override // defpackage.iw1
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.iw1
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        l6n.c(iArr[length], i, 1L);
        int a = p.a(this, i);
        if (a == 0) {
            i2 = 0;
        } else {
            i2 = iArr[a - 1];
        }
        return bArr[a][(i - i2) + iArr[bArr.length + a]];
    }

    @Override // defpackage.iw1
    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return v().j(i, bArr);
    }

    @Override // defpackage.iw1
    public final boolean m(int i, int i2, int i3, byte[] bArr) {
        int i4;
        bArr.getClass();
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i5 = i3 + i;
            int a = p.a(this, i);
            while (i < i5) {
                int[] iArr = this.f;
                if (a == 0) {
                    i4 = 0;
                } else {
                    i4 = iArr[a - 1];
                }
                int i6 = iArr[a] - i4;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + a];
                int min = Math.min(i5, i6 + i4) - i;
                if (l6n.a(bArr2[a], (i - i4) + i7, bArr, i2, min)) {
                    i2 += min;
                    i += min;
                    a++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.iw1
    public final boolean n(int i, iw1 iw1Var, int i2) {
        int i3;
        iw1Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i4 = i2 + i;
            int a = p.a(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.f;
                if (a == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[a - 1];
                }
                int i6 = iArr[a] - i3;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + a];
                int min = Math.min(i4, i6 + i3) - i;
                if (iw1Var.m(i5, (i - i3) + i7, min, bArr[a])) {
                    i5 += min;
                    i += min;
                    a++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.iw1
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // defpackage.iw1
    public final iw1 p(int i, int i2) {
        if (i >= 0) {
            if (i2 <= d()) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == d()) {
                        return this;
                    }
                    if (i == i2) {
                        return iw1.d;
                    }
                    int a = p.a(this, i);
                    int a2 = p.a(this, i2 - 1);
                    byte[][] bArr = this.e;
                    byte[][] bArr2 = (byte[][]) ArraysKt.q(bArr, a, a2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.f;
                    if (a <= a2) {
                        int i5 = a;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == a2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (a != 0) {
                        i4 = iArr2[a - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new jog(bArr2, iArr);
                }
                f27.q(woa.l(i2, i, "endIndex=", " < beginIndex="));
                return null;
            }
            StringBuilder o = ace.o(i2, "endIndex=", " > length(");
            o.append(d());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
        f27.q(sv6.j(i, "beginIndex=", " < 0"));
        return null;
    }

    @Override // defpackage.iw1
    public final iw1 r() {
        return v().r();
    }

    @Override // defpackage.iw1
    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.m(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.iw1
    public final String toString() {
        return v().toString();
    }

    @Override // defpackage.iw1
    public final void u(tp1 tp1Var, int i) {
        int i2;
        int a = p.a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.f;
            if (a == 0) {
                i2 = 0;
            } else {
                i2 = iArr[a - 1];
            }
            int i4 = iArr[a] - i2;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + a];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = (i3 - i2) + i5;
            eog eogVar = new eog(bArr[a], i6, i6 + min, true, false);
            eog eogVar2 = tp1Var.a;
            if (eogVar2 == null) {
                eogVar.g = eogVar;
                eogVar.f = eogVar;
                tp1Var.a = eogVar;
            } else {
                eog eogVar3 = eogVar2.g;
                eogVar3.getClass();
                eogVar3.b(eogVar);
            }
            i3 += min;
            a++;
        }
        tp1Var.b += i;
    }

    public final iw1 v() {
        return new iw1(s());
    }
}
