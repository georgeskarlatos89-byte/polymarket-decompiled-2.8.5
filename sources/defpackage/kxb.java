package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kxb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ kxb(int i, int i2, Function2 function2) {
        this.a = i2;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Function2 function2 = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                function2.invoke(Integer.valueOf(i2), str);
                return Unit.INSTANCE;
            case 1:
                str.getClass();
                function2.invoke(Integer.valueOf(i2), str);
                return Unit.INSTANCE;
            default:
                str.getClass();
                function2.invoke(Integer.valueOf(i2), str);
                return Unit.INSTANCE;
        }
    }
}
