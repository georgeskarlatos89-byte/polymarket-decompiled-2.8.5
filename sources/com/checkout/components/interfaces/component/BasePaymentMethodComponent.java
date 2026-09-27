package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.api.PaymentMethodComponent;
import defpackage.rk4;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/interfaces/component/BasePaymentMethodComponent;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lrk4;", "componentCallback", "<init>", "(Lrk4;)V", "Lrk4;", "getComponentCallback", "()Lrk4;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BasePaymentMethodComponent implements PaymentMethodComponent {
    public static final int $stable = 8;
    private final rk4 componentCallback;

    public BasePaymentMethodComponent(rk4 rk4Var) {
        rk4Var.getClass();
        this.componentCallback = rk4Var;
    }

    public final rk4 getComponentCallback() {
        return this.componentCallback;
    }
}
