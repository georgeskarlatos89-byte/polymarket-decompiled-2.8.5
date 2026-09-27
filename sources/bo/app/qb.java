package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qb implements na {
    public final String a;
    public final y9 b;

    public qb(String str, y9 y9Var) {
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
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        if (Intrinsics.areEqual(this.a, qbVar.a) && Intrinsics.areEqual(this.b, qbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.a + ", originalRequest=" + this.b + ')';
    }
}
