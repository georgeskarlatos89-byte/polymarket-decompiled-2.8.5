package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jq0 implements mq0 {
    public static final jq0 a = new Object();
    public static final Parcelable.Creator<jq0> CREATOR = new xd0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof jq0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 689956928;
    }

    public final String toString() {
        return "Failed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
