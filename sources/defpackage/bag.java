package defpackage;

import com.polymarket.usviewmodels.IntegrityCheckViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class bag {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntegrityCheckViewModel.IntegrityIssueType.values().length];
        try {
            iArr[IntegrityCheckViewModel.IntegrityIssueType.jailbroken.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntegrityCheckViewModel.IntegrityIssueType.expired.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntegrityCheckViewModel.IntegrityIssueType.integrityDenied.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IntegrityCheckViewModel.IntegrityIssueType.geoBlocked.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
