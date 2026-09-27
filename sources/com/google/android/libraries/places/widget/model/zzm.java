package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.model.SearchReviewsOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzm extends zzd {
    public static final Parcelable.Creator<zzm> CREATOR = new zzl();

    public zzm(String str, SearchReviewsOptions.RankPreference rankPreference) {
        super(str, rankPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getQuery());
        parcel.writeString(getRankPreference().name());
    }
}
