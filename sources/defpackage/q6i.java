package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q6i implements j8i, Serializable {
    public static final Parcelable.Creator<q6i> CREATOR = new huh(16);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q6i(String str, String str2, String str3, int i) {
        this(r3, r4, r5, null, r7, null, null, null);
        String str4;
        String str5;
        String str6;
        String str7;
        if ((i & 1) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = null;
        } else {
            str5 = "An improperly formatted error response was found.";
        }
        if ((i & 4) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6i)) {
            return false;
        }
        q6i q6iVar = (q6i) obj;
        if (Intrinsics.areEqual(this.a, q6iVar.a) && Intrinsics.areEqual(this.b, q6iVar.b) && Intrinsics.areEqual(this.c, q6iVar.c) && Intrinsics.areEqual(this.d, q6iVar.d) && Intrinsics.areEqual(this.e, q6iVar.e) && Intrinsics.areEqual(this.f, q6iVar.f) && Intrinsics.areEqual(this.g, q6iVar.g) && Intrinsics.areEqual(this.h, q6iVar.h)) {
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
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Map map = this.h;
        if (map != null) {
            i = map.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("StripeError(type=", this.a, ", message=", this.b, ", code=");
        k84.q(r, this.c, ", param=", this.d, ", declineCode=");
        k84.q(r, this.e, ", charge=", this.f, ", docUrl=");
        r.append(this.g);
        r.append(", extraFields=");
        r.append(this.h);
        r.append(")");
        return r.toString();
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
        parcel.writeString(this.g);
        Map map = this.h;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public q6i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = map;
    }
}
