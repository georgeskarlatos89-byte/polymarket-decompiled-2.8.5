package com.google.mlkit.vision.mediapipe;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.dmk;
import defpackage.ix2;
import defpackage.k84;
import defpackage.woa;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zza extends MediaPipeGraphRunnerConfig {
    private final MlKitContext zza;
    private final String zzb;
    private final List zzc;
    private final List zzd;
    private final Map zze;
    private final Map zzf;

    public zza(MlKitContext mlKitContext, String str, List list, List list2, Map map, Map map2) {
        if (mlKitContext != null) {
            this.zza = mlKitContext;
            if (str != null) {
                this.zzb = str;
                if (list != null) {
                    this.zzc = list;
                    if (list2 != null) {
                        this.zzd = list2;
                        this.zze = map;
                        this.zzf = map2;
                        return;
                    }
                    dmk.s("Null outputStreamNameList");
                    throw null;
                }
                dmk.s("Null inputFrameStreamNameList");
                throw null;
            }
            dmk.s("Null graphConfigPath");
            throw null;
        }
        dmk.s("Null mlKitContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        Map map;
        Map map2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaPipeGraphRunnerConfig) {
            MediaPipeGraphRunnerConfig mediaPipeGraphRunnerConfig = (MediaPipeGraphRunnerConfig) obj;
            if (this.zza.equals(mediaPipeGraphRunnerConfig.zza()) && this.zzb.equals(mediaPipeGraphRunnerConfig.zzb()) && this.zzc.equals(mediaPipeGraphRunnerConfig.zzc()) && this.zzd.equals(mediaPipeGraphRunnerConfig.zzd()) && ((map = this.zze) != null ? map.equals(mediaPipeGraphRunnerConfig.zze()) : mediaPipeGraphRunnerConfig.zze() == null) && ((map2 = this.zzf) != null ? map2.equals(mediaPipeGraphRunnerConfig.zzf()) : mediaPipeGraphRunnerConfig.zzf() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
        Map map = this.zze;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        Map map2 = this.zzf;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        Map map = this.zzf;
        Map map2 = this.zze;
        List list = this.zzd;
        List list2 = this.zzc;
        String obj = this.zza.toString();
        String obj2 = list2.toString();
        String obj3 = list.toString();
        String valueOf = String.valueOf(map2);
        String valueOf2 = String.valueOf(map);
        StringBuilder s = ix2.s("MediaPipeGraphRunnerConfig{mlKitContext=", obj, ", graphConfigPath=");
        k84.q(s, this.zzb, ", inputFrameStreamNameList=", obj2, ", outputStreamNameList=");
        k84.q(s, obj3, ", assetRegistry=", valueOf, ", inputSidePackets=");
        return woa.r(s, valueOf2, "}");
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final MlKitContext zza() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final List zzc() {
        return this.zzc;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final List zzd() {
        return this.zzd;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final Map zze() {
        return this.zze;
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig
    public final Map zzf() {
        return this.zzf;
    }
}
