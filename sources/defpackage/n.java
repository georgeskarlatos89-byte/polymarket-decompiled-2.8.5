package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c1f.values().length];
        try {
            iArr[c1f.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c1f.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c1f.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
