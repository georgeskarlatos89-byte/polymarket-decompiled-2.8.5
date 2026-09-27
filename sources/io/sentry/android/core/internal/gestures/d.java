package io.sentry.android.core.internal.gestures;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[e.values().length];
        a = iArr;
        try {
            iArr[e.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[e.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[e.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[e.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
