package defpackage;

import com.polymarket.usviewmodels.HubViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ynj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HubViewModel b;

    public /* synthetic */ ynj(HubViewModel hubViewModel, int i) {
        this.a = i;
        this.b = hubViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(HubViewModel.Input.INSTANCE.getOnRetry());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(HubViewModel.Input.INSTANCE.getOnShareTapped());
                return Unit.INSTANCE;
        }
    }
}
