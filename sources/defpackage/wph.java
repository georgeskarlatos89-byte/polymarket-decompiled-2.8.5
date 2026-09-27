package defpackage;

import com.polymarket.usviewmodels.SquadsPositionPopularItemPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wph implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ SquadsPositionPopularItemPresentation b;

    public wph(Function1 function1, SquadsPositionPopularItemPresentation squadsPositionPopularItemPresentation) {
        this.a = function1;
        this.b = squadsPositionPopularItemPresentation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(this.b.getId());
        }
        return Unit.INSTANCE;
    }
}
