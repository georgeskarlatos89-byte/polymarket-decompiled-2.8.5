package defpackage;

import kotlin.coroutines.Continuation;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wkn {
    public static final m23 a(Continuation continuation) {
        Unsafe unsafe;
        m23 m23Var;
        m23 m23Var2;
        if (!(continuation instanceof fv6)) {
            return new m23(1, continuation);
        }
        fv6 fv6Var = (fv6) continuation;
        long j = fv6.h;
        loop0: while (true) {
            unsafe = oo4.a;
            Object objectVolatile = unsafe.getObjectVolatile(fv6Var, j);
            m23Var = null;
            uk ukVar = sql.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(fv6Var, j, ukVar);
                m23Var2 = null;
                break;
            }
            if (objectVolatile instanceof m23) {
                do {
                    unsafe = oo4.a;
                    if (unsafe.compareAndSwapObject(fv6Var, fv6.h, objectVolatile, ukVar)) {
                        m23Var2 = (m23) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(fv6Var, j) == objectVolatile);
            } else if (objectVolatile != ukVar && !(objectVolatile instanceof Throwable)) {
                dmk.n(k84.u(objectVolatile, "Inconsistent state "));
                return null;
            }
        }
        if (m23Var2 != null) {
            long j2 = m23.h;
            Object objectVolatile2 = unsafe.getObjectVolatile(m23Var2, j2);
            if ((objectVolatile2 instanceof sj4) && ((sj4) objectVolatile2).d != null) {
                m23Var2.n();
            } else {
                unsafe.putIntVolatile(m23Var2, m23.f, 536870911);
                unsafe.putObjectVolatile(m23Var2, j2, e9.a);
                m23Var = m23Var2;
            }
            if (m23Var != null) {
                return m23Var;
            }
        }
        return new m23(2, continuation);
    }
}
