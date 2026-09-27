package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xgg implements rgg {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function1 b;

    public xgg(Function2 function2, Function1 function1) {
        this.a = function2;
        this.b = function1;
    }

    @Override // defpackage.rgg
    public final Object i(tgg tggVar, Object obj) {
        return this.a.invoke(tggVar, obj);
    }

    @Override // defpackage.rgg
    public final Object k(Object obj) {
        return this.b.invoke(obj);
    }
}
