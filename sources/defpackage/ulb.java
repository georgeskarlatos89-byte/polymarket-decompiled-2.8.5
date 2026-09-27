package defpackage;

import com.polymarket.usviewmodels.USLiveTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ulb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USLiveTabViewModel b;

    public /* synthetic */ ulb(USLiveTabViewModel uSLiveTabViewModel, int i) {
        this.a = i;
        this.b = uSLiveTabViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        USLiveTabViewModel uSLiveTabViewModel = this.b;
        switch (i) {
            case 0:
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.getOnBuildComboButtonFooterButtonPressed());
                return Unit.INSTANCE;
            case 1:
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.getOnContactSupport());
                return Unit.INSTANCE;
            case 2:
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.getOnDeposit());
                return Unit.INSTANCE;
            default:
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.getOnNotifications());
                return Unit.INSTANCE;
        }
    }
}
