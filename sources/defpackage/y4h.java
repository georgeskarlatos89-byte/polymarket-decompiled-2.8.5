package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y4h {
    public final boolean a;
    public final Function1 b;
    public h58 c;
    public final ur d;
    public h58 e;
    public h58 f;

    public y4h(boolean z, Function0 function0, Function0 function02, z4h z4hVar, Function1 function1) {
        this.a = z;
        this.b = function1;
        if (z && z4hVar == z4h.PartiallyExpanded) {
            dmk.v("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = v4h.a;
        this.d = new ur(z4hVar, new ix8(function0, 22), function02, new w4h(this, 0), function1);
        this.e = odn.d();
        this.f = odn.d();
    }

    public static Object a(y4h y4hVar, z4h z4hVar, h58 h58Var, zei zeiVar) {
        float y = ((gvd) y4hVar.d.g).y();
        Object c = y4hVar.d.c(z4hVar, drc.Default, new x4h(y4hVar, y, h58Var, null), zeiVar);
        if (c == u85.COROUTINE_SUSPENDED) {
            return c;
        }
        return Unit.INSTANCE;
    }

    public final Object b(zei zeiVar) {
        z4h z4hVar = z4h.Expanded;
        if (((Boolean) this.b.invoke(z4hVar)).booleanValue()) {
            Object a = a(this, z4hVar, this.e, zeiVar);
            if (a == u85.COROUTINE_SUSPENDED) {
                return a;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final Object c(zei zeiVar) {
        z4h z4hVar = z4h.Hidden;
        if (((Boolean) this.b.invoke(z4hVar)).booleanValue()) {
            Object a = a(this, z4hVar, this.f, zeiVar);
            if (a == u85.COROUTINE_SUSPENDED) {
                return a;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final boolean d() {
        if (((kvd) this.d.d).getValue() != z4h.Hidden) {
            return true;
        }
        return false;
    }

    public final Object e(zei zeiVar) {
        if (!this.a) {
            z4h z4hVar = z4h.PartiallyExpanded;
            if (((Boolean) this.b.invoke(z4hVar)).booleanValue()) {
                Object a = a(this, z4hVar, this.f, zeiVar);
                if (a == u85.COROUTINE_SUSPENDED) {
                    return a;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        dmk.n("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    public final Object f(zei zeiVar) {
        d0c g = this.d.g();
        z4h z4hVar = z4h.PartiallyExpanded;
        if (!g.a.containsKey(z4hVar)) {
            z4hVar = z4h.Expanded;
        }
        if (((Boolean) this.b.invoke(z4hVar)).booleanValue()) {
            Object a = a(this, z4hVar, this.e, zeiVar);
            if (a == u85.COROUTINE_SUSPENDED) {
                return a;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
