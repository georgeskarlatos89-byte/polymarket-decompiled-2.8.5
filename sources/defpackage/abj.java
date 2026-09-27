package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class abj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[jz7.values().length];
        try {
            iArr[jz7.AdministrativeArea.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jz7.AddressLine1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jz7.AddressLine2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jz7.Locality.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jz7.PostalCode.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
