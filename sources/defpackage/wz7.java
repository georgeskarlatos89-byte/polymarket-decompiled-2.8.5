package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wz7 implements Closeable {
    public boolean a;
    public int b;
    public final ReentrantLock c = new ReentrantLock();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (this.b != 0) {
                return;
            }
            reentrantLock.unlock();
            e();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void e();

    public abstract int g(long j, byte[] bArr, int i, int i2);

    public abstract long o();

    public final vz7 p(long j) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!this.a) {
                this.b++;
                reentrantLock.unlock();
                return new vz7(this, j);
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!this.a) {
                reentrantLock.unlock();
                return o();
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
