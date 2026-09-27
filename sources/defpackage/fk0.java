package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fk0 {
    public final String a;
    public final r43 b;
    public final boolean c;

    public fk0(String str, r43 r43Var, boolean z) {
        str.getClass();
        r43Var.getClass();
        this.a = str;
        this.b = r43Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fk0) {
                fk0 fk0Var = (fk0) obj;
                if (!Intrinsics.areEqual(this.a, fk0Var.a) || this.b != fk0Var.b || !Intrinsics.areEqual("", "") || this.c != fk0Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Args(lastFour=");
        sb.append(this.a);
        sb.append(", cardBrand=");
        sb.append(this.b);
        sb.append(", cvc=, isTestMode=");
        return ix2.r(sb, this.c, ")");
    }
}
