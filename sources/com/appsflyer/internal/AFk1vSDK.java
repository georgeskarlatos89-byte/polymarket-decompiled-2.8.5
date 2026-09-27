package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFk1vSDK {
    public static long[] getMediationNetwork(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }
}
