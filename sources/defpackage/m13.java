package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m13 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[z03.values().length];
        a = iArr;
        try {
            iArr[z03.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[z03.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[z03.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[z03.CONFIGURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[z03.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[z03.RELEASING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[z03.CLOSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[z03.RELEASED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
