package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nu4 implements pu4 {
    public final su4 a;
    public final ru4 b;

    public nu4(su4 su4Var, ru4 ru4Var) {
        su4Var.getClass();
        ru4Var.getClass();
        this.a = su4Var;
        this.b = ru4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu4)) {
            return false;
        }
        nu4 nu4Var = (nu4) obj;
        if (Intrinsics.areEqual(this.a, nu4Var.a) && Intrinsics.areEqual(this.b, nu4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NextStep(confirmationOption=" + this.a + ", arguments=" + this.b + ")";
    }
}
