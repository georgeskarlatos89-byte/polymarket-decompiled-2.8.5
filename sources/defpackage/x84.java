package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x84 {
    public int c;
    public final InputStream e;
    public int f;
    public int i;
    public int h = bd0.API_PRIORITY_OTHER;
    public final byte[] a = new byte[4096];
    public int b = 0;
    public int d = 0;
    public int g = 0;

    public x84(InputStream inputStream) {
        this.e = inputStream;
    }

    public final void a(int i) {
        if (this.f == i) {
        } else {
            throw new a8a("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void b() {
        if (this.i < 64) {
        } else {
            throw new a8a("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public final int c() {
        int i = this.h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.g + this.d);
    }

    public final void d(int i) {
        this.h = i;
        o();
    }

    public final int e(int i) {
        if (i >= 0) {
            int i2 = this.g + this.d + i;
            int i3 = this.h;
            if (i2 <= i3) {
                this.h = i2;
                o();
                return i3;
            }
            throw a8a.a();
        }
        throw new a8a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final skb f() {
        int k = k();
        int i = this.b;
        int i2 = this.d;
        if (k <= i - i2 && k > 0) {
            byte[] bArr = new byte[k];
            System.arraycopy(this.a, i2, bArr, 0, k);
            skb skbVar = new skb(bArr);
            this.d += k;
            return skbVar;
        }
        if (k == 0) {
            return gw1.a;
        }
        return new skb(h(k));
    }

    public final ndc g(mia miaVar, nt7 nt7Var) {
        int k = k();
        b();
        int e = e(k);
        this.i++;
        ndc ndcVar = (ndc) miaVar.c(this, nt7Var);
        a(0);
        this.i--;
        d(e);
        return ndcVar;
    }

    public final byte[] h(int i) {
        if (i <= 0) {
            if (i == 0) {
                return e5a.a;
            }
            throw new a8a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 <= i5) {
            byte[] bArr = this.a;
            if (i < 4096) {
                byte[] bArr2 = new byte[i];
                int i6 = this.b - i3;
                System.arraycopy(bArr, i3, bArr2, 0, i6);
                this.d = this.b;
                int i7 = i - i6;
                if (i7 > 0) {
                    p(i7);
                }
                System.arraycopy(bArr, 0, bArr2, i6, i7);
                this.d = i7;
                return bArr2;
            }
            int i8 = this.b;
            this.g = i2 + i8;
            this.d = 0;
            this.b = 0;
            int i9 = i8 - i3;
            int i10 = i - i9;
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr3 = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.e.read(bArr3, i11, min - i11);
                    if (read != -1) {
                        this.g += read;
                        i11 += read;
                    } else {
                        throw a8a.a();
                    }
                }
                i10 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, i3, bArr4, 0, i9);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i9, bArr5.length);
                i9 += bArr5.length;
            }
            return bArr4;
        }
        r((i5 - i2) - i3);
        throw a8a.a();
    }

    public final int i() {
        int i = this.d;
        if (this.b - i < 4) {
            p(4);
            i = this.d;
        }
        this.d = i + 4;
        byte[] bArr = this.a;
        return ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
    }

    public final long j() {
        int i = this.d;
        if (this.b - i < 8) {
            p(8);
            i = this.d;
        }
        this.d = i + 8;
        byte[] bArr = this.a;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int k() {
        int i;
        int i2 = this.d;
        int i3 = this.b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.d = i5;
                return i;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() {
        long j;
        long j2;
        long j3;
        int i = this.d;
        int i2 = this.b;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.a;
            byte b = bArr[i];
            if (b >= 0) {
                this.d = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 < 0) {
                    j2 = -128;
                } else {
                    int i5 = i + 3;
                    long j5 = j4 ^ (bArr[i4] << 14);
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ (bArr[i5] << 21);
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (bArr[i4] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (bArr[i5] << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (bArr[i4] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (bArr[i5] << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i6 = i + 9;
                                            long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                            } else {
                                                i4 = i6;
                                            }
                                            j = j6;
                                            this.d = i4;
                                            return j;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.d = i4;
                    return j;
                }
                j = j2 ^ j4;
                this.d = i4;
                return j;
            }
        }
        return m();
    }

    public final long m() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.d == this.b) {
                p(1);
            }
            int i2 = this.d;
            this.d = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.a[i2] & 128) == 0) {
                return j;
            }
        }
        throw new a8a("CodedInputStream encountered a malformed varint.");
    }

    public final int n() {
        if (this.d == this.b && !s(1)) {
            this.f = 0;
            return 0;
        }
        int k = k();
        this.f = k;
        if ((k >>> 3) != 0) {
            return k;
        }
        throw new a8a("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i = this.b + this.c;
        this.b = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.c = i4;
            this.b = i - i4;
            return;
        }
        this.c = 0;
    }

    public final void p(int i) {
        if (s(i)) {
        } else {
            throw a8a.a();
        }
    }

    public final boolean q(int i, hj1 hj1Var) {
        boolean q;
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                int i3 = i();
                                hj1Var.O(i);
                                hj1Var.M(i3);
                                return true;
                            }
                            throw new a8a("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    hj1Var.O(i);
                    do {
                        int n = n();
                        if (n == 0) {
                            break;
                        }
                        b();
                        this.i++;
                        q = q(n, hj1Var);
                        this.i--;
                    } while (q);
                    int i4 = ((i >>> 3) << 3) | 4;
                    a(i4);
                    hj1Var.O(i4);
                    return true;
                }
                skb f = f();
                hj1Var.O(i);
                hj1Var.O(f.size());
                hj1Var.K(f);
                return true;
            }
            long j = j();
            hj1Var.O(i);
            hj1Var.N(j);
            return true;
        }
        long l = l();
        hj1Var.O(i);
        hj1Var.P(l);
        return true;
    }

    public final void r(int i) {
        int i2 = this.b;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i >= 0) {
            int i5 = this.g;
            int i6 = i5 + i3 + i;
            int i7 = this.h;
            if (i6 <= i7) {
                this.d = i2;
                p(1);
                while (true) {
                    int i8 = i - i4;
                    int i9 = this.b;
                    if (i8 > i9) {
                        i4 += i9;
                        this.d = i9;
                        p(1);
                    } else {
                        this.d = i8;
                        return;
                    }
                }
            } else {
                r((i7 - i5) - i3);
                throw a8a.a();
            }
        } else {
            throw new a8a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean s(int i) {
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 > i4) {
            if (this.g + i2 + i <= this.h) {
                byte[] bArr = this.a;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.g += i2;
                    i4 = this.b - i2;
                    this.b = i4;
                    this.d = 0;
                }
                int read = this.e.read(bArr, i4, bArr.length - i4);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.b += read;
                        if ((this.g + i) - 67108864 <= 0) {
                            o();
                            if (this.b >= i) {
                                return true;
                            }
                            return s(i);
                        }
                        throw new a8a("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    dmk.n(sv6.j(read, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
                    return false;
                }
            }
            return false;
        }
        dmk.n(sv6.j(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
    }
}
