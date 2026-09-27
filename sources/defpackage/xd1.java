package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xd1 {
    public final be1 a;

    public xd1(be1 be1Var) {
        this.a = be1Var;
    }

    public static boolean a(String str, lk8 lk8Var) {
        if (lk8Var == null) {
            return false;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = lk8Var.a;
        if (str3 != null) {
            str2 = str3;
        }
        return !Intrinsics.areEqual(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xd1) || !Intrinsics.areEqual(this.a, ((xd1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BillingDetailsEntry(billingDetailsFormState=" + this.a + ")";
    }
}
