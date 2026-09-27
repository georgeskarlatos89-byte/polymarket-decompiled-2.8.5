package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class VideoEncoderWrapper {
    public static /* synthetic */ void a(long j, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        lambda$createEncoderCallback$0(j, encodedImage, codecSpecificInfo);
    }

    public static VideoEncoder.Callback createEncoderCallback(long j) {
        return new j(j);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    private static /* synthetic */ void lambda$createEncoderCallback$0(long j, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j, encodedImage);
    }

    private static native void nativeOnEncodedFrame(long j, EncodedImage encodedImage);
}
