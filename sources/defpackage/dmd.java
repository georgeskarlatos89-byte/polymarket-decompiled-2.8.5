package defpackage;

import com.polymarket.usviewmodels.OrderBookViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class dmd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderBookViewModel b;
    public final /* synthetic */ qqc c;

    public /* synthetic */ dmd(OrderBookViewModel orderBookViewModel, qqc qqcVar, int i) {
        this.a = i;
        this.b = orderBookViewModel;
        this.c = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qqc qqcVar = this.c;
        OrderBookViewModel orderBookViewModel = this.b;
        switch (i) {
            case 0:
                orderBookViewModel.sendInput(OrderBookViewModel.Input.INSTANCE.getOnDebugStagingLiquiditySync());
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                orderBookViewModel.sendInput(OrderBookViewModel.Input.INSTANCE.getOnDecimalizeToggled());
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
