package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pgf {
    public final /* synthetic */ int a;
    public final k3j b;
    public final svd c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public pgf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new k3j(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new svd();
                return;
            default:
                this.b = new k3j(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new svd();
                return;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    public static long c(svd svdVar) {
        int i = svdVar.b;
        if (svdVar.a() >= 9) {
            byte[] bArr = new byte[9];
            svdVar.e(bArr, 0, 9);
            svdVar.F(i);
            byte b = bArr[0];
            if ((b & MessagePack.Code.BIN8) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        return ((j2 & 3) << 13) | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final void a(tu7 tu7Var) {
        int i = this.a;
        svd svdVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = u1k.c;
                svdVar.D(bArr.length, bArr);
                this.d = true;
                tu7Var.d();
                return;
            default:
                byte[] bArr2 = u1k.c;
                svdVar.D(bArr2.length, bArr2);
                this.d = true;
                tu7Var.d();
                return;
        }
    }
}
