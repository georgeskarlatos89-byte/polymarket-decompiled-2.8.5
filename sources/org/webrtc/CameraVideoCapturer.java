package org.webrtc;

import android.media.MediaRecorder;
import com.socure.docv.capturesdk.common.utils.Scanner;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver;
        private final CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(CameraStatistics.TAG, "Camera fps: " + Math.round((CameraStatistics.b(CameraStatistics.this) * 1000.0f) / 2000.0f) + ".");
                    int b = CameraStatistics.b(CameraStatistics.this);
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (b == 0) {
                        CameraStatistics.f(cameraStatistics, CameraStatistics.c(cameraStatistics) + 1);
                        if (CameraStatistics.c(CameraStatistics.this) * CameraStatistics.CAMERA_OBSERVER_PERIOD_MS >= CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS && CameraStatistics.a(CameraStatistics.this) != null) {
                            Logging.e(CameraStatistics.TAG, "Camera freezed.");
                            boolean isTextureInUse = CameraStatistics.d(CameraStatistics.this).isTextureInUse();
                            CameraStatistics cameraStatistics2 = CameraStatistics.this;
                            if (isTextureInUse) {
                                CameraStatistics.a(cameraStatistics2).onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.a(cameraStatistics2).onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        CameraStatistics.f(cameraStatistics, 0);
                    }
                    CameraStatistics.e(CameraStatistics.this);
                    CameraStatistics.d(CameraStatistics.this).getHandler().postDelayed(this, Scanner.CAMERA_SETUP_DELAY_MS);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper.getHandler().postDelayed(runnable, Scanner.CAMERA_SETUP_DELAY_MS);
                return;
            }
            dmk.v("SurfaceTextureHelper is null");
            throw null;
        }

        public static /* bridge */ /* synthetic */ CameraEventsHandler a(CameraStatistics cameraStatistics) {
            return cameraStatistics.eventsHandler;
        }

        public static /* bridge */ /* synthetic */ int b(CameraStatistics cameraStatistics) {
            return cameraStatistics.frameCount;
        }

        public static /* bridge */ /* synthetic */ int c(CameraStatistics cameraStatistics) {
            return cameraStatistics.freezePeriodCount;
        }

        private void checkThread() {
            if (Thread.currentThread() == this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                return;
            }
            dmk.n("Wrong thread");
        }

        public static /* bridge */ /* synthetic */ SurfaceTextureHelper d(CameraStatistics cameraStatistics) {
            return cameraStatistics.surfaceTextureHelper;
        }

        public static /* bridge */ /* synthetic */ void e(CameraStatistics cameraStatistics) {
            cameraStatistics.frameCount = 0;
        }

        public static /* bridge */ /* synthetic */ void f(CameraStatistics cameraStatistics, int i) {
            cameraStatistics.freezePeriodCount = i;
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Deprecated
    /* loaded from: classes6.dex */
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    default void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Deprecated
    default void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler, String str);
}
