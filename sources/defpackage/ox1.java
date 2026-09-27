package defpackage;

import com.polymarket.chartlogic.ChartPathCommandKind;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ox1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[tqk.values().length];
        try {
            iArr[tqk.UnitRange.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tqk.FullRange.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tqk.DataRange.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ChartPathCommandKind.values().length];
        try {
            iArr2[ChartPathCommandKind.moveTo.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ChartPathCommandKind.lineTo.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ChartPathCommandKind.cubicTo.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
