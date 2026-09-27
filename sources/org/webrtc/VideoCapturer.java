package org.webrtc;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i, int i2, int i3);

    void stopCapture();
}
