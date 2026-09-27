package com.google.android.libraries.places.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.widget.PlaceDetailsFragment;
import defpackage.woa;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbl implements Parcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new zzbk();
    private final List zza;

    public zzbl(List list) {
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
        if ((obj instanceof zzbl) && Intrinsics.areEqual(this.zza, ((zzbl) obj).zza)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzay.zza(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator s = woa.s(this.zza, parcel);
        while (s.hasNext()) {
            parcel.writeString(((PlaceDetailsFragment.Content) s.next()).name());
        }
    }

    public final List zza() {
        return this.zza;
    }
}
