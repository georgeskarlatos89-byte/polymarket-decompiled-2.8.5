package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.dmk;
import defpackage.qp7;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ThreadUtils {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class C1CaughtException {
        Exception e;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class C1Result {
        public V value;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface BlockingOperation {
        void run();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            dmk.n("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    z2 = true;
                    break;
                }
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return z;
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        dmk.n("Not on main thread!");
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                qp7.n(e);
                return null;
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        Exception exc = c1CaughtException.e;
        if (exc == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(exc);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() {
                runnable.run();
                return null;
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() {
                return call2();
            }
        });
    }
}
