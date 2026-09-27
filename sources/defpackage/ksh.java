package defpackage;

import com.polymarket.usviewmodels.USSquadsSettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ksh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USSquadsSettingsViewModel b;

    public /* synthetic */ ksh(USSquadsSettingsViewModel uSSquadsSettingsViewModel, int i) {
        this.a = i;
        this.b = uSSquadsSettingsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        USSquadsSettingsViewModel uSSquadsSettingsViewModel = this.b;
        switch (i) {
            case 0:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnUnmuteChat());
                return Unit.INSTANCE;
            case 1:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnInviteNewMembers());
                return Unit.INSTANCE;
            case 2:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnVisibilityAndPermissions());
                return Unit.INSTANCE;
            case 3:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnLeaveSquad());
                return Unit.INSTANCE;
            case 4:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnDeleteSquad());
                return Unit.INSTANCE;
            case 5:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnShare());
                return Unit.INSTANCE;
            case 6:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnChangeNameOrImage());
                return Unit.INSTANCE;
            case 7:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnNicknames());
                return Unit.INSTANCE;
            default:
                uSSquadsSettingsViewModel.sendInput(USSquadsSettingsViewModel.Input.INSTANCE.getOnPublicSquadInfo());
                return Unit.INSTANCE;
        }
    }
}
