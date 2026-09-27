package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mg1 extends u1 {
    public final Thread e;
    public final on7 f;

    public mg1(CoroutineContext coroutineContext, Thread thread, on7 on7Var) {
        super(coroutineContext, true, true);
        this.e = thread;
        this.f = on7Var;
    }

    @Override // defpackage.tca
    public final void r(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (!Intrinsics.areEqual(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
