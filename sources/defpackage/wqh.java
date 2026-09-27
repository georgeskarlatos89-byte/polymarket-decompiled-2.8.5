package defpackage;

import com.polymarket.usviewmodels.SquadsQuickSendTilePresentation;
import com.polymarket.usviewmodels.SquadsQuickSendViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wqh implements Function0 {
    public final /* synthetic */ SquadsQuickSendViewModel a;
    public final /* synthetic */ SquadsQuickSendTilePresentation b;

    public wqh(SquadsQuickSendViewModel squadsQuickSendViewModel, SquadsQuickSendTilePresentation squadsQuickSendTilePresentation) {
        this.a = squadsQuickSendViewModel;
        this.b = squadsQuickSendTilePresentation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(SquadsQuickSendViewModel.Input.INSTANCE.onSquadTapped(this.b.getId2()));
        return Unit.INSTANCE;
    }
}
