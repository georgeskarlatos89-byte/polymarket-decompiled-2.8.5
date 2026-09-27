package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m3e implements Parcelable {
    public static final Parcelable.Creator<m3e> CREATOR = new pzd(18);
    public final String a;
    public final int b;
    public final s6i c;
    public final boolean d;
    public final String e;
    public final keh f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m3e(String str, int i, s6i s6iVar, boolean z, String str2, String str3, int i2) {
        this(str, i, s6iVar, z, str2, (keh) null, r10);
        String str4;
        str = (i2 & 1) != 0 ? null : str;
        i = (i2 & 2) != 0 ? 0 : i;
        s6iVar = (i2 & 4) != 0 ? null : s6iVar;
        z = (i2 & 8) != 0 ? false : z;
        str2 = (i2 & 16) != 0 ? null : str2;
        if ((i2 & 64) != 0) {
            str4 = null;
        } else {
            str4 = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Bundle e() {
        return ein.a(new Pair("extra_args", this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3e)) {
            return false;
        }
        m3e m3eVar = (m3e) obj;
        if (Intrinsics.areEqual(this.a, m3eVar.a) && this.b == m3eVar.b && Intrinsics.areEqual(this.c, m3eVar.c) && this.d == m3eVar.d && Intrinsics.areEqual(this.e, m3eVar.e) && Intrinsics.areEqual(this.f, m3eVar.f) && Intrinsics.areEqual(this.g, m3eVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode * 31) + this.b) * 31;
        s6i s6iVar = this.c;
        if (s6iVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s6iVar.hashCode();
        }
        int g = hdi.g((i2 + hashCode2) * 31, 31, this.d);
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (g + hashCode3) * 31;
        keh kehVar = this.f;
        if (kehVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = kehVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder q = m51.q("Unvalidated(clientSecret=", this.a, ", flowOutcome=", this.b, ", exception=");
        q.append(this.c);
        q.append(", canCancelSource=");
        q.append(this.d);
        q.append(", sourceId=");
        q.append(this.e);
        q.append(", source=");
        q.append(this.f);
        q.append(", stripeAccountId=");
        return woa.r(q, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeSerializable(this.c);
        Integer num = 1;
        if (!this.d) {
            num = null;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
    }

    public m3e(String str, int i, s6i s6iVar, boolean z, String str2, keh kehVar, String str3) {
        this.a = str;
        this.b = i;
        this.c = s6iVar;
        this.d = z;
        this.e = str2;
        this.f = kehVar;
        this.g = str3;
    }
}
