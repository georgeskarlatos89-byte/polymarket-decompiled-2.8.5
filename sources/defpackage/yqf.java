package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class yqf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[vqf.values().length];
        try {
            iArr[vqf.Compact.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vqf.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vqf.FullScreen.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[xqf.values().length];
        try {
            iArr2[xqf.FromCompact.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[xqf.FromExpanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[xqf.FromFullScreen.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
