package com.socure.docv.capturesdk.common.network.transport;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ar8;
import defpackage.y4g;
import defpackage.zif;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/transport/b;", "", "", ApiConstant.KEY_DATA, "Ly4g;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface b {
    @ar8("track/")
    Object a(@zif("data") String str, Continuation<? super y4g<ResponseBody>> continuation);
}
