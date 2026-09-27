package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gx5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[kd7.values().length];
        c = iArr;
        try {
            iArr[kd7.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[kd7.TRANSFORMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ix5.values().length];
        b = iArr2;
        try {
            iArr2[ix5.RESOURCE_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[ix5.DATA_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[ix5.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[ix5.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[ix5.INITIALIZE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[hx5.values().length];
        a = iArr3;
        try {
            iArr3[hx5.INITIALIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[hx5.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[hx5.DECODE_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
