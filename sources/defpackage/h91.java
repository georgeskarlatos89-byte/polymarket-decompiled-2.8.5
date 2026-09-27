package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h91 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[j3c.values().length];
        b = iArr;
        try {
            iArr[j3c.MASK_MODE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[j3c.MASK_MODE_SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[j3c.MASK_MODE_INTERSECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[j3c.MASK_MODE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[cwa.values().length];
        a = iArr2;
        try {
            iArr2[cwa.SHAPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[cwa.PRE_COMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[cwa.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[cwa.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[cwa.NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[cwa.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[cwa.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
