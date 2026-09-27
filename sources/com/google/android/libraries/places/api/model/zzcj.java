package com.google.android.libraries.places.api.model;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcj extends zzih {
    private zzig zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.model.zzih
    public final zzih zza(zzig zzigVar) {
        this.zza = zzigVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzih
    public final zzih zzb(List list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzih
    public final List zzc() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzih
    public final zzii zzd() {
        return new zzgy(this.zza, this.zzb);
    }
}
