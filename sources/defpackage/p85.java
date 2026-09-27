package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class p85 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[r85.values().length];
        try {
            iArr[r85.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r85.BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r85.CPU_ACQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r85.DORMANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r85.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
