package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.ace;
import defpackage.b35;
import defpackage.dmk;
import defpackage.kd0;
import defpackage.lig;
import defpackage.nei;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private final FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private VideoSink listener;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.n(SurfaceTextureHelper.this);
                if (SurfaceTextureHelper.h(SurfaceTextureHelper.this) != null) {
                    SurfaceTextureHelper.h(SurfaceTextureHelper.this).onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.h(SurfaceTextureHelper.this) != null) {
                    SurfaceTextureHelper.h(SurfaceTextureHelper.this).onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.h(SurfaceTextureHelper.this) != null) {
                    SurfaceTextureHelper.h(SurfaceTextureHelper.this).onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                Logging.d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.j(SurfaceTextureHelper.this));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                SurfaceTextureHelper.l(surfaceTextureHelper, SurfaceTextureHelper.j(surfaceTextureHelper));
                SurfaceTextureHelper.m(SurfaceTextureHelper.this);
                if (SurfaceTextureHelper.i(SurfaceTextureHelper.this)) {
                    SurfaceTextureHelper.o(SurfaceTextureHelper.this);
                    SurfaceTextureHelper.k(SurfaceTextureHelper.this);
                }
            }
        };
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            this.timestampAligner = z ? new TimestampAligner() : null;
            this.yuvConverter = yuvConverter;
            this.frameRefMonitor = frameRefMonitor;
            EglBase create = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new lig(this, 1), handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        dmk.n("SurfaceTextureHelper must be created on the handler thread");
        throw null;
    }

    public static /* synthetic */ void a(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.lambda$stopListening$1();
    }

    public static /* synthetic */ void b(SurfaceTextureHelper surfaceTextureHelper, int i) {
        surfaceTextureHelper.lambda$setFrameRotation$4(i);
    }

    public static /* synthetic */ void c(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.lambda$returnTextureFrame$5();
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final YuvConverter yuvConverter, final FrameRefMonitor frameRefMonitor) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public SurfaceTextureHelper call2() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, handler, z, yuvConverter, frameRefMonitor, 0);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ SurfaceTextureHelper call() {
                return call2();
            }
        });
    }

    public static /* synthetic */ void d(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.lambda$dispose$6();
    }

    public static /* synthetic */ void e(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.lambda$forceFrame$3();
    }

    public static /* synthetic */ void f(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        surfaceTextureHelper.lambda$new$0(surfaceTexture);
    }

    public static /* synthetic */ void g(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        surfaceTextureHelper.lambda$setTextureSize$2(i, i2);
    }

    public static /* bridge */ /* synthetic */ FrameRefMonitor h(SurfaceTextureHelper surfaceTextureHelper) {
        return surfaceTextureHelper.frameRefMonitor;
    }

    public static /* bridge */ /* synthetic */ boolean i(SurfaceTextureHelper surfaceTextureHelper) {
        return surfaceTextureHelper.hasPendingTexture;
    }

    public static /* bridge */ /* synthetic */ VideoSink j(SurfaceTextureHelper surfaceTextureHelper) {
        return surfaceTextureHelper.pendingListener;
    }

    public static /* bridge */ /* synthetic */ void k(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.hasPendingTexture = false;
    }

    public static /* bridge */ /* synthetic */ void l(SurfaceTextureHelper surfaceTextureHelper, VideoSink videoSink) {
        surfaceTextureHelper.listener = videoSink;
    }

    private /* synthetic */ void lambda$dispose$6() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    private /* synthetic */ void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    private /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    private /* synthetic */ void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    private /* synthetic */ void lambda$setFrameRotation$4(int i) {
        this.frameRotation = i;
    }

    private /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    private /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    public static /* bridge */ /* synthetic */ void m(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.pendingListener = null;
    }

    public static /* bridge */ /* synthetic */ void n(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.returnTextureFrame();
    }

    public static /* bridge */ /* synthetic */ void o(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.updateTexImage();
    }

    private void release() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isTextureInUse && this.isQuitting) {
                this.yuvConverter.release();
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                this.surfaceTexture.release();
                this.eglBase.release();
                this.handler.getLooper().quit();
                TimestampAligner timestampAligner = this.timestampAligner;
                if (timestampAligner != null) {
                    timestampAligner.dispose();
                    return;
                }
                return;
            }
            dmk.n("Unexpected release.");
            return;
        }
        dmk.n("Wrong thread.");
    }

    private void returnTextureFrame() {
        this.handler.post(new nei(this, 2));
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                if (this.textureWidth != 0 && this.textureHeight != 0) {
                    this.isTextureInUse = true;
                    this.hasPendingTexture = false;
                    updateTexImage();
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    long timestamp = this.surfaceTexture.getTimestamp();
                    TimestampAligner timestampAligner = this.timestampAligner;
                    if (timestampAligner != null) {
                        timestamp = timestampAligner.translateTimestamp(timestamp);
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
                    FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
                    if (frameRefMonitor != null) {
                        frameRefMonitor.onNewBuffer(textureBufferImpl);
                    }
                    VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
                    this.listener.onFrame(videoFrame);
                    videoFrame.release();
                    return;
                }
                Logging.w(TAG, "Texture size has not been set.");
                return;
            }
            return;
        }
        dmk.n("Wrong thread.");
    }

    private void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new nei(this, 1));
    }

    public void forceFrame() {
        this.handler.post(new nei(this, 3));
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(int i) {
        this.handler.post(new kd0(this, i, 9));
    }

    public void setTextureSize(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                this.handler.post(new b35(this, i, i2, 2));
                return;
            } else {
                dmk.v(ace.f(i2, "Texture height must be positive, but was "));
                return;
            }
        }
        dmk.v(ace.f(i, "Texture width must be positive, but was "));
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        } else {
            dmk.n("SurfaceTextureHelper listener has already been set.");
        }
    }

    public void stopListening() {
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new nei(this, 0));
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }

    public /* synthetic */ SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor, int i) {
        this(context, handler, z, yuvConverter, frameRefMonitor);
    }
}
