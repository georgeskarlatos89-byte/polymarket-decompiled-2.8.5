package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class gwn extends cfl {
    @Override // defpackage.cfl
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zvn zvnVar = null;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator<cwn> creator = cwn.CREATOR;
            int i3 = oil.a;
            if (parcel.readInt() != 0) {
                zvnVar = creator.createFromParcel(parcel);
            }
            oil.a(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        Parcelable.Creator<zvn> creator2 = zvn.CREATOR;
        int i4 = oil.a;
        if (parcel.readInt() != 0) {
            zvnVar = creator2.createFromParcel(parcel);
        }
        oil.a(parcel);
        zzb((zvn) zvnVar);
        return true;
    }

    public abstract void zzb(zvn zvnVar);
}
