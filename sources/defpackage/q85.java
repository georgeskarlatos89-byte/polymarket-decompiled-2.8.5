package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q85 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(q85.class, "workerCtl$volatile");
    public static final /* synthetic */ long j = oo4.a.objectFieldOffset(q85.class.getDeclaredField("workerCtl$volatile"));
    public final tok a;
    public final Ref.ObjectRef b;
    public r85 c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ s85 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public q85(s85 s85Var, int i2) {
        this.h = s85Var;
        setDaemon(true);
        setContextClassLoader(s85.class.getClassLoader());
        this.a = new tok();
        this.b = new Object();
        this.c = r85.DORMANT;
        this.nextParkedWorker = s85.k;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final bpi a(boolean z) {
        bpi e;
        bpi e2;
        long j2;
        Unsafe unsafe;
        Unsafe unsafe2;
        r85 r85Var = this.c;
        r85 r85Var2 = r85.CPU_ACQUIRED;
        s85 s85Var = this.h;
        bpi bpiVar = null;
        boolean z2 = true;
        tok tokVar = this.a;
        if (r85Var != r85Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s85.i;
            do {
                j2 = atomicLongFieldUpdater.get(s85Var);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    tokVar.getClass();
                    long j3 = tok.f;
                    loop1: while (true) {
                        unsafe = oo4.a;
                        bpi bpiVar2 = (bpi) unsafe.getObjectVolatile(tokVar, j3);
                        if (bpiVar2 == null || !bpiVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = oo4.a;
                            if (unsafe2.compareAndSwapObject(tokVar, tok.f, bpiVar2, (Object) null)) {
                                bpiVar = bpiVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(tokVar, j3) == bpiVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(tokVar, tok.e);
                    int intVolatile2 = unsafe.getIntVolatile(tokVar, tok.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || oo4.a.getIntVolatile(tokVar, tok.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        bpi d = tokVar.d(intVolatile2, true);
                        if (d != null) {
                            bpiVar = d;
                            break;
                        }
                    }
                    if (bpiVar == null) {
                        bpi bpiVar3 = (bpi) s85Var.f.d();
                        if (bpiVar3 == null) {
                            return i(1);
                        }
                        return bpiVar3;
                    }
                    return bpiVar;
                }
            } while (!s85.i.compareAndSet(s85Var, j2, j2 - 4398046511104L));
            this.c = r85.CPU_ACQUIRED;
        }
        if (z) {
            if (d(s85Var.a * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            tokVar.getClass();
            bpi bpiVar4 = (bpi) oo4.a.getAndSetObject(tokVar, tok.f, (Object) null);
            if (bpiVar4 == null) {
                bpiVar4 = tokVar.c();
            }
            if (bpiVar4 != null) {
                return bpiVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            bpi e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        if ((i7 & i2) == 0) {
            return i7 & i6;
        }
        return (Integer.MAX_VALUE & i6) % i2;
    }

    public final bpi e() {
        int d = d(2);
        s85 s85Var = this.h;
        ow8 ow8Var = s85Var.f;
        ow8 ow8Var2 = s85Var.e;
        if (d == 0) {
            bpi bpiVar = (bpi) ow8Var2.d();
            if (bpiVar != null) {
                return bpiVar;
            }
            return (bpi) ow8Var.d();
        }
        bpi bpiVar2 = (bpi) ow8Var.d();
        if (bpiVar2 != null) {
            return bpiVar2;
        }
        return (bpi) ow8Var2.d();
    }

    public final void f(int i2) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        if (i2 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i2);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(r85 r85Var) {
        boolean z;
        r85 r85Var2 = this.c;
        if (r85Var2 == r85.CPU_ACQUIRED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            s85.i.addAndGet(this.h, 4398046511104L);
        }
        if (r85Var2 != r85Var) {
            this.c = r85Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bpi i(int i2) {
        int i3;
        boolean z;
        long j2;
        bpi bpiVar;
        long j3;
        long j4;
        int i4;
        Unsafe unsafe;
        int i5 = i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = s85.i;
        s85 s85Var = this.h;
        int i6 = (int) (atomicLongFieldUpdater.get(s85Var) & 2097151);
        bpi bpiVar2 = null;
        if (i6 < 2) {
            return null;
        }
        int d = d(i6);
        int i7 = 0;
        long j5 = Long.MAX_VALUE;
        while (i7 < i6) {
            d++;
            if (d > i6) {
                d = 1;
            }
            q85 q85Var = (q85) s85Var.g.b(d);
            if (q85Var != null && q85Var != this) {
                tok tokVar = q85Var.a;
                tokVar.getClass();
                if (i5 == 3) {
                    bpiVar = tokVar.c();
                    i3 = i6;
                    j2 = 0;
                } else {
                    if (i5 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Unsafe unsafe2 = oo4.a;
                    j2 = 0;
                    int intVolatile = unsafe2.getIntVolatile(tokVar, tok.e);
                    int intVolatile2 = unsafe2.getIntVolatile(tokVar, tok.g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i3 = i6;
                                if (oo4.a.getIntVolatile(tokVar, tok.d) == 0) {
                                    break;
                                }
                            } else {
                                i3 = i6;
                            }
                            int i8 = intVolatile + 1;
                            bpi d2 = tokVar.d(intVolatile, z);
                            if (d2 == null) {
                                intVolatile = i8;
                                i6 = i3;
                            } else {
                                bpiVar = d2;
                                break;
                            }
                        } else {
                            i3 = i6;
                            break;
                        }
                    }
                }
                Ref.ObjectRef objectRef = this.b;
                if (bpiVar != null) {
                    objectRef.a = bpiVar;
                    j4 = -1;
                    j3 = -1;
                } else {
                    j3 = -1;
                    long j6 = tok.f;
                    while (true) {
                        bpi bpiVar3 = (bpi) oo4.a.getObjectVolatile(tokVar, j6);
                        if (bpiVar3 == null) {
                            break;
                        }
                        if (bpiVar3.b) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        if ((i4 & i2) == 0) {
                            break;
                        }
                        kpi.f.getClass();
                        tok tokVar2 = tokVar;
                        long nanoTime = System.nanoTime() - bpiVar3.a;
                        long j7 = kpi.b;
                        if (nanoTime < j7) {
                            j4 = j7 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = oo4.a;
                            if (unsafe.compareAndSwapObject(tokVar2, tok.f, bpiVar3, (Object) null)) {
                                objectRef.a = bpiVar3;
                                j4 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(tokVar2, j6) == bpiVar3);
                        tokVar = tokVar2;
                    }
                    j4 = -2;
                }
                if (j4 == j3) {
                    bpi bpiVar4 = (bpi) objectRef.a;
                    objectRef.a = null;
                    return bpiVar4;
                }
                if (j4 > j2) {
                    j5 = Math.min(j5, j4);
                }
            } else {
                i3 = i6;
            }
            i7++;
            i5 = i2;
            i6 = i3;
            bpiVar2 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.e = j5;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (!this.h.isTerminated()) {
                r85 r85Var = this.c;
                r85 r85Var2 = r85.TERMINATED;
                if (r85Var == r85Var2) {
                    break loop0;
                }
                bpi a = a(this.g);
                long j2 = -2097152;
                long j3 = 0;
                if (a != null) {
                    this.e = 0L;
                    s85 s85Var = this.h;
                    this.d = 0L;
                    if (this.c == r85.PARKING) {
                        this.c = r85.BLOCKING;
                    }
                    if (a.b) {
                        if (h(r85.BLOCKING) && !s85Var.z()) {
                            s85.i.getClass();
                            if (!s85Var.y(oo4.a.getLongVolatile(s85Var, s85.m))) {
                                s85Var.z();
                            }
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        s85.i.addAndGet(s85Var, -2097152L);
                        if (this.c != r85Var2) {
                            this.c = r85.DORMANT;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.g = false;
                    if (this.e != 0) {
                        if (!z) {
                            z = true;
                        } else {
                            h(r85.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                        }
                    } else {
                        Object obj = this.nextParkedWorker;
                        uk ukVar = s85.k;
                        if (obj != ukVar) {
                            oo4.a.putIntVolatile(this, j, -1);
                            while (this.nextParkedWorker != s85.k) {
                                Unsafe unsafe = oo4.a;
                                long j4 = j;
                                if (unsafe.getIntVolatile(this, j4) == -1 && !this.h.isTerminated()) {
                                    r85 r85Var3 = this.c;
                                    r85 r85Var4 = r85.TERMINATED;
                                    if (r85Var3 == r85Var4) {
                                        break;
                                    }
                                    h(r85.PARKING);
                                    Thread.interrupted();
                                    if (this.d == j3) {
                                        this.d = System.nanoTime() + this.h.c;
                                    }
                                    LockSupport.parkNanos(this.h.c);
                                    if (System.nanoTime() - this.d >= j3) {
                                        this.d = j3;
                                        s85 s85Var2 = this.h;
                                        synchronized (s85Var2.g) {
                                            try {
                                                if (!s85Var2.isTerminated()) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = s85.i;
                                                    if (((int) (atomicLongFieldUpdater.get(s85Var2) & 2097151)) > s85Var2.a && unsafe.compareAndSwapInt(this, j4, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        f(0);
                                                        s85Var2.p(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(s85Var2) & 2097151);
                                                        if (andDecrement != i2) {
                                                            Object b = s85Var2.g.b(andDecrement);
                                                            b.getClass();
                                                            q85 q85Var = (q85) b;
                                                            s85Var2.g.c(i2, q85Var);
                                                            q85Var.f(i2);
                                                            s85Var2.p(q85Var, andDecrement, i2);
                                                        }
                                                        s85Var2.g.c(andDecrement, null);
                                                        this.c = r85Var4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    j3 = 0;
                                }
                            }
                        } else {
                            s85 s85Var3 = this.h;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = s85.h;
                            if (this.nextParkedWorker == ukVar) {
                                while (true) {
                                    atomicLongFieldUpdater2.getClass();
                                    Unsafe unsafe2 = oo4.a;
                                    long j5 = s85.n;
                                    long longVolatile = unsafe2.getLongVolatile(s85Var3, j5);
                                    long j6 = (longVolatile + 2097152) & j2;
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = s85Var3.g.b((int) (longVolatile & 2097151));
                                    s85 s85Var4 = s85Var3;
                                    if (unsafe2.compareAndSwapLong(s85Var4, j5, longVolatile, j6 | i3)) {
                                        break;
                                    }
                                    s85Var3 = s85Var4;
                                    j2 = -2097152;
                                }
                            }
                        }
                    }
                }
            }
            break loop0;
        }
        h(r85.TERMINATED);
    }
}
