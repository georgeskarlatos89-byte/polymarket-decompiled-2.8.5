package defpackage;

import com.polymarket.data.EAmount;
import com.polymarket.usdependencies.USRoute;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class q2e {
    public final oxc a;
    public final EAmount b;
    public final USRoute.FundsPage c;
    public final USRoute.FundsLink d;

    public q2e(oxc oxcVar, EAmount eAmount, USRoute.FundsPage fundsPage, USRoute.FundsLink fundsLink) {
        oxcVar.getClass();
        this.a = oxcVar;
        this.b = eAmount;
        this.c = fundsPage;
        this.d = fundsLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2e)) {
            return false;
        }
        q2e q2eVar = (q2e) obj;
        if (Intrinsics.areEqual(this.a, q2eVar.a) && Intrinsics.areEqual(this.b, q2eVar.b) && this.c == q2eVar.c && this.d == q2eVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        EAmount eAmount = this.b;
        if (eAmount == null) {
            hashCode = 0;
        } else {
            hashCode = eAmount.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        USRoute.FundsPage fundsPage = this.c;
        if (fundsPage == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fundsPage.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        USRoute.FundsLink fundsLink = this.d;
        if (fundsLink != null) {
            i = fundsLink.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "PaymentDeepLinkConfig(route=" + this.a + ", initialAmount=" + this.b + ", initialPage=" + this.c + ", initialLink=" + this.d + ")";
    }
}
