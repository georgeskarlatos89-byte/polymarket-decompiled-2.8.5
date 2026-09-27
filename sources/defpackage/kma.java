package defpackage;

import com.polymarket.usviewmodels.KYCStatusViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class kma {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KYCStatusViewModel.UIStatus.values().length];
        try {
            iArr[KYCStatusViewModel.UIStatus.none.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.rejected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.rejectedTerminal.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.resubmit.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.pending.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.onHold.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.resumeDocv.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KYCStatusViewModel.UIStatus.provisioning.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
