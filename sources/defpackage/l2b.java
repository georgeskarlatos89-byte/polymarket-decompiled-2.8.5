package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l2b extends m4n implements u2b {
    public final vt1 g = new vt1(12, (byte) 0);
    public apc h;

    public l2b(Function1 function1) {
        function1.invoke(this);
    }

    @Override // defpackage.m4n
    public final vt1 f() {
        return this.g;
    }

    public final void h(Object obj, Function3 function3) {
        l82 l82Var;
        if (obj != null) {
            l82Var = new l82(obj, 2);
        } else {
            l82Var = null;
        }
        this.g.c(1, new k2b(l82Var, new gza(1), new vl4(new b40(function3, 6), true, -857469575)));
    }

    public final void i(int i, Function1 function1, Function1 function12, vl4 vl4Var) {
        this.g.c(i, new k2b(function1, function12, vl4Var));
    }
}
