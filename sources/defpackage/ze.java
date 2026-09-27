package defpackage;

import com.polymarket.data.EAmericanState;
import com.polymarket.usviewmodels.AddressViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ze implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddressViewModel b;

    public /* synthetic */ ze(AddressViewModel addressViewModel, int i) {
        this.a = i;
        this.b = addressViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        AddressViewModel addressViewModel = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onAddress1Changed(str));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onAddress2Changed(str2));
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onCityChanged(str3));
                return Unit.INSTANCE;
            case 3:
                EAmericanState eAmericanState = (EAmericanState) obj;
                eAmericanState.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onSelectState(eAmericanState));
                return Unit.INSTANCE;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onZipcodeChanged(str4));
                return Unit.INSTANCE;
            default:
                String str5 = (String) obj;
                str5.getClass();
                addressViewModel.sendInput(AddressViewModel.Input.INSTANCE.onSearchTextChanged(str5));
                return Unit.INSTANCE;
        }
    }
}
