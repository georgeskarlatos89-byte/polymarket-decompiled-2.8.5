package io.sentry.android.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class q0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.p0.values().length];
        a = iArr;
        try {
            iArr[io.sentry.p0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.p0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
