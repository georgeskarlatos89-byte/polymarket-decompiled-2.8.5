package org.webrtc;

import java.util.Arrays;
import java.util.HashSet;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class DefaultBlacklistedVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "DefaultBlacklistedVideoDecoderFactory";
    private static final java.util.function.Predicate<VideoDecoder> defaultBlacklistedPredicate = new Object();
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final java.util.function.Predicate<VideoDecoder> isHardwareDecoderBlacklisted;
    private final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final VideoDecoderFactory softwareVideoDecoderFactory;

    public DefaultBlacklistedVideoDecoderFactory(EglBase.Context context, java.util.function.Predicate<VideoDecoder> predicate) {
        java.util.function.Predicate<VideoDecoder> or;
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
        if (predicate == null) {
            or = defaultBlacklistedPredicate;
        } else {
            or = predicate.or(defaultBlacklistedPredicate);
        }
        this.isHardwareDecoderBlacklisted = or;
    }

    public static /* synthetic */ boolean a(VideoDecoder videoDecoder) {
        return lambda$static$0(videoDecoder);
    }

    private static boolean isExynosVP9(VideoDecoder videoDecoder) {
        if (videoDecoder == null) {
            return false;
        }
        String lowerCase = videoDecoder.getImplementationName().toLowerCase();
        if (!lowerCase.contains("exynos") || !lowerCase.contains("vp9")) {
            return false;
        }
        return true;
    }

    private static /* synthetic */ boolean lambda$static$0(VideoDecoder videoDecoder) {
        return isExynosVP9(videoDecoder);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder == null) {
            createDecoder = this.platformSoftwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (this.isHardwareDecoderBlacklisted.test(createDecoder2)) {
            Logging.d(TAG, "Hardware decoder is blacklisted: " + createDecoder2.getImplementationName());
            return createDecoder;
        }
        if (createDecoder2 != null && createDecoder != null) {
            return new VideoDecoderFallback(createDecoder, createDecoder2);
        }
        if (createDecoder2 != null) {
            return createDecoder2;
        }
        return createDecoder;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        hashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        hashSet.addAll(Arrays.asList(this.platformSoftwareVideoDecoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) hashSet.toArray(new VideoCodecInfo[0]);
    }

    public DefaultBlacklistedVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }
}
