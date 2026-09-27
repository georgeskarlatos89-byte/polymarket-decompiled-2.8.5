package defpackage;

import com.polymarket.usviewmodels.MidtermsPolymapPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wve implements Function0 {
    public final /* synthetic */ ove a;
    public final /* synthetic */ MidtermsPolymapPresentation.RaceRow b;

    public wve(ove oveVar, MidtermsPolymapPresentation.RaceRow raceRow) {
        this.a = oveVar;
        this.b = raceRow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}
