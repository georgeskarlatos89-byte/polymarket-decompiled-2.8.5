package defpackage;

import com.polymarket.usviewmodels.BuyLimitOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class js1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BuyLimitOrderViewModel b;

    public /* synthetic */ js1(BuyLimitOrderViewModel buyLimitOrderViewModel, int i) {
        this.a = i;
        this.b = buyLimitOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnMaxShares());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnOrderBookTapped());
                return Unit.INSTANCE;
            case 2:
                this.b.clearGeoDenial();
                return Unit.INSTANCE;
            case 3:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnPlaceOrder());
                return Unit.INSTANCE;
            case 4:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnMatchingSharesTapped());
                return Unit.INSTANCE;
            case 5:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnCostInfoTapped());
                return Unit.INSTANCE;
            case 6:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.onFocusChanged(BuyLimitOrderViewModel.FocusedField.price));
                return Unit.INSTANCE;
            case 7:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnIncrementPrice());
                return Unit.INSTANCE;
            case 8:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnDecrementPrice());
                return Unit.INSTANCE;
            case 9:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.onFocusChanged(BuyLimitOrderViewModel.FocusedField.shares));
                return Unit.INSTANCE;
            case 10:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnIncrementShares());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(BuyLimitOrderViewModel.Input.INSTANCE.getOnDecrementShares());
                return Unit.INSTANCE;
        }
    }
}
