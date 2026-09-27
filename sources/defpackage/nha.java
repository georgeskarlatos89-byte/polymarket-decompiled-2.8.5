package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class nha {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mha.values().length];
        try {
            iArr[mha.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mha.DEPRECATED_LIST_METHODS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mha.NOT_CONSIDERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mha.DROP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[mha.VISIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
