package defpackage;

import com.polymarket.usviewmodels.USHomeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nnj implements eb8 {
    public final /* synthetic */ USHomeViewModel a;

    public nnj(USHomeViewModel uSHomeViewModel) {
        this.a = uSHomeViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        USHomeViewModel uSHomeViewModel = this.a;
        if (intValue != uSHomeViewModel.getSelectedCategoryIndex()) {
            uSHomeViewModel.sendInput(USHomeViewModel.Input.INSTANCE.onCategorySelected(intValue));
        }
        return Unit.INSTANCE;
    }
}
