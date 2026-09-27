package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.c77;
import defpackage.f05;
import defpackage.vx;
import defpackage.y85;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.webrtc.EglBase;
import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class EglThread implements RenderSynchronizer.Listener {
    private final EglBase.EglConnection eglConnection;
    private final HandlerWithExceptionCallbacks handler;
    private final ReleaseMonitor releaseMonitor;
    private final RenderSynchronizer renderSynchronizer;
    private final List<RenderUpdate> pendingRenderUpdates = new ArrayList();
    private boolean renderWindowOpen = true;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class HandlerWithExceptionCallbacks extends Handler {
        private final Object callbackLock;
        private final List<Runnable> exceptionCallbacks;

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
            this.callbackLock = new Object();
            this.exceptionCallbacks = new ArrayList();
        }

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.e("EglThread", "Exception on EglThread", e);
                synchronized (this.callbackLock) {
                    try {
                        Iterator<Runnable> it = this.exceptionCallbacks.iterator();
                        while (it.hasNext()) {
                            it.next().run();
                        }
                        throw e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface RenderUpdate {
        void update(boolean z);
    }

    private EglThread(ReleaseMonitor releaseMonitor, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection, RenderSynchronizer renderSynchronizer) {
        this.releaseMonitor = releaseMonitor;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection;
        this.renderSynchronizer = renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.registerListener(this);
        }
    }

    public static /* synthetic */ EglBase.EglConnection a(EglBase.Context context, int[] iArr) {
        return lambda$create$0(context, iArr);
    }

    public static /* synthetic */ boolean b(EglThread eglThread) {
        return lambda$create$1(eglThread);
    }

    public static /* synthetic */ void c(EglThread eglThread) {
        eglThread.lambda$onRenderWindowClose$3();
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr, RenderSynchronizer renderSynchronizer) {
        HandlerThread handlerThread = new HandlerThread("EglThread");
        handlerThread.start();
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(handlerThread.getLooper());
        EglBase.EglConnection eglConnection = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallbacks, new vx(2, context, iArr));
        if (releaseMonitor == null) {
            releaseMonitor = new f05(25);
        }
        return new EglThread(releaseMonitor, handlerWithExceptionCallbacks, eglConnection, renderSynchronizer);
    }

    public static /* synthetic */ void d(EglThread eglThread) {
        eglThread.lambda$onRenderWindowOpen$2();
    }

    private static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return EglBase.EglConnection.createEgl10(iArr);
        }
        return EglBase.EglConnection.create(context, iArr);
    }

    private static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    private /* synthetic */ void lambda$onRenderWindowClose$3() {
        this.renderWindowOpen = false;
    }

    private /* synthetic */ void lambda$onRenderWindowOpen$2() {
        this.renderWindowOpen = true;
        Iterator<RenderUpdate> it = this.pendingRenderUpdates.iterator();
        while (it.hasNext()) {
            it.next().update(false);
        }
        this.pendingRenderUpdates.clear();
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowClose() {
        this.handler.post(new c77(this, 1));
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowOpen() {
        this.handler.post(new c77(this, 0));
    }

    public void release() {
        if (!this.releaseMonitor.onRelease(this)) {
            return;
        }
        RenderSynchronizer renderSynchronizer = this.renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.removeListener(this);
        }
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
        EglBase.EglConnection eglConnection = this.eglConnection;
        Objects.requireNonNull(eglConnection);
        handlerWithExceptionCallbacks.post(new y85(eglConnection, 18));
        this.handler.getLooper().quitSafely();
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.add(renderUpdate);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor, context, iArr, null);
    }
}
