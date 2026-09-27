package defpackage;

import com.polymarket.data.EEnvironment;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EEnvironment.values().length];
        try {
            iArr[EEnvironment.staging.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EEnvironment.localhost.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EEnvironment.preprod.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EEnvironment.production.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
