package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zye {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public zye(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        z = (i & 4) != 0 ? true : z;
        str4 = (i & 16) != 0 ? null : str4;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zye)) {
            return false;
        }
        zye zyeVar = (zye) obj;
        if (Intrinsics.areEqual(this.a, zyeVar.a) && Intrinsics.areEqual(this.b, zyeVar.b) && this.c == zyeVar.c && Intrinsics.areEqual(this.d, zyeVar.d) && Intrinsics.areEqual(this.e, zyeVar.e) && this.f == zyeVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = hdi.g((hashCode3 + hashCode) * 31, 31, this.c);
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Boolean.hashCode(this.f) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("Actions(primaryTitle=", this.a, ", primaryValueText=", this.b, ", isPrimaryEnabled=");
        m51.y(", secondaryTitle=", this.d, ", secondaryValueText=", r, this.c);
        r.append(this.e);
        r.append(", showsShare=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
