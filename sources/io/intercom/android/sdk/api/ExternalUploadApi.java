package io.intercom.android.sdk.api;

import defpackage.boc;
import defpackage.jwd;
import defpackage.ppd;
import defpackage.yxj;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.radar.sdk.RadarTripOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001Jz\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/api/ExternalUploadApi;", "", "uploadFileSuspended", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "url", "", "key", "Lokhttp3/MultipartBody$Part;", "acl", "contentType", "accessKey", "policy", "signature", "successActionStatus", RadarTripOptions.KEY_METADATA, "filePart", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExternalUploadApi {
    @boc
    @ppd
    Object uploadFileSuspended(@yxj String str, @jwd MultipartBody.Part part, @jwd MultipartBody.Part part2, @jwd MultipartBody.Part part3, @jwd MultipartBody.Part part4, @jwd MultipartBody.Part part5, @jwd MultipartBody.Part part6, @jwd MultipartBody.Part part7, @jwd MultipartBody.Part part8, @jwd MultipartBody.Part part9, Continuation<? super NetworkResponse<Unit>> continuation);
}
