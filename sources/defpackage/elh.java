package defpackage;

import com.polymarket.usviewmodels.SquadsComposeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class elh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsComposeViewModel b;

    public /* synthetic */ elh(SquadsComposeViewModel squadsComposeViewModel, int i) {
        this.a = i;
        this.b = squadsComposeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SquadsComposeViewModel squadsComposeViewModel = this.b;
        switch (i) {
            case 0:
                squadsComposeViewModel.sendInput(SquadsComposeViewModel.Input.INSTANCE.getOnConfirmSelection());
                return Unit.INSTANCE;
            case 1:
                squadsComposeViewModel.sendInput(SquadsComposeViewModel.Input.INSTANCE.getOnDismissSocialCard());
                return Unit.INSTANCE;
            case 2:
                squadsComposeViewModel.sendInput(SquadsComposeViewModel.Input.INSTANCE.getOnReferralInfoTapped());
                return Unit.INSTANCE;
            case 3:
                squadsComposeViewModel.sendInput(SquadsComposeViewModel.Input.INSTANCE.getOnReferralInfoTapped());
                return Unit.INSTANCE;
            case 4:
                return Boolean.valueOf(squadsComposeViewModel.isSendingInvites());
            default:
                return Boolean.valueOf(squadsComposeViewModel.isSendingInvites());
        }
    }
}
