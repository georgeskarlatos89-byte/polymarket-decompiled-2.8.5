package org.webrtc;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class TurnCustomizer {
    private long nativeTurnCustomizer;

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer != 0) {
            return;
        }
        dmk.n("TurnCustomizer has been disposed.");
    }

    private static native void nativeFreeTurnCustomizer(long j);

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0L;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
