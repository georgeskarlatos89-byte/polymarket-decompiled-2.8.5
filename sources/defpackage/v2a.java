package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class v2a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[aee.values().length];
        try {
            iArr[aee.OnSession.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aee.OffSession.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aee.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[rde.values().length];
        try {
            iArr2[rde.Automatic.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[rde.AutomaticAsync.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[rde.Manual.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
