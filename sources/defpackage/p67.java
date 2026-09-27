package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p67 implements t67 {
    public final be1 a;

    public p67(be1 be1Var) {
        this.a = be1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof p67) || !Intrinsics.areEqual(this.a, ((p67) obj).a)) {
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
        return "BillingDetailsChanged(billingDetailsFormState=" + this.a + ")";
    }
}
