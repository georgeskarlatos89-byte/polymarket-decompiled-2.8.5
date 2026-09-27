package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vt7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[uxf.values().length];
        try {
            iArr[uxf.SANDBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uxf.PROD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ki8.values().length];
        try {
            iArr2[ki8.Normal.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ki8.Italic.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[pi8.values().length];
        try {
            iArr3[pi8.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[pi8.Normal.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[pi8.Medium.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[pi8.SemiBold.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[pi8.Bold.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[pi8.ExtraBold.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
