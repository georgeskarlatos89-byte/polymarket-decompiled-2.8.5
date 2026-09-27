package defpackage;

import com.polymarket.usviewmodels.USLiveTabViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tmb implements eb8 {
    public final /* synthetic */ USLiveTabViewModel a;

    public tmb(USLiveTabViewModel uSLiveTabViewModel) {
        this.a = uSLiveTabViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        USLiveTabViewModel uSLiveTabViewModel = this.a;
        if (intValue != uSLiveTabViewModel.getSelectedSectionIndex()) {
            uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.onSectionSelected(intValue));
        }
        return Unit.INSTANCE;
    }
}
