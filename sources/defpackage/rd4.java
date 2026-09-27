package defpackage;

import com.polymarket.usviewmodels.ComboDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class rd4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComboDetailViewModel b;

    public /* synthetic */ rd4(ComboDetailViewModel comboDetailViewModel, int i) {
        this.a = i;
        this.b = comboDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(ComboDetailViewModel.Input.INSTANCE.getOnCashOut());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(ComboDetailViewModel.Input.INSTANCE.getOnBuy());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(ComboDetailViewModel.Input.INSTANCE.getOnShare());
                return Unit.INSTANCE;
        }
    }
}
