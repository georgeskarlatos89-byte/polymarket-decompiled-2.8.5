package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzabk extends zzabm {
    private static char[] zzd(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        dmk.i("Cannot increase internal buffer any further");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzabm
    public String zza(String str) {
        throw null;
    }

    public abstract char[] zzb(char c);

    public final String zzc(String str, int i) {
        int length = str.length();
        char[] zza = zzabs.zza();
        int length2 = zza.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = i + 1;
            char[] zzb = zzb(str.charAt(i));
            if (zzb != null) {
                int i5 = i - i2;
                int i6 = i3 + i5;
                int length3 = zzb.length;
                int i7 = i6 + length3;
                if (length2 < i7) {
                    int i8 = length - i;
                    length2 = i8 + i8 + i7;
                    zza = zzd(zza, i3, length2);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, zza, i3);
                    i3 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(zzb, 0, zza, i3, length3);
                    i3 += length3;
                }
                i2 = i4;
            }
            i = i4;
        }
        int i9 = length - i2;
        if (i9 > 0) {
            int i10 = i9 + i3;
            if (length2 < i10) {
                zza = zzd(zza, i3, i10);
            }
            str.getChars(i2, length, zza, i3);
            i3 = i10;
        }
        return new String(zza, 0, i3);
    }
}
