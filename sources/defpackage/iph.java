package defpackage;

import com.polymarket.usviewmodels.SquadsPositionsComboPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class iph implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsPositionsComboPageViewModel b;

    public /* synthetic */ iph(SquadsPositionsComboPageViewModel squadsPositionsComboPageViewModel, int i) {
        this.a = i;
        this.b = squadsPositionsComboPageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SquadsPositionsComboPageViewModel squadsPositionsComboPageViewModel = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                int hashCode = str.hashCode();
                if (hashCode != 97926) {
                    if (hashCode != 3526482) {
                        if (hashCode == 244808443 && str.equals("buyMore")) {
                            squadsPositionsComboPageViewModel.sendInput(SquadsPositionsComboPageViewModel.Input.INSTANCE.getOnBuyMore());
                        }
                    } else if (str.equals("sell")) {
                        squadsPositionsComboPageViewModel.sendInput(SquadsPositionsComboPageViewModel.Input.INSTANCE.getOnSell());
                    }
                } else if (str.equals("buy")) {
                    squadsPositionsComboPageViewModel.sendInput(SquadsPositionsComboPageViewModel.Input.INSTANCE.getOnTail());
                }
                return Unit.INSTANCE;
            default:
                str.getClass();
                squadsPositionsComboPageViewModel.sendInput(SquadsPositionsComboPageViewModel.Input.INSTANCE.onLegTapped(str));
                return Unit.INSTANCE;
        }
    }
}
