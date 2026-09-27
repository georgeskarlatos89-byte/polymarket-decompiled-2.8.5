package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class uy5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[p28.values().length];
        try {
            iArr[p28.Full.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p28.Lite.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[gee.values().length];
        try {
            iArr2[gee.Horizontal.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[gee.Vertical.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[gee.Automatic.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
