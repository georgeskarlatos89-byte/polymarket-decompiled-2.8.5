package defpackage;

import com.checkout.components.ui.model.CountryPickerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uwk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ uwk(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(CountryPickerType.Phone);
                return Unit.INSTANCE;
            default:
                this.b.invoke(CountryPickerType.Address);
                return Unit.INSTANCE;
        }
    }
}
