package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzy implements zzbi {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        return zzn().equals(((zzbi) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbi
    public boolean zzm(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbi
    public final Map zzn() {
        Map map = this.zzb;
        if (map == null) {
            Map zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbi
    public final Set zzo() {
        Set set = this.zza;
        if (set == null) {
            Set zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return set;
    }
}
