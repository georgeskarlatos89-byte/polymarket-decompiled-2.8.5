package com.socure.docv.capturesdk.common.network.transport;

import com.socure.docv.capturesdk.common.network.model.stepup.DeviceSessionRequest;
import com.socure.docv.capturesdk.common.network.model.stepup.StartSessionRequest;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ResponseWrapper;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.boc;
import defpackage.e59;
import defpackage.jwd;
import defpackage.ppd;
import defpackage.qpd;
import defpackage.ug1;
import defpackage.y4g;
import io.getstream.chat.android.models.AttachmentType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJt\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/transport/c;", "", "", "", "headers", "Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;", "deviceSessionId", "Ly4g;", "c", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", AttachmentType.FILE, "Lokhttp3/RequestBody;", "moduleData", "documentMetrics", "", "multiframeParts", "secondaryDocs", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ResponseWrapper;", "b", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/StartSessionRequest;", "startSessionRequest", "a", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/network/model/stepup/StartSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {
    @ppd(ApiConstant.STEP_UP_MODULE_START_SESSION)
    Object a(@e59 Map<String, String> map, @ug1 StartSessionRequest startSessionRequest, Continuation<? super y4g<ResponseWrapper>> continuation);

    @boc
    @ppd(ApiConstant.STEP_UP_SUBMIT)
    Object b(@e59 Map<String, String> map, @jwd MultipartBody.Part part, @jwd("module_data") RequestBody requestBody, @jwd MultipartBody.Part part2, @jwd List<MultipartBody.Part> list, @jwd List<MultipartBody.Part> list2, Continuation<? super y4g<ResponseWrapper>> continuation);

    @qpd(ApiConstant.STEP_UP_DEVICE_SESSION)
    Object c(@e59 Map<String, String> map, @ug1 DeviceSessionRequest deviceSessionRequest, Continuation<? super y4g<Object>> continuation);
}
