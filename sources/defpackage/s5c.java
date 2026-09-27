package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s5c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[exa.values().length];
        try {
            iArr[exa.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[exa.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[gxa.values().length];
        try {
            iArr2[gxa.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[gxa.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
