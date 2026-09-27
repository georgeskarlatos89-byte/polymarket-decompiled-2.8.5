package defpackage;

import com.polymarket.usviewmodels.SquadsPositionCardState;
import com.polymarket.usviewmodels.SquadsPositionDetailsPresentation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class tze {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SquadsPositionCardState.values().length];
        try {
            iArr[SquadsPositionCardState.pregame.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SquadsPositionCardState.live.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SquadsPositionCardState.won.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SquadsPositionCardState.cashedOutProfit.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SquadsPositionCardState.cashedOutLoss.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SquadsPositionCardState.lost.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SquadsPositionCardState.switched.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[SquadsPositionDetailsPresentation.Emphasis.values().length];
        try {
            iArr2[SquadsPositionDetailsPresentation.Emphasis.gain.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SquadsPositionDetailsPresentation.Emphasis.loss.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SquadsPositionDetailsPresentation.Emphasis.neutral.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SquadsPositionDetailsPresentation.Emphasis.muted.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
