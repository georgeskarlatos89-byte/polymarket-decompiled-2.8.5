package defpackage;

import com.polymarket.data.EComboLegState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class h42 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EComboLegState.values().length];
        try {
            iArr[EComboLegState.lost.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EComboLegState.won.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EComboLegState.pending.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EComboLegState.indeterminate.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[z8j.values().length];
        try {
            iArr2[z8j.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z8j.Failure.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z8j.Pending.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
