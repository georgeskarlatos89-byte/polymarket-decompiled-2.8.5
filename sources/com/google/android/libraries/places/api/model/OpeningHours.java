package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.brn;
import defpackage.jr9;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class OpeningHours implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public OpeningHours build() {
            OpeningHours zzd = zzd();
            Iterator<String> it = zzd.getWeekdayText().iterator();
            while (it.hasNext()) {
                brn.g("WeekdayText must not contain null or empty values.", !TextUtils.isEmpty(it.next()));
            }
            setPeriods(jr9.m(zzd.getPeriods()));
            setWeekdayText(jr9.m(zzd.getWeekdayText()));
            setSpecialDays(jr9.m(zzd.getSpecialDays()));
            return zzd();
        }

        public abstract HoursType getHoursType();

        public abstract List<Period> getPeriods();

        public abstract List<SpecialDay> getSpecialDays();

        public abstract List<String> getWeekdayText();

        public abstract Builder setHoursType(HoursType hoursType);

        public abstract Builder setPeriods(List<Period> list);

        public abstract Builder setSpecialDays(List<SpecialDay> list);

        public abstract Builder setWeekdayText(List<String> list);

        public abstract Builder zza(Boolean bool);

        public abstract Builder zzb(Instant instant);

        public abstract Builder zzc(Instant instant);

        public abstract OpeningHours zzd();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum HoursType implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;

        public static final Parcelable.Creator<HoursType> CREATOR = new zzhy();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        zzbk zzbkVar = new zzbk();
        zzbkVar.setPeriods(new ArrayList());
        zzbkVar.setSpecialDays(new ArrayList());
        zzbkVar.setWeekdayText(new ArrayList());
        return zzbkVar;
    }

    public abstract HoursType getHoursType();

    public abstract List<Period> getPeriods();

    public abstract List<SpecialDay> getSpecialDays();

    public abstract List<String> getWeekdayText();

    public abstract Boolean zza();

    public abstract Instant zzb();

    public abstract Instant zzc();
}
