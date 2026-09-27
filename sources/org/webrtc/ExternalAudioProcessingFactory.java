package org.webrtc;

import defpackage.dmk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface AudioProcessing {
        void initialize(int i, int i2);

        void process(int i, int i2, ByteBuffer byteBuffer);

        void reset(int i);
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr != 0) {
            return;
        }
        dmk.n("ExternalAudioProcessor has been disposed.");
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean z);

    private static native void nativeSetBypassFlagForRenderPre(boolean z);

    private static native long nativeSetCapturePostProcessing(AudioProcessing audioProcessing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing audioProcessing);

    @Override // org.webrtc.AudioProcessingFactory
    public long createNative() {
        long j = this.apmPtr;
        if (j == 0) {
            long nativeGetDefaultApm = nativeGetDefaultApm();
            this.apmPtr = nativeGetDefaultApm;
            return nativeGetDefaultApm;
        }
        return j;
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        long j2 = this.capturePostProcessingPtr;
        if (j2 != 0) {
            JniCommon.nativeReleaseRef(j2);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    public void setBypassFlagForCapturePost(boolean z) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(z);
    }

    public void setBypassFlagForRenderPre(boolean z) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(z);
    }

    public void setCapturePostProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long nativeSetCapturePostProcessing = nativeSetCapturePostProcessing(audioProcessing);
        long j = this.capturePostProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = nativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long nativeSetRenderPreProcessing = nativeSetRenderPreProcessing(audioProcessing);
        long j = this.renderPreProcessingPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = nativeSetRenderPreProcessing;
    }
}
