package io.sentry.util;

import defpackage.oo4;
import io.sentry.j1;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a implements j1 {
    public static final /* synthetic */ long b = oo4.a.objectFieldOffset(a.class.getDeclaredField("a"));
    public volatile ReentrantLock a;

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.a;
        b.t(reentrantLock, "close() called before acquire()");
        reentrantLock.unlock();
    }

    public final void e() {
        g().lock();
    }

    public final ReentrantLock g() {
        ReentrantLock reentrantLock = this.a;
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        while (true) {
            Unsafe unsafe = oo4.a;
            long j = b;
            a aVar = this;
            if (unsafe.compareAndSwapObject(aVar, j, (Object) null, reentrantLock2)) {
                return reentrantLock2;
            }
            if (unsafe.getObjectVolatile(aVar, j) != null) {
                ReentrantLock reentrantLock3 = aVar.a;
                b.t(reentrantLock3, "lock must have been set by the winning thread");
                return reentrantLock3;
            }
            this = aVar;
        }
    }
}
