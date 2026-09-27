package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f7i extends y7i {
    public static final f7i a = new Object();
    public static final Parcelable.Creator<f7i> CREATOR = new huh(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof f7i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1031794127;
    }

    public final String toString() {
        return "BlikAuthorize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
