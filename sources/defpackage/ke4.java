package defpackage;

import com.polymarket.usviewmodels.ComboBuilderEventListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ke4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComboBuilderEventListViewModel b;

    public /* synthetic */ ke4(ComboBuilderEventListViewModel comboBuilderEventListViewModel, int i) {
        this.a = i;
        this.b = comboBuilderEventListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ComboBuilderEventListViewModel comboBuilderEventListViewModel = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                comboBuilderEventListViewModel.sendInput(ComboBuilderEventListViewModel.Input.INSTANCE.onSubtagToggled(str));
                return Unit.INSTANCE;
            default:
                comboBuilderEventListViewModel.sendInput(ComboBuilderEventListViewModel.Input.INSTANCE.onSectionSelected(((Integer) obj).intValue()));
                return Unit.INSTANCE;
        }
    }
}
