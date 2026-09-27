package com.checkout.address.model.validation;

import com.polymarket.android.R;
import defpackage.d4g;
import defpackage.k91;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError;", "Lk91;", "RequiredFieldError", "MaxLengthError", "MinLengthError", "InvalidFormatEmailError", "Lcom/checkout/address/model/validation/OperationsError$InvalidFormatEmailError;", "Lcom/checkout/address/model/validation/OperationsError$MaxLengthError;", "Lcom/checkout/address/model/validation/OperationsError$MinLengthError;", "Lcom/checkout/address/model/validation/OperationsError$RequiredFieldError;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OperationsError extends k91 {
    public static final int $stable = k91.$stable;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$InvalidFormatEmailError;", "Lcom/checkout/address/model/validation/OperationsError;", "Ld4g;", "resourceProvider", "<init>", "(Ld4g;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidFormatEmailError extends OperationsError {
        public static final int $stable = k91.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidFormatEmailError(d4g d4gVar) {
            super(d4gVar.a(R.string.cko_form_email_format_invalid), null);
            d4gVar.getClass();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$MaxLengthError;", "Lcom/checkout/address/model/validation/OperationsError;", "Ld4g;", "resourceProvider", "", "maxLength", "<init>", "(Ld4g;I)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MaxLengthError extends OperationsError {
        public static final int $stable = k91.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxLengthError(d4g d4gVar, int i) {
            super(d4gVar.b(R.string.cko_form_exceed_character_limit, String.valueOf(i)), null);
            d4gVar.getClass();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$MinLengthError;", "Lcom/checkout/address/model/validation/OperationsError;", "Ld4g;", "resourceProvider", "<init>", "(Ld4g;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MinLengthError extends OperationsError {
        public static final int $stable = k91.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MinLengthError(d4g d4gVar) {
            super(d4gVar.a(R.string.cko_form_insufficient_characters), null);
            d4gVar.getClass();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/address/model/validation/OperationsError$RequiredFieldError;", "Lcom/checkout/address/model/validation/OperationsError;", "Ld4g;", "resourceProvider", "<init>", "(Ld4g;)V", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RequiredFieldError extends OperationsError {
        public static final int $stable = k91.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldError(d4g d4gVar) {
            super(d4gVar.a(R.string.cko_form_required), null);
            d4gVar.getClass();
        }
    }

    public OperationsError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
    }
}
