package defpackage;

import com.polymarket.usviewmodels.SoccerLineupDisplay;
import com.polymarket.usviewmodels.SoccerStatsDisplay;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class nyh {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SoccerStatsDisplay.Summary.Kind.values().length];
        try {
            iArr[SoccerStatsDisplay.Summary.Kind.yellowCards.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SoccerStatsDisplay.Summary.Kind.redCards.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SoccerStatsDisplay.Summary.Kind.corners.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SoccerLineupDisplay.Side.values().length];
        try {
            iArr2[SoccerLineupDisplay.Side.home.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SoccerLineupDisplay.Side.away.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
