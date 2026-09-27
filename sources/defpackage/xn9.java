package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xn9 implements wx7 {
    public final km9 a;
    public final boolean b;
    public final dp5 c;

    public xn9(km9 km9Var, boolean z, dp5 dp5Var) {
        this.a = km9Var;
        this.b = z;
        this.c = dp5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xn9) {
                xn9 xn9Var = (xn9) obj;
                if (!Intrinsics.areEqual(this.a, xn9Var.a) || this.b != xn9Var.b || this.c != xn9Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
