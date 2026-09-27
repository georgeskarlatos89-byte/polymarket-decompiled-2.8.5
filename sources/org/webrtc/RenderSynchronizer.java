package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import defpackage.ga0;
import defpackage.lzf;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(1.0E9f / f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new lzf(this, 1));
        Logging.d(TAG, "Created");
    }

    public static /* synthetic */ void a(RenderSynchronizer renderSynchronizer, long j) {
        renderSynchronizer.onDisplayRefreshCycleBegin(j);
    }

    public static /* synthetic */ void b(RenderSynchronizer renderSynchronizer) {
        renderSynchronizer.lambda$registerListener$1();
    }

    public static /* synthetic */ void c(RenderSynchronizer renderSynchronizer) {
        renderSynchronizer.lambda$new$0();
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    private /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    private /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new ga0(this, 2));
    }

    private void onDisplayRefreshCycleBegin(long j) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.d(TAG, "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new ga0(this, 2));
                long j2 = j - this.lastOpenedTimeNanos;
                long j3 = j - this.lastRefreshTimeNanos;
                this.lastRefreshTimeNanos = j;
                if (Math.abs(j2 - this.targetFrameIntervalNanos) < Math.abs((j2 - this.targetFrameIntervalNanos) + j3)) {
                    this.lastOpenedTimeNanos = j;
                    openRenderWindow();
                } else if (this.renderWindowOpen) {
                    closeRenderWindow();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        long j;
        if (this.renderWindowOpen) {
            j = 1;
        } else {
            j = 0;
        }
        Trace.setCounter("RenderWindow", j);
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d(TAG, "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new lzf(this, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(30.0f);
    }
}
