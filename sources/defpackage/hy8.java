package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hy8 implements Parcelable {
    public static final Parcelable.Creator<hy8> CREATOR = new sm8(15);
    public final sx8 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final gy8 e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public hy8(sx8 sx8Var, String str, String str2, boolean z, gy8 gy8Var, boolean z2, boolean z3, List list) {
        sx8Var.getClass();
        str.getClass();
        str2.getClass();
        gy8Var.getClass();
        list.getClass();
        this.a = sx8Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = gy8Var;
        this.f = z2;
        this.g = z3;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy8)) {
            return false;
        }
        hy8 hy8Var = (hy8) obj;
        if (this.a == hy8Var.a && Intrinsics.areEqual(this.b, hy8Var.b) && Intrinsics.areEqual(this.c, hy8Var.c) && this.d == hy8Var.d && Intrinsics.areEqual(this.e, hy8Var.e) && this.f == hy8Var.f && this.g == hy8Var.g && Intrinsics.areEqual(this.h, hy8Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + hdi.g(hdi.g((this.e.hashCode() + hdi.g(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(environment=");
        sb.append(this.a);
        sb.append(", merchantCountryCode=");
        sb.append(this.b);
        sb.append(", merchantName=");
        ace.A(this.c, ", isEmailRequired=", ", billingAddressConfig=", sb, this.d);
        sb.append(this.e);
        sb.append(", existingPaymentMethodRequired=");
        sb.append(this.f);
        sb.append(", allowCreditCards=");
        sb.append(this.g);
        sb.append(", additionalEnabledNetworks=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeStringList(this.h);
    }
}
