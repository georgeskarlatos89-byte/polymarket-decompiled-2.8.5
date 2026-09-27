package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import defpackage.d1c;
import defpackage.dmk;
import defpackage.u85;
import defpackage.xzb;
import io.getstream.chat.android.models.AttachmentType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Upload;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "externalUploadApi", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "context", "Landroid/content/Context;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/api/ExternalUploadApi;Lio/intercom/android/sdk/identity/UserIdentity;Landroid/content/Context;)V", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "getContext", "()Landroid/content/Context;", "uploadFile", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Upload$Builder;", "imageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UploadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final ExternalUploadApi externalUploadApi;
    private final MessengerApi messengerApi;
    private final UserIdentity userIdentity;

    public /* synthetic */ UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 8) != 0 ? Injector.get().getApplication() : context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
    
        if (r2 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadFile(MediaData.Media media, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        UploadRepository$uploadFile$1 uploadRepository$uploadFile$1;
        int i;
        NetworkResponse networkResponse;
        Object obj;
        NetworkResponse networkResponse2;
        NetworkResponse networkResponse3;
        UploadRepository uploadRepository = this;
        MediaData.Media media2 = media;
        if (continuation instanceof UploadRepository$uploadFile$1) {
            uploadRepository$uploadFile$1 = (UploadRepository$uploadFile$1) continuation;
            int i2 = uploadRepository$uploadFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uploadRepository$uploadFile$1.label = i2 - Integer.MIN_VALUE;
                UploadRepository$uploadFile$1 uploadRepository$uploadFile$12 = uploadRepository$uploadFile$1;
                Object obj2 = uploadRepository$uploadFile$12.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = uploadRepository$uploadFile$12.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            networkResponse2 = (NetworkResponse) uploadRepository$uploadFile$12.L$0;
                            ResultKt.a(obj2);
                            obj = null;
                            networkResponse3 = (NetworkResponse) obj2;
                            if ((networkResponse3 instanceof NetworkResponse.ClientError) || (networkResponse3 instanceof NetworkResponse.NetworkError) || (networkResponse3 instanceof NetworkResponse.ServerError)) {
                                return networkResponse3;
                            }
                            if (!(networkResponse3 instanceof NetworkResponse.Success)) {
                                return networkResponse2;
                            }
                            dmk.a();
                            return obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MediaData.Media media3 = (MediaData.Media) uploadRepository$uploadFile$12.L$1;
                    UploadRepository uploadRepository2 = (UploadRepository) uploadRepository$uploadFile$12.L$0;
                    ResultKt.a(obj2);
                    media2 = media3;
                    uploadRepository = uploadRepository2;
                } else {
                    ResultKt.a(obj2);
                    xzb xzbVar = new xzb();
                    xzbVar.put("original_filename", media2.getFileName());
                    xzbVar.put("size_in_bytes", new Long(media2.getSize()));
                    xzbVar.put("content_type", media2.getMimeType());
                    if (media2 instanceof MediaData.Media.Image) {
                        MediaData.Media.Image image = (MediaData.Media.Image) media2;
                        xzbVar.put("width", new Integer(image.getWidth()));
                        xzbVar.put("height", new Integer(image.getHeight()));
                        if (!image.getExifData().isEmpty()) {
                            xzbVar.put("image_exif", image.getExifData());
                        }
                    }
                    if (media2 instanceof MediaData.Media.Video) {
                        MediaData.Media.Video video = (MediaData.Media.Video) media2;
                        xzbVar.put("width", new Integer(video.getWidth()));
                        xzbVar.put("height", new Integer(video.getHeight()));
                    }
                    RequestBody defaultRequestBody$intercom_sdk_base_release = MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(d1c.e(new Pair("upload", xzbVar.b()), new Pair("user", uploadRepository.userIdentity.toMap()), new Pair("include_metadata", Boolean.TRUE)));
                    MessengerApi messengerApi = uploadRepository.messengerApi;
                    uploadRepository$uploadFile$12.L$0 = uploadRepository;
                    uploadRepository$uploadFile$12.L$1 = media2;
                    uploadRepository$uploadFile$12.label = 1;
                    obj2 = messengerApi.getUploadFileUrlSuspended(defaultRequestBody$intercom_sdk_base_release, uploadRepository$uploadFile$12);
                }
                networkResponse = (NetworkResponse) obj2;
                if ((networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                    if (networkResponse instanceof NetworkResponse.Success) {
                        Upload build = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                        ExternalUploadApi externalUploadApi = uploadRepository.externalUploadApi;
                        String uploadDestination = build.getUploadDestination();
                        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                        String key = build.getKey();
                        key.getClass();
                        MultipartBody.Part createFormData = companion.createFormData("key", key);
                        String acl = build.getAcl();
                        acl.getClass();
                        MultipartBody.Part createFormData2 = companion.createFormData("acl", acl);
                        String contentType = build.getContentType();
                        contentType.getClass();
                        MultipartBody.Part createFormData3 = companion.createFormData("Content-Type", contentType);
                        String awsAccessKey = build.getAwsAccessKey();
                        awsAccessKey.getClass();
                        MultipartBody.Part createFormData4 = companion.createFormData("AWSAccessKeyId", awsAccessKey);
                        String policy = build.getPolicy();
                        policy.getClass();
                        MultipartBody.Part createFormData5 = companion.createFormData("policy", policy);
                        String signature = build.getSignature();
                        signature.getClass();
                        MultipartBody.Part createFormData6 = companion.createFormData("signature", signature);
                        String successActionStatus = build.getSuccessActionStatus();
                        successActionStatus.getClass();
                        MultipartBody.Part createFormData7 = companion.createFormData("success_action_status", successActionStatus);
                        MultipartBody.Part createFormData8 = companion.createFormData("x-amz-meta-safe_app_id", build.getMetadata().getSafeAppId());
                        MultipartBody.Part createFormData9 = companion.createFormData(AttachmentType.FILE, media2.getFileName(), new UploadRequestBody(uploadRepository.context, media2));
                        uploadRepository$uploadFile$12.L$0 = networkResponse;
                        uploadRepository$uploadFile$12.L$1 = null;
                        uploadRepository$uploadFile$12.label = 2;
                        obj = null;
                        Object uploadFileSuspended = externalUploadApi.uploadFileSuspended(uploadDestination, createFormData, createFormData2, createFormData3, createFormData4, createFormData5, createFormData6, createFormData7, createFormData8, createFormData9, uploadRepository$uploadFile$12);
                        if (uploadFileSuspended != u85Var) {
                            obj2 = uploadFileSuspended;
                            networkResponse2 = networkResponse;
                            networkResponse3 = (NetworkResponse) obj2;
                            if (networkResponse3 instanceof NetworkResponse.ClientError) {
                                if (!(networkResponse3 instanceof NetworkResponse.Success)) {
                                }
                            }
                            return networkResponse3;
                        }
                        return u85Var;
                    }
                    dmk.a();
                    return null;
                }
                return networkResponse;
            }
        }
        uploadRepository$uploadFile$1 = new UploadRepository$uploadFile$1(uploadRepository, continuation);
        UploadRepository$uploadFile$1 uploadRepository$uploadFile$122 = uploadRepository$uploadFile$1;
        Object obj22 = uploadRepository$uploadFile$122.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = uploadRepository$uploadFile$122.label;
        if (i == 0) {
        }
        networkResponse = (NetworkResponse) obj22;
        if (networkResponse instanceof NetworkResponse.ClientError) {
        }
        return networkResponse;
    }

    public UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context) {
        messengerApi.getClass();
        externalUploadApi.getClass();
        userIdentity.getClass();
        context.getClass();
        this.messengerApi = messengerApi;
        this.externalUploadApi = externalUploadApi;
        this.userIdentity = userIdentity;
        this.context = context;
    }

    public UploadRepository() {
        this(null, null, null, null, 15, null);
    }
}
