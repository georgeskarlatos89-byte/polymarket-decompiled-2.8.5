package defpackage;

import com.polymarket.usviewmodels.SquadsInviteUsersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class fmh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsInviteUsersViewModel b;

    public /* synthetic */ fmh(SquadsInviteUsersViewModel squadsInviteUsersViewModel, int i) {
        this.a = i;
        this.b = squadsInviteUsersViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SquadsInviteUsersViewModel squadsInviteUsersViewModel = this.b;
        switch (i) {
            case 0:
                squadsInviteUsersViewModel.sendInput(SquadsInviteUsersViewModel.Input.INSTANCE.getOnInviteFriendsTapped());
                return Unit.INSTANCE;
            default:
                if (squadsInviteUsersViewModel != null) {
                    squadsInviteUsersViewModel.sendInput(SquadsInviteUsersViewModel.Input.INSTANCE.getOnConfirmSelection());
                }
                return Unit.INSTANCE;
        }
    }
}
