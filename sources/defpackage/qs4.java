package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qs4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(qs4.class, "load$volatile");
    public static final /* synthetic */ long h = oo4.a.objectFieldOffset(qs4.class.getDeclaredField("load$volatile"));
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ ts4 f;
    private volatile /* synthetic */ int load$volatile;

    public qs4(ts4 ts4Var, int i) {
        this.f = ts4Var;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r2 = r6.e;
        r3 = r2.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if ((r3 instanceof defpackage.o2c) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r2.compareAndSet(r0, r3, r13) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r2.get(r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, Object obj2, t49 t49Var) {
        qs4 qs4Var;
        boolean z;
        int hashCode = (obj.hashCode() * (-1640531527)) >>> this.b;
        boolean z2 = false;
        WeakReference weakReference = t49Var;
        loop0: while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            t49 t49Var2 = (t49) atomicReferenceArray.get(hashCode);
            if (t49Var2 == null) {
                if (obj2 == null) {
                    return null;
                }
                if (z2) {
                    qs4Var = this;
                    z = z2;
                } else {
                    while (true) {
                        Unsafe unsafe = oo4.a;
                        long j = h;
                        int intVolatile = unsafe.getIntVolatile(this, j);
                        if (intVolatile >= this.c) {
                            break loop0;
                        }
                        qs4Var = this;
                        if (unsafe.compareAndSwapInt(qs4Var, j, intVolatile, intVolatile + 1)) {
                            z = true;
                            break;
                        }
                        this = qs4Var;
                    }
                }
                if (weakReference == null) {
                    weakReference = new WeakReference(obj, qs4Var.f.a);
                    obj.hashCode();
                }
                WeakReference weakReference2 = weakReference;
                while (!atomicReferenceArray.compareAndSet(hashCode, null, weakReference2)) {
                    if (atomicReferenceArray.get(hashCode) != null) {
                        z2 = z;
                        weakReference = weakReference2;
                        this = qs4Var;
                        weakReference = weakReference;
                    }
                }
                break loop0;
            }
            qs4Var = this;
            T t = t49Var2.get();
            if (Intrinsics.areEqual(obj, t)) {
                if (z2) {
                    g.decrementAndGet(qs4Var);
                }
            } else {
                if (t == 0) {
                    qs4Var.c(hashCode);
                }
                if (hashCode == 0) {
                    hashCode = qs4Var.a;
                }
                hashCode--;
                this = qs4Var;
                weakReference = weakReference;
            }
        }
        return uol.a;
    }

    public final qs4 b() {
        Object obj;
        Object obj2;
        o2c o2cVar;
        while (true) {
            ts4 ts4Var = this.f;
            int size = ts4Var.size();
            if (size < 4) {
                size = 4;
            }
            qs4 qs4Var = new qs4(ts4Var, Integer.highestOneBit(size) * 4);
            for (int i = 0; i < this.a; i++) {
                t49 t49Var = (t49) this.d.get(i);
                if (t49Var != null) {
                    obj = t49Var.get();
                } else {
                    obj = null;
                }
                if (t49Var != null && obj == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj2 = atomicReferenceArray.get(i);
                    if (obj2 instanceof o2c) {
                        obj2 = ((o2c) obj2).a;
                        break;
                    }
                    if (obj2 == null) {
                        o2cVar = uol.b;
                    } else if (Intrinsics.areEqual(obj2, Boolean.TRUE)) {
                        o2cVar = uol.c;
                    } else {
                        o2cVar = new o2c(obj2);
                    }
                    while (!atomicReferenceArray.compareAndSet(i, obj2, o2cVar)) {
                        if (atomicReferenceArray.get(i) != obj2) {
                            break;
                        }
                    }
                    break;
                }
                if (obj == null || obj2 == null || qs4Var.a(obj, obj2, t49Var) != uol.a) {
                }
            }
            return qs4Var;
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj == null || (obj instanceof o2c)) {
                return;
            }
            while (!atomicReferenceArray.compareAndSet(i, obj, null)) {
                if (atomicReferenceArray.get(i) != obj) {
                    break;
                }
            }
            ts4.b.decrementAndGet(this.f);
            return;
        }
    }
}
