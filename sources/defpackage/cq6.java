package defpackage;

import com.checkout.risk.DeviceDataConfiguration;
import com.checkout.risk.PersistFingerprintDataRequest;
import com.checkout.risk.PersistFingerprintDataResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\br\u0018\u00002\u00020\u0001JA\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcq6;", "", "", "authHeader", "integrationType", "riskSdkVersion", "timezone", "Ly4g;", "Lcom/checkout/risk/DeviceDataConfiguration;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/checkout/risk/PersistFingerprintDataRequest;", "fingerprintData", "Lcom/checkout/risk/PersistFingerprintDataResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/risk/PersistFingerprintDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
interface cq6 {
    @ar8("/collect/configuration")
    Object a(@y49("Authorization") String str, @zif("integrationType") String str2, @zif("riskSdkVersion") String str3, @zif("timezone") String str4, Continuation<? super y4g<DeviceDataConfiguration>> continuation);

    @qpd("/collect/fingerprint")
    Object b(@y49("Authorization") String str, @zif("riskSdkVersion") String str2, @ug1 PersistFingerprintDataRequest persistFingerprintDataRequest, Continuation<? super y4g<PersistFingerprintDataResponse>> continuation);
}
