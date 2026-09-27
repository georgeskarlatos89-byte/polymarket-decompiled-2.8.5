package org.webrtc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFramerateFps = d;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
    }
}
