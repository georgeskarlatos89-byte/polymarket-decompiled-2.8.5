package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f33 extends qz2 {
    public final CameraCaptureSession.CaptureCallback a;

    public f33(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
        } else {
            dmk.s("captureCallback is null");
            throw null;
        }
    }
}
