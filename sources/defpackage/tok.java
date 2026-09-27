package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tok {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = oo4.a;
        f = unsafe.objectFieldOffset(tok.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(tok.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(tok.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(tok.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(tok.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(tok.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final bpi a(bpi bpiVar) {
        if (b() == 127) {
            return bpiVar;
        }
        if (bpiVar.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = oo4.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(intVolatile, bpiVar);
                b.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int b() {
        return oo4.a.getIntVolatile(this, g) - oo4.a.getIntVolatile(this, e);
    }

    public final bpi c() {
        bpi bpiVar;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            tok tokVar = this;
            if (!unsafe.compareAndSwapInt(tokVar, j, intVolatile, intVolatile + 1) || (bpiVar = (bpi) tokVar.a.getAndSet(i, null)) == null) {
                this = tokVar;
            } else {
                if (bpiVar.b) {
                    c.decrementAndGet(tokVar);
                }
                return bpiVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        defpackage.tok.c.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.b == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bpi d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        bpi bpiVar = (bpi) atomicReferenceArray.get(i2);
        if (bpiVar != null) {
        }
        return null;
    }
}
