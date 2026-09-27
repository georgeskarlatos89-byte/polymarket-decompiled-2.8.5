package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wpi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ryj.values().length];
        a = iArr;
        try {
            iArr[ryj.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ryj.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ryj.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ryj.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ryj.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
