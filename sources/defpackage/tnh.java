package defpackage;

import com.polymarket.usviewmodels.SquadsUserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class tnh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsUserProfileViewModel b;

    public /* synthetic */ tnh(SquadsUserProfileViewModel squadsUserProfileViewModel, int i) {
        this.a = i;
        this.b = squadsUserProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SquadsUserProfileViewModel squadsUserProfileViewModel = this.b;
        switch (i) {
            case 0:
                squadsUserProfileViewModel.refreshAfterTrade();
                return Unit.INSTANCE;
            case 1:
                squadsUserProfileViewModel.sendInput(SquadsUserProfileViewModel.Input.INSTANCE.getOnConfirmNickname());
                return Unit.INSTANCE;
            case 2:
                squadsUserProfileViewModel.sendInput(SquadsUserProfileViewModel.Input.INSTANCE.getOnMention());
                return Unit.INSTANCE;
            case 3:
                squadsUserProfileViewModel.sendInput(SquadsUserProfileViewModel.Input.INSTANCE.getOnEditNickname());
                return Unit.INSTANCE;
            case 4:
                squadsUserProfileViewModel.sendInput(SquadsUserProfileViewModel.Input.INSTANCE.getOnCancelEditNickname());
                return Unit.INSTANCE;
            default:
                squadsUserProfileViewModel.sendInput(SquadsUserProfileViewModel.Input.INSTANCE.getOnConfirmNickname());
                return Unit.INSTANCE;
        }
    }
}
