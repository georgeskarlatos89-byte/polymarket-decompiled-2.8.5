package defpackage;

import com.polymarket.usviewmodels.TournamentFilterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o7j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TournamentFilterViewModel b;

    public /* synthetic */ o7j(TournamentFilterViewModel tournamentFilterViewModel, int i) {
        this.a = i;
        this.b = tournamentFilterViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(TournamentFilterViewModel.Input.INSTANCE.getOnApply());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(TournamentFilterViewModel.Input.INSTANCE.onDetailStepEntered(TournamentFilterViewModel.FilterType.divisions));
                return Unit.INSTANCE;
            default:
                this.b.sendInput(TournamentFilterViewModel.Input.INSTANCE.onDetailStepEntered(TournamentFilterViewModel.FilterType.teams));
                return Unit.INSTANCE;
        }
    }
}
