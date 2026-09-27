package com.socure.idplus.device.internal.api;

import com.socure.idplus.device.internal.behavior.model.SessionDataRequest;
import com.socure.idplus.device.internal.behavior.model.SessionDataResponse;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateCustomerSession;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowRequest;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowResponse;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.CompleteSNARequestBody;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.StartSNARequestBody;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.StartSNAResponse;
import defpackage.bv2;
import defpackage.lxd;
import defpackage.p59;
import defpackage.ppd;
import defpackage.ug1;
import defpackage.y49;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\u000bJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\b\u0010\u000fJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\b\u0010\u0012J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\b\u0010\u0016J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/socure/idplus/device/internal/api/a;", "", "", "auth", "Lcom/socure/idplus/device/internal/behavior/model/SessionDataRequest;", "uploadSessionData", "Lbv2;", "Lcom/socure/idplus/device/internal/behavior/model/SessionDataResponse;", "a", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/behavior/model/SessionDataRequest;)Lbv2;", "Lokhttp3/ResponseBody;", "(Ljava/lang/String;)Lbv2;", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowRequest;", "createSessionWindowRequest", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowResponse;", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateSessionWindowRequest;)Lbv2;", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateCustomerSession;", "createCustomerSession", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateCustomerSession;)Lbv2;", "Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/StartSNARequestBody;", "startSNARequestBody", "Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/StartSNAResponse;", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/StartSNARequestBody;)Lbv2;", "snaRequestId", "Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/CompleteSNARequestBody;", "completeSNARequestBody", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/CompleteSNARequestBody;)Lbv2;", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {
    @ppd("api/v1/capture")
    @p59({"Content-Type: application/json"})
    bv2<ResponseBody> a(@y49("Authorization") String auth);

    @ppd("api/v1/session-data")
    @p59({"Content-Type: application/json"})
    bv2<SessionDataResponse> a(@y49("Authorization") String auth, @ug1 SessionDataRequest uploadSessionData);

    @ppd("api/v1/customer-session")
    @p59({"Content-Type: application/json"})
    bv2<ResponseBody> a(@y49("Authorization") String auth, @ug1 CreateCustomerSession createCustomerSession);

    @ppd("api/v1/session-window")
    @p59({"Content-Type: application/json"})
    bv2<CreateSessionWindowResponse> a(@y49("Authorization") String auth, @ug1 CreateSessionWindowRequest createSessionWindowRequest);

    @ppd("api/v1/silent-network-auth")
    @p59({"Content-Type: application/json"})
    bv2<StartSNAResponse> a(@y49("Authorization") String auth, @ug1 StartSNARequestBody startSNARequestBody);

    @ppd("api/v1/silent-network-auth/{snaRequestId}/complete")
    @p59({"Content-Type: application/json"})
    bv2<ResponseBody> a(@lxd("snaRequestId") String snaRequestId, @y49("Authorization") String auth, @ug1 CompleteSNARequestBody completeSNARequestBody);
}
