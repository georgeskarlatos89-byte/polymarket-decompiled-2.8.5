package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class TimeOfWeek implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract TimeOfWeek build();

        public abstract LocalDate getDate();

        public abstract DayOfWeek getDay();

        public abstract LocalTime getTime();

        public abstract boolean isTruncated();

        public abstract Builder setDate(LocalDate localDate);

        public abstract Builder setDay(DayOfWeek dayOfWeek);

        public abstract Builder setTime(LocalTime localTime);

        public abstract Builder setTruncated(boolean z);
    }

    public static Builder builder(DayOfWeek dayOfWeek, LocalTime localTime) {
        zzcy zzcyVar = new zzcy();
        zzcyVar.setDay(dayOfWeek);
        zzcyVar.setTime(localTime);
        zzcyVar.setTruncated(false);
        return zzcyVar;
    }

    public static TimeOfWeek newInstance(DayOfWeek dayOfWeek, LocalTime localTime) {
        return builder(dayOfWeek, localTime).build();
    }

    public abstract LocalDate getDate();

    public abstract DayOfWeek getDay();

    public abstract LocalTime getTime();

    public abstract boolean isTruncated();
}
