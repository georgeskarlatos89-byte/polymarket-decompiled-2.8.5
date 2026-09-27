package defpackage;

import kotlin.io.encoding.Base64$PaddingOption;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class e81 {
    public static final c81 f = new c81(null);
    public static final byte[] g = {13, 10};
    public static final e81 h;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final Base64$PaddingOption d;
    public final int e;

    static {
        Base64$PaddingOption base64$PaddingOption = Base64$PaddingOption.PRESENT;
        h = new e81(true, false, -1, base64$PaddingOption);
        new e81(false, true, 76, base64$PaddingOption);
        new e81(false, true, 64, base64$PaddingOption);
    }

    public e81(boolean z, boolean z2, int i, Base64$PaddingOption base64$PaddingOption) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = base64$PaddingOption;
        if (z && z2) {
            dmk.v("Failed requirement.");
            throw null;
        }
        this.e = i / 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01df, code lost:
    
        if (r15 == r10) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e2, code lost:
    
        if (r15 == (-8)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e4, code lost:
    
        if (r0 != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e8, code lost:
    
        if (r5 == kotlin.io.encoding.Base64$PaddingOption.PRESENT) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01eb, code lost:
    
        defpackage.dmk.v("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f1, code lost:
    
        if (r16 != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f3, code lost:
    
        if (r6 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f6, code lost:
    
        if (r14 >= r2) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0200, code lost:
    
        if (defpackage.g81.b[r1[r14] & org.msgpack.core.MessagePack.Code.EXT_TIMESTAMP] == (-1)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0203, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
    
        if (r14 < r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0208, code lost:
    
        if (r3 != r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020a, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020b, code lost:
    
        defpackage.dmk.n("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0210, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0211, code lost:
    
        r0 = r1[r14] & org.msgpack.core.MessagePack.Code.EXT_TIMESTAMP;
        r2 = (char) r0;
        r0 = java.lang.Integer.toString(r0, kotlin.text.CharsKt.checkRadix(8));
        r0.getClass();
        r3 = new java.lang.StringBuilder("Symbol '");
        r3.append(r2);
        r3.append("'(");
        r3.append(r0);
        r3.append(") at index ");
        r3.append(r14 - 1);
        r3.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0246, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0247, code lost:
    
        defpackage.dmk.v("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024d, code lost:
    
        defpackage.dmk.v("The last unit of input does not have enough bits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(e81 e81Var, CharSequence charSequence, int i, int i2) {
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int[] iArr2;
        char c;
        int i7;
        int i8 = 0;
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        int length = charSequence.length();
        e81Var.getClass();
        Base64$PaddingOption base64$PaddingOption = e81Var.d;
        boolean z = e81Var.b;
        charSequence.getClass();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            int length2 = str.length();
            l3.a.getClass();
            h3.a(i3, length, length2);
            bArr = str.substring(i3, length).getBytes(Charsets.f);
            bArr.getClass();
        } else {
            int length3 = charSequence.length();
            l3.a.getClass();
            h3.a(i3, length, length3);
            byte[] bArr2 = new byte[length - i3];
            int i9 = 0;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt <= 255) {
                    bArr2[i9] = (byte) charAt;
                    i9++;
                } else {
                    bArr2[i9] = 63;
                    i9++;
                }
                i3++;
            }
            bArr = bArr2;
        }
        int length4 = bArr.length;
        int length5 = bArr.length;
        l3.a.getClass();
        h3.a(0, length4, length5);
        int i10 = 1;
        int i11 = -2;
        if (length4 == 0) {
            i5 = 0;
        } else if (length4 != 1) {
            if (z) {
                i4 = length4;
                int i12 = 0;
                while (true) {
                    if (i12 >= length4) {
                        break;
                    }
                    int i13 = g81.b[bArr[i12] & MessagePack.Code.EXT_TIMESTAMP];
                    if (i13 < 0) {
                        if (i13 == -2) {
                            i4 -= length4 - i12;
                            break;
                        }
                        i4--;
                    }
                    i12++;
                }
            } else if (bArr[length4 - 1] == 61) {
                i4 = length4 - 1;
                if (bArr[length4 - 2] == 61) {
                    i4 = length4 - 2;
                }
            } else {
                i4 = length4;
            }
            i5 = (int) ((i4 * 6) / 8);
        } else {
            dmk.v(ace.f(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            return null;
        }
        byte[] bArr3 = new byte[i5];
        if (e81Var.a) {
            iArr = g81.d;
        } else {
            iArr = g81.b;
        }
        int i14 = -8;
        int i15 = 0;
        int i16 = 0;
        int i17 = -8;
        while (true) {
            int i18 = i10;
            if (i15 < length4) {
                if (i17 == i14 && (i7 = i15 + 3) < length4) {
                    int i19 = iArr[bArr[i15] & MessagePack.Code.EXT_TIMESTAMP];
                    iArr2 = iArr;
                    int i20 = i15 + 4;
                    int i21 = (iArr2[bArr[i15 + 2] & MessagePack.Code.EXT_TIMESTAMP] << 6) | (iArr[bArr[i15 + 1] & MessagePack.Code.EXT_TIMESTAMP] << 12) | (i19 << 18) | iArr2[bArr[i7] & MessagePack.Code.EXT_TIMESTAMP];
                    if (i21 >= 0) {
                        bArr3[i8] = (byte) (i21 >> 16);
                        int i22 = i8 + 2;
                        bArr3[i8 + 1] = (byte) (i21 >> 8);
                        i8 += 3;
                        bArr3[i22] = (byte) i21;
                        i10 = i18;
                        iArr = iArr2;
                        i15 = i20;
                        i11 = -2;
                        i14 = -8;
                    }
                } else {
                    iArr2 = iArr;
                }
                int i23 = bArr[i15] & MessagePack.Code.EXT_TIMESTAMP;
                int i24 = iArr2[i23];
                if (i24 < 0) {
                    if (i24 == -2) {
                        if (i17 != -8) {
                            if (i17 != -6) {
                                if (i17 != -4) {
                                    if (i17 != -2) {
                                        dmk.n("Unreachable");
                                        return null;
                                    }
                                } else if (base64$PaddingOption != Base64$PaddingOption.ABSENT) {
                                    int i25 = i15 + 1;
                                    if (z) {
                                        while (i25 < length4) {
                                            if (g81.b[bArr[i25] & MessagePack.Code.EXT_TIMESTAMP] != -1) {
                                                break;
                                            }
                                            i25++;
                                        }
                                    }
                                    if (i25 != length4 && bArr[i25] == 61) {
                                        i15 = i25 + 1;
                                        i6 = i18;
                                        i11 = -2;
                                    } else {
                                        dmk.v(ace.f(i25, "Missing one pad character at index "));
                                        return null;
                                    }
                                } else {
                                    dmk.v(ace.f(i15, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                    return null;
                                }
                            } else if (base64$PaddingOption == Base64$PaddingOption.ABSENT) {
                                dmk.v(ace.f(i15, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                return null;
                            }
                            i15++;
                            i6 = i18;
                            i11 = -2;
                        } else {
                            dmk.v(ace.f(i15, "Redundant pad character at index "));
                            return null;
                        }
                    } else {
                        c = '=';
                        if (z) {
                            i15++;
                            i10 = i18;
                        } else {
                            StringBuilder sb = new StringBuilder("Invalid symbol '");
                            sb.append((char) i23);
                            sb.append("'(");
                            String num = Integer.toString(i23, CharsKt.checkRadix(8));
                            num.getClass();
                            sb.append(num);
                            dmk.v(hdi.l(i15, ") at index ", sb));
                            return null;
                        }
                    }
                } else {
                    c = '=';
                    i15++;
                    i16 = (i16 << 6) | i24;
                    int i26 = i17 + 6;
                    if (i26 >= 0) {
                        bArr3[i8] = (byte) (i16 >>> i26);
                        i16 &= (i18 << i26) - 1;
                        i17 -= 2;
                        i10 = i18;
                        i8++;
                    } else {
                        i10 = i18;
                        i17 = i26;
                    }
                }
                iArr = iArr2;
                i11 = -2;
                i14 = -8;
            } else {
                i6 = 0;
                break;
            }
        }
    }

    public static String b(e81 e81Var, byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2;
        int length = bArr.length;
        e81Var.getClass();
        Base64$PaddingOption base64$PaddingOption = e81Var.d;
        bArr.getClass();
        int length2 = bArr.length;
        h3 h3Var = l3.a;
        h3Var.getClass();
        h3.a(0, length, length2);
        int c = e81Var.c(length);
        byte[] bArr3 = new byte[c];
        int length3 = bArr.length;
        h3Var.getClass();
        h3.a(0, length, length3);
        int c2 = e81Var.c(length);
        if (c >= 0) {
            if (c2 >= 0 && c2 <= c) {
                if (e81Var.a) {
                    bArr2 = g81.c;
                } else {
                    bArr2 = g81.a;
                }
                if (e81Var.b) {
                    i = e81Var.e;
                } else {
                    i = bd0.API_PRIORITY_OTHER;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2 = i3 + 2;
                    if (i2 >= length) {
                        break;
                    }
                    int min = Math.min((length - i3) / 3, i);
                    for (int i5 = 0; i5 < min; i5++) {
                        int i6 = bArr[i3] & MessagePack.Code.EXT_TIMESTAMP;
                        int i7 = i3 + 2;
                        int i8 = bArr[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP;
                        i3 += 3;
                        int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & MessagePack.Code.EXT_TIMESTAMP);
                        bArr3[i4] = bArr2[i9 >>> 18];
                        bArr3[i4 + 1] = bArr2[(i9 >>> 12) & 63];
                        int i10 = i4 + 3;
                        bArr3[i4 + 2] = bArr2[(i9 >>> 6) & 63];
                        i4 += 4;
                        bArr3[i10] = bArr2[i9 & 63];
                    }
                    if (min == i && i3 != length) {
                        int i11 = i4 + 1;
                        byte[] bArr4 = g;
                        bArr3[i4] = bArr4[0];
                        i4 += 2;
                        bArr3[i11] = bArr4[1];
                    }
                }
                int i12 = length - i3;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = ((bArr[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 2) | ((bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << 10);
                        bArr3[i4] = bArr2[i13 >>> 12];
                        int i14 = i4 + 2;
                        bArr3[i4 + 1] = bArr2[(i13 >>> 6) & 63];
                        int i15 = i4 + 3;
                        bArr3[i14] = bArr2[i13 & 63];
                        if (base64$PaddingOption == Base64$PaddingOption.PRESENT || base64$PaddingOption == Base64$PaddingOption.PRESENT_OPTIONAL) {
                            bArr3[i15] = 61;
                        }
                        i3 = i2;
                    }
                } else {
                    int i16 = i3 + 1;
                    int i17 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << 4;
                    bArr3[i4] = bArr2[i17 >>> 6];
                    int i18 = i4 + 2;
                    bArr3[i4 + 1] = bArr2[i17 & 63];
                    if (base64$PaddingOption == Base64$PaddingOption.PRESENT || base64$PaddingOption == Base64$PaddingOption.PRESENT_OPTIONAL) {
                        bArr3[i18] = 61;
                        bArr3[i4 + 3] = 61;
                    }
                    i3 = i16;
                }
                if (i3 == length) {
                    return new String(bArr3, Charsets.f);
                }
                dmk.n("Check failed.");
                return null;
            }
            f27.m(woa.l(c, c2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
            return null;
        }
        f27.m(ace.f(c, "destination offset: 0, destination size: "));
        return null;
    }

    public final int c(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int i5 = i2 * 4;
        if (i3 != 0) {
            Base64$PaddingOption base64$PaddingOption = Base64$PaddingOption.PRESENT;
            Base64$PaddingOption base64$PaddingOption2 = this.d;
            if (base64$PaddingOption2 != base64$PaddingOption && base64$PaddingOption2 != Base64$PaddingOption.PRESENT_OPTIONAL) {
                i4 = i3 + 1;
            }
            i5 += i4;
        }
        if (i5 >= 0) {
            if (this.b) {
                i5 += ((i5 - 1) / this.c) * 2;
            }
            if (i5 >= 0) {
                return i5;
            }
            dmk.v("Input is too big");
            return 0;
        }
        dmk.v("Input is too big");
        return 0;
    }
}
