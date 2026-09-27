package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class PostalAddress implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public PostalAddress build() {
            List zza = zza();
            if (zza != null) {
                setAddressLines(jr9.m(zza));
            }
            List zzb = zzb();
            if (zzb != null) {
                setRecipients(jr9.m(zzb));
            }
            return zzc();
        }

        public abstract Builder setAddressLines(List<String> list);

        public abstract Builder setAdministrativeArea(String str);

        public abstract Builder setLanguageCode(String str);

        public abstract Builder setLocality(String str);

        public abstract Builder setOrganization(String str);

        public abstract Builder setPostalCode(String str);

        public abstract Builder setRecipients(List<String> list);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setSortingCode(String str);

        public abstract Builder setSublocality(String str);

        public abstract List zza();

        public abstract List zzb();

        public abstract PostalAddress zzc();
    }

    public static Builder builder(String str) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.setRegionCode(str);
        return zzbzVar;
    }

    public abstract List<String> getAddressLines();

    public abstract String getAdministrativeArea();

    public abstract String getLanguageCode();

    public abstract String getLocality();

    public abstract String getOrganization();

    public abstract String getPostalCode();

    public abstract List<String> getRecipients();

    public abstract String getRegionCode();

    public abstract String getSortingCode();

    public abstract String getSublocality();
}
