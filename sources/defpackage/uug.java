package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlinx.coroutines.selects.SelectInstance;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class uug {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final lcb b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = oo4.a;
        g = unsafe.objectFieldOffset(uug.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(uug.class, "deqIdx$volatile");
        h = unsafe.objectFieldOffset(uug.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(uug.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(uug.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(uug.class.getDeclaredField("_availablePermits$volatile"));
    }

    public uug(int i) {
        this.a = i;
        if (i > 0) {
            if (i >= 0) {
                xug xugVar = new xug(0L, null, 2);
                this.head$volatile = xugVar;
                this.tail$volatile = xugVar;
                this._availablePermits$volatile = i;
                this.b = new lcb(this, 22);
                return;
            }
            f27.q(ace.f(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        f27.q(ace.f(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.m(kotlin.Unit.INSTANCE, r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        m23 a = wkn.a(m7a.b(q55Var));
        try {
            if (!b(a)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (b(a)) {
                            break;
                        }
                    }
                }
            }
            Object r = a.r();
            u85 u85Var = u85.COROUTINE_SUSPENDED;
            if (r != u85Var) {
                r = Unit.INSTANCE;
            }
            if (r == u85Var) {
                return r;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            a.B();
            throw th;
        }
    }

    public final boolean b(odk odkVar) {
        Object a;
        Unsafe unsafe;
        uug uugVar = this;
        Unsafe unsafe2 = oo4.a;
        long j = h;
        xug xugVar = (xug) unsafe2.getObjectVolatile(uugVar, j);
        long andIncrement = d.getAndIncrement(uugVar);
        sug sugVar = sug.f;
        long j2 = andIncrement / wug.f;
        loop0: while (true) {
            a = ms4.a(xugVar, j2, sugVar);
            if (fs7.c(a)) {
                break;
            }
            fog b = fs7.b(a);
            while (true) {
                fog fogVar = (fog) oo4.a.getObjectVolatile(uugVar, j);
                if (fogVar.d >= b.d) {
                    uugVar = this;
                    break loop0;
                }
                if (!b.j()) {
                    break;
                }
                do {
                    unsafe = oo4.a;
                    uugVar = this;
                    if (unsafe.compareAndSwapObject(uugVar, h, fogVar, b)) {
                        if (fogVar.f()) {
                            fogVar.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(uugVar, j) == fogVar);
                if (b.f()) {
                    b.e();
                }
            }
            uugVar = this;
        }
        xug xugVar2 = (xug) fs7.b(a);
        AtomicReferenceArray atomicReferenceArray = xugVar2.g;
        int i = (int) (andIncrement % wug.f);
        while (!atomicReferenceArray.compareAndSet(i, null, odkVar)) {
            if (atomicReferenceArray.get(i) != null) {
                uk ukVar = wug.b;
                uk ukVar2 = wug.c;
                while (!atomicReferenceArray.compareAndSet(i, ukVar, ukVar2)) {
                    if (atomicReferenceArray.get(i) != ukVar) {
                        return false;
                    }
                }
                ((l23) odkVar).m(Unit.INSTANCE, uugVar.b);
                return true;
            }
        }
        odkVar.b(xugVar2, i);
        return true;
    }

    public final int c() {
        return Math.max(oo4.a.getIntVolatile(this, f), 0);
    }

    public final void d() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object a;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement < i2) {
                if (andIncrement < 0) {
                    Unsafe unsafe3 = oo4.a;
                    long j2 = g;
                    xug xugVar = (xug) unsafe3.getObjectVolatile(this, j2);
                    long andIncrement2 = c.getAndIncrement(this);
                    long j3 = andIncrement2 / wug.f;
                    tug tugVar = tug.f;
                    while (true) {
                        a = ms4.a(xugVar, j3, tugVar);
                        if (fs7.c(a)) {
                            break;
                        }
                        fog b = fs7.b(a);
                        while (true) {
                            fog fogVar = (fog) oo4.a.getObjectVolatile(this, j2);
                            if (fogVar.d >= b.d) {
                                break;
                            }
                            if (!b.j()) {
                                break;
                            }
                            do {
                                unsafe2 = oo4.a;
                                if (unsafe2.compareAndSwapObject(this, g, fogVar, b)) {
                                    if (fogVar.f()) {
                                        fogVar.e();
                                    }
                                }
                            } while (unsafe2.getObjectVolatile(this, j2) == fogVar);
                            if (b.f()) {
                                b.e();
                            }
                        }
                    }
                    xug xugVar2 = (xug) fs7.b(a);
                    AtomicReferenceArray atomicReferenceArray = xugVar2.g;
                    xugVar2.b();
                    z = false;
                    if (xugVar2.d <= j3) {
                        int i3 = (int) (andIncrement2 % wug.f);
                        Object andSet = atomicReferenceArray.getAndSet(i3, wug.b);
                        if (andSet == null) {
                            int i4 = wug.a;
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (atomicReferenceArray.get(i3) == wug.c) {
                                    z = true;
                                    break;
                                }
                            }
                            uk ukVar = wug.b;
                            uk ukVar2 = wug.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, ukVar, ukVar2)) {
                                    z = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != ukVar) {
                                    break;
                                }
                            }
                            z = !z;
                        } else if (andSet != wug.e) {
                            if (andSet instanceof l23) {
                                l23 l23Var = (l23) andSet;
                                uk c2 = l23Var.c(Unit.INSTANCE, this.b);
                                if (c2 != null) {
                                    l23Var.q(c2);
                                    z = true;
                                    break;
                                    break;
                                }
                            } else if (andSet instanceof SelectInstance) {
                                z = ((SelectInstance) andSet).d(this, Unit.INSTANCE);
                            } else {
                                dmk.n(k84.u(andSet, "unexpected: "));
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    unsafe = oo4.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                xbc.n(i2, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!z);
    }

    public final boolean f() {
        uug uugVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = oo4.a;
                    long j2 = f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.a;
                    if (intVolatile2 > i) {
                        uug uugVar2 = this;
                        uugVar = uugVar2;
                        if (unsafe2.compareAndSwapInt(uugVar2, j2, intVolatile2, i)) {
                            break;
                        }
                        this = uugVar;
                    } else {
                        uugVar = this;
                        break;
                    }
                }
            } else {
                uugVar = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(uugVar, j, intVolatile, intVolatile - 1)) {
                    return true;
                }
            }
            this = uugVar;
        }
    }
}
