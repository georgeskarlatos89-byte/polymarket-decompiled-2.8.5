package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements VideoDecoder.Callback, VideoEncoder.Callback {
    public final /* synthetic */ long a;

    public /* synthetic */ j(long j) {
        this.a = j;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.a(this.a, videoFrame, num, num2);
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.a, encodedImage, codecSpecificInfo);
    }
}
