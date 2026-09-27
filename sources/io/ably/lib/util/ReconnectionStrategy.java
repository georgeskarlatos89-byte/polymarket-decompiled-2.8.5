package io.ably.lib.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ReconnectionStrategy {
    private static float getBackoffCoefficient(int i) {
        return Math.min((i + 2) / 3.0f, 2.0f);
    }

    private static double getJitterCoefficient() {
        return 1.0d - (Math.random() * 0.2d);
    }

    public static int getRetryTime(long j, int i) {
        return Double.valueOf(j * getJitterCoefficient() * getBackoffCoefficient(i)).intValue();
    }
}
