package defpackage;

import com.appsflyer.deeplink.DeepLinkResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ts {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeepLinkResult.Status.values().length];
        try {
            iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
