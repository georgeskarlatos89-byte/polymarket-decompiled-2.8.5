package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class VideoDecoderWrapper {
    public static /* synthetic */ void a(long j, VideoFrame videoFrame, Integer num, Integer num2) {
        lambda$createDecoderCallback$0(j, videoFrame, num, num2);
    }

    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new j(j);
    }

    private static /* synthetic */ void lambda$createDecoderCallback$0(long j, VideoFrame videoFrame, Integer num, Integer num2) {
        nativeOnDecodedFrame(j, videoFrame, num, num2);
    }

    private static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
