package defpackage;

import com.polymarket.usviewmodels.ComboBuilderEventListViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class oe4 implements eb8 {
    public final /* synthetic */ ComboBuilderEventListViewModel a;

    public oe4(ComboBuilderEventListViewModel comboBuilderEventListViewModel) {
        this.a = comboBuilderEventListViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        ComboBuilderEventListViewModel comboBuilderEventListViewModel = this.a;
        if (intValue != comboBuilderEventListViewModel.getSelectedSectionIndex()) {
            comboBuilderEventListViewModel.sendInput(ComboBuilderEventListViewModel.Input.INSTANCE.onSectionSelected(intValue));
        }
        return Unit.INSTANCE;
    }
}
