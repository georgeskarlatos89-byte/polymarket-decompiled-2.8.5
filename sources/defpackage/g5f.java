package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g5f {
    public final oh8 a;
    public final long b;

    public g5f(oh8 oh8Var, long j) {
        this.a = oh8Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5f)) {
            return false;
        }
        g5f g5fVar = (g5f) obj;
        if (Intrinsics.areEqual(this.a, g5fVar.a) && cyi.a(this.b, g5fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        oh8 oh8Var = this.a;
        if (oh8Var == null) {
            hashCode = 0;
        } else {
            hashCode = oh8Var.hashCode();
        }
        dyi[] dyiVarArr = cyi.b;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.a + ", fontSize=" + cyi.e(this.b) + ")";
    }
}
