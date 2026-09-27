package com.checkout.components.rememberme.data;

import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.rememberme.model.CreateMerchantTokenRequest;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.wallet.BuildConfig;
import defpackage.ar8;
import defpackage.lxd;
import defpackage.ppd;
import defpackage.py2;
import defpackage.ug1;
import defpackage.y49;
import defpackage.y4g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/rememberme/data/ConsumerApi;", "", "", "jwtToken", "consumerId", "ckoServiceName", "ckoServiceVersion", "Ly4g;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "getWallet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/checkout/components/rememberme/model/CreateMerchantTokenRequest;", "body", "paymentMethodId", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "createMerchantToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/CreateMerchantTokenRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConsumerApi {
    static /* synthetic */ Object createMerchantToken$default(ConsumerApi consumerApi, String str, String str2, String str3, CreateMerchantTokenRequest createMerchantTokenRequest, String str4, String str5, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = BuildConfig.SERVICE_NAME;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = BuildConfig.PRODUCT_VERSION;
            }
            return consumerApi.createMerchantToken(str, str6, str3, createMerchantTokenRequest, str4, str5, continuation);
        }
        py2.f("Super calls with default arguments not supported in this target, function: createMerchantToken");
        return null;
    }

    static /* synthetic */ Object getWallet$default(ConsumerApi consumerApi, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str3 = BuildConfig.SERVICE_NAME;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                str4 = BuildConfig.PRODUCT_VERSION;
            }
            return consumerApi.getWallet(str, str2, str5, str4, continuation);
        }
        py2.f("Super calls with default arguments not supported in this target, function: getWallet");
        return null;
    }

    @ppd("/consumers/{consumer_id}/payment-methods/{payment_method_id}/merchant-token")
    Object createMerchantToken(@y49("Authorization") String str, @y49("Cko-Service-Name") String str2, @y49("Cko-Service-Version") String str3, @ug1 CreateMerchantTokenRequest createMerchantTokenRequest, @lxd("consumer_id") String str4, @lxd("payment_method_id") String str5, Continuation<? super y4g<TokenDetailsResponse>> continuation);

    @ar8("/consumers/{consumer_id}")
    Object getWallet(@y49("Authorization") String str, @lxd("consumer_id") String str2, @y49("Cko-Service-Name") String str3, @y49("Cko-Service-Version") String str4, Continuation<? super y4g<GetWalletResponse>> continuation);
}
