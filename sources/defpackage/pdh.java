package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pdh {
    public final gj7 a;

    public pdh(gj7 gj7Var) {
        this.a = gj7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pdh) && Intrinsics.areEqual(this.a, ((pdh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        gj7 gj7Var = this.a;
        if (gj7Var == null) {
            return 0;
        }
        return gj7Var.hashCode();
    }

    public final String toString() {
        return "SocketErrorMessage(error=" + this.a + ")";
    }
}
