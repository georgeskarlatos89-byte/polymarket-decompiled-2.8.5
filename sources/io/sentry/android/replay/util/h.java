package io.sentry.android.replay.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
