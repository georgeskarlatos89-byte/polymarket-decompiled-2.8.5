package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ns4 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = oo4.a;
        a = unsafe.objectFieldOffset(ns4.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(ns4.class.getDeclaredField("_prev$volatile"));
    }

    public ns4(fog fogVar) {
        this._prev$volatile = fogVar;
    }

    public final void b() {
        oo4.a.putObjectVolatile(this, b, (Object) null);
    }

    public final ns4 c() {
        Object objectVolatile = oo4.a.getObjectVolatile(this, a);
        if (objectVolatile == ms4.a) {
            return null;
        }
        return (ns4) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        ns4 ns4Var;
        ns4 ns4Var2;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = oo4.a;
            long j = b;
            ns4 ns4Var3 = (ns4) unsafe2.getObjectVolatile(this, j);
            while (ns4Var3 != null && ns4Var3.d()) {
                ns4Var3 = (ns4) oo4.a.getObjectVolatile(ns4Var3, j);
            }
            ns4 c2 = c();
            c2.getClass();
            do {
                ns4Var = c2;
                if (!ns4Var.d()) {
                    break;
                } else {
                    c2 = ns4Var.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = oo4.a.getObjectVolatile(ns4Var, j);
                if (((ns4) objectVolatile) == null) {
                    ns4Var2 = null;
                } else {
                    ns4Var2 = ns4Var3;
                }
                do {
                    unsafe = oo4.a;
                    if (unsafe.compareAndSwapObject(ns4Var, b, objectVolatile, ns4Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(ns4Var, j) == objectVolatile);
            }
            if (ns4Var3 != null) {
                unsafe.putObjectVolatile(ns4Var3, a, ns4Var);
            }
            if (!ns4Var.d() || ns4Var.c() == null) {
                if (ns4Var3 == null || !ns4Var3.d()) {
                    return;
                }
            }
        }
    }
}
