package io.intercom.android.sdk.tickets.create.data;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.d1c;
import defpackage.dmk;
import defpackage.u85;
import defpackage.xzb;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 J&\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020%H\u0086@¢\u0006\u0002\u0010&J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010(J,\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u0006\u0010+\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010,J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "", MetricTracker.Place.API, "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "uploadRepository", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketApi;Lio/intercom/android/sdk/m5/upload/data/UploadRepository;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/AblyManager;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "realTimeEvents", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "createTicket", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Ticket;", "conversationId", "", "ticketId", "", "attributes", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "(Ljava/lang/String;JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "Lio/intercom/android/sdk/models/Upload$Builder;", ApiConstant.KEY_DATA, "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTickets", "Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "page", "pageSize", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTicketDetail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "ticketTypeId", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TicketRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final TicketApi api;
    private final IntercomDataLayer intercomDataLayer;
    private final NexusClient nexusClient;
    private final UploadRepository uploadRepository;

    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getTicketApi() : ticketApi, (i & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i & 4) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 8) != 0 ? Injector.get().getAblyManager() : ablyManager, (i & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchTicketType$default(TicketRepository ticketRepository, long j, List list, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return ticketRepository.fetchTicketType(j, list, continuation);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return ticketRepository.fetchTickets(j, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTicket(String str, long j, List<TicketAttributeRequest> list, Continuation<? super NetworkResponse<Ticket>> continuation) {
        TicketRepository$createTicket$1 ticketRepository$createTicket$1;
        int i;
        NetworkResponse networkResponse;
        if (continuation instanceof TicketRepository$createTicket$1) {
            ticketRepository$createTicket$1 = (TicketRepository$createTicket$1) continuation;
            int i2 = ticketRepository$createTicket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ticketRepository$createTicket$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ticketRepository$createTicket$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ticketRepository$createTicket$1.label;
                if (i == 0) {
                    if (i == 1) {
                        this = (TicketRepository) ticketRepository$createTicket$1.L$0;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    TicketApi ticketApi = this.api;
                    MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
                    xzb xzbVar = new xzb();
                    if (str != null && !StringsKt.T(str)) {
                        xzbVar.put(CreateTicketDestinationKt.CONVERSATION_ID, str);
                    }
                    xzbVar.put("type_id", new Long(j));
                    xzbVar.put("attributes", list);
                    RequestBody defaultRequestBody$intercom_sdk_base_release = messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(xzbVar.b());
                    ticketRepository$createTicket$1.L$0 = this;
                    ticketRepository$createTicket$1.label = 1;
                    obj = ticketApi.createTicket(defaultRequestBody$intercom_sdk_base_release, ticketRepository$createTicket$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    this.intercomDataLayer.updateTicket((Ticket) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return networkResponse;
            }
        }
        ticketRepository$createTicket$1 = new TicketRepository$createTicket$1(this, continuation);
        Object obj2 = ticketRepository$createTicket$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ticketRepository$createTicket$1.label;
        if (i == 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
        return networkResponse;
    }

    public final Object fetchTicketDetail(String str, Continuation<? super NetworkResponse<Ticket>> continuation) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), continuation);
    }

    public final Object fetchTicketType(long j, List<TicketAttributeRequest> list, Continuation<? super NetworkResponse<TicketTypeV2>> continuation) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(d1c.e(new Pair(CreateTicketDestinationKt.TICKET_TYPE_ID, new Long(j)), new Pair("attributes", list))), continuation);
    }

    public final Object fetchTickets(long j, int i, Continuation<? super NetworkResponse<TicketsResponse>> continuation) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(d1c.e(new Pair("page", new Long(j)), new Pair("per_page", new Integer(i)))), continuation);
    }

    public final Object markAsRead(String str, Continuation<? super NetworkResponse<Unit>> continuation) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), continuation);
    }

    public final Flow<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    public final Object uploadFile(MediaData.Media media, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        return this.uploadRepository.uploadFile(media, continuation);
    }

    public TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer) {
        ticketApi.getClass();
        uploadRepository.getClass();
        nexusClient.getClass();
        ablyManager.getClass();
        intercomDataLayer.getClass();
        this.api = ticketApi;
        this.uploadRepository = uploadRepository;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
        this.intercomDataLayer = intercomDataLayer;
    }

    public TicketRepository() {
        this(null, null, null, null, null, 31, null);
    }
}
