package defpackage;

import com.polymarket.usviewmodels.SquadsPositionCardState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class roh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SquadsPositionCardState.values().length];
        try {
            iArr[SquadsPositionCardState.won.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SquadsPositionCardState.cashedOutProfit.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SquadsPositionCardState.lost.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SquadsPositionCardState.cashedOutLoss.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SquadsPositionCardState.switched.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SquadsPositionCardState.pregame.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SquadsPositionCardState.live.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
