package defpackage;

import com.polymarket.usviewmodels.SportsTeamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vih implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.a b;
    public final /* synthetic */ SportsTeamViewModel c;

    public /* synthetic */ vih(Ref.a aVar, SportsTeamViewModel sportsTeamViewModel, int i) {
        this.a = i;
        this.b = aVar;
        this.c = sportsTeamViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SportsTeamViewModel sportsTeamViewModel = this.c;
        Ref.a aVar = this.b;
        switch (i) {
            case 0:
                if (!aVar.a) {
                    aVar.a = true;
                    SportsTeamViewModel.Input.Companion companion = SportsTeamViewModel.Input.INSTANCE;
                    sportsTeamViewModel.sendInput(companion.getOnViewWillAppear());
                    sportsTeamViewModel.sendInput(companion.getOnViewDidAppear());
                }
                return Unit.INSTANCE;
            default:
                if (aVar.a) {
                    aVar.a = false;
                    sportsTeamViewModel.sendInput(SportsTeamViewModel.Input.INSTANCE.getOnViewWillDisappear());
                }
                return Unit.INSTANCE;
        }
    }
}
