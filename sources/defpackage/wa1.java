package defpackage;

import com.polymarket.data.EEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class wa1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EEvent.SportsGame.BattingSide.values().length];
        try {
            iArr[EEvent.SportsGame.BattingSide.f4long.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EEvent.SportsGame.BattingSide.f5short.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
