package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e8 implements f8 {
    public final ix4 a;
    public final boolean b;

    public e8(ix4 ix4Var, boolean z) {
        this.a = ix4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        if (Intrinsics.areEqual(this.a, e8Var.a) && this.b == e8Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ix4 ix4Var = this.a;
        if (ix4Var == null) {
            hashCode = 0;
        } else {
            hashCode = ix4Var.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "Verified(consentPresentation=" + this.a + ", meetsMinimumAuthenticationLevel=" + this.b + ")";
    }
}
