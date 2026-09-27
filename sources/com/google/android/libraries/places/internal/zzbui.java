package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzbui {
    public static final int zza(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i <= i2) {
            System.arraycopy(bytes, 0, bArr, i, length);
            return i + length;
        }
        throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
    }

    public static int zzb(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                try {
                    int i4 = zzbuk.zza;
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    throw new zzbuj(i2, length2);
                                }
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (zzbuj unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
