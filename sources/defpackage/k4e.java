package defpackage;

import com.stripe.android.model.StripeIntent$Usage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class k4e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StripeIntent$Usage.values().length];
        try {
            iArr[StripeIntent$Usage.OnSession.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StripeIntent$Usage.OffSession.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StripeIntent$Usage.OneTime.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
