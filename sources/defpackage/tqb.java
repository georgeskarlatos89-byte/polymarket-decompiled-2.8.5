package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tqb {
    public static final rqb e = new rqb(null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(tqb.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final uk h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = oo4.a;
        i = unsafe.objectFieldOffset(tqb.class.getDeclaredField("_next$volatile"));
        g = AtomicLongFieldUpdater.newUpdater(tqb.class, "_state$volatile");
        j = unsafe.objectFieldOffset(tqb.class.getDeclaredField("_state$volatile"));
        h = new uk("REMOVE_FROZEN", 8);
    }

    public tqb(int i2, boolean z) {
        this.a = i2;
        this.b = z;
        int i3 = i2 - 1;
        this.c = i3;
        this.d = new AtomicReferenceArray(i2);
        if (i3 <= 1073741823) {
            if ((i2 & i3) == 0) {
                return;
            }
            dmk.n("Check failed.");
            throw null;
        }
        dmk.n("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        tqb tqbVar = this;
        while (true) {
            g.getClass();
            Unsafe unsafe = oo4.a;
            long j2 = j;
            long longVolatile = unsafe.getLongVolatile(tqbVar, j2);
            long j3 = 3458764513820540928L & longVolatile;
            rqb rqbVar = e;
            if (j3 != 0) {
                rqbVar.getClass();
                if ((2305843009213693952L & longVolatile) != 0) {
                    return 2;
                }
                return 1;
            }
            int i2 = (int) (1073741823 & longVolatile);
            int i3 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i4 = tqbVar.c;
            if (((i3 + 2) & i4) != (i2 & i4)) {
                boolean z = tqbVar.b;
                AtomicReferenceArray atomicReferenceArray = tqbVar.d;
                if (!z && atomicReferenceArray.get(i3 & i4) != null) {
                    int i5 = tqbVar.a;
                    if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                        return 1;
                    }
                } else {
                    rqbVar.getClass();
                    if (unsafe.compareAndSwapLong(tqbVar, j, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i3 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i3 & i4, obj);
                        tqb tqbVar2 = this;
                        while ((oo4.a.getLongVolatile(tqbVar2, j2) & 1152921504606846976L) != 0) {
                            tqbVar2 = tqbVar2.d();
                            AtomicReferenceArray atomicReferenceArray2 = tqbVar2.d;
                            int i6 = tqbVar2.c & i3;
                            Object obj2 = atomicReferenceArray2.get(i6);
                            if ((obj2 instanceof sqb) && ((sqb) obj2).a == i3) {
                                atomicReferenceArray2.set(i6, obj);
                            } else {
                                tqbVar2 = null;
                            }
                            if (tqbVar2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    tqbVar = this;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            g.getClass();
            long longVolatile = oo4.a.getLongVolatile(this, j);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            tqb tqbVar = this;
            if (oo4.a.compareAndSwapLong(tqbVar, j, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = tqbVar;
        }
    }

    public final boolean c() {
        g.getClass();
        long longVolatile = oo4.a.getLongVolatile(this, j);
        if (((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public final tqb d() {
        long j2;
        Unsafe unsafe;
        while (true) {
            g.getClass();
            Unsafe unsafe2 = oo4.a;
            long j3 = j;
            long longVolatile = unsafe2.getLongVolatile(this, j3);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j3, longVolatile, j2)) {
                break;
            }
        }
        while (true) {
            f.getClass();
            Unsafe unsafe3 = oo4.a;
            long j4 = i;
            tqb tqbVar = (tqb) unsafe3.getObjectVolatile(this, j4);
            if (tqbVar != null) {
                return tqbVar;
            }
            tqb tqbVar2 = new tqb(this.a * 2, this.b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.d.get(i5);
                if (obj == null) {
                    obj = new sqb(i2);
                }
                tqbVar2.d.set(tqbVar2.c & i2, obj);
                i2++;
            }
            e.getClass();
            oo4.a.putLongVolatile(tqbVar2, j, j2 & (-1152921504606846977L));
            do {
                unsafe = oo4.a;
                if (unsafe.compareAndSwapObject(this, i, (Object) null, tqbVar2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j4) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0049, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e() {
        tqb tqbVar = this;
        while (true) {
            g.getClass();
            Unsafe unsafe = oo4.a;
            long j2 = j;
            long longVolatile = unsafe.getLongVolatile(tqbVar, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return h;
            }
            int i2 = (int) (longVolatile & 1073741823);
            int i3 = tqbVar.c;
            int i4 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = tqbVar.d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z = tqbVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof sqb) {
                    break;
                }
                e.getClass();
                long j3 = (i2 + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(tqbVar, j2, longVolatile, (longVolatile & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                tqbVar = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = oo4.a;
                        long j4 = j;
                        long longVolatile2 = unsafe2.getLongVolatile(tqbVar, j4);
                        int i6 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            tqbVar = tqbVar.d();
                        } else {
                            if (unsafe2.compareAndSwapLong(tqbVar, j4, longVolatile2, (longVolatile2 & (-1073741824)) | j3)) {
                                tqbVar.d.set(tqbVar.c & i6, null);
                                tqbVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (tqbVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
