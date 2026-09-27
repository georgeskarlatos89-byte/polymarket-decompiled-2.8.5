package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class oyi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rbb.values().length];
        try {
            iArr[rbb.ALWAYS_LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rbb.ALWAYS_DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rbb.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
