package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lq8 {
    public final kq8 a;
    public final int b;

    public lq8(kq8 kq8Var, int i) {
        this.a = kq8Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lq8) {
                lq8 lq8Var = (lq8) obj;
                if (!Intrinsics.areEqual(this.a, lq8Var.a) || this.b != lq8Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return sv6.o(sb, this.b, ')');
    }
}
