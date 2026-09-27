package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AutocompleteListDensity createFromParcel;
        AutocompleteUiIcon createFromParcel2;
        parcel.getClass();
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AutocompleteListDensity.CREATOR.createFromParcel(parcel);
        }
        AutocompleteListDensity autocompleteListDensity = createFromParcel;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = AutocompleteUiIcon.CREATOR.createFromParcel(parcel);
        }
        AutocompleteUiIcon autocompleteUiIcon = createFromParcel2;
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new AutocompleteUiCustomization(autocompleteListDensity, readString, autocompleteUiIcon, readString2, num, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteUiCustomization[i];
    }
}
