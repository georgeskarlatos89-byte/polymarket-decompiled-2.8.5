package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;
import java.time.Instant;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfy extends zzbl {
    public static final Parcelable.Creator<zzfy> CREATOR = new zzfx();

    public zzfy(OpeningHours.HoursType hoursType, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        super(hoursType, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getHoursType(), i);
        parcel.writeList(getPeriods());
        parcel.writeList(getSpecialDays());
        parcel.writeList(getWeekdayText());
        if (zza() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(zza().booleanValue() ? 1 : 0);
        }
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzb());
        }
        if (zzc() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzc());
        }
    }
}
