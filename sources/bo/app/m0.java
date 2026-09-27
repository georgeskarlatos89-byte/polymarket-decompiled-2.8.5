package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m0 implements na {
    public final String a;
    public final y9 b;

    public m0(String str, y9 y9Var) {
        y9Var.getClass();
        this.a = str;
        this.b = y9Var;
    }

    @Override // bo.app.na
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (Intrinsics.areEqual(this.a, m0Var.a) && Intrinsics.areEqual(this.b, m0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.a + ", originalRequest=" + this.b + ')';
    }
}
