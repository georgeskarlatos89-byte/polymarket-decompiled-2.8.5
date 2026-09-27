package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class qnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[yba.values().length];
        try {
            iArr[yba.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yba.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yba.INFLEXIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
