package defpackage;

import com.polymarket.usviewmodels.PromotionsHubViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gcf implements eb8 {
    public final /* synthetic */ PromotionsHubViewModel a;

    public gcf(PromotionsHubViewModel promotionsHubViewModel) {
        this.a = promotionsHubViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        PromotionsHubViewModel promotionsHubViewModel = this.a;
        if (intValue != promotionsHubViewModel.getCurrentTabIndex()) {
            promotionsHubViewModel.sendInput(PromotionsHubViewModel.Input.INSTANCE.onTabSelected(intValue));
        }
        return Unit.INSTANCE;
    }
}
