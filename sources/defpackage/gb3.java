package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class gb3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[d59.values().length];
        try {
            iArr[d59.Postponed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d59.Upcoming.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d59.StartingSoon.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d59.Live.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d59.Finished.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
