package defpackage;

import com.stripe.android.model.LinkBrand;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class peg {
    public final cw6 a;
    public final LinkBrand b;
    public final oeg c;

    public peg(cw6 cw6Var, LinkBrand linkBrand, oeg oegVar) {
        cw6Var.getClass();
        linkBrand.getClass();
        this.a = cw6Var;
        this.b = linkBrand;
        this.c = oegVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof peg) {
                peg pegVar = (peg) obj;
                if (!Intrinsics.areEqual(this.a, pegVar.a) || this.b != pegVar.b || !Intrinsics.areEqual(this.c, pegVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "State(displayableSavedPaymentMethod=" + this.a + ", linkBrand=" + this.b + ", form=" + this.c + ")";
    }
}
