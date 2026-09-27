package defpackage;

import com.polymarket.usviewmodels.SellLimitOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class itg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SellLimitOrderViewModel b;

    public /* synthetic */ itg(SellLimitOrderViewModel sellLimitOrderViewModel, int i) {
        this.a = i;
        this.b = sellLimitOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.onFocusChanged(SellLimitOrderViewModel.FocusedField.price));
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnIncrementPrice());
                return Unit.INSTANCE;
            case 2:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnDecrementPrice());
                return Unit.INSTANCE;
            case 3:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.onFocusChanged(SellLimitOrderViewModel.FocusedField.shares));
                return Unit.INSTANCE;
            case 4:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnIncrementShares());
                return Unit.INSTANCE;
            case 5:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnDecrementShares());
                return Unit.INSTANCE;
            case 6:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnMaxShares());
                return Unit.INSTANCE;
            case 7:
                this.b.sendInput(SellLimitOrderViewModel.Input.INSTANCE.getOnOrderBookTapped());
                return Unit.INSTANCE;
            default:
                this.b.clearGeoDenial();
                return Unit.INSTANCE;
        }
    }
}
