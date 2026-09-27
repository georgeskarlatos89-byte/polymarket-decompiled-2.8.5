package defpackage;

import com.stripe.android.networking.PaymentAnalyticsEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class no7 implements ip, sp8 {
    public final /* synthetic */ Function1 a;

    public no7(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }

    @Override // defpackage.ip
    public final /* synthetic */ void a(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        this.a.invoke(paymentAnalyticsEvent);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ip) && (obj instanceof sp8)) {
            return Intrinsics.areEqual(this.a, ((sp8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
