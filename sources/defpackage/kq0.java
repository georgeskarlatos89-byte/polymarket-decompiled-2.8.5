package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class kq0 implements mq0 {
    public static final kq0 a = new Object();
    public static final Parcelable.Creator<kq0> CREATOR = new xd0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof kq0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1556876417;
    }

    public final String toString() {
        return "NoResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
