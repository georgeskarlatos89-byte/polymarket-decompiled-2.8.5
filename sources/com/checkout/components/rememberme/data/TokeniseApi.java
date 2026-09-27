package com.checkout.components.rememberme.data;

import com.checkout.components.rememberme.model.CvvTokenPayload;
import com.checkout.components.rememberme.model.CvvTokenResponse;
import com.checkout.components.wallet.BuildConfig;
import defpackage.ppd;
import defpackage.py2;
import defpackage.ug1;
import defpackage.y49;
import defpackage.y4g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/rememberme/data/TokeniseApi;", "", "", "authorization", "ckoServiceName", "ckoServiceVersion", "Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "body", "Ly4g;", "Lcom/checkout/components/rememberme/model/CvvTokenResponse;", "createCvvToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/CvvTokenPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TokeniseApi {
    static /* synthetic */ Object createCvvToken$default(TokeniseApi tokeniseApi, String str, String str2, String str3, CvvTokenPayload cvvTokenPayload, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = BuildConfig.SERVICE_NAME;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = BuildConfig.PRODUCT_VERSION;
            }
            return tokeniseApi.createCvvToken(str, str4, str3, cvvTokenPayload, continuation);
        }
        py2.f("Super calls with default arguments not supported in this target, function: createCvvToken");
        return null;
    }

    @ppd("/tokens")
    Object createCvvToken(@y49("Authorization") String str, @y49("Cko-Service-Name") String str2, @y49("Cko-Service-Version") String str3, @ug1 CvvTokenPayload cvvTokenPayload, Continuation<? super y4g<CvvTokenResponse>> continuation);
}
