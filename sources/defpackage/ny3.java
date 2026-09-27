package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ny3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ny3(Function1 function1, boolean z, int i) {
        this.a = i;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            case 1:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
            default:
                function1.invoke(Boolean.valueOf(!z));
                return Unit.INSTANCE;
        }
    }
}
