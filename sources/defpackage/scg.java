package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class scg extends y1 {
    public final Function2 a;

    public scg(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.y1
    public final Object e(ncg ncgVar, x1 x1Var) {
        Object invoke = this.a.invoke(ncgVar, x1Var);
        if (invoke == u85.COROUTINE_SUSPENDED) {
            return invoke;
        }
        return Unit.INSTANCE;
    }
}
