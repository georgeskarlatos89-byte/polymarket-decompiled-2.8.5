package org.webrtc;

import java.util.concurrent.Callable;
import org.webrtc.SimulcastAlignedVideoEncoderFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper b;

    public /* synthetic */ g(SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper streamEncoderWrapper, int i) {
        this.a = i;
        this.b = streamEncoderWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper streamEncoderWrapper = this.b;
        switch (i) {
            case 0:
                return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.b(streamEncoderWrapper);
            case 1:
                return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.c(streamEncoderWrapper);
            default:
                return SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper.d(streamEncoderWrapper);
        }
    }
}
