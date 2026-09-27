package defpackage;

import com.polymarket.usviewmodels.SportsTeamSettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class hjh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SportsTeamSettingsViewModel b;

    public /* synthetic */ hjh(SportsTeamSettingsViewModel sportsTeamSettingsViewModel, int i) {
        this.a = i;
        this.b = sportsTeamSettingsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SportsTeamSettingsViewModel sportsTeamSettingsViewModel = this.b;
        switch (i) {
            case 0:
                sportsTeamSettingsViewModel.sendInput(SportsTeamSettingsViewModel.Input.INSTANCE.getOnUnmuteChat());
                return Unit.INSTANCE;
            case 1:
                sportsTeamSettingsViewModel.sendInput(SportsTeamSettingsViewModel.Input.INSTANCE.getOnToggleFavorite());
                return Unit.INSTANCE;
            case 2:
                sportsTeamSettingsViewModel.sendInput(SportsTeamSettingsViewModel.Input.INSTANCE.getOnInviteNewMembers());
                return Unit.INSTANCE;
            default:
                sportsTeamSettingsViewModel.sendInput(SportsTeamSettingsViewModel.Input.INSTANCE.getOnShare());
                return Unit.INSTANCE;
        }
    }
}
