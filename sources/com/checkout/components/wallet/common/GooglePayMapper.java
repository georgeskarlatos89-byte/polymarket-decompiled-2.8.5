package com.checkout.components.wallet.common;

import com.checkout.components.interfaces.model.paymentsession.CardParameters;
import com.checkout.components.wallet.data.dto.BillingAddressParameters;
import com.checkout.components.wallet.data.dto.CardPaymentMethod;
import com.checkout.components.wallet.data.dto.Format;
import com.checkout.components.wallet.data.dto.GatewayInformation;
import com.checkout.components.wallet.data.dto.MerchantInfo;
import com.checkout.components.wallet.data.dto.PaymentDataRequest;
import com.checkout.components.wallet.data.dto.PaymentMethod;
import com.checkout.components.wallet.data.dto.PaymentMethodCardParameters;
import com.checkout.components.wallet.data.dto.PaymentMethodGatewayParameters;
import com.checkout.components.wallet.data.dto.PaymentMethodTokenizationSpecification;
import com.checkout.components.wallet.data.dto.TokenizationSpecification;
import com.checkout.components.wallet.data.dto.TotalPriceStatus;
import com.checkout.components.wallet.data.dto.TransactionInfo;
import com.checkout.components.wallet.data.model.RequiredPaymentInfo;
import defpackage.blc;
import defpackage.d1c;
import defpackage.eb4;
import defpackage.s1k;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/wallet/common/GooglePayMapper;", "", "Lblc;", "moshi", "<init>", "(Lblc;)V", "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "Lcom/checkout/components/interfaces/model/paymentsession/GetCardParameters;", "cardParameters", "", "publicKey", "", "supportedCardSchemes", "toAllowedPaymentMethodsJsonString", "(Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "paymentInfo", "toJson", "(Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;Ljava/util/List;)Ljava/lang/String;", "createIsReadyToPayRequestJson", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GooglePayMapper {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final blc a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/wallet/common/GooglePayMapper$Companion;", "", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "paymentInfo", "", "", "supportedCardSchemes", "Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "createCardPaymentMethod", "(Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;Ljava/util/List;)Lcom/checkout/components/wallet/data/dto/CardPaymentMethod;", "CARD_PAYMENT_METHOD_TYPE", "Ljava/lang/String;", "TOKENIZATION_SPECIFICATION_TYPE", "GATEWAY_INFORMATION", "API_VERSION", "API_VERSION_MINOR", "ALLOWED_PAYMENT_METHODS", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
        
            if (r5 == null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CardPaymentMethod createCardPaymentMethod(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes) {
            paymentInfo.getClass();
            CardParameters cardParameters = paymentInfo.getCardParameters();
            TokenizationSpecification tokenizationSpecification = new TokenizationSpecification("PAYMENT_GATEWAY", new GatewayInformation("checkoutltd", paymentInfo.getPublicKey()));
            List<String> allowedAuthMethods = cardParameters.getAllowedAuthMethods();
            if (supportedCardSchemes != null) {
                if (supportedCardSchemes.isEmpty()) {
                    supportedCardSchemes = null;
                }
            }
            supportedCardSchemes = cardParameters.getAllowedCardNetworks();
            return new CardPaymentMethod("CARD", tokenizationSpecification, new com.checkout.components.wallet.data.dto.CardParameters(allowedAuthMethods, supportedCardSchemes, true, new BillingAddressParameters(Format.FULL)));
        }
    }

    public GooglePayMapper(blc blcVar) {
        blcVar.getClass();
        this.a = blcVar;
    }

    public final String createIsReadyToPayRequestJson(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes) {
        paymentInfo.getClass();
        Map e = d1c.e(new Pair("apiVersion", 2), new Pair("apiVersionMinor", 0), new Pair("allowedPaymentMethods", eb4.c(INSTANCE.createCardPaymentMethod(paymentInfo, supportedCardSchemes))));
        blc blcVar = this.a;
        blcVar.getClass();
        String json = blcVar.b(Map.class, s1k.a).toJson(e);
        json.getClass();
        return json;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toAllowedPaymentMethodsJsonString(CardParameters cardParameters, String publicKey, List<String> supportedCardSchemes) {
        cardParameters.getClass();
        publicKey.getClass();
        List<String> allowedAuthMethods = cardParameters.getAllowedAuthMethods();
        if (supportedCardSchemes != null) {
            if (supportedCardSchemes.isEmpty()) {
                supportedCardSchemes = null;
            }
        }
        supportedCardSchemes = cardParameters.getAllowedCardNetworks();
        List c = eb4.c(new PaymentMethod("CARD", new PaymentMethodCardParameters(allowedAuthMethods, supportedCardSchemes), new PaymentMethodTokenizationSpecification("PAYMENT_GATEWAY", new PaymentMethodGatewayParameters("checkoutltd", publicKey))));
        blc blcVar = this.a;
        blcVar.getClass();
        String json = blcVar.b(List.class, s1k.a).toJson(c);
        json.getClass();
        return json;
    }

    public final String toJson(RequiredPaymentInfo paymentInfo, List<String> supportedCardSchemes) {
        paymentInfo.getClass();
        CardPaymentMethod createCardPaymentMethod = INSTANCE.createCardPaymentMethod(paymentInfo, supportedCardSchemes);
        MerchantInfo merchantInfo = new MerchantInfo(paymentInfo.getMerchant().getName());
        List c = eb4.c(createCardPaymentMethod);
        String bigDecimal = paymentInfo.getAmount().toString();
        bigDecimal.getClass();
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest(2, 0, c, new TransactionInfo(bigDecimal, TotalPriceStatus.FINAL, paymentInfo.getCurrency()), merchantInfo);
        blc blcVar = this.a;
        blcVar.getClass();
        String json = blcVar.b(PaymentDataRequest.class, s1k.a).toJson(paymentDataRequest);
        json.getClass();
        return json;
    }
}
