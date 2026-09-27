package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ex3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[gw3.values().length];
        try {
            iArr[gw3.INITIAL_CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw3.AUTOMATIC_RECONNECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw3.FORCE_RECONNECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
