package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbuk {
    public static final /* synthetic */ int zza = 0;

    static {
        int i = zzbqe.zza;
    }

    public static boolean zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65 || (b == -32 && b2 < -96)) {
                        return false;
                    }
                    if (b == -19 && b2 >= -96) {
                        return false;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return false;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                i = i3;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i7 <= i3 - 3) {
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            } else {
                if (i7 <= i3 - 4) {
                    i6++;
                    if (i6 != str.length()) {
                        char charAt3 = str.charAt(i6);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i8 = i7 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i8] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzbui.zza(str, bArr, i, i2);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                    return zzbui.zza(str, bArr, i, i2);
                }
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            i6++;
        }
        return i7;
    }

    public static String zzc(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 != 0) {
            int length = bArr.length;
            if ((((length - i) - i2) | i | i2) >= 0) {
                int i4 = i + i2;
                char[] cArr = new char[i2];
                int i5 = 0;
                while (i < i4) {
                    byte b = bArr[i];
                    if (!zzbug.zza(b)) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                int i6 = i5;
                while (i < i4) {
                    int i7 = i + 1;
                    byte b2 = bArr[i];
                    if (zzbug.zza(b2)) {
                        cArr[i6] = (char) b2;
                        i6++;
                        i = i7;
                        while (i < i4) {
                            byte b3 = bArr[i];
                            if (zzbug.zza(b3)) {
                                i++;
                                cArr[i6] = (char) b3;
                                i6++;
                            }
                        }
                    } else {
                        if (b2 < -32) {
                            if (i7 < i4) {
                                i3 = i6 + 1;
                                i += 2;
                                zzbug.zzb(b2, bArr[i7], cArr, i6);
                            } else {
                                dmk.A("Protocol message had invalid UTF-8.");
                                return null;
                            }
                        } else if (b2 < -16) {
                            if (i7 < i4 - 1) {
                                i3 = i6 + 1;
                                int i8 = i + 2;
                                i += 3;
                                zzbug.zzc(b2, bArr[i7], bArr[i8], cArr, i6);
                            } else {
                                dmk.A("Protocol message had invalid UTF-8.");
                                return null;
                            }
                        } else if (i7 < i4 - 2) {
                            byte b4 = bArr[i7];
                            int i9 = i + 3;
                            byte b5 = bArr[i + 2];
                            i += 4;
                            zzbug.zzd(b2, b4, b5, bArr[i9], cArr, i6);
                            i6 += 2;
                        } else {
                            dmk.A("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        i6 = i3;
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return "";
    }
}
