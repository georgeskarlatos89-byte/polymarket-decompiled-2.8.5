package defpackage;

import com.polymarket.usviewmodels.MidtermsPolymapPresentation;
import com.polymarket.usviewmodels.MidtermsRace;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xve implements Function1 {
    public final /* synthetic */ mve a;
    public final /* synthetic */ MidtermsPolymapPresentation.RaceRow b;

    public xve(mve mveVar, MidtermsPolymapPresentation.RaceRow raceRow) {
        this.a = mveVar;
        this.b = raceRow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MidtermsRace.Slot slot = (MidtermsRace.Slot) obj;
        slot.getClass();
        this.a.invoke(this.b, slot);
        return Unit.INSTANCE;
    }
}
