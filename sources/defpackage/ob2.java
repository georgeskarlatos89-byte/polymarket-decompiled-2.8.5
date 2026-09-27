package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ob2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[qb2.values().length];
        try {
            iArr[qb2.Rounded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qb2.Pill.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[sb2.values().length];
        try {
            iArr2[sb2.Error.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[sb2.Warning.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[tb2.values().length];
        try {
            iArr3[tb2.Simple.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[tb2.Contained.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[tb2.Glass.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[tb2.Overlay.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
