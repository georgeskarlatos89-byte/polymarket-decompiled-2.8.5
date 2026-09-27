package org.webrtc;

import defpackage.lvf;
import defpackage.sv6;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.EglBase;
import org.webrtc.SimulcastAlignedVideoEncoderFactory;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;", "Lorg/webrtc/VideoEncoderFactory;", "sharedContext", "Lorg/webrtc/EglBase$Context;", "enableIntelVp8Encoder", "", "enableH264HighProfile", "resolutionAdjustment", "Lorg/webrtc/ResolutionAdjustment;", "(Lorg/webrtc/EglBase$Context;ZZLorg/webrtc/ResolutionAdjustment;)V", "fallback", "native", "Lorg/webrtc/SimulcastVideoEncoderFactory;", "primary", "createEncoder", "Lorg/webrtc/VideoEncoder;", "info", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "StreamEncoderWrapper", "StreamEncoderWrapperFactory", "stream-webrtc-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimulcastAlignedVideoEncoderFactory implements VideoEncoderFactory {
    private final VideoEncoderFactory fallback;
    private final SimulcastVideoEncoderFactory native;
    private final VideoEncoderFactory primary;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;", "Lorg/webrtc/VideoEncoderFactory;", "factory", "(Lorg/webrtc/VideoEncoderFactory;)V", "createEncoder", "Lorg/webrtc/VideoEncoder;", "videoCodecInfo", "Lorg/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lorg/webrtc/VideoCodecInfo;", "stream-webrtc-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory videoEncoderFactory) {
            videoEncoderFactory.getClass();
            this.factory = videoEncoderFactory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder createEncoder = this.factory.createEncoder(videoCodecInfo);
            if (createEncoder == null) {
                return null;
            }
            return new StreamEncoderWrapper(createEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            VideoCodecInfo[] supportedCodecs = this.factory.getSupportedCodecs();
            supportedCodecs.getClass();
            return supportedCodecs;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [org.webrtc.HardwareVideoEncoderWrapperFactory] */
    public SimulcastAlignedVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, ResolutionAdjustment resolutionAdjustment) {
        resolutionAdjustment.getClass();
        HardwareVideoEncoderFactory hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2);
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(resolutionAdjustment != ResolutionAdjustment.NONE ? new HardwareVideoEncoderWrapperFactory(hardwareVideoEncoderFactory, resolutionAdjustment.getValue()) : hardwareVideoEncoderFactory);
        this.primary = streamEncoderWrapperFactory;
        SoftwareVideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        this.fallback = softwareVideoEncoderFactory;
        this.native = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, softwareVideoEncoderFactory);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo info) {
        return this.native.createEncoder(info);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.native.getSupportedCodecs();
        supportedCodecs.getClass();
        return supportedCodecs;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;", "Lorg/webrtc/VideoEncoder;", "encoder", "(Lorg/webrtc/VideoEncoder;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "streamSettings", "Lorg/webrtc/VideoEncoder$Settings;", "encode", "Lorg/webrtc/VideoCodecStatus;", "frame", "Lorg/webrtc/VideoFrame;", "encodeInfo", "Lorg/webrtc/VideoEncoder$EncodeInfo;", "getImplementationName", "", "getScalingSettings", "Lorg/webrtc/VideoEncoder$ScalingSettings;", "initEncode", "settings", "callback", "Lorg/webrtc/VideoEncoder$Callback;", "release", "setRateAllocation", "allocation", "Lorg/webrtc/VideoEncoder$BitrateAllocation;", "frameRate", "", "Companion", "stream-webrtc-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StreamEncoderWrapper implements VideoEncoder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String TAG = lvf.a.getOrCreateKotlinClass(StreamEncoderWrapper.class).getSimpleName();
        private final VideoEncoder encoder;
        private final ExecutorService executor;
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder videoEncoder) {
            videoEncoder.getClass();
            this.encoder = videoEncoder;
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            newSingleThreadExecutor.getClass();
            this.executor = newSingleThreadExecutor;
        }

        public static /* synthetic */ VideoCodecStatus a(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
            return setRateAllocation$lambda$5(streamEncoderWrapper, bitrateAllocation, i);
        }

        public static final /* synthetic */ String access$getTAG$cp() {
            return TAG;
        }

        public static /* synthetic */ VideoEncoder.ScalingSettings b(StreamEncoderWrapper streamEncoderWrapper) {
            return getScalingSettings$lambda$6(streamEncoderWrapper);
        }

        public static /* synthetic */ String c(StreamEncoderWrapper streamEncoderWrapper) {
            return getImplementationName$lambda$7(streamEncoderWrapper);
        }

        public static /* synthetic */ VideoCodecStatus d(StreamEncoderWrapper streamEncoderWrapper) {
            return release$lambda$1(streamEncoderWrapper);
        }

        public static /* synthetic */ VideoCodecStatus e(StreamEncoderWrapper streamEncoderWrapper, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            return encode$lambda$4(streamEncoderWrapper, videoFrame, encodeInfo);
        }

        private static final VideoCodecStatus encode$lambda$4(StreamEncoderWrapper streamEncoderWrapper, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            VideoCodecStatus videoCodecStatus;
            streamEncoderWrapper.getClass();
            videoFrame.getClass();
            VideoEncoder.Settings settings = streamEncoderWrapper.streamSettings;
            if (settings != null) {
                if (videoFrame.getBuffer().getWidth() == settings.width) {
                    videoCodecStatus = streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
                } else {
                    VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(0, 0, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), settings.width, settings.height);
                    videoCodecStatus = streamEncoderWrapper.encoder.encode(new VideoFrame(cropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
                    cropAndScale.release();
                }
            } else {
                videoCodecStatus = null;
            }
            if (videoCodecStatus == null) {
                return VideoCodecStatus.ERROR;
            }
            return videoCodecStatus;
        }

        public static /* synthetic */ VideoCodecStatus f(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            return initEncode$lambda$0(streamEncoderWrapper, settings, callback);
        }

        private static final String getImplementationName$lambda$7(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getImplementationName();
        }

        private static final VideoEncoder.ScalingSettings getScalingSettings$lambda$6(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getScalingSettings();
        }

        private static final VideoCodecStatus initEncode$lambda$0(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            streamEncoderWrapper.getClass();
            settings.getClass();
            String str = TAG;
            String name = Thread.currentThread().getName();
            long id = Thread.currentThread().getId();
            String implementationName = streamEncoderWrapper.encoder.getImplementationName();
            int i = settings.numberOfCores;
            int i2 = settings.width;
            int i3 = settings.height;
            int i4 = settings.startBitrate;
            int i5 = settings.maxFramerate;
            boolean z = settings.automaticResizeOn;
            int i6 = settings.numberOfSimulcastStreams;
            boolean z2 = settings.capabilities.lossNotification;
            StringBuilder sb = new StringBuilder("initEncode() thread=");
            sb.append(name);
            sb.append(" [");
            sb.append(id);
            sb.append("]\n                        |  encoder=");
            sb.append(implementationName);
            sb.append("\n                        |  streamSettings:\n                        |    numberOfCores=");
            sb.append(i);
            sv6.w(i2, i3, "\n                        |    width=", "\n                        |    height=", sb);
            sv6.w(i4, i5, "\n                        |    startBitrate=", "\n                        |    maxFramerate=", sb);
            sb.append("\n                        |    automaticResizeOn=");
            sb.append(z);
            sb.append("\n                        |    numberOfSimulcastStreams=");
            sb.append(i6);
            sb.append("\n                        |    lossNotification=");
            sb.append(z2);
            sb.append("\n            ");
            Logging.v(str, kotlin.text.c.d(sb.toString()));
            return streamEncoderWrapper.encoder.initEncode(settings, callback);
        }

        private static final VideoCodecStatus release$lambda$1(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.release();
        }

        private static final VideoCodecStatus setRateAllocation$lambda$5(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.setRateAllocation(bitrateAllocation, i);
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) {
            frame.getClass();
            Object obj = this.executor.submit(new h(this, frame, encodeInfo, 1)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public String getImplementationName() {
            Object obj = this.executor.submit(new g(this, 1)).get();
            obj.getClass();
            return (String) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() {
            Object obj = this.executor.submit(new g(this, 0)).get();
            obj.getClass();
            return (VideoEncoder.ScalingSettings) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            settings.getClass();
            this.streamSettings = settings;
            Object obj = this.executor.submit(new h(this, settings, callback, 0)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus release() {
            Object obj = this.executor.submit(new g(this, 2)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) {
            Object obj = this.executor.submit(new Callable() { // from class: org.webrtc.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.a(SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.this, allocation, frameRate);
                }
            }).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "stream-webrtc-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getTAG() {
                return StreamEncoderWrapper.access$getTAG$cp();
            }

            private Companion() {
            }
        }
    }

    public /* synthetic */ SimulcastAlignedVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, ResolutionAdjustment resolutionAdjustment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, resolutionAdjustment);
    }
}
