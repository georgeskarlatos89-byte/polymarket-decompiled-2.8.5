package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pe7 {
    public final km9 a;
    public final boolean b;
    public final dp5 c;
    public final String d;

    public pe7(km9 km9Var, boolean z, dp5 dp5Var, String str) {
        this.a = km9Var;
        this.b = z;
        this.c = dp5Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe7)) {
            return false;
        }
        pe7 pe7Var = (pe7) obj;
        if (Intrinsics.areEqual(this.a, pe7Var.a) && this.b == pe7Var.b && this.c == pe7Var.c && Intrinsics.areEqual(this.d, pe7Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + hdi.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
