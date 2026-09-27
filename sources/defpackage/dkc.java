package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class dkc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rna.values().length];
        a = iArr;
        try {
            iArr[rna.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[rna.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[rna.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
