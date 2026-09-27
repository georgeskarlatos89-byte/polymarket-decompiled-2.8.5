package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ia9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[lod.values().length];
        b = iArr;
        try {
            iArr[lod.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[lod.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[lod.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[lod.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[s49.values().length];
        a = iArr2;
        try {
            iArr2[s49.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[s49.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[s49.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[s49.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[s49.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
