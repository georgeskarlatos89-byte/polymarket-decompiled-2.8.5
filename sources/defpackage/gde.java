package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gde implements Parcelable {
    public static final Parcelable.Creator<gde> CREATOR = new lce(11);
    public final String a;
    public final d3g b;
    public final boolean c;

    public gde(String str, d3g d3gVar, boolean z) {
        str.getClass();
        this.a = str;
        this.b = d3gVar;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gde)) {
            return false;
        }
        gde gdeVar = (gde) obj;
        if (Intrinsics.areEqual(this.a, gdeVar.a) && Intrinsics.areEqual(this.b, gdeVar.b) && this.c == gdeVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        d3g d3gVar = this.b;
        if (d3gVar == null) {
            hashCode = 0;
        } else {
            hashCode = d3gVar.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomPaymentMethod(id=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", disableBillingDetailCollection=");
        return ix2.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
