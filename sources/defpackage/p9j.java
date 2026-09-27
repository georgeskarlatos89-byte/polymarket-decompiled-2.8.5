package defpackage;

import com.polymarket.data.EAmount;
import com.polymarket.data.ETradingMode;
import com.polymarket.usviewmodels.TradingCoordinatorViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p9j {
    public final qqc a;
    public final qqc b;
    public final qqc c;
    public final qqc d;
    public final ETradingMode e;
    public final EAmount f;
    public final TradingCoordinatorViewModel.Callbacks g;

    public p9j(qqc qqcVar, qqc qqcVar2, qqc qqcVar3, qqc qqcVar4, ETradingMode eTradingMode, EAmount eAmount, TradingCoordinatorViewModel.Callbacks callbacks) {
        qqcVar.getClass();
        qqcVar2.getClass();
        qqcVar3.getClass();
        qqcVar4.getClass();
        eTradingMode.getClass();
        callbacks.getClass();
        this.a = qqcVar;
        this.b = qqcVar2;
        this.c = qqcVar3;
        this.d = qqcVar4;
        this.e = eTradingMode;
        this.f = eAmount;
        this.g = callbacks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9j)) {
            return false;
        }
        p9j p9jVar = (p9j) obj;
        if (Intrinsics.areEqual(this.a, p9jVar.a) && Intrinsics.areEqual(this.b, p9jVar.b) && Intrinsics.areEqual(this.c, p9jVar.c) && Intrinsics.areEqual(this.d, p9jVar.d) && this.e == p9jVar.e && Intrinsics.areEqual(this.f, p9jVar.f) && Intrinsics.areEqual(this.g, p9jVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        EAmount eAmount = this.f;
        if (eAmount == null) {
            hashCode = 0;
        } else {
            hashCode = eAmount.hashCode();
        }
        return this.g.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "TradingCoordinatorNavigationContentState(buyTradingInfoSheetVMState=" + this.a + ", sellTradingInfoSheetVMState=" + this.b + ", orderBookSheetState=" + this.c + ", depositFlowConfigState=" + this.d + ", initialMode=" + this.e + ", prefillPrice=" + this.f + ", callbacks=" + this.g + ")";
    }
}
