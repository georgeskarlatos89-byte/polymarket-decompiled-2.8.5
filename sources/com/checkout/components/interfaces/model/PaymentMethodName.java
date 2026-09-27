package com.checkout.components.interfaces.model;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/components/interfaces/model/ComponentName;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Card", "GooglePay", "RememberMe", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentMethodName implements ComponentName {
    public static final PaymentMethodName Card;
    public static final PaymentMethodName GooglePay;
    public static final PaymentMethodName RememberMe;
    private static final /* synthetic */ PaymentMethodName[] b;
    private static final /* synthetic */ ug7 c;

    /* renamed from: a, reason: from kotlin metadata */
    private final String value;

    static {
        PaymentMethodName paymentMethodName = new PaymentMethodName("Card", 0, "card");
        Card = paymentMethodName;
        PaymentMethodName paymentMethodName2 = new PaymentMethodName("GooglePay", 1, "googlepay");
        GooglePay = paymentMethodName2;
        PaymentMethodName paymentMethodName3 = new PaymentMethodName("RememberMe", 2, "remember_me");
        RememberMe = paymentMethodName3;
        PaymentMethodName[] paymentMethodNameArr = {paymentMethodName, paymentMethodName2, paymentMethodName3};
        b = paymentMethodNameArr;
        c = new wg7(paymentMethodNameArr);
    }

    private PaymentMethodName(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return c;
    }

    public static PaymentMethodName valueOf(String str) {
        return (PaymentMethodName) Enum.valueOf(PaymentMethodName.class, str);
    }

    public static PaymentMethodName[] values() {
        return (PaymentMethodName[]) b.clone();
    }

    @Override // com.checkout.components.interfaces.model.ComponentName
    public final String getValue() {
        return this.value;
    }
}
