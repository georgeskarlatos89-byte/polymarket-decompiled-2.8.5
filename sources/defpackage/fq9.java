package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fq9 {
    public final eq9 a;
    public final int b;

    public fq9(eq9 eq9Var, int i) {
        this.a = eq9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fq9) {
                fq9 fq9Var = (fq9) obj;
                if (!Intrinsics.areEqual(this.a, fq9Var.a) || this.b != fq9Var.b) {
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
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return sv6.o(sb, this.b, ')');
    }
}
