package com.google.mlkit.vision.mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzl implements MediaPipeInput {
    private final int zza;
    private final long zzb;

    public zzl(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final zzhv zzb(zzhl zzhlVar) {
        return zzhlVar.zzd(this.zza);
    }
}
