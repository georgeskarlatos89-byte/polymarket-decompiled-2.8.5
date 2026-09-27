package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class bz7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[uba.values().length];
        b = iArr;
        try {
            iArr[uba.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[uba.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[uba.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[dz7.values().length];
        a = iArr2;
        try {
            iArr2[dz7.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[dz7.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[dz7.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
