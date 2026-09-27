package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k0e {
    public final x0e a;
    public wo1 b = null;
    public String c = null;
    public final String d;
    public final String e;
    public final String f;

    public k0e(x0e x0eVar, String str, String str2, String str3) {
        this.a = x0eVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0e) {
                k0e k0eVar = (k0e) obj;
                if (!Intrinsics.areEqual(this.a, k0eVar.a) || !Intrinsics.areEqual(this.b, k0eVar.b) || !Intrinsics.areEqual(this.c, k0eVar.c) || !Intrinsics.areEqual(this.d, k0eVar.d) || !Intrinsics.areEqual(this.e, k0eVar.e) || !Intrinsics.areEqual(this.f, k0eVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        wo1 wo1Var = this.b;
        int i = 0;
        if (wo1Var == null) {
            hashCode = 0;
        } else {
            hashCode = wo1Var.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.f.hashCode() + ((i4 + i) * 31);
    }

    public final String toString() {
        wo1 wo1Var = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder("PayPalPaymentAuthRequestParams(payPalRequest=");
        sb.append(this.a);
        sb.append(", browserSwitchOptions=");
        sb.append(wo1Var);
        sb.append(", approvalUrl=");
        k84.q(sb, str, ", clientMetadataId=", this.d, ", contextId=");
        return sv6.p(sb, this.e, ", successUrl=", this.f, ")");
    }
}
