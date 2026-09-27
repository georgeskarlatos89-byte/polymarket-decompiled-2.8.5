package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class fab {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[wdb.values().length];
        try {
            iArr[wdb.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wdb.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wdb.ENABLED_NO_WEB_FALLBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[acb.values().length];
        try {
            iArr2[acb.Consented.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[acb.Rejected.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[acb.Created.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[acb.Expired.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[acb.Authenticated.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
