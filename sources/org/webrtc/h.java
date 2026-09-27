package org.webrtc;

import java.util.concurrent.Callable;
import org.webrtc.SimulcastAlignedVideoEncoderFactory;
import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper streamEncoderWrapper, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = streamEncoderWrapper;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper streamEncoderWrapper = this.b;
        switch (i) {
            case 0:
                return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.f(streamEncoderWrapper, (VideoEncoder.Settings) obj2, (VideoEncoder.Callback) obj);
            default:
                return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.e(streamEncoderWrapper, (VideoFrame) obj2, (VideoEncoder.EncodeInfo) obj);
        }
    }
}
