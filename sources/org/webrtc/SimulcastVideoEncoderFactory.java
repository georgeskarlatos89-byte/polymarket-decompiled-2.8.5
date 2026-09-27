package org.webrtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SimulcastVideoEncoderFactory implements VideoEncoderFactory {
    VideoEncoderFactory fallback;
    VideoEncoderFactory primary;

    public SimulcastVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2) {
        this.primary = videoEncoderFactory;
        this.fallback = videoEncoderFactory2;
    }

    public static native VideoCodecInfo nativeAV1Codec();

    public static native List<VideoCodecInfo> nativeVP9Codecs();

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return new SimulcastVideoEncoder(this.primary, this.fallback, videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(this.primary.getSupportedCodecs()));
        VideoEncoderFactory videoEncoderFactory = this.fallback;
        if (videoEncoderFactory != null) {
            arrayList.addAll(Arrays.asList(videoEncoderFactory.getSupportedCodecs()));
        }
        arrayList.addAll(nativeVP9Codecs());
        arrayList.add(nativeAV1Codec());
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
