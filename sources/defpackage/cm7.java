package defpackage;

import com.polymarket.data.EOrder;
import com.polymarket.usviewmodels.UserOrdersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class cm7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserOrdersViewModel b;
    public final /* synthetic */ EOrder c;

    public /* synthetic */ cm7(UserOrdersViewModel userOrdersViewModel, EOrder eOrder, int i) {
        this.a = i;
        this.b = userOrdersViewModel;
        this.c = eOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EOrder eOrder = this.c;
        UserOrdersViewModel userOrdersViewModel = this.b;
        switch (i) {
            case 0:
                userOrdersViewModel.sendInput(UserOrdersViewModel.Input.INSTANCE.onCancelOrder(eOrder));
                return Unit.INSTANCE;
            default:
                userOrdersViewModel.sendInput(UserOrdersViewModel.Input.INSTANCE.onCancelOrder(eOrder));
                return Unit.INSTANCE;
        }
    }
}
