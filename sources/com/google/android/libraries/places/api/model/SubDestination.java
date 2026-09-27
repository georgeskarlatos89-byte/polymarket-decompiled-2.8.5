package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SubDestination implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract SubDestination build();

        public abstract Builder setId(String str);

        public abstract Builder setName(String str);
    }

    public static SubDestination newInstance(String str, String str2) {
        zzcw zzcwVar = new zzcw();
        zzcwVar.setId(str);
        zzcwVar.setName(str2);
        return zzcwVar.build();
    }

    public abstract String getId();

    public abstract String getName();
}
