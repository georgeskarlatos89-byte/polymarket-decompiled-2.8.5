package defpackage;

import com.polymarket.usviewmodels.DepositViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class fm6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DepositViewModel.DepositRewardPill.State.values().length];
        try {
            iArr[DepositViewModel.DepositRewardPill.State.neutral.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DepositViewModel.DepositRewardPill.State.belowThreshold.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DepositViewModel.DepositRewardPill.State.met.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
