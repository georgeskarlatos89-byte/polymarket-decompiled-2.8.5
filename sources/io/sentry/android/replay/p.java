package io.sentry.android.replay;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[q.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
