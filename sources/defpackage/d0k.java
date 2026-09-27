package defpackage;

import com.polymarket.usviewmodels.USUserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class d0k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USUserProfileViewModel b;

    public /* synthetic */ d0k(USUserProfileViewModel uSUserProfileViewModel, int i) {
        this.a = i;
        this.b = uSUserProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnPromoCreditsDisclaimerLink());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnSettings());
                return Unit.INSTANCE;
            case 2:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnAvailableBalanceInfo());
                return Unit.INSTANCE;
            case 3:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnDeposit());
                return Unit.INSTANCE;
            case 4:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnWithdraw());
                return Unit.INSTANCE;
            case 5:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnSettings());
                return Unit.INSTANCE;
            case 6:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnDismissBalanceInfo());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(USUserProfileViewModel.Input.INSTANCE.getOnDismissBalanceInfo());
                return Unit.INSTANCE;
        }
    }
}
