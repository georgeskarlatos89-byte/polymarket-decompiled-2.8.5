package defpackage;

import com.polymarket.usviewmodels.TournamentBracketViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class n6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TournamentBracketViewModel b;

    public /* synthetic */ n6j(TournamentBracketViewModel tournamentBracketViewModel, int i) {
        this.a = i;
        this.b = tournamentBracketViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(TournamentBracketViewModel.Input.INSTANCE.getOnShowFilter());
                return Unit.INSTANCE;
            case 1:
                this.b.setFilterVM(null);
                return Unit.INSTANCE;
            case 2:
                this.b.setFilterVM(null);
                return Unit.INSTANCE;
            default:
                this.b.sendInput(TournamentBracketViewModel.Input.INSTANCE.getOnRetry());
                return Unit.INSTANCE;
        }
    }
}
