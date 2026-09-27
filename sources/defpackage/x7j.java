package defpackage;

import com.polymarket.data.ETournamentGameUS;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class x7j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ETournamentGameUS.Phase.values().length];
        try {
            iArr[ETournamentGameUS.Phase.finished.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ETournamentGameUS.Phase.live.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
