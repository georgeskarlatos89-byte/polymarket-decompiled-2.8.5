package io.intercom.android.sdk.tickets.list.data;

import defpackage.dmk;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.mtd;
import defpackage.ntd;
import defpackage.otd;
import defpackage.ptd;
import defpackage.u85;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsPagingSource;", "Lotd;", "", "Lio/intercom/android/sdk/models/Ticket;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "repository", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketRepository;)V", "Lktd;", "params", "Lntd;", "load", "(Lktd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lptd;", "state", "getRefreshKey", "(Lptd;)Ljava/lang/Long;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TicketsPagingSource extends otd {
    public static final int PAGE_SIZE = 10;
    private final TicketRepository repository;
    public static final int $stable = 8;

    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository);
    }

    @Override // defpackage.otd
    public Long getRefreshKey(ptd state) {
        state.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.otd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(ktd ktdVar, Continuation<? super ntd> continuation) {
        TicketsPagingSource$load$1 ticketsPagingSource$load$1;
        int i;
        long j;
        NetworkResponse networkResponse;
        if (continuation instanceof TicketsPagingSource$load$1) {
            ticketsPagingSource$load$1 = (TicketsPagingSource$load$1) continuation;
            int i2 = ticketsPagingSource$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ticketsPagingSource$load$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ticketsPagingSource$load$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ticketsPagingSource$load$1.label;
                Long l = null;
                if (i == 0) {
                    if (i == 1) {
                        ktdVar = (ktd) ticketsPagingSource$load$1.L$0;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    TicketRepository ticketRepository = this.repository;
                    Long l2 = (Long) ktdVar.a();
                    if (l2 != null) {
                        j = l2.longValue();
                    } else {
                        j = 1;
                    }
                    ticketsPagingSource$load$1.L$0 = ktdVar;
                    ticketsPagingSource$load$1.label = 1;
                    obj = ticketRepository.fetchTickets(j, 10, ticketsPagingSource$load$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                    List<Ticket> tickets = ((TicketsResponse) success.getBody()).getTickets();
                    if (((Long) ktdVar.a()) != null) {
                        l = new Long(r10.longValue() - 1);
                    }
                    Long nextPage = ((TicketsResponse) success.getBody()).getNextPage();
                    tickets.getClass();
                    return new mtd(tickets, l, nextPage, Integer.MIN_VALUE, Integer.MIN_VALUE);
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
        ticketsPagingSource$load$1 = new TicketsPagingSource$load$1(this, continuation);
        Object obj2 = ticketsPagingSource$load$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ticketsPagingSource$load$1.label;
        Long l3 = null;
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

    public TicketsPagingSource() {
        this(null, 1, null);
    }

    public TicketsPagingSource(TicketRepository ticketRepository) {
        ticketRepository.getClass();
        this.repository = ticketRepository;
    }
}
