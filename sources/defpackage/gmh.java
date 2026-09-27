package defpackage;

import com.polymarket.usviewmodels.SquadsComposeContactPresentation;
import com.polymarket.usviewmodels.SquadsInviteUsersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gmh implements Function0 {
    public final /* synthetic */ SquadsInviteUsersViewModel a;
    public final /* synthetic */ SquadsComposeContactPresentation b;

    public gmh(SquadsInviteUsersViewModel squadsInviteUsersViewModel, SquadsComposeContactPresentation squadsComposeContactPresentation) {
        this.a = squadsInviteUsersViewModel;
        this.b = squadsComposeContactPresentation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(SquadsInviteUsersViewModel.Input.INSTANCE.onToggleUser(this.b.getId2()));
        return Unit.INSTANCE;
    }
}
