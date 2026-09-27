package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ijc extends kjc {
    @Override // defpackage.kjc
    default Object a(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.kjc
    default boolean b(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
