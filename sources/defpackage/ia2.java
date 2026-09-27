package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia2 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ia2(int i, Function1 function1, int i2) {
        this.b = i;
        this.c = function1;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.d;
        Function1 function1 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(i3 % i2));
                return Unit.INSTANCE;
            default:
                if (i3 == 0) {
                    function1.invoke(Integer.valueOf(i2));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ia2(Function1 function1, int i, int i2) {
        this.c = function1;
        this.b = i;
        this.d = i2;
    }
}
