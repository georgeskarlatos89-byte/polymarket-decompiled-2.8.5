package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x8k extends TextureView implements VideoSink, TextureView.SurfaceTextureListener {
    public final RendererCommon.VideoLayoutMeasure a;
    public final EglRenderer b;
    public RendererCommon.RendererEvents c;
    public final Handler d;
    public boolean e;
    public int f;
    public int g;
    public int h;

    public x8k(Context context) {
        super(context, null);
        String resourceName = getResourceName();
        this.a = new RendererCommon.VideoLayoutMeasure();
        this.b = new EglRenderer(resourceName);
        this.d = new Handler(Looper.getMainLooper());
        setSurfaceTextureListener(this);
    }

    private final String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.release();
        super.onDetachedFromWindow();
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        videoFrame.getClass();
        this.b.onFrame(videoFrame);
        final int i = 1;
        if (!this.e) {
            RendererCommon.RendererEvents rendererEvents = this.c;
            if (rendererEvents != null) {
                rendererEvents.onFirstFrameRendered();
            }
            this.e = true;
        }
        if (videoFrame.getRotatedWidth() == this.f && videoFrame.getRotatedHeight() == this.g && videoFrame.getRotation() == this.h) {
            return;
        }
        this.f = videoFrame.getRotatedWidth();
        this.g = videoFrame.getRotatedHeight();
        this.h = videoFrame.getRotation();
        final int i2 = 0;
        post(new Runnable(this) { // from class: w8k
            public final /* synthetic */ x8k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                x8k x8kVar = this.b;
                switch (i3) {
                    case 0:
                        x8kVar.requestLayout();
                        return;
                    default:
                        RendererCommon.RendererEvents rendererEvents2 = x8kVar.c;
                        if (rendererEvents2 != null) {
                            rendererEvents2.onFrameResolutionChanged(x8kVar.f, x8kVar.g, x8kVar.h);
                            return;
                        }
                        return;
                }
            }
        });
        this.d.post(new Runnable(this) { // from class: w8k
            public final /* synthetic */ x8k b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                x8k x8kVar = this.b;
                switch (i3) {
                    case 0:
                        x8kVar.requestLayout();
                        return;
                    default:
                        RendererCommon.RendererEvents rendererEvents2 = x8kVar.c;
                        if (rendererEvents2 != null) {
                            rendererEvents2.onFrameResolutionChanged(x8kVar.f, x8kVar.g, x8kVar.h);
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.setLayoutAspectRatio((i3 - i) / (i4 - i2));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.a.measure(i, i2, this.f, this.g);
        measure.getClass();
        setMeasuredDimension(measure.x, measure.y);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        this.b.createEglSurface(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.releaseEglSurface(new wdi(countDownLatch, 1));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final void setMirror(boolean z) {
        this.b.setMirror(z);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.a.setScalingType(scalingType);
        requestLayout();
    }
}
