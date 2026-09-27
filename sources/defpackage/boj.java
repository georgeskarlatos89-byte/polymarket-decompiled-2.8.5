package defpackage;

import com.polymarket.usviewmodels.HubViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class boj implements eb8 {
    public final /* synthetic */ HubViewModel a;

    public boj(HubViewModel hubViewModel) {
        this.a = hubViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        HubViewModel hubViewModel = this.a;
        if (hubViewModel.getCurrentTabIndex() != intValue) {
            hubViewModel.sendInput(HubViewModel.Input.INSTANCE.onTabSelected(intValue));
        }
        return Unit.INSTANCE;
    }
}
