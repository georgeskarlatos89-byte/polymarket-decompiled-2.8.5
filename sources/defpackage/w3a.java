package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w3a implements Parcelable {
    public static final Parcelable.Creator<w3a> CREATOR = new hl9(24);
    public static final w3a e = new w3a("", "", "", null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w3a(String str, String str2, String str3, String str4) {
        g.x(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3a)) {
            return false;
        }
        w3a w3aVar = (w3a) obj;
        if (Intrinsics.areEqual(this.a, w3aVar.a) && Intrinsics.areEqual(this.b, w3aVar.b) && Intrinsics.areEqual(this.c, w3aVar.c) && Intrinsics.areEqual(this.d, w3aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e2 = hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e2 + hashCode;
    }

    public final String toString() {
        return sv6.p(m51.r("IntentData(clientSecret=", this.a, ", sourceId=", this.b, ", publishableKey="), this.c, ", accountId=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
