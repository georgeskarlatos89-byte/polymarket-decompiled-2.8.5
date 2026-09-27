package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z53 {
    public final s43 a;
    public final hs7 b;

    public z53(s43 s43Var, hs7 hs7Var) {
        this.a = s43Var;
        this.b = hs7Var;
    }

    public static z53 a(z53 z53Var, s43 s43Var, hs7 hs7Var, int i) {
        if ((i & 1) != 0) {
            s43Var = z53Var.a;
        }
        if ((i & 2) != 0) {
            hs7Var = z53Var.b;
        }
        return new z53(s43Var, hs7Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z53) {
                z53 z53Var = (z53) obj;
                if (!Intrinsics.areEqual(this.a, z53Var.a) || !Intrinsics.areEqual(this.b, z53Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardDetailsEntry(cardBrandChoice=" + this.a + ", expiryDateState=" + this.b + ")";
    }
}
