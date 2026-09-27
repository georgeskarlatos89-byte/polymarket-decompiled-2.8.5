package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;
import kotlin.text.e;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class iw1 implements Serializable, Comparable {
    public static final iw1 d = new iw1(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public iw1(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    public static int g(iw1 iw1Var, iw1 iw1Var2) {
        iw1Var.getClass();
        iw1Var2.getClass();
        return iw1Var.f(0, iw1Var2.h());
    }

    public static int k(iw1 iw1Var, iw1 iw1Var2) {
        int d2 = iw1Var.d();
        iw1Var.getClass();
        iw1Var2.getClass();
        return iw1Var.j(d2, iw1Var2.h());
    }

    public static iw1 q(iw1 iw1Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iw1Var.d();
        }
        return iw1Var.p(i, i2);
    }

    public String a() {
        return a.a(this.a, a.a);
    }

    public final int b(iw1 iw1Var) {
        iw1Var.getClass();
        int d2 = d();
        int d3 = iw1Var.d();
        int min = Math.min(d2, d3);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & MessagePack.Code.EXT_TIMESTAMP;
            int i3 = iw1Var.i(i) & MessagePack.Code.EXT_TIMESTAMP;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                }
                return 1;
            }
        }
        if (d2 == d3) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        return 1;
    }

    public iw1 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.a, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new iw1(digest);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return b((iw1) obj);
    }

    public int d() {
        return this.a.length;
    }

    public String e() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iw1) {
                iw1 iw1Var = (iw1) obj;
                int d2 = iw1Var.d();
                byte[] bArr = this.a;
                if (d2 == bArr.length && iw1Var.m(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.a;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!l6n.a(bArr2, max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.a;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.a[i];
    }

    public int j(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.a;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (l6n.a(bArr2, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean m(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && l6n.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean n(int i, iw1 iw1Var, int i2) {
        iw1Var.getClass();
        return iw1Var.m(0, i, i2, this.a);
    }

    public String o(Charset charset) {
        charset.getClass();
        return new String(this.a, charset);
    }

    public iw1 p(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.a;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    return new iw1(ArraysKt.copyOfRange(bArr, i, i2));
                }
                dmk.v("endIndex < beginIndex");
                return null;
            }
            f27.q(sv6.o(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        dmk.v("beginIndex < 0");
        return null;
    }

    public iw1 r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new iw1(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public byte[] s() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String t() {
        String str = this.c;
        if (str == null) {
            byte[] h = h();
            h.getClass();
            String str2 = new String(h, Charsets.UTF_8);
            this.c = str2;
            return str2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ef, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0127, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012b, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00cf, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016a, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0171, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0163, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a2, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01a5, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a8, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0137, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ab, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0092, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        if (r6 == 64) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i;
        byte b;
        int i2;
        int i3;
        iw1 iw1Var = this;
        byte[] bArr = iw1Var.a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b2 = bArr[i4];
            int i7 = 2;
            if (b2 >= 0) {
                int i8 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                if (b2 < 65536) {
                    i = 1;
                } else {
                    i = 2;
                }
                i5 += i;
                i4++;
                while (true) {
                    i6 = i8;
                    if (i4 < length && (b = bArr[i4]) >= 0) {
                        i4++;
                        i8 = i6 + 1;
                        if (i6 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        if (b < 65536) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        i5 += i2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i9 = i4 + 1;
                if (length > i9) {
                    byte b3 = bArr[i9];
                    if ((b3 & MessagePack.Code.NIL) == 128) {
                        int i10 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i3 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            if (i10 < 65536) {
                                i7 = 1;
                            }
                            i5 += i7;
                            i4 += 2;
                            i6 = i3;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i11 = i4 + 2;
                if (length > i11) {
                    byte b4 = bArr[i4 + 1];
                    if ((b4 & MessagePack.Code.NIL) == 128) {
                        byte b5 = bArr[i11];
                        if ((b5 & MessagePack.Code.NIL) == 128) {
                            int i12 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i12 >= 2048) {
                                if (55296 > i12 || i12 >= 57344) {
                                    i3 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    }
                                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                        break;
                                    }
                                    if (i12 < 65536) {
                                        i7 = 1;
                                    }
                                    i5 += i7;
                                    i4 += 3;
                                    i6 = i3;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i13 = i4 + 3;
                if (length > i13) {
                    byte b6 = bArr[i4 + 1];
                    if ((b6 & MessagePack.Code.NIL) == 128) {
                        byte b7 = bArr[i4 + 2];
                        if ((b7 & MessagePack.Code.NIL) == 128) {
                            byte b8 = bArr[i13];
                            if ((b8 & MessagePack.Code.NIL) == 128) {
                                int i14 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i14 <= 1114111) {
                                    if (55296 > i14 || i14 >= 57344) {
                                        if (i14 >= 65536) {
                                            i3 = i6 + 1;
                                            if (i6 == 64) {
                                                break;
                                            }
                                            if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                                break;
                                            }
                                            if (i14 < 65536) {
                                                i7 = 1;
                                            }
                                            i5 += i7;
                                            i4 += 4;
                                            i6 = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + iw1Var.e() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 <= bArr.length) {
                if (64 != bArr.length) {
                    iw1Var = new iw1(ArraysKt.copyOfRange(bArr, 0, 64));
                }
                sb.append(iw1Var.e());
                sb.append("…]");
                return sb.toString();
            }
            f27.q(sv6.o(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        String t = iw1Var.t();
        String s = e.s(e.s(e.s(t.substring(0, i5), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i5 < t.length()) {
            return "[size=" + bArr.length + " text=" + s + "…]";
        }
        return hdi.o("[text=", s, ']');
    }

    public void u(tp1 tp1Var, int i) {
        tp1Var.m1395write(this.a, 0, i);
    }
}
