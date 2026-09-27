package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wg8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ng5.values().length];
        try {
            iArr[ng5.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ng5.Redirected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ng5.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ng5.RedirectCancelled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[pg8.values().length];
        try {
            iArr2[pg8.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pg8.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pg8.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pg8.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
