package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r5a extends t5a {
    public static final r5a a = new Object();
    public static final Parcelable.Creator<r5a> CREATOR = new hl9(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof r5a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -263131732;
    }

    public final String toString() {
        return "Completed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
