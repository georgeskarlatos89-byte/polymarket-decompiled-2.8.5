package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class w85 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[x85.values().length];
        try {
            iArr[x85.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x85.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x85.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x85.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
