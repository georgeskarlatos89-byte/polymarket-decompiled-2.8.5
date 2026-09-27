package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wyj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[xyj.values().length];
        try {
            iArr[xyj.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xyj.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xyj.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xyj.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xyj.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
