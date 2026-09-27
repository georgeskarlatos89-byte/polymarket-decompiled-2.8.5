package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class thh implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ USEventCardViewModel c;

    public thh(Function2 function2, int i, USEventCardViewModel uSEventCardViewModel) {
        this.a = function2;
        this.b = i;
        this.c = uSEventCardViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer valueOf = Integer.valueOf(this.b);
        Function2 function2 = this.a;
        USEventCardViewModel uSEventCardViewModel = this.c;
        function2.invoke(valueOf, uSEventCardViewModel);
        uSEventCardViewModel.sendInput(USEventCardViewModel.Input.INSTANCE.getOnSelect());
        return Unit.INSTANCE;
    }
}
