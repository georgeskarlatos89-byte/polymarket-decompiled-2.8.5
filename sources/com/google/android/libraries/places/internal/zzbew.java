package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbew {
    final /* synthetic */ zzbez zza;
    private final Object zzb;
    private final LinkedHashMap zzc;
    private int zzd;

    public /* synthetic */ zzbew(zzbez zzbezVar, Object obj, byte[] bArr) {
        Objects.requireNonNull(zzbezVar);
        this.zza = zzbezVar;
        this.zzc = new LinkedHashMap();
        this.zzb = obj;
    }

    public final boolean zza() {
        if (this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzd()) {
            return true;
        }
        return false;
    }

    public final boolean zzb() {
        if (this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzf() + 1) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    public final /* synthetic */ LinkedHashMap zzd() {
        return this.zzc;
    }

    public final /* synthetic */ int zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(int i) {
        this.zzd = i;
    }
}
