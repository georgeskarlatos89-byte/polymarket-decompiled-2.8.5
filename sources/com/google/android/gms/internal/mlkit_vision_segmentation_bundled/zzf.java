package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzf {
    private final String zza;
    private final zzd zzb;
    private zzd zzc;

    public /* synthetic */ zzf(String str, zze zzeVar) {
        zzd zzdVar = new zzd();
        this.zzb = zzdVar;
        this.zzc = zzdVar;
        this.zza = "SelfieSegmenterOptions";
    }

    private final zzf zze(String str, Object obj) {
        zzc zzcVar = new zzc(null);
        this.zzc.zzc = zzcVar;
        this.zzc = zzcVar;
        zzcVar.zzb = obj;
        zzcVar.zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzd zzdVar = this.zzb.zzc;
        String str = "";
        while (zzdVar != null) {
            Object obj = zzdVar.zzb;
            sb.append(str);
            String str2 = zzdVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            } else {
                sb.append(obj);
            }
            zzdVar = zzdVar.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzf zza(String str, float f) {
        zze("StreamModeSmoothingRatio", String.valueOf(f));
        return this;
    }

    public final zzf zzb(String str, int i) {
        zze("DetectorMode", String.valueOf(i));
        return this;
    }

    public final zzf zzc(String str, Object obj) {
        zzd zzdVar = new zzd();
        this.zzc.zzc = zzdVar;
        this.zzc = zzdVar;
        zzdVar.zzb = obj;
        zzdVar.zza = "executor";
        return this;
    }

    public final zzf zzd(String str, boolean z) {
        zze("isRawSizeMaskEnabled", String.valueOf(z));
        return this;
    }
}
