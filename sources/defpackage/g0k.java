package defpackage;

import com.polymarket.usviewmodels.USUserProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g0k implements eb8 {
    public final /* synthetic */ USUserProfileViewModel a;

    public g0k(USUserProfileViewModel uSUserProfileViewModel) {
        this.a = uSUserProfileViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        USUserProfileViewModel uSUserProfileViewModel = this.a;
        if (intValue != uSUserProfileViewModel.getCurrentTabIndex()) {
            uSUserProfileViewModel.sendInput(USUserProfileViewModel.Input.INSTANCE.onTabChanged(intValue));
        }
        return Unit.INSTANCE;
    }
}
