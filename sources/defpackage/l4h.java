package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l4h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[owh.values().length];
        try {
            iArr[owh.NoMatchFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[owh.NoRequest.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[owh.MatchFound.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[owh.VisibleContentAbsentDuringTransition.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
