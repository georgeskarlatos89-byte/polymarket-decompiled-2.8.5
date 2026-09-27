package org.webrtc;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    public static /* bridge */ /* synthetic */ long a(SoftwareVideoEncoderFactory softwareVideoEncoderFactory) {
        return softwareVideoEncoderFactory.nativeFactory;
    }

    public static /* bridge */ /* synthetic */ long b(long j, long j2, VideoCodecInfo videoCodecInfo) {
        return nativeCreate(j, j2, videoCodecInfo);
    }

    private static native long nativeCreate(long j, long j2, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j);

    private static native boolean nativeIsSupported(long j, VideoCodecInfo videoCodecInfo);

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (!nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            Logging.w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoEncoder() { // from class: org.webrtc.SoftwareVideoEncoderFactory.1
            @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
            public long createNative(long j) {
                return SoftwareVideoEncoderFactory.b(SoftwareVideoEncoderFactory.a(SoftwareVideoEncoderFactory.this), j, videoCodecInfo);
            }

            @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
            public boolean isHardwareEncoder() {
                return false;
            }
        };
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
