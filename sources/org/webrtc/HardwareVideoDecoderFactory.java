package org.webrtc;

import android.media.MediaCodecInfo;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public /* bridge */ /* synthetic */ boolean test(MediaCodecInfo mediaCodecInfo) {
            return test2(mediaCodecInfo);
        }

        /* renamed from: test, reason: avoid collision after fix types in other method */
        public boolean test2(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        super(context, r3);
        Predicate<MediaCodecInfo> and;
        if (predicate == null) {
            and = defaultAllowedPredicate;
        } else {
            and = predicate.and(defaultAllowedPredicate);
        }
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
