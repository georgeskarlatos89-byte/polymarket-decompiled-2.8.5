package defpackage;

import com.polymarket.usviewmodels.PromotionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ccf implements Function0 {
    public final /* synthetic */ PromotionsViewModel a;
    public final /* synthetic */ PromotionsViewModel.Item b;

    public ccf(PromotionsViewModel promotionsViewModel, PromotionsViewModel.Item item) {
        this.a = promotionsViewModel;
        this.b = item;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(PromotionsViewModel.Input.INSTANCE.onItemAction(this.b));
        return Unit.INSTANCE;
    }
}
