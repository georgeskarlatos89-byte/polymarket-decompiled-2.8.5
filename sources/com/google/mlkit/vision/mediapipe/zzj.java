package com.google.mlkit.vision.mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzj implements MediaPipeInput {
    private final ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzj(ByteBuffer byteBuffer, int i, int i2, long j) {
        this.zza = byteBuffer;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
        return this.zzd;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final zzhv zzb(zzhl zzhlVar) {
        return zzhlVar.zzf(this.zza, this.zzb, this.zzc);
    }
}
