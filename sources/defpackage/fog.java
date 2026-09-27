package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class fog extends ns4 implements t9d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(fog.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = oo4.a.objectFieldOffset(fog.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public fog(long j, fog fogVar, int i) {
        super(fogVar);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.ns4
    public final boolean d() {
        if (oo4.a.getIntVolatile(this, f) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (e.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i, CoroutineContext coroutineContext);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            fog fogVar = this;
            if (unsafe.compareAndSwapInt(fogVar, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = fogVar;
        }
    }
}
