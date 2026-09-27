package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class jha {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[hha.values().length];
        try {
            iArr[hha.FROM_DEPENDENCIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hha.FROM_CLASS_LOADER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hha.FALLBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
