package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzbg extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set == null) {
            Set zza = zza();
            this.zza = zza;
            return zza;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set == null) {
            zzbe zzbeVar = new zzbe(this);
            this.zzb = zzbeVar;
            return zzbeVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection == null) {
            zzbf zzbfVar = new zzbf(this);
            this.zzc = zzbfVar;
            return zzbfVar;
        }
        return collection;
    }

    public abstract Set zza();
}
