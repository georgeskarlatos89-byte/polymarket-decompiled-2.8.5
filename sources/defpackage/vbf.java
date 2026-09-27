package defpackage;

import com.polymarket.data.EPromotionCampaign;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class vbf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EPromotionCampaign.BonusDay.State.values().length];
        try {
            iArr[EPromotionCampaign.BonusDay.State.earned.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EPromotionCampaign.BonusDay.State.todayEarned.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EPromotionCampaign.BonusDay.State.todayPending.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EPromotionCampaign.BonusDay.State.missed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EPromotionCampaign.BonusDay.State.upcoming.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
