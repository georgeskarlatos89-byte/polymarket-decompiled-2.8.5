package defpackage;

import com.polymarket.data.EEventState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class kdh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EEventState.SoccerState.Status.values().length];
        try {
            iArr[EEventState.SoccerState.Status.scored.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EEventState.SoccerState.Status.missed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
