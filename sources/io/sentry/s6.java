package io.sentry;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum s6 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    s6(float f, int i, int i2) {
        this.sizeScale = f;
        this.bitRate = i;
        this.screenshotQuality = i2;
    }

    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
