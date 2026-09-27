package defpackage;

import com.polymarket.data.EImageDisplayType;
import com.polymarket.data.EMarketIcon;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class nd2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[EImageDisplayType.values().length];
        try {
            iArr[EImageDisplayType.logo.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[fd2.values().length];
        try {
            iArr2[fd2.Circle.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[fd2.RoundedRect.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[EMarketIcon.values().length];
        try {
            iArr3[EMarketIcon.totalOver.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[EMarketIcon.totalUnder.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[EMarketIcon.draw.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
