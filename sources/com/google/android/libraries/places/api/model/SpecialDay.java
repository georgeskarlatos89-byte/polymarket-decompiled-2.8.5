package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class SpecialDay implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract SpecialDay build();

        public abstract LocalDate getDate();

        public abstract boolean isExceptional();

        public abstract Builder setDate(LocalDate localDate);

        public abstract Builder setExceptional(boolean z);
    }

    public static Builder builder(LocalDate localDate) {
        zzcu zzcuVar = new zzcu();
        zzcuVar.setDate(localDate);
        zzcuVar.setExceptional(false);
        return zzcuVar;
    }

    public abstract LocalDate getDate();

    public abstract boolean isExceptional();
}
