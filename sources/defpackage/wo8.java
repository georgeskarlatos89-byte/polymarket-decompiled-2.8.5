package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wo8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vo8.values().length];
        try {
            iArr[vo8.ON_CONFIGURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vo8.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vo8.ON_UPGRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vo8.ON_DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vo8.ON_OPEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
