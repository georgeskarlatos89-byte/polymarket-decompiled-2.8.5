package com.checkout.address.model.validation.contract;

import com.checkout.address.model.validation.FieldValidationRequest;
import defpackage.d4g;
import defpackage.e3k;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/checkout/address/model/validation/contract/FieldValidator;", "", "Ld4g;", "resourceProvider", "<init>", "(Ld4g;)V", "Lcom/checkout/address/model/validation/FieldValidationRequest;", "request", "Le3k;", "", "validate", "(Lcom/checkout/address/model/validation/FieldValidationRequest;)Le3k;", "Ld4g;", "getResourceProvider", "()Ld4g;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FieldValidator {
    public static final int $stable = 8;
    private final d4g resourceProvider;

    public FieldValidator(d4g d4gVar) {
        d4gVar.getClass();
        this.resourceProvider = d4gVar;
    }

    public final d4g getResourceProvider() {
        return this.resourceProvider;
    }

    public abstract e3k validate(FieldValidationRequest request);
}
