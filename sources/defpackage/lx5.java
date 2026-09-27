package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lx5 {
    public final km9 a;
    public final boolean b;

    public lx5(km9 km9Var, boolean z) {
        this.a = km9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx5)) {
            return false;
        }
        lx5 lx5Var = (lx5) obj;
        if (Intrinsics.areEqual(this.a, lx5Var.a) && this.b == lx5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
