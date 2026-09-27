package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class z50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g6f.values().length];
        try {
            iArr[g6f.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g6f.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g6f.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g6f.WARN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g6f.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g6f.ASSERT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
