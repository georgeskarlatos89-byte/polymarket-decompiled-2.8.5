package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class md7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[tic.values().length];
        a = iArr;
        try {
            iArr[tic.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[tic.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[tic.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[tic.KANJI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
