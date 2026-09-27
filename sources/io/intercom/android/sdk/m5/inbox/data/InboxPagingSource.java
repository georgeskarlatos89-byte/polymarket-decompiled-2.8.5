package io.intercom.android.sdk.m5.inbox.data;

import defpackage.dmk;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.mtd;
import defpackage.ntd;
import defpackage.otd;
import defpackage.ptd;
import defpackage.u85;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationList;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxPagingSource;", "Lotd;", "", "Lio/intercom/android/sdk/models/Conversation;", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "inboxRepository", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lkotlin/Function2;", "Lio/intercom/android/sdk/models/EmptyState;", "Lkotlin/coroutines/Continuation;", "", "", "onEmptyState", "<init>", "(Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lkotlin/jvm/functions/Function2;)V", "Lktd;", "params", "Lntd;", "load", "(Lktd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lptd;", "state", "getRefreshKey", "(Lptd;)Ljava/lang/Long;", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lkotlin/jvm/functions/Function2;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InboxPagingSource extends otd {
    public static final int PAGE_SIZE = 20;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final Function2<EmptyState, Continuation<? super Unit>, Object> onEmptyState;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public InboxPagingSource(InboxRepository inboxRepository, IntercomDataLayer intercomDataLayer, Function2<? super EmptyState, ? super Continuation<? super Unit>, ? extends Object> function2) {
        inboxRepository.getClass();
        intercomDataLayer.getClass();
        function2.getClass();
        this.inboxRepository = inboxRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.onEmptyState = function2;
    }

    @Override // defpackage.otd
    public Long getRefreshKey(ptd state) {
        state.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0060, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.otd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(ktd ktdVar, Continuation<? super ntd> continuation) {
        InboxPagingSource$load$1 inboxPagingSource$load$1;
        int i;
        NetworkResponse networkResponse;
        InboxPagingSource inboxPagingSource;
        ConversationList conversationList;
        int i2;
        List<Conversation> conversations;
        Long l;
        Conversation conversation;
        if (continuation instanceof InboxPagingSource$load$1) {
            inboxPagingSource$load$1 = (InboxPagingSource$load$1) continuation;
            int i3 = inboxPagingSource$load$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inboxPagingSource$load$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inboxPagingSource$load$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = inboxPagingSource$load$1.label;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = inboxPagingSource$load$1.I$0;
                            conversationList = (ConversationList) inboxPagingSource$load$1.L$1;
                            inboxPagingSource = (InboxPagingSource) inboxPagingSource$load$1.L$0;
                            ResultKt.a(obj);
                            if (i2 == 0) {
                                conversations = CollectionsKt.M0((Iterable) inboxPagingSource.intercomDataLayer.getConversations().getValue());
                            } else {
                                conversations = conversationList.getConversations();
                            }
                            List<Conversation> list = conversations;
                            list.getClass();
                            if (!conversationList.hasMorePages() && (conversation = (Conversation) CollectionsKt.S(list)) != null) {
                                l = new Long(ConversationExtensionsKt.lastActionCreatedAt(conversation));
                            } else {
                                l = null;
                            }
                            return new mtd(list, null, l, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ktdVar = (ktd) inboxPagingSource$load$1.L$1;
                    this = (InboxPagingSource) inboxPagingSource$load$1.L$0;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    InboxRepository inboxRepository = this.inboxRepository;
                    Long l2 = (Long) ktdVar.a();
                    inboxPagingSource$load$1.L$0 = this;
                    inboxPagingSource$load$1.L$1 = ktdVar;
                    inboxPagingSource$load$1.label = 1;
                    obj = inboxRepository.getConversations(l2, 20, inboxPagingSource$load$1);
                }
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    if (ktdVar.a() != null) {
                        i4 = 0;
                    }
                    ConversationsResponse build = ((ConversationsResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                    ConversationList conversationPage = build.getConversationPage();
                    IntercomDataLayer intercomDataLayer = this.intercomDataLayer;
                    Config config = build.getConfig();
                    config.getClass();
                    intercomDataLayer.updateConfig(config);
                    IntercomDataLayer intercomDataLayer2 = this.intercomDataLayer;
                    List<Conversation> conversations2 = conversationPage.getConversations();
                    conversations2.getClass();
                    intercomDataLayer2.addConversations(conversations2);
                    Function2<EmptyState, Continuation<? super Unit>, Object> function2 = this.onEmptyState;
                    EmptyState emptyState = conversationPage.getEmptyState();
                    emptyState.getClass();
                    inboxPagingSource$load$1.L$0 = this;
                    inboxPagingSource$load$1.L$1 = conversationPage;
                    inboxPagingSource$load$1.I$0 = i4;
                    inboxPagingSource$load$1.label = 2;
                    if (function2.invoke(emptyState, inboxPagingSource$load$1) != u85Var) {
                        inboxPagingSource = this;
                        conversationList = conversationPage;
                        i2 = i4;
                        if (i2 == 0) {
                        }
                        List<Conversation> list2 = conversations;
                        list2.getClass();
                        if (!conversationList.hasMorePages()) {
                        }
                        l = null;
                        return new mtd(list2, null, l, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    return u85Var;
                }
                if (networkResponse instanceof NetworkResponse.NetworkError) {
                    return new ltd(((NetworkResponse.NetworkError) networkResponse).getError());
                }
                if (networkResponse instanceof NetworkResponse.ClientError) {
                    return new ltd(((NetworkResponse.ClientError) networkResponse).getError());
                }
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    return new ltd(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
                }
                dmk.a();
                return null;
            }
        }
        inboxPagingSource$load$1 = new InboxPagingSource$load$1(this, continuation);
        Object obj2 = inboxPagingSource$load$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = inboxPagingSource$load$1.label;
        int i42 = 1;
        if (i == 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
        }
    }

    @Override // defpackage.otd
    public /* bridge */ /* synthetic */ Object getRefreshKey(ptd ptdVar) {
        return getRefreshKey(ptdVar);
    }
}
