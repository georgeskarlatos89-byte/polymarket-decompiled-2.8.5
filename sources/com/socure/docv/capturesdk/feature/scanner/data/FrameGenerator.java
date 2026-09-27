package com.socure.docv.capturesdk.feature.scanner.data;

import android.app.Activity;
import android.widget.VideoView;
import com.socure.docv.capturesdk.core.provider.interfaces.b;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGenerator;", "", "", "manualCaptureOnly", "Landroid/app/Activity;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/widget/VideoView;", "videoView", "", "filePath", "Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGeneratorCallback;", "callback", "<init>", "(ZLandroid/app/Activity;Landroid/widget/VideoView;Ljava/lang/String;Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGeneratorCallback;)V", "Lcom/socure/docv/capturesdk/core/provider/interfaces/b;", "frameDispatcher", "", "addFrameDispatcher", "(Lcom/socure/docv/capturesdk/core/provider/interfaces/b;)V", "Z", "Landroid/app/Activity;", "Landroid/widget/VideoView;", "Ljava/lang/String;", "Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGeneratorCallback;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/b;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FrameGenerator {
    public static final int $stable = 8;
    private final Activity activity;
    private final FrameGeneratorCallback callback;
    private final String filePath;
    private b frameDispatcher;
    private final boolean manualCaptureOnly;
    private final VideoView videoView;

    public FrameGenerator(boolean z, Activity activity, VideoView videoView, String str, FrameGeneratorCallback frameGeneratorCallback) {
        activity.getClass();
        videoView.getClass();
        str.getClass();
        frameGeneratorCallback.getClass();
        this.manualCaptureOnly = z;
        this.activity = activity;
        this.videoView = videoView;
        this.filePath = str;
        this.callback = frameGeneratorCallback;
    }

    public final void addFrameDispatcher(b frameDispatcher) {
        frameDispatcher.getClass();
    }
}
