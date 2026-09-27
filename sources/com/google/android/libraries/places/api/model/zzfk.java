package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.Landmark;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfk extends zzay {
    public static final Parcelable.Creator<zzfk> CREATOR = new zzfj();

    public zzfk(String str, String str2, String str3, String str4, List list, Landmark.SpatialRelationship spatialRelationship, Double d, Double d2) {
        super(str, str2, str3, str4, list, spatialRelationship, d, d2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (getResourceName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getResourceName());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        if (getDisplayName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayName());
        }
        if (getDisplayNameLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisplayNameLanguageCode());
        }
        parcel.writeList(getTypes());
        if (getSpatialRelationship() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSpatialRelationship().name());
        }
        if (getStraightLineDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getStraightLineDistanceMeters().doubleValue());
        }
        if (getTravelDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getTravelDistanceMeters().doubleValue());
        }
    }
}
