package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.model.SearchMediaOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzk(parcel.readString(), (SearchMediaOptions.RankPreference) Enum.valueOf(SearchMediaOptions.RankPreference.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
