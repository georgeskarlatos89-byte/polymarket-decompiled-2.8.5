package defpackage;

import com.polymarket.usviewmodels.WaitlistInviteCodeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class udk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WaitlistInviteCodeViewModel b;

    public /* synthetic */ udk(WaitlistInviteCodeViewModel waitlistInviteCodeViewModel, int i) {
        this.a = i;
        this.b = waitlistInviteCodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        WaitlistInviteCodeViewModel waitlistInviteCodeViewModel = this.b;
        switch (i) {
            case 0:
                waitlistInviteCodeViewModel.sendInput(WaitlistInviteCodeViewModel.Input.INSTANCE.getOnSubmitCode());
                return Unit.INSTANCE;
            default:
                waitlistInviteCodeViewModel.sendInput(WaitlistInviteCodeViewModel.Input.INSTANCE.getOnSubmitCode());
                return Unit.INSTANCE;
        }
    }
}
