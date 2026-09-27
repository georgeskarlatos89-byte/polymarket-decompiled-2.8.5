package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import defpackage.vd5;
import defpackage.w0;
import defpackage.woa;
import defpackage.y85;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import okhttp3.internal.http2.Http2;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.EglThread;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final Object threadLock;
    private boolean usePresentationTimeStamp;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EglRenderer.k(EglRenderer.this)) {
                    EglRenderer.l(EglRenderer.this);
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.m(EglRenderer.this);
                synchronized (EglRenderer.k(EglRenderer.this)) {
                    try {
                        if (EglRenderer.i(EglRenderer.this) != null) {
                            EglRenderer.i(EglRenderer.this).getHandler().removeCallbacks(EglRenderer.j(EglRenderer.this));
                            EglRenderer.i(EglRenderer.this).getHandler().postDelayed(EglRenderer.j(EglRenderer.this), 4000L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public static /* synthetic */ void a(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        eglRenderer.lambda$addFrameListener$1(glDrawer, frameListener, f, z);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return woa.n((j / i) / 1000, " us", new StringBuilder());
    }

    public static /* synthetic */ void b(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.lambda$removeFrameListener$2(countDownLatch, frameListener);
    }

    public static /* synthetic */ void c(EglRenderer eglRenderer) {
        eglRenderer.renderFrameOnRenderThread();
    }

    private void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            this.eglBase.makeCurrent();
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public static /* synthetic */ void d(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        eglRenderer.lambda$clearImage$4(f, f2, f3, f4);
    }

    public static /* synthetic */ void e(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.lambda$release$0(countDownLatch);
    }

    public static /* synthetic */ void f(EglRenderer eglRenderer, VideoFrame videoFrame, long j, boolean z) {
        eglRenderer.lambda$swapBuffersOnRenderThread$5(videoFrame, j, z);
    }

    public static /* synthetic */ void g(EglRenderer eglRenderer, Runnable runnable) {
        eglRenderer.lambda$releaseEglSurface$3(runnable);
    }

    public static /* bridge */ /* synthetic */ EglBase h(EglRenderer eglRenderer) {
        return eglRenderer.eglBase;
    }

    public static /* bridge */ /* synthetic */ EglThread i(EglRenderer eglRenderer) {
        return eglRenderer.eglThread;
    }

    public static /* bridge */ /* synthetic */ Runnable j(EglRenderer eglRenderer) {
        return eglRenderer.logStatisticsRunnable;
    }

    public static /* bridge */ /* synthetic */ Object k(EglRenderer eglRenderer) {
        return eglRenderer.threadLock;
    }

    public static /* bridge */ /* synthetic */ void l(EglRenderer eglRenderer) {
        eglRenderer.eglThread = null;
    }

    private /* synthetic */ void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    private /* synthetic */ void lambda$clearImage$4(float f, float f2, float f3, float f4) {
        clearSurfaceOnRenderThread(f, f2, f3, f4);
    }

    private /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    private /* synthetic */ void lambda$releaseEglSurface$3(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    private /* synthetic */ void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private /* synthetic */ void lambda$swapBuffersOnRenderThread$5(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                this.eglBase.makeCurrent();
            } else {
                return;
            }
        }
        boolean z2 = this.usePresentationTimeStamp;
        EglBase eglBase2 = this.eglBase;
        if (z2) {
            eglBase2.swapBuffers(videoFrame.getTimestampNs());
        } else {
            eglBase2.swapBuffers();
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs = (System.nanoTime() - j) + this.renderSwapBufferTimeNs;
        }
    }

    private void logD(String str) {
        Logging.d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th) {
        Logging.e(TAG, this.name + str, th);
    }

    private void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j = nanoTime - this.statisticsStartTimeNs;
                if (j > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                    logD("Duration: " + (j / 1000000) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(((float) (this.framesRendered * Duration.ATTOSECONDS_PER_NANOSECOND)) / ((float) j)) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(nanoTime);
                }
            } finally {
            }
        }
    }

    private void logW(String str) {
        Logging.w(TAG, this.name + str);
    }

    public static /* bridge */ /* synthetic */ void m(EglRenderer eglRenderer) {
        eglRenderer.logStatistics();
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (this.mirrorVertically) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                    int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                    if (rotatedWidth != 0 && rotatedHeight != 0) {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    } else {
                        next.listener.onFrame(null);
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.getHandler().post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void renderFrameOnRenderThread() {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase != null && eglBase.hasSurface()) {
                    this.eglBase.makeCurrent();
                    synchronized (this.fpsReductionLock) {
                        try {
                            long j = this.minRenderPeriodNs;
                            if (j != Long.MAX_VALUE) {
                                if (j > 0) {
                                    long nanoTime = System.nanoTime();
                                    long j2 = this.nextFrameTimeNs;
                                    if (nanoTime < j2) {
                                        logD("Skipping frame rendering - fps reduction is active.");
                                    } else {
                                        long j3 = j2 + this.minRenderPeriodNs;
                                        this.nextFrameTimeNs = j3;
                                        this.nextFrameTimeNs = Math.max(j3, nanoTime);
                                    }
                                }
                                z = true;
                            }
                            z = false;
                        } finally {
                        }
                    }
                    long nanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f = this.layoutAspectRatio;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    }
                    float f5 = 1.0f;
                    if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    Matrix matrix = this.drawMatrix;
                    if (this.mirrorHorizontally) {
                        f4 = -1.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    if (this.mirrorVertically) {
                        f5 = -1.0f;
                    }
                    matrix.preScale(f4, f5);
                    this.drawMatrix.preScale(f3, f2);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long nanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, nanoTime3);
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs = (nanoTime3 - nanoTime2) + this.renderTimeNs;
                                }
                            } catch (GlUtil.GlOutOfMemoryException e) {
                                logE("Error while drawing frame", e);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                                videoFrame.release();
                                return;
                            }
                        }
                        notifyCallbacks(videoFrame, z);
                        videoFrame.release();
                        return;
                    } catch (Throwable th) {
                        videoFrame.release();
                        throw th;
                    }
                }
                logD("Dropping frame - No surface");
                videoFrame.release();
            } finally {
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.scheduleRenderUpdate(new EglThread.RenderUpdate() { // from class: b77
                        @Override // org.webrtc.EglThread.RenderUpdate
                        public final void update(boolean z) {
                            EglRenderer.f(EglRenderer.this, videoFrame, j, z);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: z67
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.a(EglRenderer.this, glDrawer, frameListener, f, z);
            }
        });
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    return;
                }
                eglThread.getHandler().postAtFrontOfQueue(new Runnable() { // from class: a77
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.d(EglRenderer.this, f, f2, f3, f4);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    logD("Initializing EglRenderer");
                    this.eglThread = eglThread;
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z;
                    eglThread.addExceptionCallback(this.eglExceptionCallback);
                    this.eglBase = eglThread.createEglBaseWithSharedConnection();
                    eglThread.getHandler().post(this.eglSurfaceCreationRunnable);
                    resetStatistics(System.nanoTime());
                    eglThread.getHandler().postDelayed(this.logStatisticsRunnable, 4000L);
                } else {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        if (videoFrame2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.eglThread.getHandler().post(new y85(this, 17));
                    } finally {
                    }
                }
                if (z) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    thread = null;
                } else {
                    thread = eglThread.getHandler().getLooper().getThread();
                }
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    logD("Already released");
                    return;
                }
                eglThread.getHandler().removeCallbacks(this.logStatisticsRunnable);
                this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
                this.eglThread.getHandler().postAtFrontOfQueue(new vd5(27, this, countDownLatch));
                this.eglThread.release();
                this.eglThread = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.eglThread.getHandler().postAtFrontOfQueue(new vd5(26, this, runnable));
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() != this.eglThread.getHandler().getLooper().getThread()) {
                    postToRenderThread(new w0(this, countDownLatch, frameListener, 14));
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f) {
        long j;
        synchronized (this.fpsReductionLock) {
            try {
                long j2 = this.minRenderPeriodNs;
                if (f <= 0.0f) {
                    j = Long.MAX_VALUE;
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    j = 1.0E9f / f;
                    this.minRenderPeriodNs = j;
                }
                if (j != j2) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.h(EglRenderer.this) != null && !EglRenderer.h(EglRenderer.this).hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.h(EglRenderer.this).createSurface((Surface) this.surface);
                    } else if (obj instanceof SurfaceTexture) {
                        EglRenderer.h(EglRenderer.this).createSurface((SurfaceTexture) this.surface);
                    } else {
                        throw new IllegalStateException("Invalid surface: " + this.surface);
                    }
                    EglRenderer.h(EglRenderer.this).makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        public /* synthetic */ EglSurfaceCreation(EglRenderer eglRenderer, int i) {
            this();
        }
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create(null, context, iArr), glDrawer, z);
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
