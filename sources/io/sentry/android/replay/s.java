package io.sentry.android.replay;

import io.sentry.k4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[k4.values().length];
        try {
            iArr[k4.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k4.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
