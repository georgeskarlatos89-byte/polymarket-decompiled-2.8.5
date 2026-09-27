package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wlc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vlc.values().length];
        try {
            iArr[vlc.DefaultSpatial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vlc.FastSpatial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vlc.SlowSpatial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vlc.DefaultEffects.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vlc.FastEffects.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vlc.SlowEffects.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
