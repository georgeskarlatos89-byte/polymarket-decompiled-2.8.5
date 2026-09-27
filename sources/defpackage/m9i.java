package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m9i extends m81 {
    public static final Parcelable.Creator<m9i> CREATOR = new r7i(7);
    public String d;
    public String e;
    public String f;
    public String g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m9i) {
                m9i m9iVar = (m9i) obj;
                if (!Intrinsics.areEqual(this.d, m9iVar.d) || !Intrinsics.areEqual(this.e, m9iVar.e) || !Intrinsics.areEqual(this.f, m9iVar.f) || !Intrinsics.areEqual(this.g, m9iVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return bkn.b(this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.m81, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
