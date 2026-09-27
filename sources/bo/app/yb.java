package bo.app;

import defpackage.ej9;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yb implements na {
    public final y9 a;
    public final ej9 b;

    public yb(y9 y9Var, ej9 ej9Var) {
        y9Var.getClass();
        this.a = y9Var;
        this.b = ej9Var;
    }

    @Override // bo.app.na
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb)) {
            return false;
        }
        yb ybVar = (yb) obj;
        if (Intrinsics.areEqual(this.a, ybVar.a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.b, ybVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.b + ')';
    }
}
