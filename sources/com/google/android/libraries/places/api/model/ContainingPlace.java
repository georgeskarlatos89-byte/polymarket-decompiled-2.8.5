package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ContainingPlace implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract ContainingPlace build();

        public abstract Builder setId(String str);

        public abstract Builder setResourceName(String str);
    }

    public static Builder builder(String str, String str2) {
        zzae zzaeVar = new zzae();
        zzaeVar.setResourceName(str);
        zzaeVar.setId(str2);
        return zzaeVar;
    }

    public abstract String getId();

    public abstract String getResourceName();
}
