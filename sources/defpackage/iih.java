package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class iih {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[lyh.values().length];
        try {
            iArr[lyh.Home.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lyh.Away.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[fwh.values().length];
        try {
            iArr2[fwh.YellowCards.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[fwh.RedCards.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fwh.Corners.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
