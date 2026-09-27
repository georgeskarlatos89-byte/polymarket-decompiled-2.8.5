package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.woa;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzq implements Parcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzp();
    private final List zza;

    public zzq(List list) {
        list.getClass();
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzq) && Intrinsics.areEqual(this.zza, ((zzq) obj).zza)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(list).length() + 43);
        sb.append("ParcelablePhotoPageDataList(photoPageData=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator s = woa.s(this.zza, parcel);
        while (s.hasNext()) {
            ((zze) s.next()).writeToParcel(parcel, i);
        }
    }

    public final List zza() {
        return this.zza;
    }
}
