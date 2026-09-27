package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class qqb {
    public static final /* synthetic */ long a = oo4.a.objectFieldOffset(qqb.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new tqb(8, false);

    public final boolean a(Runnable runnable) {
        qqb qqbVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = a;
            tqb tqbVar = (tqb) unsafe.getObjectVolatile(this, j);
            int a2 = tqbVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    qqbVar = this;
                } else {
                    return false;
                }
            } else {
                tqb d = tqbVar.d();
                while (true) {
                    Unsafe unsafe2 = oo4.a;
                    qqbVar = this;
                    if (!unsafe2.compareAndSwapObject(qqbVar, a, tqbVar, d) && unsafe2.getObjectVolatile(qqbVar, j) == tqbVar) {
                        this = qqbVar;
                    }
                }
            }
            this = qqbVar;
        }
    }

    public final void b() {
        qqb qqbVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = a;
            tqb tqbVar = (tqb) unsafe.getObjectVolatile(this, j);
            if (tqbVar.b()) {
                return;
            }
            tqb d = tqbVar.d();
            while (true) {
                qqbVar = this;
                if (!oo4.a.compareAndSwapObject(qqbVar, a, tqbVar, d) && oo4.a.getObjectVolatile(qqbVar, j) == tqbVar) {
                    this = qqbVar;
                }
            }
            this = qqbVar;
        }
    }

    public final int c() {
        tqb tqbVar = (tqb) oo4.a.getObjectVolatile(this, a);
        tqbVar.getClass();
        tqb.g.getClass();
        long longVolatile = oo4.a.getLongVolatile(tqbVar, tqb.j);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        qqb qqbVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = a;
            tqb tqbVar = (tqb) unsafe.getObjectVolatile(this, j);
            Object e = tqbVar.e();
            if (e != tqb.h) {
                return e;
            }
            tqb d = tqbVar.d();
            while (true) {
                qqbVar = this;
                if (!oo4.a.compareAndSwapObject(qqbVar, a, tqbVar, d) && oo4.a.getObjectVolatile(qqbVar, j) == tqbVar) {
                    this = qqbVar;
                }
            }
            this = qqbVar;
        }
    }
}
