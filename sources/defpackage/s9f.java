package defpackage;

import com.polymarket.usviewmodels.ProfileSettingsTradingLimitsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class s9f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileSettingsTradingLimitsViewModel b;

    public /* synthetic */ s9f(ProfileSettingsTradingLimitsViewModel profileSettingsTradingLimitsViewModel, int i) {
        this.a = i;
        this.b = profileSettingsTradingLimitsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(ProfileSettingsTradingLimitsViewModel.Input.INSTANCE.getOnDismissConfirmation());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(ProfileSettingsTradingLimitsViewModel.Input.INSTANCE.getOnDismissConfirmation());
                return Unit.INSTANCE;
            case 2:
                this.b.sendInput(ProfileSettingsTradingLimitsViewModel.Input.INSTANCE.getOnConfirm());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(ProfileSettingsTradingLimitsViewModel.Input.INSTANCE.getOnContinue());
                return Unit.INSTANCE;
        }
    }
}
