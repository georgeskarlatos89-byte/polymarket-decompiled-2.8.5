package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qfj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[pg8.values().length];
        try {
            iArr[pg8.ActiveParent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pg8.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pg8.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pg8.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
