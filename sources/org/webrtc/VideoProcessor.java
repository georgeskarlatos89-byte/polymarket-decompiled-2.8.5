package org.webrtc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface VideoProcessor extends CapturerObserver {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
            this.cropX = i;
            this.cropY = i2;
            this.cropWidth = i3;
            this.cropHeight = i4;
            this.scaleWidth = i5;
            this.scaleHeight = i6;
            this.timestampNs = j;
            this.drop = z;
        }
    }

    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame applyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        }
    }

    void setSink(VideoSink videoSink);
}
