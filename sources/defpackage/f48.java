package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f48 implements Parcelable {
    public static final Parcelable.Creator<f48> CREATOR = new ci7(20);
    public final String a;
    public final String b;
    public final String c;

    public f48(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f48)) {
            return false;
        }
        f48 f48Var = (f48) obj;
        if (Intrinsics.areEqual(this.a, f48Var.a) && Intrinsics.areEqual(this.b, f48Var.b) && Intrinsics.areEqual(this.c, f48Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        return woa.r(m51.r("FinancialConnectionsSheetConfiguration(financialConnectionsSessionClientSecret=", this.a, ", publishableKey=", this.b, ", stripeAccountId="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
