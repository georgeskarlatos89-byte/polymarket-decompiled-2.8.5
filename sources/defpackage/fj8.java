package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fj8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fj8(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj8)) {
            return false;
        }
        fj8 fj8Var = (fj8) obj;
        if (Intrinsics.areEqual(this.a, fj8Var.a) && Intrinsics.areEqual(this.b, fj8Var.b) && Intrinsics.areEqual(this.c, fj8Var.c) && Intrinsics.areEqual(this.d, fj8Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return sv6.p(m51.r("FootballLineupEntryUi(shortName=", this.a, ", positionTitle=", this.b, ", imageUrl="), this.c, ", darkImageUrl=", this.d, ")");
    }
}
