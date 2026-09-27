package defpackage;

import com.stripe.android.model.StripeIntent$Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class o3e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StripeIntent$Status.values().length];
        try {
            iArr[StripeIntent$Status.Succeeded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StripeIntent$Status.RequiresCapture.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
