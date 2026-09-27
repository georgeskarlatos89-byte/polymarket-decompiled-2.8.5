package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class br6 extends gr6 {
    public final String a;
    public final long b;

    public br6(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br6) {
                br6 br6Var = (br6) obj;
                if (!Intrinsics.areEqual(this.a, br6Var.a) || this.b != br6Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Increment(key=");
        sb.append(this.a);
        sb.append(", value=");
        return ix2.n(sb, this.b, ')');
    }
}
