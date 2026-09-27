package org.webrtc.audio;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z);

    default boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    void setSpeakerMute(boolean z);
}
