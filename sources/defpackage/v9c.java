package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v9c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[qhg.values().length];
        try {
            iArr[qhg.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qhg.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[b1f.values().length];
        try {
            iArr2[b1f.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b1f.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
