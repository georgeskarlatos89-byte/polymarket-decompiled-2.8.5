package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ts4 extends AbstractMap {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ts4.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile;

    static {
        Unsafe unsafe = oo4.a;
        d = unsafe.objectFieldOffset(ts4.class.getDeclaredField("_size$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(ts4.class, Object.class, "core$volatile");
        e = unsafe.objectFieldOffset(ts4.class.getDeclaredField("core$volatile"));
    }

    public ts4(boolean z) {
        ReferenceQueue referenceQueue;
        this.core$volatile = new qs4(this, 16);
        if (z) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.a = referenceQueue;
    }

    public final synchronized Object a(Object obj, Object obj2) {
        Object a;
        qs4 qs4Var = (qs4) oo4.a.getObjectVolatile(this, e);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qs4.g;
            a = qs4Var.a(obj, obj2, null);
            if (a == uol.a) {
                qs4Var = qs4Var.b();
                oo4.a.putObjectVolatile(this, e, qs4Var);
            }
        }
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((ss4) keySet()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ss4(this, new hn4(29));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            qs4 qs4Var = (qs4) oo4.a.getObjectVolatile(this, e);
            qs4Var.getClass();
            int hashCode = (obj.hashCode() * (-1640531527)) >>> qs4Var.b;
            while (true) {
                t49 t49Var = (t49) qs4Var.d.get(hashCode);
                if (t49Var == null) {
                    return null;
                }
                T t = t49Var.get();
                if (Intrinsics.areEqual(obj, t)) {
                    Object obj2 = qs4Var.e.get(hashCode);
                    if (obj2 instanceof o2c) {
                        return ((o2c) obj2).a;
                    }
                    return obj2;
                }
                if (t == 0) {
                    qs4Var.c(hashCode);
                }
                if (hashCode == 0) {
                    hashCode = qs4Var.a;
                }
                hashCode--;
            }
        } else {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new ss4(this, new hn4(28));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        qs4 qs4Var = (qs4) oo4.a.getObjectVolatile(this, e);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qs4.g;
        Object a = qs4Var.a(obj, obj2, null);
        if (a == uol.a) {
            a = a(obj, obj2);
        }
        if (a == null) {
            b.incrementAndGet(this);
        }
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        qs4 qs4Var = (qs4) oo4.a.getObjectVolatile(this, e);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qs4.g;
        Object a = qs4Var.a(obj, null, null);
        if (a == uol.a) {
            a = a(obj, null);
        }
        if (a != null) {
            b.decrementAndGet(this);
        }
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return oo4.a.getIntVolatile(this, d);
    }

    public ts4() {
        this(false);
    }
}
