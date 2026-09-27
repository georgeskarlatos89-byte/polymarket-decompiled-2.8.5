package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uzi extends mca {
    public static final /* synthetic */ long g = oo4.a.objectFieldOffset(uzi.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public jw6 f;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.mca
    public final boolean k() {
        return true;
    }

    @Override // defpackage.mca
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1 && intVolatile != 2 && intVolatile != 3) {
                    n(intVolatile);
                    throw null;
                }
                return;
            }
            uzi uziVar = this;
            if (unsafe.compareAndSwapInt(uziVar, g, intVolatile, 2)) {
                uziVar.e.interrupt();
                unsafe.putIntVolatile(uziVar, j, 3);
                return;
            }
            this = uziVar;
        }
    }

    public final void m() {
        uzi uziVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                uziVar = this;
            } else {
                uziVar = this;
                if (unsafe.compareAndSwapInt(uziVar, j, intVolatile, 1)) {
                    jw6 jw6Var = uziVar.f;
                    if (jw6Var != null) {
                        jw6Var.dispose();
                        return;
                    }
                    return;
                }
            }
            this = uziVar;
        }
    }
}
