package defpackage;

import com.polymarket.usviewmodels.PremadeComboCardPresentation;
import com.polymarket.usviewmodels.USHomePremadeCombosRailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hc9 implements Function0 {
    public final /* synthetic */ USHomePremadeCombosRailViewModel a;
    public final /* synthetic */ PremadeComboCardPresentation b;

    public hc9(USHomePremadeCombosRailViewModel uSHomePremadeCombosRailViewModel, PremadeComboCardPresentation premadeComboCardPresentation) {
        this.a = uSHomePremadeCombosRailViewModel;
        this.b = premadeComboCardPresentation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(USHomePremadeCombosRailViewModel.Input.INSTANCE.onCardTapped(this.b.getId2()));
        return Unit.INSTANCE;
    }
}
