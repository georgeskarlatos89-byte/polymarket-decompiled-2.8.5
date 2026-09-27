package defpackage;

import com.polymarket.clients.GeoFailureCode;
import com.polymarket.usdependencies.GeoComplianceVerdict;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class wpb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ypb.values().length];
        try {
            iArr[ypb.NotRequested.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ypb.Denied.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ypb.PermanentlyDenied.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ypb.Granted.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[GeoComplianceVerdict.Kind.values().length];
        try {
            iArr2[GeoComplianceVerdict.Kind.passed.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[GeoComplianceVerdict.Kind.blocked.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[GeoComplianceVerdict.Kind.unavailable.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[GeoComplianceVerdict.Kind.skipped.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[GeoFailureCode.values().length];
        try {
            iArr3[GeoFailureCode.networkError.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[GeoFailureCode.rateLimited.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[GeoFailureCode.serverError.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
