package defpackage;

import com.polymarket.data.EEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jmg implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ EEvent b;

    public jmg(Function1 function1, EEvent eEvent) {
        this.a = function1;
        this.b = eEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}
