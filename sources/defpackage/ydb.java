package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class ydb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mhb.values().length];
        try {
            iArr[mhb.LoggedIn.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mhb.NeedsVerification.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mhb.NeedsWebVerification.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mhb.LoggedOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
