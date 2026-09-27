package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kbc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ibc.values().length];
        a = iArr;
        try {
            iArr[ibc.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ibc.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ibc.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ibc.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ibc.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
