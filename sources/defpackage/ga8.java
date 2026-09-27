package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ga8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[m6b.values().length];
        try {
            iArr[m6b.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m6b.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[c98.values().length];
        try {
            iArr2[c98.LoginRequired.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c98.FundingRequired.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
