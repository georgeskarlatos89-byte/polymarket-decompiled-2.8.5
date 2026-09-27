package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class orc extends uug implements mrc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(orc.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = oo4.a.objectFieldOffset(orc.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public orc() {
        super(1);
        this.owner$volatile = wjm.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.m(kotlin.Unit.INSTANCE, r3.b);
     */
    @Override // defpackage.mrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        if (tryLock()) {
            return Unit.INSTANCE;
        }
        m23 a = wkn.a(m7a.b(continuation));
        try {
            nrc nrcVar = new nrc(this, a);
            while (true) {
                int andDecrement = uug.e.getAndDecrement(this);
                if (andDecrement <= this.a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (b(nrcVar)) {
                        break;
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

    @Override // defpackage.mrc
    public final boolean g() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mrc
    public final void o(Object obj) {
        while (this.g()) {
            Unsafe unsafe = oo4.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            uk ukVar = wjm.a;
            if (objectVolatile != ukVar) {
                if (objectVolatile != obj && obj != null) {
                    xbc.h(objectVolatile, ", but ", "This mutex is locked by ", obj, " is expected");
                    return;
                }
                while (true) {
                    orc orcVar = this;
                    if (oo4.a.compareAndSwapObject(orcVar, j, objectVolatile, ukVar)) {
                        orcVar.d();
                        return;
                    } else {
                        if (oo4.a.getObjectVolatile(orcVar, j2) != objectVolatile) {
                            this = orcVar;
                            break;
                        }
                        this = orcVar;
                    }
                }
            }
        }
        dmk.n("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(pw5.f(this));
        sb.append("[isLocked=");
        sb.append(g());
        sb.append(",owner=");
        return woa.q(sb, oo4.a.getObjectVolatile(this, j), ']');
    }

    @Override // defpackage.mrc
    public final boolean tryLock() {
        if (f()) {
            oo4.a.putObjectVolatile(this, j, (Object) null);
            return true;
        }
        return false;
    }
}
