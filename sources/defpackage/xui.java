package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class xui {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[xy9.values().length];
        try {
            iArr[xy9.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xy9.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xy9.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
