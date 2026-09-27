package defpackage;

import com.polymarket.data.EOrder;
import com.polymarket.usviewmodels.UserOrdersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rzj implements Function0 {
    public final /* synthetic */ UserOrdersViewModel a;
    public final /* synthetic */ EOrder b;

    public rzj(UserOrdersViewModel userOrdersViewModel, EOrder eOrder) {
        this.a = userOrdersViewModel;
        this.b = eOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(UserOrdersViewModel.Input.INSTANCE.onCancelOrder(this.b));
        return Unit.INSTANCE;
    }
}
