package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class v5e extends d6e {
    public static final Parcelable.Creator<v5e> CREATOR = new i5e(8);
    public final r43 a;
    public final s5e b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final u5e i;
    public final lek j;
    public final t5e k;
    public final String l;
    public final r5e m;

    public v5e(r43 r43Var, s5e s5eVar, String str, Integer num, Integer num2, String str2, String str3, String str4, u5e u5eVar, lek lekVar, t5e t5eVar, String str5, r5e r5eVar) {
        r43Var.getClass();
        this.a = r43Var;
        this.b = s5eVar;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = u5eVar;
        this.j = lekVar;
        this.k = t5eVar;
        this.l = str5;
        this.m = r5eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5e)) {
            return false;
        }
        v5e v5eVar = (v5e) obj;
        if (this.a == v5eVar.a && Intrinsics.areEqual(this.b, v5eVar.b) && Intrinsics.areEqual(this.c, v5eVar.c) && Intrinsics.areEqual(this.d, v5eVar.d) && Intrinsics.areEqual(this.e, v5eVar.e) && Intrinsics.areEqual(this.f, v5eVar.f) && Intrinsics.areEqual(this.g, v5eVar.g) && Intrinsics.areEqual(this.h, v5eVar.h) && Intrinsics.areEqual(this.i, v5eVar.i) && Intrinsics.areEqual(this.j, v5eVar.j) && Intrinsics.areEqual(this.k, v5eVar.k) && Intrinsics.areEqual(this.l, v5eVar.l) && Intrinsics.areEqual(this.m, v5eVar.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = this.a.hashCode() * 31;
        int i = 0;
        s5e s5eVar = this.b;
        if (s5eVar == null) {
            hashCode = 0;
        } else {
            hashCode = s5eVar.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str3 = this.g;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str4 = this.h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        u5e u5eVar = this.i;
        if (u5eVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = Boolean.hashCode(u5eVar.a);
        }
        int i9 = (i8 + hashCode8) * 31;
        lek lekVar = this.j;
        if (lekVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = lekVar.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        t5e t5eVar = this.k;
        if (t5eVar == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = t5eVar.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str5 = this.l;
        if (str5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str5.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        r5e r5eVar = this.m;
        if (r5eVar != null) {
            i = r5eVar.hashCode();
        }
        return i12 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Card(brand=");
        sb.append(this.a);
        sb.append(", checks=");
        sb.append(this.b);
        sb.append(", country=");
        sb.append(this.c);
        sb.append(", expiryMonth=");
        sb.append(this.d);
        sb.append(", expiryYear=");
        sb.append(this.e);
        sb.append(", fingerprint=");
        sb.append(this.f);
        sb.append(", funding=");
        k84.q(sb, this.g, ", last4=", this.h, ", threeDSecureUsage=");
        sb.append(this.i);
        sb.append(", wallet=");
        sb.append(this.j);
        sb.append(", networks=");
        sb.append(this.k);
        sb.append(", displayBrand=");
        sb.append(this.l);
        sb.append(", cardArt=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        s5e s5eVar = this.b;
        if (s5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s5eVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num2);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        u5e u5eVar = this.i;
        if (u5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(u5eVar.a ? 1 : 0);
        }
        parcel.writeParcelable(this.j, i);
        t5e t5eVar = this.k;
        if (t5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            t5eVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.l);
        r5e r5eVar = this.m;
        if (r5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r5eVar.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ v5e(r43 r43Var, String str) {
        this(r43Var, null, null, null, null, null, null, str, null, null, null, null, null);
    }
}
