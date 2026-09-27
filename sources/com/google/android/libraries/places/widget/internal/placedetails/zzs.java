package com.google.android.libraries.places.widget.internal.placedetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzawn;
import com.google.android.libraries.places.internal.zzawr;
import com.google.android.libraries.places.internal.zzaxy;
import com.google.android.libraries.places.internal.zzayh;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        boolean z3;
        parcel.getClass();
        zzawr zzawrVar = (zzawr) Enum.valueOf(zzawr.class, parcel.readString());
        zzayh zzb = zzayh.zzb(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add((zzawn) Enum.valueOf(zzawn.class, parcel.readString()));
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        zzaxy zza = zza.zza(parcel);
        zzaxy zza2 = zza.zza(parcel);
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new zzt(zzawrVar, zzb, arrayList, readInt2, valueOf, zza, zza2, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
