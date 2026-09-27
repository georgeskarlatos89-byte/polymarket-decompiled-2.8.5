package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface kjc {
    Object a(Object obj, Function2 function2);

    boolean b(Function1 function1);

    default kjc e(kjc kjcVar) {
        if (kjcVar == hjc.a) {
            return this;
        }
        return new cd4(this, kjcVar);
    }
}
