package com.launchdarkly.sdk.android;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum ConnectionInformation$ConnectionMode {
    STREAMING(true),
    POLLING(true),
    BACKGROUND_POLLING(true),
    BACKGROUND_DISABLED(false),
    OFFLINE(false),
    SET_OFFLINE(false),
    SHUTDOWN(false);

    private boolean connectionActive;

    ConnectionInformation$ConnectionMode(boolean z) {
        this.connectionActive = z;
    }

    public boolean isConnectionActive() {
        return this.connectionActive;
    }
}
