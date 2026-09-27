package com.google.mlkit.vision.mediapipe;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzh implements MediaPipeInput {
    private final Bitmap zza;
    private final long zzb;

    public zzh(Bitmap bitmap, long j) {
        this.zza = bitmap;
        this.zzb = j;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final zzhv zzb(zzhl zzhlVar) {
        Bitmap.Config config = this.zza.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            if (Log.isLoggable("MediaPipeInputBitmap", 3)) {
                "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ".concat(String.valueOf(this.zza.getConfig()));
            }
            Bitmap bitmap = this.zza;
            return zzhlVar.zza(bitmap.copy(config2, bitmap.isMutable()));
        }
        return zzhlVar.zza(this.zza);
    }
}
