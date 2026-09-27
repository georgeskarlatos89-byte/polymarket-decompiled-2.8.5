package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzgo extends zzca {
    public static final Parcelable.Creator<zzgo> CREATOR = new zzgn();

    public zzgo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, list, list2, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getRegionCode());
        if (getLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLanguageCode());
        }
        if (getPostalCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPostalCode());
        }
        if (getSortingCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSortingCode());
        }
        if (getAdministrativeArea() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdministrativeArea());
        }
        if (getLocality() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getLocality());
        }
        if (getSublocality() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSublocality());
        }
        parcel.writeList(getAddressLines());
        parcel.writeList(getRecipients());
        if (getOrganization() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOrganization());
        }
    }
}
