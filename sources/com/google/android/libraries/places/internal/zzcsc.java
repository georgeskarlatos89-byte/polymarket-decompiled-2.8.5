package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.f27;
import defpackage.hdi;
import defpackage.k84;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcsc {
    String zza;
    String zzb;
    int zzc = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0091, code lost:
    
        if ((r12 - r10) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0093, code lost:
    
        r3[r7] = (byte) r14;
        r11 = r17;
        r7 = r7 + 1;
        r10 = r12;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InetAddress zzf(String str, int i, int i2) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        InetAddress inetAddress3;
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = 1;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            InetAddress inetAddress4 = null;
            if (i4 >= i2) {
                break;
            }
            if (i7 == 16) {
                return null;
            }
            int i8 = i4 + 2;
            if (i8 <= i2 && str.regionMatches(i4, "::", i3, 2)) {
                if (i5 != -1) {
                    return null;
                }
                i7 += 2;
                if (i8 == i2) {
                    i5 = i7;
                    break;
                }
                i5 = i7;
                inetAddress2 = null;
                i6 = i8;
            } else if (i7 != 0) {
                if (str.regionMatches(i4, ":", i3, 1)) {
                    i6 = i4 + 1;
                    inetAddress2 = null;
                } else {
                    if (!str.regionMatches(i4, ".", i3, 1)) {
                        return null;
                    }
                    int i9 = i7 - 2;
                    int i10 = i9;
                    while (i6 < i2) {
                        if (i10 != 16) {
                            if (i10 != i9) {
                                if (str.charAt(i6) == '.') {
                                    i6++;
                                }
                            }
                            int i11 = i3;
                            int i12 = i6;
                            while (true) {
                                if (i12 < i2) {
                                    char charAt = str.charAt(i12);
                                    inetAddress3 = inetAddress4;
                                    if (charAt < '0' || charAt > '9') {
                                        break;
                                    }
                                    if (i11 == 0) {
                                        if (i6 == i12) {
                                            i11 = i3;
                                        } else {
                                            return inetAddress3;
                                        }
                                    }
                                    i11 = k84.a(i11, 10, charAt, -48);
                                    if (i11 <= 255) {
                                        i12++;
                                        inetAddress4 = inetAddress3;
                                        i3 = 0;
                                    } else {
                                        return inetAddress3;
                                    }
                                } else {
                                    inetAddress3 = inetAddress4;
                                    break;
                                }
                            }
                        }
                        return inetAddress4;
                    }
                    inetAddress = inetAddress4;
                    if (i10 == i7 + 2) {
                        i7 += 2;
                    } else {
                        return inetAddress;
                    }
                }
            } else {
                inetAddress2 = null;
                i6 = i4;
            }
            i4 = i6;
            int i13 = 0;
            while (i4 < i2) {
                int zzd = zzcsd.zzd(str.charAt(i4));
                if (zzd == -1) {
                    break;
                }
                i4++;
                i13 = (i13 << 4) + zzd;
            }
            int i14 = i4 - i6;
            if (i14 == 0 || i14 > 4) {
                break;
            }
            int i15 = i7 + 1;
            bArr[i7] = (byte) ((i13 >>> 8) & 255);
            i7 += 2;
            bArr[i15] = (byte) (i13 & 255);
            i3 = 0;
        }
        if (i7 != 16) {
            if (i5 == -1) {
                return inetAddress;
            }
            int i16 = i7 - i5;
            System.arraycopy(bArr, i5, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i5, (16 - i7) + i5, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            f27.p();
            return inetAddress;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.zzb);
            sb.append(']');
        } else {
            sb.append(this.zzb);
        }
        int zzd = zzd();
        if (zzd != zzcsd.zzc(this.zza)) {
            sb.append(':');
            sb.append(zzd);
        }
        return sb.toString();
    }

    public final zzcsc zza(String str) {
        this.zza = "https";
        return this;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [tp1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [tp1, java.lang.Object] */
    public final zzcsc zzb(String str) {
        int i;
        String substring;
        String str2;
        int i2;
        if (str != null) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int length = str.length();
                i = -1;
                if (i4 < length) {
                    if (str.charAt(i4) != '%') {
                        i4++;
                    } else {
                        ?? obj = new Object();
                        obj.C0(0, i4, str);
                        while (i4 < length) {
                            int codePointAt = str.codePointAt(i4);
                            if (codePointAt == 37) {
                                int i5 = i4 + 2;
                                if (i5 < length) {
                                    int zzd = zzcsd.zzd(str.charAt(i4 + 1));
                                    int zzd2 = zzcsd.zzd(str.charAt(i5));
                                    if (zzd != -1 && zzd2 != -1) {
                                        obj.i0((zzd << 4) + zzd2);
                                        i4 = i5;
                                        codePointAt = 37;
                                        i4 += Character.charCount(codePointAt);
                                    }
                                }
                                codePointAt = 37;
                            }
                            obj.I0(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                        substring = obj.R();
                    }
                } else {
                    substring = str.substring(0, length);
                    break;
                }
            }
            if (substring.startsWith("[") && substring.endsWith("]")) {
                InetAddress zzf = zzf(substring, 1, substring.length() - 1);
                if (zzf != null) {
                    byte[] address = zzf.getAddress();
                    if (address.length == 16) {
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < address.length) {
                            int i8 = i6;
                            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                                i8 += 2;
                            }
                            int i9 = i8 - i6;
                            if (i9 > i7) {
                                i2 = i9;
                            } else {
                                i2 = i7;
                            }
                            if (i9 > i7) {
                                i = i6;
                            }
                            i6 = i8 + 2;
                            i7 = i2;
                        }
                        ?? obj2 = new Object();
                        while (i3 < address.length) {
                            if (i3 == i) {
                                obj2.i0(58);
                                i3 += i7;
                                if (i3 == 16) {
                                    obj2.i0(58);
                                }
                            } else {
                                if (i3 > 0) {
                                    obj2.i0(58);
                                }
                                obj2.m0(((address[i3] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (address[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP));
                                i3 += 2;
                            }
                        }
                        str2 = obj2.R();
                    } else {
                        f27.p();
                        return null;
                    }
                }
                str2 = null;
                break;
            }
            try {
                String lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (i3 < lowerCase.length()) {
                        char charAt = lowerCase.charAt(i3);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                            i3++;
                        }
                    }
                    str2 = lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            str2 = null;
            break;
            if (str2 != null) {
                this.zzb = str2;
                return this;
            }
            dmk.v("unexpected host: ".concat(str));
            return null;
        }
        dmk.v("host == null");
        return null;
    }

    public final zzcsc zzc(int i) {
        if (i > 0 && i <= 65535) {
            this.zzc = i;
            return this;
        }
        dmk.v(hdi.l(i, "unexpected port: ", new StringBuilder(String.valueOf(i).length() + 17)));
        return null;
    }

    public final int zzd() {
        int i = this.zzc;
        if (i != -1) {
            return i;
        }
        return zzcsd.zzc(this.zza);
    }

    public final zzcsd zze() {
        if (this.zza != null) {
            if (this.zzb != null) {
                return new zzcsd(this, null);
            }
            dmk.n("host == null");
            return null;
        }
        dmk.n("scheme == null");
        return null;
    }
}
