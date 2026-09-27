package com.checkout.components.interfaces.api;

import com.checkout.components.interfaces.model.UpdateDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/api/BaseComponent;", "isAvailable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenize", "", "submit", "isValid", "update", "updateDetails", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PaymentMethodComponent extends BaseComponent {
    Object isAvailable(Continuation<? super Boolean> continuation);

    Object isValid(Continuation<? super Boolean> continuation);

    Object submit(Continuation<? super Unit> continuation);

    Object tokenize(Continuation<? super Unit> continuation);

    void update(UpdateDetails updateDetails);
}
