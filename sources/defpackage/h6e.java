package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h6e extends d6e {
    public static final Parcelable.Creator<h6e> CREATOR = new i5e(18);
    public final e6e a;
    public final f6e b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final g6e g;
    public final String h;

    public h6e(e6e e6eVar, f6e f6eVar, String str, String str2, String str3, String str4, g6e g6eVar, String str5) {
        e6eVar.getClass();
        f6eVar.getClass();
        this.a = e6eVar;
        this.b = f6eVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = g6eVar;
        this.h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        if (this.a == h6eVar.a && this.b == h6eVar.b && Intrinsics.areEqual(this.c, h6eVar.c) && Intrinsics.areEqual(this.d, h6eVar.d) && Intrinsics.areEqual(this.e, h6eVar.e) && Intrinsics.areEqual(this.f, h6eVar.f) && Intrinsics.areEqual(this.g, h6eVar.g) && Intrinsics.areEqual(this.h, h6eVar.h)) {
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
        int hashCode6 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        g6e g6eVar = this.g;
        if (g6eVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = g6eVar.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("USBankAccount(accountHolderType=");
        sb.append(this.a);
        sb.append(", accountType=");
        sb.append(this.b);
        sb.append(", bankName=");
        k84.q(sb, this.c, ", fingerprint=", this.d, ", last4=");
        k84.q(sb, this.e, ", financialConnectionsAccount=", this.f, ", networks=");
        sb.append(this.g);
        sb.append(", routingNumber=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        g6e g6eVar = this.g;
        if (g6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            g6eVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
    }
}
