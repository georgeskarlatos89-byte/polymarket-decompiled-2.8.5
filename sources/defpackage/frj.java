package defpackage;

import com.polymarket.usviewmodels.SportDetailsInfoDisplay;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class frj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SportDetailsInfoDisplay.Tab.values().length];
        try {
            iArr[SportDetailsInfoDisplay.Tab.stats.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SportDetailsInfoDisplay.Tab.playerStats.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SportDetailsInfoDisplay.Tab.lineup.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SportDetailsInfoDisplay.Tab.timeline.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
