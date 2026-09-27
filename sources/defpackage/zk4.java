package defpackage;

import com.checkout.components.interfaces.component.PaymentButtonAction;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zk4 {
    public final PaymentButtonAction a;

    public zk4(PaymentButtonAction paymentButtonAction) {
        paymentButtonAction.getClass();
        this.a = paymentButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zk4) {
                zk4 zk4Var = (zk4) obj;
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(bool, bool) || !Intrinsics.areEqual(null, null) || this.a != zk4Var.a || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Boolean.TRUE.hashCode() * 961)) * 923521;
    }

    public final String toString() {
        return "ComponentOption(showPayButton=" + Boolean.TRUE + ", callback=null, paymentButtonAction=" + this.a + ", googlePayConfiguration=null, addressConfiguration=null, rememberMeConfiguration=null, cardConfiguration=null)";
    }
}
