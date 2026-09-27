package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ContainingPlace;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzae extends ContainingPlace.Builder {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.api.model.ContainingPlace.Builder
    public final ContainingPlace build() {
        String str;
        String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null) {
            return new zzeq(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" resourceName");
        }
        if (this.zzb == null) {
            sb.append(" id");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.ContainingPlace.Builder
    public final ContainingPlace.Builder setId(String str) {
        if (str != null) {
            this.zzb = str;
            return this;
        }
        dmk.s("Null id");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.ContainingPlace.Builder
    public final ContainingPlace.Builder setResourceName(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null resourceName");
        return null;
    }
}
