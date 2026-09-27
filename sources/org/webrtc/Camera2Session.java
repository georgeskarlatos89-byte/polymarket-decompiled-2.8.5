package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import defpackage.ace;
import defpackage.dmk;
import defpackage.k84;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private SessionState state = SessionState.RUNNING;
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Logging.d(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    public static /* bridge */ /* synthetic */ CameraSession.CreateSessionCallback a(Camera2Session camera2Session) {
        return camera2Session.callback;
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics b(Camera2Session camera2Session) {
        return camera2Session.cameraCharacteristics;
    }

    public static /* bridge */ /* synthetic */ CameraDevice c(Camera2Session camera2Session) {
        return camera2Session.cameraDevice;
    }

    private void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        dmk.n("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ int d(Camera2Session camera2Session) {
        return camera2Session.cameraOrientation;
    }

    public static /* bridge */ /* synthetic */ Handler e(Camera2Session camera2Session) {
        return camera2Session.cameraThreadHandler;
    }

    public static /* bridge */ /* synthetic */ CameraEnumerationAndroid.CaptureFormat f(Camera2Session camera2Session) {
        return camera2Session.captureFormat;
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.d(TAG, "Available preview sizes: " + supportedSizes);
        Logging.d(TAG, "Available fps ranges: " + convertFramerates);
        if (!convertFramerates.isEmpty() && !supportedSizes.isEmpty()) {
            CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
            Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
            CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
            this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
            Logging.d(TAG, "Using capture format: " + this.captureFormat);
            return;
        }
        reportError("No supported capture formats.");
    }

    public static /* bridge */ /* synthetic */ CameraCaptureSession g(Camera2Session camera2Session) {
        return camera2Session.captureSession;
    }

    private int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    public static /* bridge */ /* synthetic */ long h(Camera2Session camera2Session) {
        return camera2Session.constructionTimeNs;
    }

    public static /* bridge */ /* synthetic */ CameraSession.Events i(Camera2Session camera2Session) {
        return camera2Session.events;
    }

    public static /* bridge */ /* synthetic */ boolean j(Camera2Session camera2Session) {
        return camera2Session.firstFrameReported;
    }

    public static /* bridge */ /* synthetic */ int k(Camera2Session camera2Session) {
        return camera2Session.fpsUnitFactor;
    }

    public static /* bridge */ /* synthetic */ boolean l(Camera2Session camera2Session) {
        return camera2Session.isCameraFrontFacing;
    }

    public static /* bridge */ /* synthetic */ SessionState m(Camera2Session camera2Session) {
        return camera2Session.state;
    }

    public static /* bridge */ /* synthetic */ Surface n(Camera2Session camera2Session) {
        return camera2Session.surface;
    }

    public static /* bridge */ /* synthetic */ SurfaceTextureHelper o(Camera2Session camera2Session) {
        return camera2Session.surfaceTextureHelper;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        Logging.d(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(this, 0), this.cameraThreadHandler);
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
            reportError("Failed to open camera: " + e);
        }
    }

    public static /* bridge */ /* synthetic */ void p(Camera2Session camera2Session, CameraDevice cameraDevice) {
        camera2Session.cameraDevice = cameraDevice;
    }

    public static /* bridge */ /* synthetic */ void q(Camera2Session camera2Session, CameraCaptureSession cameraCaptureSession) {
        camera2Session.captureSession = cameraCaptureSession;
    }

    public static /* bridge */ /* synthetic */ void r(Camera2Session camera2Session) {
        camera2Session.firstFrameReported = true;
    }

    private void reportError(String str) {
        boolean z;
        checkIsOnCameraThread();
        Logging.e(TAG, "Error: " + str);
        if (this.captureSession == null && this.state != SessionState.STOPPED) {
            z = true;
        } else {
            z = false;
        }
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    public static /* bridge */ /* synthetic */ void s(Camera2Session camera2Session, SessionState sessionState) {
        camera2Session.state = sessionState;
    }

    private void start() {
        boolean z;
        checkIsOnCameraThread();
        Logging.d(TAG, OpsMetricTracker.START);
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.isCameraFrontFacing = z;
            findCaptureFormat();
            if (this.captureFormat == null) {
                return;
            }
            openCamera();
        } catch (CameraAccessException | IllegalArgumentException e) {
            reportError(k84.e(e, new StringBuilder("getCameraCharacteristics(): ")));
        }
    }

    private void stopInternal() {
        Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        Logging.d(TAG, "Stop done");
    }

    public static /* bridge */ /* synthetic */ void t(Camera2Session camera2Session, Surface surface) {
        camera2Session.surface = surface;
    }

    public static /* bridge */ /* synthetic */ void u(Camera2Session camera2Session) {
        camera2Session.checkIsOnCameraThread();
    }

    public static /* bridge */ /* synthetic */ int v(Camera2Session camera2Session) {
        return camera2Session.getFrameOrientation();
    }

    public static /* bridge */ /* synthetic */ void w(Camera2Session camera2Session, String str) {
        camera2Session.reportError(str);
    }

    public static /* bridge */ /* synthetic */ void x(Camera2Session camera2Session) {
        camera2Session.stopInternal();
    }

    public static /* bridge */ /* synthetic */ Histogram y() {
        return camera2StartTimeMsHistogram;
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.d(TAG, "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) ((System.nanoTime() - nanoTime) / 1000000));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public /* synthetic */ CameraCaptureCallback(int i) {
            this();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.d(Camera2Session.TAG, "Capture failed: " + captureFailure);
        }

        private CameraCaptureCallback() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class CameraStateCallback extends CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private String getErrorDescription(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return ace.f(i, "Unknown camera error: ");
                            }
                            return "Camera service has encountered a fatal error.";
                        }
                        return "Camera device has encountered a fatal error.";
                    }
                    return "Camera device could not be opened due to a device policy.";
                }
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            return "Camera device is in use already.";
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.u(Camera2Session.this);
            Logging.d(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.i(Camera2Session.this).onCameraClosed(Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            boolean z;
            Camera2Session.u(Camera2Session.this);
            if (Camera2Session.g(Camera2Session.this) == null && Camera2Session.m(Camera2Session.this) != SessionState.STOPPED) {
                z = true;
            } else {
                z = false;
            }
            Camera2Session.s(Camera2Session.this, SessionState.STOPPED);
            Camera2Session.x(Camera2Session.this);
            Camera2Session camera2Session = Camera2Session.this;
            if (z) {
                Camera2Session.a(camera2Session).onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.i(camera2Session).onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.u(Camera2Session.this);
            Camera2Session.w(Camera2Session.this, getErrorDescription(i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.u(Camera2Session.this);
            Logging.d(Camera2Session.TAG, "Camera opened.");
            Camera2Session.p(Camera2Session.this, cameraDevice);
            Camera2Session.o(Camera2Session.this).setTextureSize(Camera2Session.f(Camera2Session.this).width, Camera2Session.f(Camera2Session.this).height);
            Camera2Session.t(Camera2Session.this, new Surface(Camera2Session.o(Camera2Session.this).getSurfaceTexture()));
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.n(Camera2Session.this)), new CaptureSessionCallback(Camera2Session.this, 0), Camera2Session.e(Camera2Session.this));
            } catch (CameraAccessException e) {
                Camera2Session.w(Camera2Session.this, "Failed to create capture session. " + e);
            }
        }

        public /* synthetic */ CameraStateCallback(Camera2Session camera2Session, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        public static /* synthetic */ void a(CaptureSessionCallback captureSessionCallback, VideoFrame videoFrame) {
            captureSessionCallback.lambda$onConfigured$0(videoFrame);
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i : (int[]) Camera2Session.b(Camera2Session.this).get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Logging.d(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.d(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.b(Camera2Session.this).get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Logging.d(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) Camera2Session.b(Camera2Session.this).get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 1) {
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        Logging.d(Camera2Session.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            Logging.d(Camera2Session.TAG, "Stabilization not available.");
        }

        private /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.u(Camera2Session.this);
            if (Camera2Session.m(Camera2Session.this) != SessionState.RUNNING) {
                Logging.d(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.j(Camera2Session.this)) {
                Camera2Session.r(Camera2Session.this);
                Camera2Session.y().addSample((int) ((System.nanoTime() - Camera2Session.h(Camera2Session.this)) / 1000000));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.l(Camera2Session.this), -Camera2Session.d(Camera2Session.this)), Camera2Session.v(Camera2Session.this), videoFrame.getTimestampNs());
            Camera2Session.i(Camera2Session.this).onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.u(Camera2Session.this);
            cameraCaptureSession.close();
            Camera2Session.w(Camera2Session.this, "Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.u(Camera2Session.this);
            Logging.d(Camera2Session.TAG, "Camera capture session configured.");
            Camera2Session.q(Camera2Session.this, cameraCaptureSession);
            try {
                CaptureRequest.Builder createCaptureRequest = Camera2Session.c(Camera2Session.this).createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.f(Camera2Session.this).framerate.min / Camera2Session.k(Camera2Session.this)), Integer.valueOf(Camera2Session.f(Camera2Session.this).framerate.max / Camera2Session.k(Camera2Session.this))));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(Camera2Session.n(Camera2Session.this));
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(0), Camera2Session.e(Camera2Session.this));
                Camera2Session.o(Camera2Session.this).startListening(new a(this, 1));
                Logging.d(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.a(Camera2Session.this).onDone(Camera2Session.this);
            } catch (CameraAccessException e) {
                Camera2Session.w(Camera2Session.this, "Failed to start capture request. " + e);
            }
        }

        public /* synthetic */ CaptureSessionCallback(Camera2Session camera2Session, int i) {
            this();
        }
    }
}
