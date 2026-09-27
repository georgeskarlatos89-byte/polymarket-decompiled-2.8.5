package org.webrtc;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class FrameCryptorKeyProvider {
    private long nativeKeyProvider;

    public FrameCryptorKeyProvider(long j) {
        this.nativeKeyProvider = j;
    }

    private void checkKeyProviderExists() {
        if (this.nativeKeyProvider != 0) {
            return;
        }
        dmk.n("FrameCryptorKeyProvider has been disposed.");
    }

    private static native byte[] nativeExportKey(long j, String str, int i);

    private static native byte[] nativeExportSharedKey(long j, int i);

    private static native byte[] nativeRatchetKey(long j, String str, int i);

    private static native byte[] nativeRatchetSharedKey(long j, int i);

    private static native boolean nativeSetKey(long j, String str, int i, byte[] bArr);

    private static native boolean nativeSetSharedKey(long j, int i, byte[] bArr);

    private static native void nativeSetSifTrailer(long j, byte[] bArr);

    public void dispose() {
        checkKeyProviderExists();
        JniCommon.nativeReleaseRef(this.nativeKeyProvider);
        this.nativeKeyProvider = 0L;
    }

    public byte[] exportKey(String str, int i) {
        checkKeyProviderExists();
        return nativeExportKey(this.nativeKeyProvider, str, i);
    }

    public byte[] exportSharedKey(int i) {
        checkKeyProviderExists();
        return nativeExportSharedKey(this.nativeKeyProvider, i);
    }

    public long getNativeKeyProvider() {
        return this.nativeKeyProvider;
    }

    public byte[] ratchetKey(String str, int i) {
        checkKeyProviderExists();
        return nativeRatchetKey(this.nativeKeyProvider, str, i);
    }

    public byte[] ratchetSharedKey(int i) {
        checkKeyProviderExists();
        return nativeRatchetSharedKey(this.nativeKeyProvider, i);
    }

    public boolean setKey(String str, int i, byte[] bArr) {
        checkKeyProviderExists();
        return nativeSetKey(this.nativeKeyProvider, str, i, bArr);
    }

    public boolean setSharedKey(int i, byte[] bArr) {
        checkKeyProviderExists();
        return nativeSetSharedKey(this.nativeKeyProvider, i, bArr);
    }

    public void setSifTrailer(byte[] bArr) {
        checkKeyProviderExists();
        nativeSetSifTrailer(this.nativeKeyProvider, bArr);
    }
}
