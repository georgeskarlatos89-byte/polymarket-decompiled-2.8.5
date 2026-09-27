package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Period implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract Period build();

        public abstract TimeOfWeek getClose();

        public abstract TimeOfWeek getOpen();

        public abstract Builder setClose(TimeOfWeek timeOfWeek);

        public abstract Builder setOpen(TimeOfWeek timeOfWeek);
    }

    public static Builder builder() {
        return new zzbq();
    }

    public abstract TimeOfWeek getClose();

    public abstract TimeOfWeek getOpen();
}
