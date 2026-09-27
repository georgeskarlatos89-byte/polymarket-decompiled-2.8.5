package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kzd extends l48 {
    public static final Parcelable.Creator<kzd> CREATOR = new ahc(27);
    public final String a;
    public final boolean b;
    public final String c;
    public final f0f d;
    public final f0f e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final xzd k;
    public final String l;
    public final String m;

    public kzd(String str, boolean z, String str2, f0f f0fVar, f0f f0fVar2, String str3, String str4, String str5, String str6, String str7, xzd xzdVar, String str8, String str9) {
        str.getClass();
        f0fVar.getClass();
        f0fVar2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = f0fVar;
        this.e = f0fVar2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = xzdVar;
        this.l = str8;
        this.m = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzd)) {
            return false;
        }
        kzd kzdVar = (kzd) obj;
        if (Intrinsics.areEqual(this.a, kzdVar.a) && this.b == kzdVar.b && Intrinsics.areEqual(this.c, kzdVar.c) && Intrinsics.areEqual(this.d, kzdVar.d) && Intrinsics.areEqual(this.e, kzdVar.e) && Intrinsics.areEqual(this.f, kzdVar.f) && Intrinsics.areEqual(this.g, kzdVar.g) && Intrinsics.areEqual(this.h, kzdVar.h) && Intrinsics.areEqual(this.i, kzdVar.i) && Intrinsics.areEqual(this.j, kzdVar.j) && Intrinsics.areEqual(this.k, kzdVar.k) && Intrinsics.areEqual(this.l, kzdVar.l) && Intrinsics.areEqual(this.m, kzdVar.m)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        int i3 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = hdi.e(hdi.e(hdi.e((this.e.hashCode() + ((this.d.hashCode() + ((i2 + hashCode) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int e2 = hdi.e((e + hashCode2) * 31, 31, this.j);
        xzd xzdVar = this.k;
        if (xzdVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xzdVar.hashCode();
        }
        int i4 = (e2 + hashCode3) * 31;
        String str3 = this.l;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.m;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder r = g.r("PayPalAccountNonce(string=", this.a, ", isDefault=", ", clientMetadataId=", this.b);
        r.append(this.c);
        r.append(", billingAddress=");
        r.append(this.d);
        r.append(", shippingAddress=");
        r.append(this.e);
        r.append(", firstName=");
        r.append(this.f);
        r.append(", lastName=");
        k84.q(r, this.g, ", phone=", this.h, ", email=");
        k84.q(r, this.i, ", payerId=", this.j, ", creditFinancing=");
        r.append(this.k);
        r.append(", authenticateUrl=");
        r.append(this.l);
        r.append(", paymentId=");
        return woa.r(r, this.m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        xzd xzdVar = this.k;
        if (xzdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xzdVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }
}
