package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class hsb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[m8g.values().length];
        try {
            iArr[m8g.QA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m8g.SANDBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m8g.PRODUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[n8g.values().length];
        try {
            iArr2[n8g.PUBLISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n8g.COLLECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n8g.PUBLISH_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n8g.LOAD_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n8g.PUBLISH_DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
