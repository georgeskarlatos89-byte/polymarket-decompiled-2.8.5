package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u1f implements kp5 {
    public final kp5 a;

    public u1f(kp5 kp5Var) {
        this.a = kp5Var;
    }

    @Override // defpackage.kp5
    public final Object a(Function2 function2, Continuation continuation) {
        return this.a.a(new b95(function2, null, 1), continuation);
    }

    @Override // defpackage.kp5
    public final Flow getData() {
        return this.a.getData();
    }
}
