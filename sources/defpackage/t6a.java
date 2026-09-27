package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t6a extends AbstractOwnableSynchronizer implements Runnable {
    public final wej a;

    public t6a(wej wejVar) {
        this.a = wejVar;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
