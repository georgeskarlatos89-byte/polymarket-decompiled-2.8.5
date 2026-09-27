package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d29 {
    public final q8j a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public d29(q8j q8jVar) {
        this.a = q8jVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & MessagePack.Code.NIL) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d = z;
                this.c = false;
                return;
            }
            this.f = (i2 - i) + i3;
        }
    }

    public final void b(int i, boolean z, long j) {
        boolean z2;
        if (this.h != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        pfn.f(z2);
        if (this.e == 182 && z && this.b) {
            int i2 = (int) (j - this.g);
            boolean z3 = this.d;
            this.a.a(this.h, z3 ? 1 : 0, i2, i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
