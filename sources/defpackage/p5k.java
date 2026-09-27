package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p5k extends l48 {
    public static final Parcelable.Creator<p5k> CREATOR = new r7i(20);
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final f0f i;
    public final f0f j;

    public p5k(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, f0f f0fVar, f0f f0fVar2) {
        str.getClass();
        str7.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = f0fVar;
        this.j = f0fVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5k)) {
            return false;
        }
        p5k p5kVar = (p5k) obj;
        if (Intrinsics.areEqual(this.a, p5kVar.a) && this.b == p5kVar.b && Intrinsics.areEqual(this.c, p5kVar.c) && Intrinsics.areEqual(this.d, p5kVar.d) && Intrinsics.areEqual(this.e, p5kVar.e) && Intrinsics.areEqual(this.f, p5kVar.f) && Intrinsics.areEqual(this.g, p5kVar.g) && Intrinsics.areEqual(this.h, p5kVar.h) && Intrinsics.areEqual(this.i, p5kVar.i) && Intrinsics.areEqual(this.j, p5kVar.j)) {
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
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        int i3 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str5 = this.g;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int e = hdi.e((i7 + hashCode5) * 31, 31, this.h);
        f0f f0fVar = this.i;
        if (f0fVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f0fVar.hashCode();
        }
        int i8 = (e + hashCode6) * 31;
        f0f f0fVar2 = this.j;
        if (f0fVar2 != null) {
            i3 = f0fVar2.hashCode();
        }
        return i8 + i3;
    }

    public final String toString() {
        StringBuilder r = g.r("VenmoAccountNonce(string=", this.a, ", isDefault=", ", email=", this.b);
        k84.q(r, this.c, ", externalId=", this.d, ", firstName=");
        k84.q(r, this.e, ", lastName=", this.f, ", phoneNumber=");
        k84.q(r, this.g, ", username=", this.h, ", billingAddress=");
        r.append(this.i);
        r.append(", shippingAddress=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
    }
}
