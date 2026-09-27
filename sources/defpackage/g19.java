package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class g19 {
    public final Integer a;
    public final Integer b;
    public final boolean c;
    public final boolean d;

    public g19(Integer num, Integer num2, boolean z, boolean z2) {
        this.a = num;
        this.b = num2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g19)) {
            return false;
        }
        g19 g19Var = (g19) obj;
        if (Intrinsics.areEqual(this.a, g19Var.a) && Intrinsics.areEqual(this.b, g19Var.b) && this.c == g19Var.c && this.d == g19Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return Boolean.hashCode(this.d) + hdi.g((i2 + i) * 31, 31, this.c);
    }

    public final String toString() {
        return "GroupedQueryConfig(limit=" + this.a + ", pageSize=" + this.b + ", watch=" + this.c + ", presence=" + this.d + ")";
    }
}
