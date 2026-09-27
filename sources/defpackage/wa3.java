package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wa3 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public wa3(int i, int i2) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }

    public void a() {
        boolean z;
        int i;
        boolean z2;
        int i2;
        switch (this.a) {
            case 1:
                int i3 = this.c;
                if (i3 >= 0 && (i3 < (i = this.e) || (i3 == i && this.d == 0))) {
                    z = true;
                } else {
                    z = false;
                }
                pfn.f(z);
                return;
            default:
                int i4 = this.d;
                if (i4 >= 0 && (i4 < (i2 = this.c) || (i4 == i2 && this.e == 0))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                pfn.f(z2);
                return;
        }
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public boolean d(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.c) {
                break;
            }
            if (r(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.c;
        if (i4 < i6 || (i4 == i6 && i5 == 0)) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z;
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.c && !h()) {
            i3++;
        }
        if (this.d == this.c) {
            z = true;
        } else {
            z = false;
        }
        this.d = i;
        this.e = i2;
        if (z || !d((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        return this.c;
    }

    public int g() {
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 1:
                if ((this.b[this.c] & (128 >> this.d)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                s();
                return z;
            case 2:
                if ((this.b[this.d] & (128 >> this.e)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                s();
                return z2;
            default:
                if ((((this.b[this.d] & MessagePack.Code.EXT_TIMESTAMP) >> this.e) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                t(1);
                return z3;
        }
    }

    public int i(int i) {
        int i2 = 1;
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i3 = 0;
                while (true) {
                    int i4 = this.d;
                    if (i4 > 8) {
                        int i5 = i4 - 8;
                        this.d = i5;
                        byte[] bArr = this.b;
                        int i6 = this.c;
                        this.c = i6 + 1;
                        i3 |= (bArr[i6] & MessagePack.Code.EXT_TIMESTAMP) << i5;
                    } else {
                        byte[] bArr2 = this.b;
                        int i7 = this.c;
                        int i8 = ((-1) >>> (32 - i)) & (i3 | ((255 & bArr2[i7]) >> (8 - i4)));
                        if (i4 == 8) {
                            this.d = 0;
                            this.c = i7 + 1;
                        }
                        a();
                        return i8;
                    }
                }
            case 2:
                this.e += i;
                int i9 = 0;
                while (true) {
                    int i10 = this.e;
                    int i11 = 2;
                    if (i10 > 8) {
                        int i12 = i10 - 8;
                        this.e = i12;
                        byte[] bArr3 = this.b;
                        int i13 = this.d;
                        i9 |= (bArr3[i13] & MessagePack.Code.EXT_TIMESTAMP) << i12;
                        if (!r(i13 + 1)) {
                            i11 = 1;
                        }
                        this.d = i13 + i11;
                    } else {
                        byte[] bArr4 = this.b;
                        int i14 = this.d;
                        int i15 = ((-1) >>> (32 - i)) & (i9 | ((255 & bArr4[i14]) >> (8 - i10)));
                        if (i10 == 8) {
                            this.e = 0;
                            if (r(i14 + 1)) {
                                i2 = 2;
                            }
                            this.d = i14 + i2;
                        }
                        a();
                        return i15;
                    }
                }
            default:
                int i16 = this.d;
                int min = Math.min(i, 8 - this.e);
                byte[] bArr5 = this.b;
                int i17 = i16 + 1;
                int i18 = ((bArr5[i16] & MessagePack.Code.EXT_TIMESTAMP) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i18 |= (bArr5[i17] & MessagePack.Code.EXT_TIMESTAMP) << min;
                    min += 8;
                    i17++;
                }
                int i19 = i18 & ((-1) >>> (32 - i));
                t(i);
                return i19;
        }
    }

    public void j(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & MessagePack.Code.EXT_TIMESTAMP) << i8));
            i8 -= 8;
            this.d = i8;
        }
        int i10 = i8 + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((bArr4[i11] & MessagePack.Code.EXT_TIMESTAMP) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        a();
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            int i3 = u1k.a;
            return i2 & 4294967295L;
        }
        int i4 = i(i - 32);
        int i5 = i(32);
        int i6 = u1k.a;
        return (i5 & 4294967295L) | ((i4 & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        a();
    }

    public int m() {
        int i = 0;
        int i2 = 0;
        while (!h()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = i(i2);
        }
        return i3 + i;
    }

    public int n() {
        int i;
        int m = m();
        if (m % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((m + 1) / 2) * i;
    }

    public void o(int i, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public void p(svd svdVar) {
        o(svdVar.c, svdVar.a);
        q(svdVar.b * 8);
    }

    public void q(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public boolean r(int i) {
        if (2 <= i && i < this.c) {
            byte[] bArr = this.b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void s() {
        switch (this.a) {
            case 1:
                int i = this.d + 1;
                this.d = i;
                if (i == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                return;
            default:
                int i2 = 1;
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.d;
                    if (r(i4 + 1)) {
                        i2 = 2;
                    }
                    this.d = i4 + i2;
                }
                a();
                return;
        }
    }

    public void t(int i) {
        boolean z;
        int i2;
        switch (this.a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.c + i3;
                this.c = i4;
                int i5 = (i - (i3 * 8)) + this.d;
                this.d = i5;
                if (i5 > 7) {
                    this.c = i4 + 1;
                    this.d = i5 - 8;
                }
                a();
                return;
            case 2:
                int i6 = this.d;
                int i7 = i / 8;
                int i8 = i6 + i7;
                this.d = i8;
                int i9 = (i - (i7 * 8)) + this.e;
                this.e = i9;
                if (i9 > 7) {
                    this.d = i8 + 1;
                    this.e = i9 - 8;
                }
                while (true) {
                    i6++;
                    if (i6 <= this.d) {
                        if (r(i6)) {
                            this.d++;
                            i6 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i10 = i / 8;
                int i11 = this.d + i10;
                this.d = i11;
                int i12 = (i - (i10 * 8)) + this.e;
                this.e = i12;
                if (i12 > 7) {
                    i11++;
                    this.d = i11;
                    i12 -= 8;
                    this.e = i12;
                }
                if (i11 >= 0 && (i11 < (i2 = this.c) || (i11 == i2 && i12 == 0))) {
                    z = true;
                } else {
                    z = false;
                }
                pfn.f(z);
                return;
        }
    }

    public void u(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        this.c += i;
        a();
    }

    public wa3(byte[] bArr) {
        this.a = 3;
        this.b = bArr;
        this.c = bArr.length;
    }

    public wa3(byte[] bArr, int i, int i2) {
        this.a = 2;
        this.b = bArr;
        this.d = i;
        this.c = i2;
        this.e = 0;
        a();
    }

    public wa3(int i, byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.e = i;
    }

    public wa3() {
        this.a = 1;
        this.b = u1k.c;
    }
}
