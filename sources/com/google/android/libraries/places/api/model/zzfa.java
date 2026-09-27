package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfa extends zzao {
    public static final Parcelable.Creator<zzfa> CREATOR = new zzez();

    public zzfa(ContentBlock contentBlock, ContentBlock contentBlock2, ContentBlock contentBlock3, ContentBlock contentBlock4, Uri uri, String str, String str2) {
        super(contentBlock, contentBlock2, contentBlock3, contentBlock4, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getOverview(), i);
        parcel.writeParcelable(getCoffee(), i);
        parcel.writeParcelable(getRestaurant(), i);
        parcel.writeParcelable(getStore(), i);
        parcel.writeParcelable(getFlagContentUri(), i);
        if (getDisclosureText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureText());
        }
        if (getDisclosureTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureTextLanguageCode());
        }
    }
}
