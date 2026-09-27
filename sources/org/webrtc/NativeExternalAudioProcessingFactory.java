package org.webrtc;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class NativeExternalAudioProcessingFactory implements AudioProcessingFactory {
    private final String libname;

    public NativeExternalAudioProcessingFactory(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                this.libname = str;
                return;
            } else {
                dmk.v("libname must not be empty.");
                throw null;
            }
        }
        dmk.s("libname must not be null.");
        throw null;
    }

    private static native long nativeCreateAudioProcessingModule(String str);

    private static native void nativeDestroyAudioProcessingModule();

    @Override // org.webrtc.AudioProcessingFactory
    public long createNative() {
        return nativeCreateAudioProcessingModule(this.libname);
    }

    public void destroyNative() {
        nativeDestroyAudioProcessingModule();
    }
}
