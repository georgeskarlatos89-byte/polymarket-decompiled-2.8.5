package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ou0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[c89.values().length];
        try {
            iArr[c89.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c89.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c89.WHATSAPP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ru0.values().length];
        try {
            iArr2[ru0.CHALLENGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ru0.OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
