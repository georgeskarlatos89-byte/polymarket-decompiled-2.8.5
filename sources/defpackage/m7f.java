package defpackage;

import com.polymarket.usviewmodels.SMSMFACodeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SMSMFACodeViewModel b;

    public /* synthetic */ m7f(SMSMFACodeViewModel sMSMFACodeViewModel, int i) {
        this.a = i;
        this.b = sMSMFACodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SMSMFACodeViewModel sMSMFACodeViewModel = this.b;
        switch (i) {
            case 0:
                if (sMSMFACodeViewModel != null) {
                    sMSMFACodeViewModel.sendInput(SMSMFACodeViewModel.Input.INSTANCE.getOnBack());
                }
                return Unit.INSTANCE;
            case 1:
                if (sMSMFACodeViewModel != null) {
                    sMSMFACodeViewModel.sendInput(SMSMFACodeViewModel.Input.INSTANCE.getOnBack());
                }
                return Unit.INSTANCE;
            case 2:
                sMSMFACodeViewModel.sendInput(SMSMFACodeViewModel.Input.INSTANCE.getOnContinue());
                return Unit.INSTANCE;
            default:
                sMSMFACodeViewModel.sendInput(SMSMFACodeViewModel.Input.INSTANCE.getOnResendCode());
                return Unit.INSTANCE;
        }
    }
}
