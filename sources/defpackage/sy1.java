package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class sy1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[vy1.values().length];
        try {
            iArr[vy1.System.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vy1.AlwaysAnimate.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vy1.NeverAnimate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[uy1.values().length];
        try {
            iArr2[uy1.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uy1.Truncate.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[uy1.Scale.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
