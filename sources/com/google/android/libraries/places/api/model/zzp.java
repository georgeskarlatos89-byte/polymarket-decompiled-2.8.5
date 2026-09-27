package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AuthorAttribution;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzp extends AuthorAttribution.Builder {
    private String zza;
    private String zzb;
    private String zzc;

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final String getUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setPhotoUri(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setUri(String str) {
        this.zzb = str;
        return this;
    }

    public final AuthorAttribution.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null name");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution zzb() {
        String str = this.zza;
        if (str != null) {
            return new zzdy(str, this.zzb, this.zzc);
        }
        dmk.n("Missing required properties: name");
        return null;
    }
}
