package defpackage;

import com.polymarket.usviewmodels.SquadsTutorialViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fth implements eb8 {
    public final /* synthetic */ SquadsTutorialViewModel a;
    public final /* synthetic */ dpc b;

    public fth(SquadsTutorialViewModel squadsTutorialViewModel, dpc dpcVar) {
        this.a = squadsTutorialViewModel;
        this.b = dpcVar;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        SquadsTutorialViewModel squadsTutorialViewModel = this.a;
        if (intValue != squadsTutorialViewModel.getCurrentSlideIndex()) {
            squadsTutorialViewModel.sendInput(SquadsTutorialViewModel.Input.INSTANCE.onSlideChanged(intValue));
        }
        ((hvd) this.b).z(intValue);
        return Unit.INSTANCE;
    }
}
