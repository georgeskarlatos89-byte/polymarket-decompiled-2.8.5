package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i32 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d32 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y22 d;

    public /* synthetic */ i32(d32 d32Var, int i, y22 y22Var, int i2) {
        this.a = i2;
        this.b = d32Var;
        this.c = i;
        this.d = y22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object invoke;
        Object invoke2;
        int i = this.a;
        y22 y22Var = this.d;
        int i2 = this.c;
        d32 d32Var = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                Function3 function3 = d32Var.E;
                if (function3 == null || (invoke = function3.invoke(obj2, Integer.valueOf(i2), num)) == null) {
                    return y22Var.a + "-item-" + intValue;
                }
                return invoke;
            default:
                int intValue2 = num.intValue();
                Function3 function32 = d32Var.E;
                if (function32 == null || (invoke2 = function32.invoke(obj2, Integer.valueOf(i2), num)) == null) {
                    return y22Var.a + "-item-" + intValue2;
                }
                return invoke2;
        }
    }
}
