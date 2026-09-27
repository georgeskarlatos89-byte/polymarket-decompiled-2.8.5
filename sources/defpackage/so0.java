package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.app.PictureInPictureUiState;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.text.StaticLayout;
import android.view.WindowInsets;
import io.sentry.android.core.h1;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class so0 {
    public static /* bridge */ /* synthetic */ int A(ApplicationStartInfo applicationStartInfo) {
        return applicationStartInfo.getReason();
    }

    public static /* bridge */ /* synthetic */ int B(ApplicationStartInfo applicationStartInfo) {
        return applicationStartInfo.getReason();
    }

    public static /* bridge */ /* synthetic */ int a(ApplicationStartInfo applicationStartInfo) {
        return applicationStartInfo.getStartupState();
    }

    public static /* bridge */ /* synthetic */ int b(ProfilingResult profilingResult) {
        return profilingResult.getErrorCode();
    }

    public static /* bridge */ /* synthetic */ ApplicationStartInfo c(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key d() {
        return CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
    }

    public static /* bridge */ /* synthetic */ CameraDevice.CameraDeviceSetup e(CameraManager cameraManager, String str) {
        return cameraManager.getCameraDeviceSetup(str);
    }

    public static /* bridge */ /* synthetic */ CaptureRequest.Key f() {
        return CaptureRequest.FLASH_STRENGTH_LEVEL;
    }

    public static /* bridge */ /* synthetic */ LoudnessCodecController g(int i, pt6 pt6Var, qwb qwbVar) {
        return LoudnessCodecController.create(i, pt6Var, qwbVar);
    }

    public static /* bridge */ /* synthetic */ ProfilingManager h(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ String i(ProfilingResult profilingResult) {
        return profilingResult.getErrorMessage();
    }

    public static /* bridge */ /* synthetic */ List j(ActivityManager activityManager) {
        return activityManager.getHistoricalProcessStartReasons(1);
    }

    public static /* bridge */ /* synthetic */ List k(WindowInsets windowInsets, int i) {
        return windowInsets.getBoundingRects(i);
    }

    public static /* bridge */ /* synthetic */ Map l(ApplicationStartInfo applicationStartInfo) {
        return applicationStartInfo.getStartupTimestamps();
    }

    public static /* bridge */ /* synthetic */ void m(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.isTransitioningToPip();
    }

    public static /* bridge */ /* synthetic */ void n(LoudnessCodecController loudnessCodecController) {
        loudnessCodecController.close();
    }

    public static /* bridge */ /* synthetic */ void o(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public static /* bridge */ /* synthetic */ void p(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }

    public static /* bridge */ /* synthetic */ void q(ProfilingManager profilingManager, Bundle bundle, CancellationSignal cancellationSignal, bk0 bk0Var, h1 h1Var) {
        profilingManager.requestProfiling(3, bundle, "sentry-profiling", cancellationSignal, bk0Var, h1Var);
    }

    public static /* bridge */ /* synthetic */ void r(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static /* bridge */ /* synthetic */ boolean s(CameraDevice.CameraDeviceSetup cameraDeviceSetup, SessionConfiguration sessionConfiguration) {
        return cameraDeviceSetup.isSessionConfigurationSupported(sessionConfiguration);
    }

    public static /* bridge */ /* synthetic */ boolean t(CameraManager cameraManager, String str) {
        return cameraManager.isCameraDeviceSetupSupported(str);
    }

    public static /* bridge */ /* synthetic */ boolean u(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        return loudnessCodecController.addMediaCodec(mediaCodec);
    }

    public static /* bridge */ /* synthetic */ int v(ApplicationStartInfo applicationStartInfo) {
        return applicationStartInfo.getStartType();
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key w() {
        return CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
    }

    public static /* bridge */ /* synthetic */ String x(ProfilingResult profilingResult) {
        return profilingResult.getResultFilePath();
    }

    public static /* bridge */ /* synthetic */ List y(WindowInsets windowInsets, int i) {
        return windowInsets.getBoundingRectsIgnoringVisibility(i);
    }

    public static /* bridge */ /* synthetic */ void z(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }
}
