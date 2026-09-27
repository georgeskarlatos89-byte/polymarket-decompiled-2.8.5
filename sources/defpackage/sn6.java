package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class sn6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[rzf.values().length];
        try {
            iArr[rzf.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rzf.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[qud.values().length];
        try {
            iArr2[qud.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qud.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qud.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
