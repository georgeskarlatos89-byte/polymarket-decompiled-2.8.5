package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class bsh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[csh.values().length];
        try {
            iArr[csh.Primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[csh.Secondary.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[csh.Placeholder.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[csh.Destructive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
