package defpackage;

import com.polymarket.usviewmodels.SquadsPositionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class eoh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsPositionsViewModel b;

    public /* synthetic */ eoh(SquadsPositionsViewModel squadsPositionsViewModel, int i) {
        this.a = i;
        this.b = squadsPositionsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.refreshAfterTrade();
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(SquadsPositionsViewModel.Input.INSTANCE.getOnBrowseMarkets());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(SquadsPositionsViewModel.Input.INSTANCE.getOnPullToRefresh());
                return Unit.INSTANCE;
        }
    }
}
