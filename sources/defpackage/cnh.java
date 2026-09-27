package defpackage;

import com.polymarket.usviewmodels.USSquadsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class cnh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USSquadsViewModel b;

    public /* synthetic */ cnh(USSquadsViewModel uSSquadsViewModel, int i) {
        this.a = i;
        this.b = uSSquadsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        USSquadsViewModel uSSquadsViewModel = this.b;
        switch (i) {
            case 0:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnCreateSquad());
                return Unit.INSTANCE;
            case 1:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.onShowTutorial(USSquadsViewModel.TutorialEntryPoint.banner));
                return Unit.INSTANCE;
            case 2:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnInviteCardTapped());
                return Unit.INSTANCE;
            case 3:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnDismissInviteCard());
                return Unit.INSTANCE;
            case 4:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnReferralInfoTapped());
                return Unit.INSTANCE;
            case 5:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnOpenCompose());
                return Unit.INSTANCE;
            case 6:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnViewInvites());
                return Unit.INSTANCE;
            case 7:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.onShowTutorial(USSquadsViewModel.TutorialEntryPoint.navBar));
                return Unit.INSTANCE;
            case 8:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnOpenCompose());
                return Unit.INSTANCE;
            case 9:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnOpenSettings());
                return Unit.INSTANCE;
            case 10:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnOpenCompose());
                return Unit.INSTANCE;
            case 11:
                uSSquadsViewModel.sendInput(USSquadsViewModel.Input.INSTANCE.getOnRetry());
                return Unit.INSTANCE;
            case 12:
                return Boolean.valueOf(uSSquadsViewModel.isLoading());
            default:
                return Boolean.valueOf(uSSquadsViewModel.isLoading());
        }
    }
}
