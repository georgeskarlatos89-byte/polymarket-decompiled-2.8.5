package defpackage;

import com.polymarket.android.R;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cw6 {
    public final d3g a;
    public final j6e b;
    public final neg c;
    public final boolean d;

    public cw6(d3g d3gVar, j6e j6eVar, neg negVar, boolean z) {
        this.a = d3gVar;
        this.b = j6eVar;
        this.c = negVar;
        this.d = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        bgb bgbVar;
        r43 r43Var;
        r43 r43Var2;
        neg negVar = this.c;
        if (negVar instanceof ieg) {
            v5e v5eVar = ((ieg) negVar).a;
            String str = v5eVar.l;
            if (str != null) {
                r43.Companion.getClass();
                r43Var2 = p43.b(str);
            }
            r43Var2 = v5eVar.a;
            return r43Var2.i();
        }
        if (negVar instanceof jeg) {
            ggb ggbVar = ((jeg) negVar).a;
            if (ggbVar instanceof bgb) {
                bgbVar = (bgb) ggbVar;
            } else {
                bgbVar = null;
            }
            if (bgbVar != null && (r43Var = bgbVar.e) != null) {
                return r43Var.i();
            }
        } else if (!(negVar instanceof leg) && !(negVar instanceof keg) && !(negVar instanceof meg)) {
            dmk.a();
        }
        return null;
    }

    public final d3g b() {
        neg negVar = this.c;
        if (negVar instanceof ieg) {
            return xun.f(R.string.stripe_card_ending_in, new Object[]{a(), ((ieg) negVar).a.h});
        }
        if (negVar instanceof keg) {
            return xun.f(R.string.stripe_bank_account_ending_in, new Object[]{((keg) negVar).a.e});
        }
        if (negVar instanceof leg) {
            return xun.f(R.string.stripe_bank_account_ending_in, new Object[]{((leg) negVar).a.e});
        }
        if (negVar instanceof jeg) {
            ggb ggbVar = ((jeg) negVar).a;
            if (ggbVar instanceof agb) {
                return xun.f(R.string.stripe_bank_account_ending_in, new Object[]{((agb) ggbVar).b});
            }
            if (ggbVar instanceof bgb) {
                return xun.f(R.string.stripe_card_ending_in, new Object[]{a(), ((bgb) ggbVar).d});
            }
            if (ggbVar instanceof cgb) {
                return this.a;
            }
            dmk.a();
            return null;
        }
        if (negVar instanceof meg) {
            return new uxh("", ArraysKt.e0(new Object[0]));
        }
        dmk.a();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cw6) {
                cw6 cw6Var = (cw6) obj;
                if (!Intrinsics.areEqual(this.a, cw6Var.a) || !Intrinsics.areEqual(this.b, cw6Var.b) || !Intrinsics.areEqual(this.c, cw6Var.c) || this.d != cw6Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.a + ", paymentMethod=" + this.b + ", savedPaymentMethod=" + this.c + ", shouldShowDefaultBadge=" + this.d + ")";
    }
}
