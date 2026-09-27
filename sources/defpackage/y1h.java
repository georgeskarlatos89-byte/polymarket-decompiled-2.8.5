package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y1h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[a2h.values().length];
        b = iArr;
        try {
            iArr[a2h.BEVEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[a2h.MITER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[a2h.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[z1h.values().length];
        a = iArr2;
        try {
            iArr2[z1h.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[z1h.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[z1h.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
