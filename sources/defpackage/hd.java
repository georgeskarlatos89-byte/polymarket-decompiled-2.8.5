package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hd implements j8i, k8i {
    public static final Parcelable.Creator<hd> CREATOR = new z4l(5);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public hd(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        if (Intrinsics.areEqual(this.a, hdVar.a) && Intrinsics.areEqual(this.b, hdVar.b) && Intrinsics.areEqual(this.c, hdVar.c) && Intrinsics.areEqual(this.d, hdVar.d) && Intrinsics.areEqual(this.e, hdVar.e) && Intrinsics.areEqual(this.f, hdVar.f)) {
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
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 + i;
    }

    @Override // defpackage.k8i
    public final Map o0() {
        String str = "";
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair = new Pair("city", str2);
        String str3 = this.b;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair2 = new Pair("country", str3);
        String str4 = this.c;
        if (str4 == null) {
            str4 = "";
        }
        Pair pair3 = new Pair("line1", str4);
        String str5 = this.d;
        if (str5 == null) {
            str5 = "";
        }
        Pair pair4 = new Pair("line2", str5);
        String str6 = this.e;
        if (str6 == null) {
            str6 = "";
        }
        Pair pair5 = new Pair(PlaceTypes.POSTAL_CODE, str6);
        String str7 = this.f;
        if (str7 != null) {
            str = str7;
        }
        Map e = d1c.e(pair, pair2, pair3, pair4, pair5, new Pair("state", str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : e.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder r = m51.r("Address(city=", this.a, ", country=", this.b, ", line1=");
        k84.q(r, this.c, ", line2=", this.d, ", postalCode=");
        return sv6.p(r, this.e, ", state=", this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
