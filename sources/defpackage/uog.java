package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uog extends yv8 {
    public final cw6 b;

    public uog(cw6 cw6Var) {
        this.b = cw6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uog) || !Intrinsics.areEqual(this.b, ((uog) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "EditPaymentMethod(paymentMethod=" + this.b + ")";
    }
}
