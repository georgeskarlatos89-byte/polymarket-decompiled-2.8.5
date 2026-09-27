package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbug {
    public static /* synthetic */ boolean zza(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zze(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        } else {
            dmk.A("Protocol message had invalid UTF-8.");
        }
    }

    public static /* synthetic */ void zzc(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zze(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zze(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        dmk.A("Protocol message had invalid UTF-8.");
    }

    public static /* synthetic */ void zzd(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zze(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        dmk.A("Protocol message had invalid UTF-8.");
    }

    private static boolean zze(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
