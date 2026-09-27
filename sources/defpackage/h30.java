package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l9.values().length];
        try {
            iArr[l9.Created.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l9.Started.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l9.Resumed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l9.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l9.Stopped.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l9.Destroyed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
