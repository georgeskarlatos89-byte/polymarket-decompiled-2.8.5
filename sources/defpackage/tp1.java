package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tp1 implements kq1, jq1, Cloneable, ByteChannel {
    public eog a;
    public long b;

    public final long A(long j, iw1 iw1Var) {
        iw1Var.getClass();
        long j2 = 0;
        if (j >= 0) {
            eog eogVar = this.a;
            if (eogVar == null) {
                return -1L;
            }
            long j3 = this.b;
            if (j3 - j < j) {
                while (j3 > j) {
                    eogVar = eogVar.g;
                    eogVar.getClass();
                    j3 -= eogVar.c - eogVar.b;
                }
                if (iw1Var.d() == 2) {
                    byte i = iw1Var.i(0);
                    byte i2 = iw1Var.i(1);
                    while (j3 < this.b) {
                        byte[] bArr = eogVar.a;
                        int i3 = eogVar.c;
                        for (int i4 = (int) ((eogVar.b + j) - j3); i4 < i3; i4++) {
                            byte b = bArr[i4];
                            if (b == i || b == i2) {
                                return (i4 - eogVar.b) + j3;
                            }
                        }
                        j3 += eogVar.c - eogVar.b;
                        eogVar = eogVar.f;
                        eogVar.getClass();
                        j = j3;
                    }
                } else {
                    byte[] h = iw1Var.h();
                    while (j3 < this.b) {
                        byte[] bArr2 = eogVar.a;
                        int i5 = eogVar.c;
                        for (int i6 = (int) ((eogVar.b + j) - j3); i6 < i5; i6++) {
                            byte b2 = bArr2[i6];
                            for (byte b3 : h) {
                                if (b2 == b3) {
                                    return (i6 - eogVar.b) + j3;
                                }
                            }
                        }
                        j3 += eogVar.c - eogVar.b;
                        eogVar = eogVar.f;
                        eogVar.getClass();
                        j = j3;
                    }
                }
                return -1L;
            }
            while (true) {
                long j4 = (eogVar.c - eogVar.b) + j2;
                if (j4 > j) {
                    break;
                }
                eogVar = eogVar.f;
                eogVar.getClass();
                j2 = j4;
            }
            if (iw1Var.d() == 2) {
                byte i7 = iw1Var.i(0);
                byte i8 = iw1Var.i(1);
                while (j2 < this.b) {
                    byte[] bArr3 = eogVar.a;
                    int i9 = eogVar.c;
                    for (int i10 = (int) ((eogVar.b + j) - j2); i10 < i9; i10++) {
                        byte b4 = bArr3[i10];
                        if (b4 == i7 || b4 == i8) {
                            return (i10 - eogVar.b) + j2;
                        }
                    }
                    j2 += eogVar.c - eogVar.b;
                    eogVar = eogVar.f;
                    eogVar.getClass();
                    j = j2;
                }
            } else {
                byte[] h2 = iw1Var.h();
                while (j2 < this.b) {
                    byte[] bArr4 = eogVar.a;
                    int i11 = eogVar.c;
                    for (int i12 = (int) ((eogVar.b + j) - j2); i12 < i11; i12++) {
                        byte b5 = bArr4[i12];
                        for (byte b6 : h2) {
                            if (b5 == b6) {
                                return (i12 - eogVar.b) + j2;
                            }
                        }
                    }
                    j2 += eogVar.c - eogVar.b;
                    eogVar = eogVar.f;
                    eogVar.getClass();
                    j = j2;
                }
            }
            return -1L;
        }
        f27.q(woa.m(j, "fromIndex < 0: "));
        return 0L;
    }

    public final void A0(OutputStream outputStream, long j) {
        outputStream.getClass();
        l6n.c(this.b, 0L, j);
        eog eogVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            eogVar.getClass();
            int min = (int) Math.min(j2, eogVar.c - eogVar.b);
            outputStream.write(eogVar.a, eogVar.b, min);
            int i = eogVar.b + min;
            eogVar.b = i;
            long j3 = min;
            this.b -= j3;
            j2 -= j3;
            if (i == eogVar.c) {
                eog a = eogVar.a();
                this.a = a;
                hog.a(eogVar);
                eogVar = a;
            }
        }
    }

    public final void C0(int i, int i2, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            eog e0 = e0(1);
                            byte[] bArr = e0.a;
                            int i3 = e0.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = e0.c;
                            int i6 = (i3 + i) - i5;
                            e0.c = i5 + i6;
                            this.b += i6;
                        } else {
                            if (charAt2 < 2048) {
                                eog e02 = e0(2);
                                byte[] bArr2 = e02.a;
                                int i7 = e02.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                e02.c = i7 + 2;
                                this.b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    eog e03 = e0(4);
                                    byte[] bArr3 = e03.a;
                                    int i10 = e03.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    e03.c = i10 + 4;
                                    this.b += 4;
                                    i += 2;
                                } else {
                                    i0(63);
                                    i = i8;
                                }
                            } else {
                                eog e04 = e0(3);
                                byte[] bArr4 = e04.a;
                                int i11 = e04.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                e04.c = i11 + 3;
                                this.b += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                f27.i(str.length(), ace.o(i2, "endIndex > string.length: ", " > "));
                return;
            }
            f27.q(woa.l(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        f27.q(ace.f(i, "beginIndex < 0: "));
    }

    public final boolean D(int i, iw1 iw1Var, long j) {
        iw1Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= iw1Var.d()) {
            if (i == 0 || b.a(this, iw1Var, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E0(String str) {
        str.getClass();
        C0(0, str.length(), str);
    }

    @Override // defpackage.kq1
    public final long F(iw1 iw1Var) {
        iw1Var.getClass();
        return A(0L, iw1Var);
    }

    @Override // defpackage.kq1
    public final long F0(jq1 jq1Var) {
        long j = this.b;
        if (j > 0) {
            jq1Var.write(this, j);
        }
        return j;
    }

    public final void G(qp1 qp1Var) {
        qp1Var.getClass();
        byte[] bArr = b.a;
        if (qp1Var.a == null) {
            qp1Var.a = this;
            qp1Var.b = true;
        } else {
            dmk.n("already attached to a buffer");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [tp1, java.lang.Object] */
    @Override // defpackage.kq1
    public final String I(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long z = z((byte) 10, 0L, j3);
            if (z != -1) {
                return b.c(this, z);
            }
            if (j3 < this.b && y(j3 - 1) == 13 && y(j3) == 10) {
                return b.c(this, j3);
            }
            ?? obj = new Object();
            p(obj, 0L, Math.min(32L, this.b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + obj.k0(obj.b).e() + (char) 8230);
        }
        f27.q(woa.m(j, "limit < 0: "));
        return null;
    }

    public final void I0(int i) {
        if (i < 128) {
            i0(i);
            return;
        }
        if (i < 2048) {
            eog e0 = e0(2);
            byte[] bArr = e0.a;
            int i2 = e0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            e0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            i0(63);
            return;
        }
        if (i < 65536) {
            eog e02 = e0(3);
            byte[] bArr2 = e02.a;
            int i3 = e02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            e02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            eog e03 = e0(4);
            byte[] bArr3 = e03.a;
            int i4 = e03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            e03.c = i4 + 4;
            this.b += 4;
            return;
        }
        dmk.v("Unexpected code point: 0x".concat(l6n.i(i)));
    }

    public final short K() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.kq1
    public final String K0(Charset charset) {
        charset.getClass();
        return N(this.b, charset);
    }

    @Override // defpackage.kq1
    public final long L0(long j, iw1 iw1Var) {
        iw1Var.getClass();
        byte[] bArr = b.a;
        return b.a(this, iw1Var, 0L, j, iw1Var.d());
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 M0(long j) {
        m0(j);
        return this;
    }

    public final String N(long j, Charset charset) {
        charset.getClass();
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (j == 0) {
                    return "";
                }
                eog eogVar = this.a;
                eogVar.getClass();
                int i = eogVar.b;
                if (i + j > eogVar.c) {
                    return new String(Z(j), charset);
                }
                int i2 = (int) j;
                String str = new String(eogVar.a, i, i2, charset);
                int i3 = eogVar.b + i2;
                eogVar.b = i3;
                this.b -= j;
                if (i3 == eogVar.c) {
                    this.a = eogVar.a();
                    hog.a(eogVar);
                }
                return str;
            }
            f27.r();
            return null;
        }
        f27.q(woa.m(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 O(String str) {
        E0(str);
        return this;
    }

    @Override // defpackage.kq1
    public final iw1 O0() {
        return k0(this.b);
    }

    public final String R() {
        return N(this.b, Charsets.UTF_8);
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 R0(int i, int i2, String str) {
        C0(i, i2, str);
        return this;
    }

    @Override // defpackage.kq1
    public final void U(tp1 tp1Var, long j) {
        tp1Var.getClass();
        long j2 = this.b;
        if (j2 >= j) {
            tp1Var.write(this, j);
        } else {
            tp1Var.write(this, j2);
            f27.r();
        }
    }

    @Override // defpackage.kq1
    public final String W() {
        return I(Long.MAX_VALUE);
    }

    public final int X() {
        int i;
        int i2;
        int i3;
        if (this.b != 0) {
            byte y = y(0L);
            if ((y & 128) == 0) {
                i = y & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((y & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
                i = y & 31;
                i2 = 2;
                i3 = 128;
            } else if ((y & 240) == 224) {
                i = y & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((y & 248) == 240) {
                i = y & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (this.b >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte y2 = y(j2);
                    if ((y2 & MessagePack.Code.NIL) == 128) {
                        i = (i << 6) | (y2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && i < 57344) || i < i3) {
                    return 65533;
                }
                return i;
            }
            StringBuilder o = ace.o(i2, "size < ", ": ");
            o.append(this.b);
            o.append(" (to read code point prefixed 0x");
            o.append(l6n.h(y));
            o.append(')');
            throw new EOFException(o.toString());
        }
        f27.r();
        return 0;
    }

    public final iw1 Y() {
        long j = this.b;
        if (j <= 2147483647L) {
            return a0((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.kq1
    public final byte[] Z(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            f27.r();
            return null;
        }
        f27.q(woa.m(j, "byteCount: "));
        return null;
    }

    public final iw1 a0(int i) {
        if (i == 0) {
            return iw1.d;
        }
        l6n.c(this.b, 0L, i);
        eog eogVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            eogVar.getClass();
            int i5 = eogVar.c;
            int i6 = eogVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                eogVar = eogVar.f;
            } else {
                dmk.i("s.limit == s.pos");
                return null;
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        eog eogVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            eogVar2.getClass();
            bArr[i7] = eogVar2.a;
            i2 += eogVar2.c - eogVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = eogVar2.b;
            eogVar2.d = true;
            i7++;
            eogVar2 = eogVar2.f;
        }
        return new jog(bArr, iArr);
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 b0(iw1 iw1Var) {
        f0(iw1Var);
        return this;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 c0(long j) {
        j0(j);
        return this;
    }

    @Override // defpackage.kq1
    public final boolean c1(long j, iw1 iw1Var) {
        iw1Var.getClass();
        return D(iw1Var.d(), iw1Var, j);
    }

    public final Object clone() {
        return o();
    }

    public final void e() {
        skip(this.b);
    }

    public final eog e0(int i) {
        if (i >= 1 && i <= 8192) {
            eog eogVar = this.a;
            if (eogVar == null) {
                eog b = hog.b();
                this.a = b;
                b.g = b;
                b.f = b;
                return b;
            }
            eog eogVar2 = eogVar.g;
            eogVar2.getClass();
            if (eogVar2.c + i <= 8192 && eogVar2.e) {
                return eogVar2;
            }
            eog b2 = hog.b();
            eogVar2.b(b2);
            return b2;
        }
        dmk.v("unexpected capacity");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        long j = this.b;
        tp1 tp1Var = (tp1) obj;
        if (j != tp1Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        eog eogVar = this.a;
        eogVar.getClass();
        eog eogVar2 = tp1Var.a;
        eogVar2.getClass();
        int i = eogVar.b;
        int i2 = eogVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(eogVar.c - i, eogVar2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (eogVar.a[i] != eogVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == eogVar.c) {
                eogVar = eogVar.f;
                eogVar.getClass();
                i = eogVar.b;
            }
            if (i2 == eogVar2.c) {
                eogVar2 = eogVar2.f;
                eogVar2.getClass();
                i2 = eogVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final void f0(iw1 iw1Var) {
        iw1Var.getClass();
        iw1Var.u(this, iw1Var.d());
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        eog eogVar = this.a;
        eogVar.getClass();
        eog eogVar2 = eogVar.g;
        eogVar2.getClass();
        if (eogVar2.c < 8192 && eogVar2.e) {
            return j - (r2 - eogVar2.b);
        }
        return j;
    }

    @Override // defpackage.kq1
    public final int g0(jld jldVar) {
        jldVar.getClass();
        int d = b.d(this, jldVar, false);
        if (d == -1) {
            return -1;
        }
        skip(jldVar.b[d].d());
        return d;
    }

    @Override // defpackage.kq1
    public final boolean h(long j) {
        if (this.b >= j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        eog eogVar = this.a;
        if (eogVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eogVar.c;
            for (int i3 = eogVar.b; i3 < i2; i3++) {
                i = (i * 31) + eogVar.a[i3];
            }
            eogVar = eogVar.f;
            eogVar.getClass();
        } while (eogVar != this.a);
        return i;
    }

    @Override // defpackage.kq1
    public final void i(long j) {
        if (this.b >= j) {
            return;
        }
        f27.r();
    }

    public final void i0(int i) {
        eog e0 = e0(1);
        byte[] bArr = e0.a;
        int i2 = e0.c;
        e0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.jq1
    public final long i1(meh mehVar) {
        mehVar.getClass();
        long j = 0;
        while (true) {
            long read = mehVar.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.kq1
    public final boolean j() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final void j0(long j) {
        boolean z;
        if (j == 0) {
            i0(48);
            return;
        }
        int i = 0;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                E0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        if (j > b.b[numberOfLeadingZeros]) {
            i = 1;
        }
        int i2 = numberOfLeadingZeros + i;
        if (z) {
            i2++;
        }
        eog e0 = e0(i2);
        byte[] bArr2 = e0.a;
        int i3 = e0.c + i2;
        while (j != 0) {
            i3--;
            bArr2[i3] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i3 - 1] = 45;
        }
        e0.c += i2;
        this.b += i2;
    }

    @Override // defpackage.kq1
    public final iw1 k0(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (j >= 4096) {
                    iw1 a0 = a0((int) j);
                    skip(j);
                    return a0;
                }
                return new iw1(Z(j));
            }
            f27.r();
            return null;
        }
        f27.q(woa.m(j, "byteCount: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Type inference failed for: r14v2, types: [tp1, java.lang.Object] */
    @Override // defpackage.kq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l1() {
        int i;
        if (this.b != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                eog eogVar = this.a;
                eogVar.getClass();
                byte[] bArr = eogVar.a;
                int i3 = eogVar.b;
                int i4 = eogVar.c;
                while (i3 < i4) {
                    byte b = bArr[i3];
                    if (b >= 48 && b <= 57) {
                        i = b + MessagePack.Code.INT8;
                    } else if (b >= 97 && b <= 102) {
                        i = b - 87;
                    } else if (b >= 65 && b <= 70) {
                        i = b + MessagePack.Code.EXT32;
                    } else if (i2 != 0) {
                        z = true;
                        if (i3 != i4) {
                            this.a = eogVar.a();
                            hog.a(eogVar);
                        } else {
                            eogVar.b = i3;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(l6n.h(b)));
                    }
                    if (((-1152921504606846976L) & j) == 0) {
                        j = (j << 4) | i;
                        i3++;
                        i2++;
                    } else {
                        ?? obj = new Object();
                        obj.m0(j);
                        obj.i0(b);
                        throw new NumberFormatException("Number too large: ".concat(obj.R()));
                    }
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (this.a != null);
            this.b -= i2;
            return j;
        }
        f27.r();
        return 0L;
    }

    public final void m0(long j) {
        if (j == 0) {
            i0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        eog e0 = e0(i);
        byte[] bArr = e0.a;
        int i2 = e0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        e0.c += i;
        this.b += i;
    }

    @Override // defpackage.kq1
    public final InputStream n1() {
        return new og1(this, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object] */
    public final tp1 o() {
        ?? obj = new Object();
        if (this.b == 0) {
            return obj;
        }
        eog eogVar = this.a;
        eogVar.getClass();
        eog c = eogVar.c();
        obj.a = c;
        c.g = c;
        c.f = c;
        for (eog eogVar2 = eogVar.f; eogVar2 != eogVar; eogVar2 = eogVar2.f) {
            eog eogVar3 = c.g;
            eogVar3.getClass();
            eogVar2.getClass();
            eogVar3.b(eogVar2.c());
        }
        obj.b = this.b;
        return obj;
    }

    public final void p(tp1 tp1Var, long j, long j2) {
        tp1Var.getClass();
        long j3 = j;
        l6n.c(this.b, j3, j2);
        if (j2 != 0) {
            tp1Var.b += j2;
            eog eogVar = this.a;
            while (true) {
                eogVar.getClass();
                long j4 = eogVar.c - eogVar.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                eogVar = eogVar.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                eogVar.getClass();
                eog c = eogVar.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                eog eogVar2 = tp1Var.a;
                if (eogVar2 == null) {
                    c.g = c;
                    c.f = c;
                    tp1Var.a = c;
                } else {
                    eog eogVar3 = eogVar2.g;
                    eogVar3.getClass();
                    eogVar3.b(c);
                }
                j5 -= c.c - c.b;
                eogVar = eogVar.f;
                j3 = 0;
            }
        }
    }

    public final void p0(int i) {
        eog e0 = e0(4);
        byte[] bArr = e0.a;
        int i2 = e0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        e0.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.kq1
    public final ipf peek() {
        return new ipf(new fje(this));
    }

    @Override // defpackage.kq1
    public final long q(iw1 iw1Var) {
        iw1Var.getClass();
        return L0(Long.MAX_VALUE, iw1Var);
    }

    public final void q0(int i) {
        eog e0 = e0(2);
        byte[] bArr = e0.a;
        int i2 = e0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        e0.c = i2 + 2;
        this.b += 2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        l6n.c(bArr.length, i, i2);
        eog eogVar = this.a;
        if (eogVar == null) {
            return -1;
        }
        int min = Math.min(i2, eogVar.c - eogVar.b);
        byte[] bArr2 = eogVar.a;
        int i3 = eogVar.b;
        ArraysKt.m(bArr2, i, bArr, i3, i3 + min);
        int i4 = eogVar.b + min;
        eogVar.b = i4;
        this.b -= min;
        if (i4 == eogVar.c) {
            this.a = eogVar.a();
            hog.a(eogVar);
        }
        return min;
    }

    @Override // defpackage.kq1
    public final byte readByte() {
        if (this.b != 0) {
            eog eogVar = this.a;
            eogVar.getClass();
            int i = eogVar.b;
            int i2 = eogVar.c;
            int i3 = i + 1;
            byte b = eogVar.a[i];
            this.b--;
            if (i3 == i2) {
                this.a = eogVar.a();
                hog.a(eogVar);
                return b;
            }
            eogVar.b = i3;
            return b;
        }
        f27.r();
        return (byte) 0;
    }

    @Override // defpackage.kq1
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                f27.r();
                return;
            }
        }
    }

    @Override // defpackage.kq1
    public final int readInt() {
        if (this.b >= 4) {
            eog eogVar = this.a;
            eogVar.getClass();
            int i = eogVar.b;
            int i2 = eogVar.c;
            if (i2 - i < 4) {
                return (readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8);
            }
            byte[] bArr = eogVar.a;
            int i3 = i + 3;
            int i4 = ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
            int i5 = i + 4;
            int i6 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) | i4;
            this.b -= 4;
            if (i5 == i2) {
                this.a = eogVar.a();
                hog.a(eogVar);
                return i6;
            }
            eogVar.b = i5;
            return i6;
        }
        f27.r();
        return 0;
    }

    @Override // defpackage.kq1
    public final long readLong() {
        if (this.b >= 8) {
            eog eogVar = this.a;
            eogVar.getClass();
            int i = eogVar.b;
            int i2 = eogVar.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = eogVar.a;
            int i3 = i + 7;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j2 = j | (bArr[i3] & 255);
            this.b -= 8;
            if (i4 == i2) {
                this.a = eogVar.a();
                hog.a(eogVar);
                return j2;
            }
            eogVar.b = i4;
            return j2;
        }
        f27.r();
        return 0L;
    }

    @Override // defpackage.kq1
    public final short readShort() {
        if (this.b >= 2) {
            eog eogVar = this.a;
            eogVar.getClass();
            int i = eogVar.b;
            int i2 = eogVar.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8));
            }
            byte[] bArr = eogVar.a;
            int i3 = i + 1;
            int i4 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 8;
            int i5 = i + 2;
            int i6 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) | i4;
            this.b -= 2;
            if (i5 == i2) {
                this.a = eogVar.a();
                hog.a(eogVar);
            } else {
                eogVar.b = i5;
            }
            return (short) i6;
        }
        f27.r();
        return (short) 0;
    }

    @Override // defpackage.kq1
    public final void skip(long j) {
        while (j > 0) {
            eog eogVar = this.a;
            if (eogVar != null) {
                int min = (int) Math.min(j, eogVar.c - eogVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                int i = eogVar.b + min;
                eogVar.b = i;
                if (i == eogVar.c) {
                    this.a = eogVar.a();
                    hog.a(eogVar);
                }
            } else {
                f27.r();
                return;
            }
        }
    }

    @Override // defpackage.kq1
    public final byte[] t0() {
        return Z(this.b);
    }

    @Override // defpackage.meh
    public final b3j timeout() {
        return b3j.NONE;
    }

    public final String toString() {
        return Y().toString();
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 u(int i) {
        I0(i);
        return this;
    }

    @Override // defpackage.y8h
    public final void write(tp1 tp1Var, long j) {
        eog eogVar;
        eog b;
        int i;
        tp1Var.getClass();
        if (tp1Var != this) {
            l6n.c(tp1Var.b, 0L, j);
            while (j > 0) {
                eog eogVar2 = tp1Var.a;
                eogVar2.getClass();
                int i2 = eogVar2.c;
                eog eogVar3 = tp1Var.a;
                eogVar3.getClass();
                long j2 = i2 - eogVar3.b;
                int i3 = 0;
                if (j < j2) {
                    eog eogVar4 = this.a;
                    if (eogVar4 != null) {
                        eogVar = eogVar4.g;
                    } else {
                        eogVar = null;
                    }
                    if (eogVar != null && eogVar.e) {
                        long j3 = eogVar.c + j;
                        if (eogVar.d) {
                            i = 0;
                        } else {
                            i = eogVar.b;
                        }
                        if (j3 - i <= 8192) {
                            eog eogVar5 = tp1Var.a;
                            eogVar5.getClass();
                            eogVar5.d(eogVar, (int) j);
                            tp1Var.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    eog eogVar6 = tp1Var.a;
                    eogVar6.getClass();
                    int i4 = (int) j;
                    if (i4 > 0 && i4 <= eogVar6.c - eogVar6.b) {
                        if (i4 >= 1024) {
                            b = eogVar6.c();
                        } else {
                            b = hog.b();
                            byte[] bArr = eogVar6.a;
                            byte[] bArr2 = b.a;
                            int i5 = eogVar6.b;
                            ArraysKt.m(bArr, 0, bArr2, i5, i5 + i4);
                        }
                        b.c = b.b + i4;
                        eogVar6.b += i4;
                        eog eogVar7 = eogVar6.g;
                        eogVar7.getClass();
                        eogVar7.b(b);
                        tp1Var.a = b;
                    } else {
                        dmk.v("byteCount out of range");
                        return;
                    }
                }
                eog eogVar8 = tp1Var.a;
                eogVar8.getClass();
                long j4 = eogVar8.c - eogVar8.b;
                tp1Var.a = eogVar8.a();
                eog eogVar9 = this.a;
                if (eogVar9 == null) {
                    this.a = eogVar8;
                    eogVar8.g = eogVar8;
                    eogVar8.f = eogVar8;
                } else {
                    eog eogVar10 = eogVar9.g;
                    eogVar10.getClass();
                    eogVar10.b(eogVar8);
                    eog eogVar11 = eogVar8.g;
                    if (eogVar11 != eogVar8) {
                        eogVar11.getClass();
                        if (eogVar11.e) {
                            int i6 = eogVar8.c - eogVar8.b;
                            eog eogVar12 = eogVar8.g;
                            eogVar12.getClass();
                            int i7 = 8192 - eogVar12.c;
                            eog eogVar13 = eogVar8.g;
                            eogVar13.getClass();
                            if (!eogVar13.d) {
                                eog eogVar14 = eogVar8.g;
                                eogVar14.getClass();
                                i3 = eogVar14.b;
                            }
                            if (i6 <= i7 + i3) {
                                eog eogVar15 = eogVar8.g;
                                eogVar15.getClass();
                                eogVar8.d(eogVar15, i6);
                                eogVar8.a();
                                hog.a(eogVar8);
                            }
                        }
                    } else {
                        dmk.n("cannot compact");
                        return;
                    }
                }
                tp1Var.b -= j4;
                this.b += j4;
                j -= j4;
            }
            return;
        }
        dmk.v("source == this");
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 writeByte(int i) {
        i0(i);
        return this;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 writeInt(int i) {
        p0(i);
        return this;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 writeShort(int i) {
        q0(i);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.b - r1;
        r19.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = defpackage.sv6.t(r1, " but was 0x");
        r1.append(defpackage.l6n.h(y(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r3 = r17;
        defpackage.f27.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [tp1, java.lang.Object] */
    @Override // defpackage.kq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x0() {
        long j;
        byte b;
        long j2 = 0;
        if (this.b != 0) {
            int i = 0;
            boolean z = false;
            long j3 = 0;
            long j4 = -7;
            boolean z2 = false;
            loop0: while (true) {
                eog eogVar = this.a;
                eogVar.getClass();
                byte[] bArr = eogVar.a;
                int i2 = eogVar.b;
                int i3 = eogVar.c;
                while (i2 < i3) {
                    b = bArr[i2];
                    if (b >= 48 && b <= 57) {
                        int i4 = 48 - b;
                        if (j3 < -922337203685477580L) {
                            break loop0;
                        }
                        j = j2;
                        if (j3 == -922337203685477580L && i4 < j4) {
                            break loop0;
                        }
                        j3 = (j3 * 10) + i4;
                    } else {
                        j = j2;
                        if (b == 45 && i == 0) {
                            j4--;
                            z = true;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    i2++;
                    i++;
                    j2 = j;
                }
                j = j2;
                if (i2 == i3) {
                    this.a = eogVar.a();
                    hog.a(eogVar);
                } else {
                    eogVar.b = i2;
                }
                if (z2 || this.a == null) {
                    break;
                }
                j2 = j;
            }
            ?? obj = new Object();
            obj.j0(j3);
            obj.i0(b);
            if (!z) {
                obj.readByte();
            }
            throw new NumberFormatException("Number too large: ".concat(obj.R()));
        }
        f27.r();
        return 0L;
    }

    public final byte y(long j) {
        l6n.c(this.b, j, 1L);
        eog eogVar = this.a;
        eogVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                eogVar = eogVar.g;
                eogVar.getClass();
                j2 -= eogVar.c - eogVar.b;
            }
            return eogVar.a[(int) ((eogVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = eogVar.c;
            int i2 = eogVar.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                eogVar = eogVar.f;
                eogVar.getClass();
                j3 = j4;
            } else {
                return eogVar.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    public final void y0(String str, int i, int i2, Charset charset) {
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        C0(i, i2, str);
                        return;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    bytes.getClass();
                    m1395write(bytes, 0, bytes.length);
                    return;
                }
                f27.i(str.length(), ace.o(i2, "endIndex > string.length: ", " > "));
                return;
            }
            f27.q(woa.l(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        f27.q(ace.f(i, "beginIndex < 0: "));
    }

    public final long z(byte b, long j, long j2) {
        eog eogVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 <= j3 && j3 <= j4) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            long j7 = -1;
            if (j3 == j4 || (eogVar = this.a) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    eogVar = eogVar.g;
                    eogVar.getClass();
                    j6 -= eogVar.c - eogVar.b;
                }
                while (j6 < j4) {
                    byte[] bArr = eogVar.a;
                    long j8 = j7;
                    int min = (int) Math.min(eogVar.c, (eogVar.b + j4) - j6);
                    for (int i = (int) ((eogVar.b + j3) - j6); i < min; i++) {
                        if (bArr[i] == b) {
                            return (i - eogVar.b) + j6;
                        }
                    }
                    j6 += eogVar.c - eogVar.b;
                    eogVar = eogVar.f;
                    eogVar.getClass();
                    j7 = j8;
                    j3 = j6;
                }
                return j7;
            }
            while (true) {
                long j9 = (eogVar.c - eogVar.b) + j5;
                if (j9 > j3) {
                    break;
                }
                eogVar = eogVar.f;
                eogVar.getClass();
                j5 = j9;
            }
            while (j5 < j4) {
                byte[] bArr2 = eogVar.a;
                int min2 = (int) Math.min(eogVar.c, (eogVar.b + j4) - j5);
                for (int i2 = (int) ((eogVar.b + j3) - j5); i2 < min2; i2++) {
                    if (bArr2[i2] == b) {
                        return (i2 - eogVar.b) + j5;
                    }
                }
                j5 += eogVar.c - eogVar.b;
                eogVar = eogVar.f;
                eogVar.getClass();
                j3 = j5;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.b);
        ix2.A(sb, " fromIndex=", j3, " toIndex=");
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.jq1
    public final jq1 E() {
        return this;
    }

    @Override // defpackage.kq1
    public final tp1 c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.y8h
    public final void close() {
    }

    @Override // defpackage.jq1, defpackage.y8h, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        eog eogVar = this.a;
        if (eogVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eogVar.c - eogVar.b);
        byteBuffer.put(eogVar.a, eogVar.b, min);
        int i = eogVar.b + min;
        eogVar.b = i;
        this.b -= min;
        if (i == eogVar.c) {
            this.a = eogVar.a();
            hog.a(eogVar);
        }
        return min;
    }

    @Override // defpackage.meh
    public final long read(tp1 tp1Var, long j) {
        tp1Var.getClass();
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            tp1Var.write(this, j);
            return j;
        }
        f27.q(woa.m(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 write(byte[] bArr, int i, int i2) {
        m1395write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.jq1
    public final /* bridge */ /* synthetic */ jq1 write(byte[] bArr) {
        m1394write(bArr);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            eog e0 = e0(1);
            int min = Math.min(i, 8192 - e0.c);
            byteBuffer.get(e0.a, e0.c, min);
            i -= min;
            e0.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m1394write(byte[] bArr) {
        bArr.getClass();
        m1395write(bArr, 0, bArr.length);
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m1395write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        l6n.c(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            eog e0 = e0(1);
            int min = Math.min(i3 - i, 8192 - e0.c);
            int i4 = i + min;
            ArraysKt.m(bArr, e0.c, e0.a, i, i4);
            e0.c += min;
            i = i4;
        }
        this.b += j;
    }
}
