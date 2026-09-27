package org.webrtc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i);

    void setTargets(int i, double d);
}
