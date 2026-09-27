package defpackage;

import com.polymarket.usviewmodels.AddressViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressViewModel b;

    public /* synthetic */ bf(AddressViewModel addressViewModel, int i) {
        this.a = i;
        this.b = addressViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        AddressViewModel addressViewModel = this.b;
        switch (i) {
            case 0:
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.getOnContinue());
                return Unit.INSTANCE;
            default:
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.getOnEnterManually());
                return Unit.INSTANCE;
        }
    }
}
