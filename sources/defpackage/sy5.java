package defpackage;

import com.stripe.android.networking.PaymentAnalyticsEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sy5 implements ip {
    public final Function1 a;

    public sy5(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }

    @Override // defpackage.ip
    public final void a(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        paymentAnalyticsEvent.getClass();
        this.a.invoke(new kj5(paymentAnalyticsEvent));
    }
}
