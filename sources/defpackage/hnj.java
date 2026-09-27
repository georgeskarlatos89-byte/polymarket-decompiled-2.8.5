package defpackage;

import com.polymarket.usviewmodels.USHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class hnj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USHomeViewModel b;

    public /* synthetic */ hnj(USHomeViewModel uSHomeViewModel, int i) {
        this.a = i;
        this.b = uSHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        USHomeViewModel uSHomeViewModel = this.b;
        switch (i) {
            case 0:
                uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.getOnContactSupport());
                return Unit.INSTANCE;
            case 1:
                uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.getOnRetry());
                return Unit.INSTANCE;
            case 2:
                uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.getOnBuildComboButtonFooterButtonPressed());
                return Unit.INSTANCE;
            case 3:
                uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.getOnDeposit());
                return Unit.INSTANCE;
            default:
                uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.getOnNotifications());
                return Unit.INSTANCE;
        }
    }
}
