package com.google.android.libraries.places.api.net;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzy extends zzal {
    private List zza;

    @Override // com.google.android.libraries.places.api.net.zzal
    public final zzal zza(List list) {
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzal
    public final List zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.zzal
    public final zzam zzc() {
        return new zzz(this.zza, null);
    }
}
