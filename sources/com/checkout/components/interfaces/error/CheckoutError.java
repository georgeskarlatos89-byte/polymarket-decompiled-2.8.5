package com.checkout.components.interfaces.error;

import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "message", "", "getMessage", "()Ljava/lang/String;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "Integration", "Request", "PaymentMethod", "Validation", "Submit", "Internal", "Lcom/checkout/components/interfaces/error/CheckoutError$Integration;", "Lcom/checkout/components/interfaces/error/CheckoutError$Internal;", "Lcom/checkout/components/interfaces/error/CheckoutError$PaymentMethod;", "Lcom/checkout/components/interfaces/error/CheckoutError$Request;", "Lcom/checkout/components/interfaces/error/CheckoutError$Submit;", "Lcom/checkout/components/interfaces/error/CheckoutError$Validation;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CheckoutError extends Exception {
    public static final int $stable = 8;

    public /* synthetic */ CheckoutError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CheckoutErrorCode getCode();

    public abstract CheckoutErrorDetails getDetails();

    @Override // java.lang.Throwable
    public abstract String getMessage();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$Integration;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Integration extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.Integration details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Integration(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Integration integration) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            integration.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = integration;
        }

        public static /* synthetic */ Integration copy$default(Integration integration, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Integration integration2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = integration.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = integration.code;
            }
            if ((i & 4) != 0) {
                integration2 = integration.details;
            }
            return integration.copy(str, checkoutErrorCode, integration2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.Integration getDetails() {
            return this.details;
        }

        public final Integration copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.Integration details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new Integration(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Integration)) {
                return false;
            }
            Integration integration = (Integration) other;
            if (Intrinsics.areEqual(this.message, integration.message) && this.code == integration.code && Intrinsics.areEqual(this.details, integration.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Integration(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.Integration getDetails() {
            return this.details;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$Internal;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Internal extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.Internal details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Internal(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Internal internal) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            internal.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = internal;
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Internal internal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = internal.code;
            }
            if ((i & 4) != 0) {
                internal2 = internal.details;
            }
            return internal.copy(str, checkoutErrorCode, internal2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.Internal getDetails() {
            return this.details;
        }

        public final Internal copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.Internal details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new Internal(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            if (Intrinsics.areEqual(this.message, internal.message) && this.code == internal.code && Intrinsics.areEqual(this.details, internal.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Internal(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.Internal getDetails() {
            return this.details;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$PaymentMethod;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class PaymentMethod extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.PaymentMethod details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethod(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.PaymentMethod paymentMethod) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            paymentMethod.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = paymentMethod;
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.PaymentMethod paymentMethod2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethod.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = paymentMethod.code;
            }
            if ((i & 4) != 0) {
                paymentMethod2 = paymentMethod.details;
            }
            return paymentMethod.copy(str, checkoutErrorCode, paymentMethod2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.PaymentMethod getDetails() {
            return this.details;
        }

        public final PaymentMethod copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.PaymentMethod details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new PaymentMethod(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            if (Intrinsics.areEqual(this.message, paymentMethod.message) && this.code == paymentMethod.code && Intrinsics.areEqual(this.details, paymentMethod.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentMethod(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.PaymentMethod getDetails() {
            return this.details;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$Request;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Request extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.Request details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Request request) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            request.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = request;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Request request2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = request.code;
            }
            if ((i & 4) != 0) {
                request2 = request.details;
            }
            return request.copy(str, checkoutErrorCode, request2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.Request getDetails() {
            return this.details;
        }

        public final Request copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.Request details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new Request(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            if (Intrinsics.areEqual(this.message, request.message) && this.code == request.code && Intrinsics.areEqual(this.details, request.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Request(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.Request getDetails() {
            return this.details;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$Submit;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Submit;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Submit;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Submit;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Submit extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.Submit details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submit(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Submit submit) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            submit.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = submit;
        }

        public static /* synthetic */ Submit copy$default(Submit submit, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.Submit submit2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submit.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = submit.code;
            }
            if ((i & 4) != 0) {
                submit2 = submit.details;
            }
            return submit.copy(str, checkoutErrorCode, submit2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.Submit getDetails() {
            return this.details;
        }

        public final Submit copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.Submit details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new Submit(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            if (Intrinsics.areEqual(this.message, submit.message) && this.code == submit.code && Intrinsics.areEqual(this.details, submit.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Submit(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.Submit getDetails() {
            return this.details;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutError$Validation;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "message", "", ApiConstant.KEY_CODE, "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "details", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;)V", "getMessage", "()Ljava/lang/String;", "getCode", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getDetails", "()Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Validation extends CheckoutError {
        public static final int $stable = 8;
        private final CheckoutErrorCode code;
        private final CheckoutErrorDetails.PaymentMethod details;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validation(String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.PaymentMethod paymentMethod) {
            super(null);
            str.getClass();
            checkoutErrorCode.getClass();
            paymentMethod.getClass();
            this.message = str;
            this.code = checkoutErrorCode;
            this.details = paymentMethod;
        }

        public static /* synthetic */ Validation copy$default(Validation validation, String str, CheckoutErrorCode checkoutErrorCode, CheckoutErrorDetails.PaymentMethod paymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validation.message;
            }
            if ((i & 2) != 0) {
                checkoutErrorCode = validation.code;
            }
            if ((i & 4) != 0) {
                paymentMethod = validation.details;
            }
            return validation.copy(str, checkoutErrorCode, paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutErrorDetails.PaymentMethod getDetails() {
            return this.details;
        }

        public final Validation copy(String message, CheckoutErrorCode code, CheckoutErrorDetails.PaymentMethod details) {
            message.getClass();
            code.getClass();
            details.getClass();
            return new Validation(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validation)) {
                return false;
            }
            Validation validation = (Validation) other;
            if (Intrinsics.areEqual(this.message, validation.message) && this.code == validation.code && Intrinsics.areEqual(this.details, validation.details)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorCode getCode() {
            return this.code;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public /* bridge */ /* synthetic */ CheckoutErrorDetails getDetails() {
            return getDetails();
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.code.hashCode() + (this.message.hashCode() * 31)) * 31);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Validation(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        @Override // com.checkout.components.interfaces.error.CheckoutError
        public CheckoutErrorDetails.PaymentMethod getDetails() {
            return this.details;
        }
    }

    private CheckoutError() {
    }
}
