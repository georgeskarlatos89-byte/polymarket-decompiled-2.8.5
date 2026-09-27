package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AddressDescriptor implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public AddressDescriptor build() {
            List zza = zza();
            if (zza != null) {
                setLandmarks(jr9.m(zza));
            }
            List zzb = zzb();
            if (zzb != null) {
                setAreas(jr9.m(zzb));
            }
            return zzc();
        }

        public abstract Builder setAreas(List<Area> list);

        public abstract Builder setLandmarks(List<Landmark> list);

        public abstract List zza();

        public abstract List zzb();

        public abstract AddressDescriptor zzc();
    }

    public static Builder builder() {
        return new zzf();
    }

    public abstract List<Area> getAreas();

    public abstract List<Landmark> getLandmarks();
}
