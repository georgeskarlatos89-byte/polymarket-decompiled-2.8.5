package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class jya implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ jya(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                return (r09) function1.invoke((aza) obj);
            case 1:
                ((Integer) obj).intValue();
                String str = (String) obj2;
                str.getClass();
                function1.invoke(str);
                return Unit.INSTANCE;
            case 2:
                function1.invoke(obj);
                return Unit.INSTANCE;
            default:
                function1.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
