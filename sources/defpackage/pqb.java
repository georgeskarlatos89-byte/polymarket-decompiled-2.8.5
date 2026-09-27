package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class pqb {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = oo4.a;
        a = unsafe.objectFieldOffset(pqb.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(pqb.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(pqb.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(pqb pqbVar, int i) {
        pqb pqbVar2;
        pqb pqbVar3;
        while (true) {
            pqb h = this.h();
            if (h instanceof tib) {
                if ((((tib) h).d & i) == 0 && h.c(pqbVar, i)) {
                    return true;
                }
                return false;
            }
            Unsafe unsafe = oo4.a;
            unsafe.putObjectVolatile(pqbVar, b, h);
            long j = a;
            unsafe.putObjectVolatile(pqbVar, j, this);
            while (true) {
                Unsafe unsafe2 = oo4.a;
                pqbVar2 = this;
                pqbVar3 = pqbVar;
                if (unsafe2.compareAndSwapObject(h, a, pqbVar2, pqbVar3)) {
                    pqbVar3.e(pqbVar2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != pqbVar2) {
                    break;
                }
                this = pqbVar2;
                pqbVar = pqbVar3;
            }
            this = pqbVar2;
            pqbVar = pqbVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pqb d() {
        pqb pqbVar;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = oo4.a;
            long j = b;
            pqb pqbVar2 = (pqb) unsafe2.getObjectVolatile(this, j);
            pqb pqbVar3 = null;
            pqb pqbVar4 = pqbVar2;
            while (pqbVar4 != null) {
                Unsafe unsafe3 = oo4.a;
                long j2 = a;
                Object objectVolatile = unsafe3.getObjectVolatile(pqbVar4, j2);
                if (objectVolatile == this) {
                    if (pqbVar2 == pqbVar4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = oo4.a;
                        pqb pqbVar5 = this;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(pqbVar5, b, pqbVar2, pqbVar4);
                        pqb pqbVar6 = pqbVar2;
                        pqbVar = pqbVar5;
                        if (compareAndSwapObject) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(pqbVar, j) != pqbVar6) {
                            break;
                        }
                        this = pqbVar;
                        pqbVar2 = pqbVar6;
                    }
                } else {
                    pqb pqbVar7 = pqbVar2;
                    pqbVar = this;
                    if (pqbVar.i()) {
                        return null;
                    }
                    if (objectVolatile instanceof gzf) {
                        if (pqbVar3 != null) {
                            pqb pqbVar8 = ((gzf) objectVolatile).a;
                            do {
                                pqb pqbVar9 = pqbVar4;
                                unsafe = oo4.a;
                                boolean compareAndSwapObject2 = unsafe.compareAndSwapObject(pqbVar3, a, pqbVar9, pqbVar8);
                                pqbVar4 = pqbVar9;
                                if (compareAndSwapObject2) {
                                    this = pqbVar;
                                    pqbVar4 = pqbVar3;
                                    pqbVar2 = pqbVar7;
                                    pqbVar3 = null;
                                }
                            } while (unsafe.getObjectVolatile(pqbVar3, j2) == pqbVar4);
                        } else if (pqbVar4 != null) {
                            pqbVar4 = (pqb) unsafe3.getObjectVolatile(pqbVar4, j);
                        } else {
                            dmk.p();
                            return null;
                        }
                    } else {
                        objectVolatile.getClass();
                        pqbVar3 = pqbVar4;
                        pqbVar4 = (pqb) objectVolatile;
                    }
                    this = pqbVar;
                    pqbVar2 = pqbVar7;
                }
                this = pqbVar;
            }
            dmk.p();
            return null;
        }
    }

    public final void e(pqb pqbVar) {
        pqb pqbVar2;
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = b;
            pqb pqbVar3 = (pqb) unsafe.getObjectVolatile(pqbVar, j);
            if (this.f() != pqbVar) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = oo4.a;
                pqbVar2 = this;
                pqb pqbVar4 = pqbVar;
                if (unsafe2.compareAndSwapObject(pqbVar4, b, pqbVar3, pqbVar2)) {
                    if (pqbVar2.i()) {
                        pqbVar4.d();
                        return;
                    }
                    return;
                } else {
                    pqbVar = pqbVar4;
                    if (unsafe2.getObjectVolatile(pqbVar4, j) != pqbVar3) {
                        break;
                    } else {
                        this = pqbVar2;
                    }
                }
            }
            this = pqbVar2;
        }
    }

    public final Object f() {
        return oo4.a.getObjectVolatile(this, a);
    }

    public final pqb g() {
        gzf gzfVar;
        Object f = f();
        if (f instanceof gzf) {
            gzfVar = (gzf) f;
        } else {
            gzfVar = null;
        }
        if (gzfVar != null) {
            return gzfVar.a;
        }
        f.getClass();
        return (pqb) f;
    }

    public final pqb h() {
        pqb d = d();
        if (d == null) {
            Unsafe unsafe = oo4.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            while (true) {
                pqb pqbVar = (pqb) objectVolatile;
                if (!pqbVar.i()) {
                    return pqbVar;
                }
                objectVolatile = oo4.a.getObjectVolatile(pqbVar, j);
            }
        } else {
            return d;
        }
    }

    public boolean i() {
        return f() instanceof gzf;
    }

    public String toString() {
        return new nya(1, 4, pw5.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + pw5.f(this);
    }
}
