package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class svd {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final tr9 f = tr9.k(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public svd(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public final long A() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.a[this.b + i] & MessagePack.Code.NIL) == 128) {
                    j = (j << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(woa.m(j, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException(woa.m(j, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.a;
            int i2 = this.b;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public final void C(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        D(i, bArr);
    }

    public final void D(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void E(int i) {
        boolean z;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.c = i;
    }

    public final void F(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.b = i;
    }

    public final void G(int i) {
        F(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        pfn.a("Unsupported charset: " + charset, f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b;
        byte b2 = 0;
        int i = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b = this.a[this.b];
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b2 = bArr[i2];
                b = bArr[i2 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b2 = bArr2[i3 + 1];
                b = bArr2[i3];
            }
            i = 2;
        }
        return ((b & MessagePack.Code.EXT_TIMESTAMP) << 16) | (b2 << 24) | (i & 255);
    }

    public final void e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char f(Charset charset, char[] cArr) {
        int d2 = d(charset);
        if (d2 != 0) {
            char c = (char) (d2 >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.b += d2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & MessagePack.Code.EXT_TIMESTAMP) << 8);
        this.b = i + 4;
        return (bArr[i6] & MessagePack.Code.EXT_TIMESTAMP) | i7;
    }

    public final String h(Charset charset) {
        int i;
        pfn.a("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            B();
        }
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                qp7.k(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && u1k.J(this.a[i2])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && u1k.J(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && u1k.J(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String r = r(i2 - this.b, charset);
        if (this.b != this.c && f(charset, d) == '\r') {
            f(charset, e);
        }
        return r;
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & MessagePack.Code.EXT_TIMESTAMP) << 16);
        this.b = i + 4;
        return ((bArr[i6] & MessagePack.Code.EXT_TIMESTAMP) << 24) | i7;
    }

    public final long j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public final long k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int l() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        dmk.n(ace.f(i, "Top bit not zero: "));
        return 0;
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
        this.b = i + 2;
        return ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | i3;
    }

    public final long n() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public final String o() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = u1k.a;
        String str = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String p(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.a;
        int i5 = u1k.a;
        String str = new String(bArr, i3, i2, StandardCharsets.UTF_8);
        this.b += i;
        return str;
    }

    public final short q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) | i3);
    }

    public final String r(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int s() {
        return t() | (t() << 21) | (t() << 14) | (t() << 7);
    }

    public final int t() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long v() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & MessagePack.Code.EXT_TIMESTAMP) | i5;
    }

    public final int x() {
        int g = g();
        if (g >= 0) {
            return g;
        }
        dmk.n(ace.f(g, "Top bit not zero: "));
        return 0;
    }

    public final long y() {
        long n = n();
        if (n >= 0) {
            return n;
        }
        dmk.n(woa.m(n, "Top bit not zero: "));
        return 0L;
    }

    public final int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        this.b = i + 2;
        return (bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) | i3;
    }

    public svd() {
        this.a = u1k.c;
    }

    public svd(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public svd(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
