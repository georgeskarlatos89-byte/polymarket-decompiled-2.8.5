package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q68 implements ke1 {
    public final v68 a;
    public final int b;
    public final t68 c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [t68, java.lang.Object] */
    public q68(v68 v68Var, int i) {
        this.a = v68Var;
        this.b = i;
    }

    public final long a(tu7 tu7Var) {
        t68 t68Var;
        v68 v68Var;
        int k;
        while (true) {
            long g = tu7Var.g();
            long length = tu7Var.getLength() - 6;
            t68Var = this.c;
            v68Var = this.a;
            if (g >= length) {
                break;
            }
            long g2 = tu7Var.g();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean a = false;
            tu7Var.o(bArr, 0, 2);
            int i2 = ((bArr[0] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[1] & MessagePack.Code.EXT_TIMESTAMP);
            int i3 = this.b;
            if (i2 != i3) {
                tu7Var.d();
                tu7Var.h((int) (g2 - tu7Var.getPosition()));
            } else {
                svd svdVar = new svd(16);
                System.arraycopy(bArr, 0, svdVar.a, 0, 2);
                byte[] bArr2 = svdVar.a;
                while (i < 14 && (k = tu7Var.k(bArr2, 2 + i, 14 - i)) != -1) {
                    i += k;
                }
                svdVar.E(i);
                tu7Var.d();
                tu7Var.h((int) (g2 - tu7Var.getPosition()));
                a = dil.a(svdVar, v68Var, i3, t68Var);
            }
            if (a) {
                break;
            }
            tu7Var.h(1);
        }
        if (tu7Var.g() >= tu7Var.getLength() - 6) {
            tu7Var.h((int) (tu7Var.getLength() - tu7Var.g()));
            return v68Var.j;
        }
        return t68Var.a;
    }

    @Override // defpackage.ke1
    public final je1 d(tu7 tu7Var, long j) {
        long position = tu7Var.getPosition();
        long a = a(tu7Var);
        long g = tu7Var.g();
        tu7Var.h(Math.max(6, this.a.c));
        long a2 = a(tu7Var);
        long g2 = tu7Var.g();
        if (a <= j && a2 > j) {
            return new je1(0, -9223372036854775807L, g);
        }
        if (a2 <= j) {
            return new je1(-2, a2, g2);
        }
        return new je1(-1, a, position);
    }
}
