package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h8i extends m81 {
    public static final Parcelable.Creator<h8i> CREATOR = new r7i(4);
    public String d;
    public String e;
    public int f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h8i) {
                h8i h8iVar = (h8i) obj;
                if (!Intrinsics.areEqual(this.d, h8iVar.d) || !Intrinsics.areEqual(this.e, h8iVar.e) || this.f != h8iVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return bkn.b(this.d, this.e, Integer.valueOf(this.f));
    }

    @Override // defpackage.m81, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }
}
