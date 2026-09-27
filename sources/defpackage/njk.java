package defpackage;

import com.polymarket.usviewmodels.WelcomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class njk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeViewModel b;

    public /* synthetic */ njk(String str, WelcomeViewModel welcomeViewModel) {
        this.a = 1;
        this.b = welcomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        WelcomeViewModel welcomeViewModel = this.b;
        switch (i) {
            case 0:
                welcomeViewModel.sendInput(WelcomeViewModel.Input.INSTANCE.onURLSelected(welcomeViewModel.getTermsAndConditionsURL()));
                return Unit.INSTANCE;
            case 1:
                welcomeViewModel.sendInput(WelcomeViewModel.Input.INSTANCE.getOnSelectGoogle());
                return Unit.INSTANCE;
            default:
                welcomeViewModel.sendInput(WelcomeViewModel.Input.INSTANCE.getOnSelectApple());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ njk(WelcomeViewModel welcomeViewModel, int i) {
        this.a = i;
        this.b = welcomeViewModel;
    }
}
