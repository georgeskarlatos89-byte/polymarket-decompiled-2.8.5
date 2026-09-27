package defpackage;

import com.polymarket.usviewmodels.OnboardingProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class s8f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnboardingProfileViewModel b;

    public /* synthetic */ s8f(OnboardingProfileViewModel onboardingProfileViewModel, int i) {
        this.a = i;
        this.b = onboardingProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        OnboardingProfileViewModel onboardingProfileViewModel = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                onboardingProfileViewModel.sendInput(OnboardingProfileViewModel.Input.INSTANCE.getOnDisclaimerToggle());
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                str.getClass();
                onboardingProfileViewModel.sendInput(OnboardingProfileViewModel.Input.INSTANCE.onUsernameChanged(str));
                return Unit.INSTANCE;
        }
    }
}
