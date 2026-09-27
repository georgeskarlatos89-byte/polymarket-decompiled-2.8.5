package defpackage;

import com.polymarket.usviewmodels.MFASetupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rxb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MFASetupViewModel b;

    public /* synthetic */ rxb(MFASetupViewModel mFASetupViewModel, int i) {
        this.a = i;
        this.b = mFASetupViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MFASetupViewModel mFASetupViewModel = this.b;
        switch (i) {
            case 0:
                mFASetupViewModel.sendInput(MFASetupViewModel.Input.onSetupPasskey);
                return Unit.INSTANCE;
            case 1:
                mFASetupViewModel.sendInput(MFASetupViewModel.Input.onSetupPasskey);
                return Unit.INSTANCE;
            default:
                mFASetupViewModel.sendInput(MFASetupViewModel.Input.onSetupSMS);
                return Unit.INSTANCE;
        }
    }
}
