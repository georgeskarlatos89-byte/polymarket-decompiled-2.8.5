package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class cde {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[dde.values().length];
        try {
            iArr[dde.Debit.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dde.Credit.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dde.Prepaid.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dde.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
