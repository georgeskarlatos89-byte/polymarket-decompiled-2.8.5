package com.google.mlkit.vision.segmentation.internal;

import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzqr;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzqs;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzqu;
import com.google.mlkit.vision.segmentation.selfie.SelfieSegmenterOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzc {
    public static zzqu zza(SelfieSegmenterOptions selfieSegmenterOptions) {
        zzqr zzqrVar = new zzqr();
        if (selfieSegmenterOptions.zzb() == 1) {
            zzqrVar.zza(zzqs.STREAM);
        } else {
            zzqrVar.zza(zzqs.SINGLE_IMAGE);
        }
        zzqrVar.zzc(Float.valueOf(selfieSegmenterOptions.zza()));
        zzqrVar.zzb(Boolean.valueOf(selfieSegmenterOptions.zzd()));
        return zzqrVar.zze();
    }
}
