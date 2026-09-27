package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.ace;
import defpackage.dmk;
import defpackage.f27;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzi {
    public static int zza(int i, int i2, String str) {
        String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                dmk.v(ace.f(i2, "negative size: "));
                return 0;
            }
            zza = zzj.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zza = zzj.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        f27.m(zze(i, i2, "index"));
        return 0;
    }

    public static void zzc(int i, int i2, int i3) {
        String zze;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zze = zzj.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zze = zze(i2, i3, "end index");
            }
        } else {
            zze = zze(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zze);
    }

    public static void zzd(boolean z, Object obj) {
        if (z) {
            return;
        }
        dmk.n((String) obj);
    }

    private static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzj.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzj.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }
}
