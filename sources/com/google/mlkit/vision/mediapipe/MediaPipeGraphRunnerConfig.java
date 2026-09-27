package com.google.mlkit.vision.mediapipe;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class MediaPipeGraphRunnerConfig {
    public static MediaPipeGraphRunnerConfig create(MlKitContext mlKitContext, String str, List<String> list, List<String> list2, Map<String, String> map, Map<String, MediaPipeInput> map2) {
        return new zza(mlKitContext, str, list, list2, map, map2);
    }

    public abstract MlKitContext zza();

    public abstract String zzb();

    public abstract List zzc();

    public abstract List zzd();

    public abstract Map zze();

    public abstract Map zzf();
}
