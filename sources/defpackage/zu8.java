package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zu8 extends arl {
    public final ak1 b;

    public zu8(ak1 ak1Var) {
        this.b = ak1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zu8) || !Intrinsics.areEqual(this.b, ((zu8) obj).b)) {
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
        return "Failure(exception=" + this.b + ")";
    }
}
