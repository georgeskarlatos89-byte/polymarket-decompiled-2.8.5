package defpackage;

import com.polymarket.usviewmodels.TournamentFilterViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p7j extends zei implements Function2 {
    public final /* synthetic */ boolean k;
    public final /* synthetic */ TournamentFilterViewModel l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7j(boolean z, TournamentFilterViewModel tournamentFilterViewModel, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = tournamentFilterViewModel;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new p7j(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p7j) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k) {
            TournamentFilterViewModel tournamentFilterViewModel = this.l;
            if (tournamentFilterViewModel.getActiveFilterType() == null) {
                tournamentFilterViewModel.sendInput(TournamentFilterViewModel.Input.INSTANCE.onDetailStepEntered(TournamentFilterViewModel.FilterType.teams));
            }
        }
        return Unit.INSTANCE;
    }
}
