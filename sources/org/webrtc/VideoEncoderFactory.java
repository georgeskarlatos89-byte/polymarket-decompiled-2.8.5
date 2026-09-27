package org.webrtc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface VideoEncoderFactory {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface VideoEncoderSelector {
        VideoCodecInfo onAvailableBitrate(int i);

        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        VideoCodecInfo onEncoderBroken();

        default VideoCodecInfo onResolutionChange(int i, int i2) {
            return null;
        }
    }

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    default VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    default VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    VideoCodecInfo[] getSupportedCodecs();
}
