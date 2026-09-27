package org.webrtc;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        public static FrameCryptionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface Observer {
        void onFrameCryptionStateChanged(String str, FrameCryptionState frameCryptionState);
    }

    public FrameCryptor(long j) {
        this.nativeFrameCryptor = j;
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor != 0) {
            return;
        }
        dmk.n("FrameCryptor has been disposed.");
    }

    private static native int nativeGetKeyIndex(long j);

    private static native boolean nativeIsEnabled(long j);

    private static native void nativeSetEnabled(long j, boolean z);

    private static native void nativeSetKeyIndex(long j, int i);

    private static native long nativeSetObserver(long j, Observer observer);

    private static native void nativeUnSetObserver(long j);

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j = this.observerPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.observerPtr = 0L;
        }
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public void setEnabled(boolean z) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, z);
    }

    public void setKeyIndex(int i) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, i);
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j = this.observerPtr;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.observerPtr = 0L;
        }
    }
}
