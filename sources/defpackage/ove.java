package defpackage;

import com.polymarket.usviewmodels.MidtermsPolymapPresentation;
import com.polymarket.usviewmodels.MidtermsPolymapSectionViewModel;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ove implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MidtermsPolymapSectionViewModel b;

    public /* synthetic */ ove(MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel, int i) {
        this.a = i;
        this.b = midtermsPolymapSectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel = this.b;
        switch (i) {
            case 0:
                MidtermsPolymapPresentation.RaceRow raceRow = (MidtermsPolymapPresentation.RaceRow) obj;
                raceRow.getClass();
                midtermsPolymapSectionViewModel.sendInput(MidtermsPolymapSectionViewModel.Input.INSTANCE.onRaceSelected(raceRow.getId2()));
                return Unit.INSTANCE;
            default:
                MidtermsRaceRating.Party party = (MidtermsRaceRating.Party) obj;
                party.getClass();
                midtermsPolymapSectionViewModel.sendInput(MidtermsPolymapSectionViewModel.Input.INSTANCE.onHeadlineOutcomeSelected(party));
                return Unit.INSTANCE;
        }
    }
}
