package defpackage;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class qh4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EventReporter$Mode.values().length];
        try {
            iArr[EventReporter$Mode.Complete.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventReporter$Mode.Custom.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventReporter$Mode.Embedded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
