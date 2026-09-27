package com.google.android.libraries.places.api.net;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzag extends zzap {
    private List zza;

    @Override // com.google.android.libraries.places.api.net.zzap
    public final zzap zza(List list) {
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzap
    public final List zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.zzap
    public final zzaq zzc() {
        return new zzah(this.zza, null);
    }
}
