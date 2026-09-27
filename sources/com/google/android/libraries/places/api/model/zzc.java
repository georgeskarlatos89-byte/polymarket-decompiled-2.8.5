package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressComponent;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzc extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List zzc;

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(String str) {
        this.zzb = str;
        return this;
    }

    public final AddressComponent.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null name");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder zzb(List list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        dmk.s("Null types");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new zzdk(str, this.zzb, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" name");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
