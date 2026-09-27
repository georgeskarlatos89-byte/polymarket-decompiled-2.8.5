package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class cnb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[r98.values().length];
        try {
            iArr[r98.Playing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r98.Paused.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r98.Failed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r98.Loading.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r98.Ready.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r98.Idle.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
