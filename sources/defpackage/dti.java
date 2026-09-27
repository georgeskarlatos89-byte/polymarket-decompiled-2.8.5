package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class dti {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[zui.values().length];
        try {
            iArr[zui.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zui.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[wy9.values().length];
        try {
            iArr2[wy9.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wy9.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wy9.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
