package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dil {
    public static final vl4 a = new vl4(new lm4(11), false, -298415252);

    public static boolean a(svd svdVar, v68 v68Var, int i, t68 t68Var) {
        boolean z;
        boolean z2;
        long v = svdVar.v();
        long j = v >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((v >> 12) & 15);
        int i3 = (int) ((v >> 8) & 15);
        int i4 = (int) ((v >> 4) & 15);
        int i5 = (int) ((v >> 1) & 7);
        if ((v & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 <= 7) {
            if (i4 != v68Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || v68Var.g != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != v68Var.i) || z2) {
            return false;
        }
        try {
            long A = svdVar.A();
            if (!z) {
                A *= v68Var.b;
            }
            t68Var.a = A;
            int b = b(i2, svdVar);
            if (b == -1 || b > v68Var.b) {
                return false;
            }
            int i6 = v68Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != v68Var.f) {
                        return false;
                    }
                } else if (i3 == 12) {
                    if (svdVar.t() * 1000 != i6) {
                        return false;
                    }
                } else {
                    if (i3 > 14) {
                        return false;
                    }
                    int z3 = svdVar.z();
                    if (i3 == 14) {
                        z3 *= 10;
                    }
                    if (z3 != i6) {
                        return false;
                    }
                }
            }
            int t = svdVar.t();
            int i7 = svdVar.b;
            byte[] bArr = svdVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = svdVar.b; i10 < i8; i10++) {
                i9 = u1k.k[i9 ^ (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP)];
            }
            int i11 = u1k.a;
            if (t == i9) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, svd svdVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return svdVar.t() + 1;
            case 7:
                return svdVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
