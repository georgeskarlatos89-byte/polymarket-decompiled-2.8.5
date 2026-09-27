package defpackage;

import com.polymarket.data.EComboLegState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class b42 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EComboLegState.values().length];
        try {
            iArr[EComboLegState.pending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EComboLegState.won.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EComboLegState.lost.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EComboLegState.indeterminate.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
