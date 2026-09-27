package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class yhk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[zjk.values().length];
        try {
            iArr[zjk.Connected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zjk.Failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zjk.Idle.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zjk.Connecting.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zjk.Closed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
