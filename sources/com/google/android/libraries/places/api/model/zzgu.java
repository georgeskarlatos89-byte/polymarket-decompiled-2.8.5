package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgu extends zzcg {
    public static final Parcelable.Creator<zzgu> CREATOR = new zzgt();

    public zzgu(String str, String str2, String str3, String str4, String str5, Double d, AuthorAttribution authorAttribution, String str6, String str7, Uri uri, LocalDate localDate, Uri uri2) {
        super(str, str2, str3, str4, str5, d, authorAttribution, str6, str7, uri, localDate, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getRelativePublishTimeDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getRelativePublishTimeDescription());
        }
        if (getText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getText());
        }
        if (getTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTextLanguageCode());
        }
        if (getOriginalText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalText());
        }
        if (getOriginalTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalTextLanguageCode());
        }
        parcel.writeDouble(getRating().doubleValue());
        parcel.writeParcelable(getAuthorAttribution(), i);
        parcel.writeString(getAttribution());
        if (getPublishTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPublishTime());
        }
        parcel.writeParcelable(getFlagContentUri(), i);
        parcel.writeParcelable(getVisitDate(), i);
        parcel.writeParcelable(getGoogleMapsUri(), i);
    }
}
