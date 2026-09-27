package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class q7h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[y23.values().length];
        try {
            iArr[y23.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y23.Characters.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y23.Words.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y23.Sentences.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[qoa.values().length];
        try {
            iArr2[qoa.Text.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qoa.Ascii.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qoa.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qoa.Phone.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[qoa.Uri.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[qoa.Email.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[qoa.Password.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[qoa.NumberPassword.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
