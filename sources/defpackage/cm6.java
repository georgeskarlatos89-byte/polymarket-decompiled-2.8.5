package defpackage;

import com.polymarket.data.EAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class cm6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ EAmount c;

    public /* synthetic */ cm6(Function1 function1, EAmount eAmount, int i) {
        this.a = i;
        this.b = function1;
        this.c = eAmount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            default:
                this.b.invoke(this.c);
                return Unit.INSTANCE;
        }
    }
}
