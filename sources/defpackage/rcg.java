package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rcg implements Continuation, v85 {
    private static final qcg b = new qcg(null);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(rcg.class, Object.class, Keys.KEY_SOCURE_RESULT);
    public static final /* synthetic */ long d = oo4.a.objectFieldOffset(rcg.class.getDeclaredField(Keys.KEY_SOCURE_RESULT));
    public final Continuation a;
    private volatile Object result;

    public rcg(Continuation continuation, u85 u85Var) {
        continuation.getClass();
        this.a = continuation;
        this.result = u85Var;
    }

    public final Object b() {
        Object obj = this.result;
        u85 u85Var = u85.UNDECIDED;
        if (obj == u85Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            u85 u85Var2 = u85.COROUTINE_SUSPENDED;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                rcg rcgVar = this;
                if (oo4.a.compareAndSwapObject(rcgVar, d, u85Var, u85Var2)) {
                    return u85.COROUTINE_SUSPENDED;
                }
                if (oo4.a.getObjectVolatile(rcgVar, d) != u85Var) {
                    obj = rcgVar.result;
                    break;
                }
                this = rcgVar;
            }
        }
        if (obj == u85.RESUMED) {
            return u85.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof r5g)) {
            return obj;
        }
        throw ((r5g) obj).a;
    }

    @Override // defpackage.v85
    public final v85 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof v85) {
            return (v85) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        rcg rcgVar;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            u85 u85Var = u85.UNDECIDED;
            if (obj3 == u85Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = oo4.a;
                    long j2 = d;
                    rcgVar = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(rcgVar, j2, u85Var, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(rcgVar, j2) != u85Var) {
                        break;
                    }
                    this = rcgVar;
                    obj = obj2;
                }
            } else {
                rcgVar = this;
                obj2 = obj;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                if (obj3 == u85Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                    u85 u85Var3 = u85.RESUMED;
                    do {
                        atomicReferenceFieldUpdater2.getClass();
                        unsafe = oo4.a;
                        j = d;
                        if (unsafe.compareAndSwapObject(rcgVar, j, u85Var2, u85Var3)) {
                            rcgVar.a.resumeWith(obj2);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(rcgVar, j) == u85Var2);
                } else {
                    dmk.n("Already resumed");
                    return;
                }
            }
            this = rcgVar;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rcg(Continuation continuation) {
        this(continuation, u85.UNDECIDED);
        continuation.getClass();
    }
}
