package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vej {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(q8j q8jVar, p8j p8jVar) {
        if (this.c > 0) {
            q8jVar.a(this.d, this.e, this.f, this.g, p8jVar);
            this.c = 0;
        }
    }

    public final void b(q8j q8jVar, long j, int i, int i2, int i3, p8j p8jVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        pfn.e("TrueHD chunk samples must be contiguous in the sample queue.", z);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(q8jVar, p8jVar);
            }
        }
    }

    public final void c(tu7 tu7Var) {
        char c;
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            tu7Var.o(bArr, 0, 10);
            tu7Var.d();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & MessagePack.Code.EXT_TIMESTAMP) == 187) {
                        i = 1;
                    }
                    if (i != 0) {
                        c = '\t';
                    } else {
                        c = '\b';
                    }
                    i = 40 << ((bArr[c] >> 4) & 7);
                }
            }
            if (i == 0) {
                return;
            }
            this.b = true;
        }
    }
}
