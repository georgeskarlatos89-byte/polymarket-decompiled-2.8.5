package defpackage;

import com.polymarket.usdependencies.GeoComplianceVerdict;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mt8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GeoComplianceVerdict.Kind.values().length];
        try {
            iArr[GeoComplianceVerdict.Kind.blocked.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeoComplianceVerdict.Kind.unavailable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GeoComplianceVerdict.Kind.passed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GeoComplianceVerdict.Kind.skipped.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
