package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class zvi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[yvi.values().length];
        try {
            iArr[yvi.StartInput.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yvi.StopInput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yvi.ShowKeyboard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yvi.HideKeyboard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
