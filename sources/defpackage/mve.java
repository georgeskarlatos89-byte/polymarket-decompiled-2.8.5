package defpackage;

import com.polymarket.usviewmodels.MidtermsPolymapPresentation;
import com.polymarket.usviewmodels.MidtermsPolymapSectionViewModel;
import com.polymarket.usviewmodels.MidtermsRace;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class mve implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MidtermsPolymapSectionViewModel b;

    public /* synthetic */ mve(MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel) {
        this.a = 1;
        this.b = midtermsPolymapSectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uve.a(midtermsPolymapSectionViewModel, (pq4) obj, rtn.a(1));
                return Unit.INSTANCE;
            case 1:
                MidtermsPolymapPresentation.RaceRow raceRow = (MidtermsPolymapPresentation.RaceRow) obj;
                MidtermsRace.Slot slot = (MidtermsRace.Slot) obj2;
                raceRow.getClass();
                slot.getClass();
                midtermsPolymapSectionViewModel.sendInput(MidtermsPolymapSectionViewModel.Input.INSTANCE.onRaceOutcomeSelected(raceRow.getId2(), slot));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                uve.a(midtermsPolymapSectionViewModel, (pq4) obj, rtn.a(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ mve(MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel, int i, int i2) {
        this.a = i2;
        this.b = midtermsPolymapSectionViewModel;
    }
}
