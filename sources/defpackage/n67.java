package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n67 {
    public final s43 a;
    public final boolean b;
    public final List c;
    public final hs7 d;

    public n67(s43 s43Var, boolean z, List list, hs7 hs7Var) {
        list.getClass();
        this.a = s43Var;
        this.b = z;
        this.c = list;
        this.d = hs7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n67) {
                n67 n67Var = (n67) obj;
                if (!Intrinsics.areEqual(this.a, n67Var.a) || this.b != n67Var.b || !Intrinsics.areEqual(this.c, n67Var.c) || !Intrinsics.areEqual(this.d, n67Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.f(hdi.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CardDetailsState(selectedCardBrand=" + this.a + ", shouldShowCardBrandDropdown=" + this.b + ", availableNetworks=" + this.c + ", expiryDateState=" + this.d + ")";
    }
}
