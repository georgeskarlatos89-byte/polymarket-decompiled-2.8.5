package io.intercom.android.sdk.m5.data;

import defpackage.dmk;
import defpackage.mrc;
import defpackage.orc;
import defpackage.u85;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/data/CommonRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "openMessenger", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/intercom/android/sdk/models/UsersResponse;", "fetchUnreadCounts", "Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lmrc;", "openMutex", "Lmrc;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonRepository {
    public static final int $stable = 8;
    private final IntercomDataLayer intercomDataLayer;
    private final MessengerApi messengerApi;
    private final mrc openMutex;

    public CommonRepository(MessengerApi messengerApi, IntercomDataLayer intercomDataLayer) {
        messengerApi.getClass();
        intercomDataLayer.getClass();
        this.messengerApi = messengerApi;
        this.intercomDataLayer = intercomDataLayer;
        this.openMutex = new orc();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchUnreadCounts(Continuation<? super UsersResponse> continuation) {
        CommonRepository$fetchUnreadCounts$1 commonRepository$fetchUnreadCounts$1;
        int i;
        NetworkResponse networkResponse;
        if (continuation instanceof CommonRepository$fetchUnreadCounts$1) {
            commonRepository$fetchUnreadCounts$1 = (CommonRepository$fetchUnreadCounts$1) continuation;
            int i2 = commonRepository$fetchUnreadCounts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonRepository$fetchUnreadCounts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonRepository$fetchUnreadCounts$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = commonRepository$fetchUnreadCounts$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    MessengerApi messengerApi = this.messengerApi;
                    commonRepository$fetchUnreadCounts$1.label = 1;
                    obj = MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(messengerApi, null, commonRepository$fetchUnreadCounts$1, 1, null);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    return null;
                }
                return ((UsersResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
            }
        }
        commonRepository$fetchUnreadCounts$1 = new CommonRepository$fetchUnreadCounts$1(this, continuation);
        Object obj2 = commonRepository$fetchUnreadCounts$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = commonRepository$fetchUnreadCounts$1.label;
        if (i == 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        if (r8.e(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x009c, B:15:0x00a2, B:17:0x00bf, B:18:0x00c1), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:31:0x005d, B:33:0x0065, B:34:0x0070, B:36:0x007e, B:37:0x0089), top: B:30:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:31:0x005d, B:33:0x0065, B:34:0x0070, B:36:0x007e, B:37:0x0089), top: B:30:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openMessenger(Continuation<? super NetworkResponse<OpenMessengerResponse>> continuation) {
        CommonRepository$openMessenger$1 commonRepository$openMessenger$1;
        int i;
        mrc mrcVar;
        Throwable th;
        mrc mrcVar2;
        OpenMessengerResponse openResponse;
        CommonRepository commonRepository;
        Object success;
        Object obj;
        try {
            if (continuation instanceof CommonRepository$openMessenger$1) {
                commonRepository$openMessenger$1 = (CommonRepository$openMessenger$1) continuation;
                int i2 = commonRepository$openMessenger$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    commonRepository$openMessenger$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = commonRepository$openMessenger$1.result;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = commonRepository$openMessenger$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                mrcVar2 = (mrc) commonRepository$openMessenger$1.L$1;
                                commonRepository = (CommonRepository) commonRepository$openMessenger$1.L$0;
                                try {
                                    ResultKt.a(obj2);
                                    obj = (NetworkResponse) obj2;
                                    if (obj instanceof NetworkResponse.Success) {
                                        commonRepository.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) ((NetworkResponse.Success) obj).getBody());
                                        TeamPresence teamPresence = ((OpenMessengerResponse) ((NetworkResponse.Success) obj).getBody()).getTeamPresence();
                                        if (teamPresence == null) {
                                            teamPresence = TeamPresence.NULL;
                                        }
                                        commonRepository.intercomDataLayer.updateTeamPresence(teamPresence);
                                    }
                                    mrcVar = mrcVar2;
                                    success = obj;
                                    mrcVar.o(null);
                                    return success;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mrcVar2.o(null);
                                    throw th;
                                }
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mrc mrcVar3 = (mrc) commonRepository$openMessenger$1.L$1;
                        CommonRepository commonRepository2 = (CommonRepository) commonRepository$openMessenger$1.L$0;
                        ResultKt.a(obj2);
                        mrcVar = mrcVar3;
                        this = commonRepository2;
                    } else {
                        ResultKt.a(obj2);
                        mrcVar = this.openMutex;
                        commonRepository$openMessenger$1.L$0 = this;
                        commonRepository$openMessenger$1.L$1 = mrcVar;
                        commonRepository$openMessenger$1.label = 1;
                    }
                    openResponse = this.intercomDataLayer.getOpenResponse();
                    if (openResponse == null) {
                        success = new NetworkResponse.Success(openResponse);
                        mrcVar.o(null);
                        return success;
                    }
                    if (!Injector.get().getAblyManager().isConnected()) {
                        Injector.get().getAblyManager().connect();
                    }
                    MessengerApi messengerApi = this.messengerApi;
                    commonRepository$openMessenger$1.L$0 = this;
                    commonRepository$openMessenger$1.L$1 = mrcVar;
                    commonRepository$openMessenger$1.label = 2;
                    Object openMessengerSuspended$default = MessengerApi.DefaultImpls.openMessengerSuspended$default(messengerApi, null, commonRepository$openMessenger$1, 1, null);
                    if (openMessengerSuspended$default != u85Var) {
                        commonRepository = this;
                        mrcVar2 = mrcVar;
                        obj2 = openMessengerSuspended$default;
                        obj = (NetworkResponse) obj2;
                        if (obj instanceof NetworkResponse.Success) {
                        }
                        mrcVar = mrcVar2;
                        success = obj;
                        mrcVar.o(null);
                        return success;
                    }
                    return u85Var;
                }
            }
            openResponse = this.intercomDataLayer.getOpenResponse();
            if (openResponse == null) {
            }
        } catch (Throwable th3) {
            mrc mrcVar4 = mrcVar;
            th = th3;
            mrcVar2 = mrcVar4;
            mrcVar2.o(null);
            throw th;
        }
        commonRepository$openMessenger$1 = new CommonRepository$openMessenger$1(this, continuation);
        Object obj22 = commonRepository$openMessenger$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = commonRepository$openMessenger$1.label;
        if (i == 0) {
        }
    }
}
