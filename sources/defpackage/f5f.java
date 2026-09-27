package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f5f {
    public final Integer a;
    public final long b;

    public f5f(Integer num, long j) {
        this.a = num;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5f)) {
            return false;
        }
        f5f f5fVar = (f5f) obj;
        if (Intrinsics.areEqual(this.a, f5fVar.a) && cyi.a(this.b, f5fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        dyi[] dyiVarArr = cyi.b;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.a + ", fontSize=" + cyi.e(this.b) + ")";
    }
}
