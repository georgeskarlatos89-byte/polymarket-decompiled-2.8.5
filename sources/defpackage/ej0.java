package defpackage;

import com.checkout.address.model.State;
import com.checkout.components.interfaces.model.contact.Country;
import com.polymarket.usviewmodels.USSquadsJoinViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ej0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ ej0(int i, Function0 function0, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return new USSquadsJoinViewModel(str, new USSquadsJoinViewModel.Callbacks(null, this.b, this.c, null, 9, null));
            case 1:
                Country country = (Country) obj;
                country.getClass();
                function1.invoke(country);
                function0.invoke();
                return Unit.INSTANCE;
            default:
                State state = (State) obj;
                state.getClass();
                function1.invoke(state);
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
