package org.webrtc;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j);

    public static native List<String> nativeGetSupportedScalabilityModes();

    public static native boolean nativeIsSupported();

    public static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j) {
        return nativeCreate(j);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
