package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nle {
    public final String a;
    public final String b;
    public final String c;

    public nle(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str3 != null && str3.length() <= 0) {
            dmk.v("Pattern should not be empty. Set it to null if it's missing.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nle)) {
            return false;
        }
        nle nleVar = (nle) obj;
        if (Intrinsics.areEqual(this.a, nleVar.a) && Intrinsics.areEqual(this.b, nleVar.b) && Intrinsics.areEqual(this.c, nleVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = hdi.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        return woa.r(m51.r("Metadata(prefix=", this.a, ", regionCode=", this.b, ", pattern="), this.c, ")");
    }

    public /* synthetic */ nle(String str, String str2) {
        this(str, str2, null);
    }
}
