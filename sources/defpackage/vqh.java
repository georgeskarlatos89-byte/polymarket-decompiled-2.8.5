package defpackage;

import com.polymarket.usviewmodels.SquadsQuickSendViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class vqh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SquadsQuickSendViewModel b;

    public /* synthetic */ vqh(SquadsQuickSendViewModel squadsQuickSendViewModel, int i) {
        this.a = i;
        this.b = squadsQuickSendViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(SquadsQuickSendViewModel.Input.INSTANCE.getOnCreateSquadTapped());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(SquadsQuickSendViewModel.Input.INSTANCE.getOnSendToAllTapped());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(SquadsQuickSendViewModel.Input.INSTANCE.getOnCreateSquadTapped());
                return Unit.INSTANCE;
        }
    }
}
