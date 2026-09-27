package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lkg implements zkg {
    public static final zcg j = new zcg(1, new wgg(6), new vgg(16));
    public final hvd a;
    public float f;
    public final hvd b = new hvd(0);
    public final hvd c = new hvd(0);
    public final fpc d = new fpc();
    public final hvd e = new hvd(bd0.API_PRIORITY_OTHER);
    public final uc6 g = new uc6(new jxf(this, 12));
    public final rm6 h = adh.b(new li1(this, 4));
    public final rm6 i = adh.b(new li1(this, 5));

    public lkg(int i) {
        this.a = new hvd(i);
    }

    public static Object f(int i, lkg lkgVar, Continuation continuation) {
        Object a = ti1.a(lkgVar, i - lkgVar.a.y(), new qjh(null, 7), continuation);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.zkg
    public final Object a(drc drcVar, Function2 function2, Continuation continuation) {
        Object a = this.g.a(drcVar, function2, continuation);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.zkg
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.zkg
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.zkg
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.zkg
    public final float e(float f) {
        return this.g.e(f);
    }

    public final Object g(int i, q55 q55Var) {
        return ti1.h(this, i - this.a.y(), q55Var);
    }
}
