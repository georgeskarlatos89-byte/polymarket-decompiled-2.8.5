package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k6 {
    public final y9 a;

    public k6(y9 y9Var) {
        y9Var.getClass();
        this.a = y9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k6) && Intrinsics.areEqual(this.a, ((k6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.a + ')';
    }
}
