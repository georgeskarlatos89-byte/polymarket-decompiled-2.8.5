package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fng {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[eng.values().length];
        try {
            iArr[eng.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[eng.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[eng.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
