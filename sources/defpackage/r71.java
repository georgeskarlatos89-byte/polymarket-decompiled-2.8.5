package defpackage;

import com.polymarket.data.EBannerSystemStatus;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class r71 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EBannerSystemStatus.Style.values().length];
        try {
            iArr[EBannerSystemStatus.Style.info.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EBannerSystemStatus.Style.warning.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EBannerSystemStatus.Style.error.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EBannerSystemStatus.Style.severe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
