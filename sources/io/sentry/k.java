package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[h4.values().length];
        a = iArr;
        try {
            iArr[h4.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[h4.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[h4.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[h4.COMBINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
