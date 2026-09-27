package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.SubDestination;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcw extends SubDestination.Builder {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination build() {
        String str;
        String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null) {
            return new zzhm(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" id");
        }
        if (this.zzb == null) {
            sb.append(" name");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setId(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null id");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setName(String str) {
        if (str != null) {
            this.zzb = str;
            return this;
        }
        dmk.s("Null name");
        return null;
    }
}
