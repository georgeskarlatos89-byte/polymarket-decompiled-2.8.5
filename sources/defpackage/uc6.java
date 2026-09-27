package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uc6 implements zkg {
    public final Function1 a;
    public final tc6 b = new tc6(this);
    public final krc c = new krc();
    public final kvd d;
    public final kvd e;
    public final kvd f;

    public uc6(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = ikl.c(bool);
        this.e = ikl.c(bool);
        this.f = ikl.c(bool);
    }

    @Override // defpackage.zkg
    public final Object a(drc drcVar, Function2 function2, Continuation continuation) {
        Object f = qsn.f(new sc6(this, drcVar, function2, (Continuation) null), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.zkg
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.zkg
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
