package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ContentBlock implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public ContentBlock build() {
            List zza = zza();
            if (zza != null) {
                setReferencedPlaceResourceNames(jr9.m(zza));
            }
            List zzb = zzb();
            if (zzb != null) {
                setReferencedPlaceIds(jr9.m(zzb));
            }
            return zzc();
        }

        public abstract Builder setContent(String str);

        public abstract Builder setContentLanguageCode(String str);

        public abstract Builder setReferencedPlaceIds(List<String> list);

        public abstract Builder setReferencedPlaceResourceNames(List<String> list);

        public abstract List zza();

        public abstract List zzb();

        public abstract ContentBlock zzc();
    }

    public static Builder builder() {
        return new zzag();
    }

    public abstract String getContent();

    public abstract String getContentLanguageCode();

    public abstract List<String> getReferencedPlaceIds();

    public abstract List<String> getReferencedPlaceResourceNames();
}
