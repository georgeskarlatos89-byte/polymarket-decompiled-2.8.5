package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class lgc {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[tic.values().length];
        b = iArr;
        try {
            iArr[tic.KANJI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[tic.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[tic.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[tic.BYTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[tic.ECI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ogc.values().length];
        a = iArr2;
        try {
            iArr2[ogc.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ogc.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[ogc.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
