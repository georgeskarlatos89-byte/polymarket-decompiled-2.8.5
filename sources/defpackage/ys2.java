package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ys2 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys2(Function1 function1, int i) {
        super(1);
        this.h = i;
        this.i = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        Function1 function1 = this.i;
        switch (i) {
            case 0:
                t35 t35Var = (t35) obj;
                function1.invoke(t35Var);
                ((lxa) t35Var).a();
                return Unit.INSTANCE;
            case 1:
                return new n1a((((int) (((n1a) obj).a & 4294967295L)) & 4294967295L) | (((Number) function1.invoke(Integer.valueOf((int) (r4 >> 32)))).intValue() << 32));
            case 2:
                return new n1a((((Number) function1.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((n1a) obj).a >> 32)) << 32));
            case 3:
                return new n1a((((int) (((n1a) obj).a & 4294967295L)) & 4294967295L) | (((Number) function1.invoke(Integer.valueOf((int) (r4 >> 32)))).intValue() << 32));
            case 4:
                return new n1a((((Number) function1.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((n1a) obj).a >> 32)) << 32));
            case 5:
                return new e1a(((Number) function1.invoke(Integer.valueOf((int) (((n1a) obj).a >> 32)))).intValue() << 32);
            case 6:
                return new e1a(((Number) function1.invoke(Integer.valueOf((int) (((n1a) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 7:
                return new e1a(((Number) function1.invoke(Integer.valueOf((int) (((n1a) obj).a >> 32)))).intValue() << 32);
            default:
                return new e1a(((Number) function1.invoke(Integer.valueOf((int) (((n1a) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
