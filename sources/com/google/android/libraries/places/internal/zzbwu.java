package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwu {
    private zzbww zza;
    private IdentityHashMap zzb;

    public /* synthetic */ zzbwu(zzbww zzbwwVar, byte[] bArr) {
        this.zza = zzbwwVar;
    }

    private final IdentityHashMap zzd(int i) {
        if (this.zzb == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.zza.zzd().size() + i);
            this.zzb = identityHashMap;
            identityHashMap.putAll(this.zza.zzd());
            this.zza = null;
        }
        return this.zzb;
    }

    public final zzbwu zza(zzbwv zzbwvVar, Object obj) {
        zzd(1).put(zzbwvVar, obj);
        return this;
    }

    public final zzbwu zzb(zzbwv zzbwvVar) {
        zzbww zzbwwVar = this.zza;
        if (zzbwwVar != null) {
            if (zzbwwVar.zzd().containsKey(zzbwvVar)) {
                zzd(0).remove(zzbwvVar);
            }
            return this;
        }
        this.zzb.remove(zzbwvVar);
        return this;
    }

    public final zzbww zzc() {
        if (this.zzb != null) {
            this.zza = new zzbww(this.zzb, null);
            this.zzb = null;
        }
        return this.zza;
    }
}
