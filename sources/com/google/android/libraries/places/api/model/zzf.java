package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressDescriptor;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzf extends AddressDescriptor.Builder {
    private List zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor.Builder
    public final AddressDescriptor.Builder setAreas(List<Area> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor.Builder
    public final AddressDescriptor.Builder setLandmarks(List<Landmark> list) {
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor.Builder
    public final List zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor.Builder
    public final List zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor.Builder
    public final AddressDescriptor zzc() {
        return new zzdo(this.zza, this.zzb);
    }
}
