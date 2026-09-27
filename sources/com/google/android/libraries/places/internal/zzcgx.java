package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcgx extends zzcac {
    private final zzbxv zza;
    private final zzbzy zzb;
    private final zzccd zzc;

    public zzcgx(zzbxv zzbxvVar, zzbzy zzbzyVar, zzccd zzccdVar) {
        Objects.requireNonNull(zzbxvVar, "state");
        this.zza = zzbxvVar;
        Objects.requireNonNull(zzbzyVar, "picker");
        this.zzb = zzbzyVar;
        Objects.requireNonNull(zzccdVar, "acceptAddressesStatus");
        this.zzc = zzccdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbzp
    public final zzcaa zza(zzbzr zzbzrVar) {
        return new zzcgw(this, zzbzrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcac
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcac
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzcac
    public final String zzd() {
        return "fixed_picker_lb_internal";
    }

    public final /* synthetic */ zzbxv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzbzy zzg() {
        return this.zzb;
    }

    public final /* synthetic */ zzccd zzh() {
        return this.zzc;
    }
}
