package defpackage;

import com.polymarket.usviewmodels.MidtermsPolymapViewModel;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class qve implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MidtermsPolymapViewModel b;

    public /* synthetic */ qve(MidtermsPolymapViewModel midtermsPolymapViewModel, int i) {
        this.a = i;
        this.b = midtermsPolymapViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MidtermsPolymapViewModel midtermsPolymapViewModel = this.b;
        MidtermsRaceRating midtermsRaceRating = (MidtermsRaceRating) obj;
        switch (i) {
            case 0:
                midtermsRaceRating.getClass();
                midtermsPolymapViewModel.sendInput(MidtermsPolymapViewModel.Input.INSTANCE.onRatingToggled(midtermsRaceRating, MidtermsPolymapViewModel.RatingToggleSource.filterCapsule));
                return Unit.INSTANCE;
            default:
                midtermsRaceRating.getClass();
                midtermsPolymapViewModel.sendInput(MidtermsPolymapViewModel.Input.INSTANCE.onRatingToggled(midtermsRaceRating, MidtermsPolymapViewModel.RatingToggleSource.balanceOfPowerLegend));
                return Unit.INSTANCE;
        }
    }
}
