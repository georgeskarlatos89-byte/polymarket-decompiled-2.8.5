package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AuthorAttribution implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public AuthorAttribution build() {
            brn.g("Name must not be empty.", !zzb().getName().isEmpty());
            return zzb();
        }

        public abstract String getPhotoUri();

        public abstract String getUri();

        public abstract Builder setPhotoUri(String str);

        public abstract Builder setUri(String str);

        public abstract AuthorAttribution zzb();
    }

    public static Builder builder(String str) {
        zzp zzpVar = new zzp();
        zzpVar.zza(str);
        return zzpVar;
    }

    public abstract String getName();

    public abstract String getPhotoUri();

    public abstract String getUri();
}
