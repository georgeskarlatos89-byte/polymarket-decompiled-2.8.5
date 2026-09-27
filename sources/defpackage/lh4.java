package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lh4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;

    public lh4(String str, String str2, String str3, String str4, String str5) {
        k84.p(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh4)) {
            return false;
        }
        lh4 lh4Var = (lh4) obj;
        if (Intrinsics.areEqual(this.a, lh4Var.a) && Intrinsics.areEqual(this.b, lh4Var.b) && Intrinsics.areEqual(this.c, lh4Var.c) && Intrinsics.areEqual(this.d, lh4Var.d) && Intrinsics.areEqual(this.e, lh4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hdi.e(hdi.e(hdi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder r = m51.r("CommandInnerEntity(name=", this.a, ", description=", this.b, ", args=");
        k84.q(r, this.c, ", set=", this.d, ", channelType=");
        return woa.r(r, this.e, ")");
    }
}
