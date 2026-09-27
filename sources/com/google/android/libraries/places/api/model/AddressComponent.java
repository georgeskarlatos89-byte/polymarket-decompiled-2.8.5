package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.brn;
import defpackage.jr9;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AddressComponent implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public AddressComponent build() {
            AddressComponent zzc = zzc();
            brn.g("Name must not be empty.", !zzc.getName().isEmpty());
            List<String> types = zzc.getTypes();
            Iterator<String> it = types.iterator();
            while (it.hasNext()) {
                brn.g("Types must not contain null or empty values.", !TextUtils.isEmpty(it.next()));
            }
            zzb(jr9.m(types));
            return zzc();
        }

        public abstract String getShortName();

        public abstract Builder setShortName(String str);

        public abstract Builder zzb(List list);

        public abstract AddressComponent zzc();
    }

    public static Builder builder(String str, List<String> list) {
        zzc zzcVar = new zzc();
        zzcVar.zza(str);
        zzcVar.zzb(list);
        return zzcVar;
    }

    public abstract String getName();

    public abstract String getShortName();

    public abstract List<String> getTypes();
}
