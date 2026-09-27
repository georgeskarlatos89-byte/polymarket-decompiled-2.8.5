package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class q5b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[wma.values().length];
        b = iArr;
        try {
            iArr[wma.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[wma.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[lod.values().length];
        a = iArr2;
        try {
            iArr2[lod.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[lod.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[lod.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[lod.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
