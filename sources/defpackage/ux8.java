package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ux8 implements Parcelable {
    public static final Parcelable.Creator<ux8> CREATOR = new sm8(8);
    public final boolean a;
    public final tx8 b;
    public final boolean c;

    public ux8(boolean z, tx8 tx8Var, boolean z2) {
        tx8Var.getClass();
        this.a = z;
        this.b = tx8Var;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux8)) {
            return false;
        }
        ux8 ux8Var = (ux8) obj;
        if (this.a == ux8Var.a && this.b == ux8Var.b && this.c == ux8Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingAddressParameters(isRequired=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append(this.b);
        sb.append(", isPhoneNumberRequired=");
        return ix2.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
    }
}
