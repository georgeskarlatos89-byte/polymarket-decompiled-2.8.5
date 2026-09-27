package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class uod {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[sic.values().length];
        c = iArr;
        try {
            iArr[sic.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[sic.SEALED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            c[sic.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            c[sic.ABSTRACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[vod.values().length];
        b = iArr2;
        try {
            iArr2[vod.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[vod.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[vod.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[au7.values().length];
        a = iArr3;
        try {
            iArr3[au7.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[au7.INCOMPATIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[au7.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
