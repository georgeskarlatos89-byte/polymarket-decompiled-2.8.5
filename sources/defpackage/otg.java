package defpackage;

import com.polymarket.usviewmodels.SellMarketOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class otg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SellMarketOrderViewModel b;

    public /* synthetic */ otg(SellMarketOrderViewModel sellMarketOrderViewModel, int i) {
        this.a = i;
        this.b = sellMarketOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SellMarketOrderViewModel sellMarketOrderViewModel = this.b;
        switch (i) {
            case 0:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.onAmountChanged("0"));
                sellMarketOrderViewModel.setShowManualAmountMode(true);
                return Unit.INSTANCE;
            case 1:
                sellMarketOrderViewModel.clearGeoDenial();
                return Unit.INSTANCE;
            case 2:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnShowTradeInfo());
                return Unit.INSTANCE;
            case 3:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnPrimaryTrade());
                return Unit.INSTANCE;
            case 4:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnSwipeStarted());
                return Unit.INSTANCE;
            case 5:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnSwipeReleased());
                return Unit.INSTANCE;
            case 6:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnPrimaryTrade());
                return Unit.INSTANCE;
            default:
                sellMarketOrderViewModel.sendInput(SellMarketOrderViewModel.Input.INSTANCE.getOnAuthenticationRejected());
                return Unit.INSTANCE;
        }
    }
}
