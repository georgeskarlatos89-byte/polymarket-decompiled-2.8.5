package defpackage;

import com.polymarket.usviewmodels.ComboBuilderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lf4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComboBuilderViewModel b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qqc d;

    public /* synthetic */ lf4(ComboBuilderViewModel comboBuilderViewModel, Function0 function0, qqc qqcVar, int i) {
        this.a = i;
        this.b = comboBuilderViewModel;
        this.c = function0;
        this.d = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qqc qqcVar = this.d;
        Function0 function0 = this.c;
        ComboBuilderViewModel comboBuilderViewModel = this.b;
        switch (i) {
            case 0:
                comboBuilderViewModel.sendInput(ComboBuilderViewModel.Input.INSTANCE.getOnClearAll());
                qqcVar.setValue(null);
                function0.invoke();
                return Unit.INSTANCE;
            default:
                comboBuilderViewModel.sendInput(ComboBuilderViewModel.Input.INSTANCE.getOnClearAll());
                qqcVar.setValue(null);
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
