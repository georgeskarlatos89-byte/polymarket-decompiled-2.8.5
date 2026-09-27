package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ho0 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock access$getLock$cp;
        ko0 a;
        while (true) {
            try {
                ko0.access$getCompanion$p().getClass();
                access$getLock$cp = ko0.access$getLock$cp();
                access$getLock$cp.lock();
                try {
                    ko0.access$getCompanion$p().getClass();
                    a = go0.a();
                    ko0.access$getCompanion$p().getClass();
                } catch (Throwable th) {
                    access$getLock$cp.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (a == ko0.access$getIdleSentinel$cp()) {
                ko0.access$getCompanion$p().getClass();
                ko0.access$setIdleSentinel$cp(null);
                access$getLock$cp.unlock();
                return;
            } else {
                access$getLock$cp.unlock();
                if (a != null) {
                    a.timedOut();
                }
            }
        }
    }
}
