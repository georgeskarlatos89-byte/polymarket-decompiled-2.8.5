package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class PhotoMetadata implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public PhotoMetadata build() {
            boolean z;
            PhotoMetadata zzd = zzd();
            int width = zzd.getWidth();
            boolean z2 = false;
            if (width >= 0) {
                z = true;
            } else {
                z = false;
            }
            brn.c(width, "Width must not be < 0, but was: %s.", z);
            int height = zzd.getHeight();
            if (height >= 0) {
                z2 = true;
            }
            brn.c(height, "Height must not be < 0, but was: %s.", z2);
            brn.g("PhotoReference must not be empty.", !zzd.zza().isEmpty());
            return zzd;
        }

        public abstract String getAttributions();

        public abstract AuthorAttributions getAuthorAttributions();

        public abstract Uri getFlagContentUri();

        public abstract int getHeight();

        public abstract int getWidth();

        public abstract Builder setAttributions(String str);

        public abstract Builder setAuthorAttributions(AuthorAttributions authorAttributions);

        public abstract Builder setFlagContentUri(Uri uri);

        public abstract Builder setHeight(int i);

        public abstract Builder setWidth(int i);

        public abstract Builder zzb(String str);

        public abstract Builder zzc(Uri uri);

        public abstract PhotoMetadata zzd();
    }

    public static Builder builder(String str) {
        zzbs zzbsVar = new zzbs();
        zzbsVar.zza(str);
        zzbsVar.setWidth(0);
        zzbsVar.setHeight(0);
        zzbsVar.setAttributions("");
        return zzbsVar;
    }

    public abstract String getAttributions();

    public abstract AuthorAttributions getAuthorAttributions();

    public abstract Uri getFlagContentUri();

    public abstract Uri getGoogleMapsUri();

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract String zza();

    public abstract String zzb();
}
