package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gkh implements hkh {
    public final String a;
    public final String b;

    public gkh(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkh)) {
            return false;
        }
        gkh gkhVar = (gkh) obj;
        if (Intrinsics.areEqual(this.a, gkhVar.a) && Intrinsics.areEqual(this.b, gkhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return hdi.p("Avatar(userId=", this.a, ", avatarUrl=", this.b, ")");
    }
}
