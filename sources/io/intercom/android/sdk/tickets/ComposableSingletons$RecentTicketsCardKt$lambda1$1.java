package io.intercom.android.sdk.tickets;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import defpackage.hjc;
import defpackage.kjc;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    public static /* synthetic */ Unit a(String str) {
        return invoke$lambda$1$lambda$0(str);
    }

    private static final Unit invoke$lambda$1$lambda$0(String str) {
        str.getClass();
        return Unit.INSTANCE;
    }

    public final void invoke(pq4 pq4Var, int i) {
        if ((i & 3) == 2) {
            sr8 sr8Var = (sr8) pq4Var;
            if (sr8Var.F()) {
                sr8Var.Y();
                return;
            }
        }
        kjc d = androidx.compose.foundation.layout.b.d(hjc.a, 1.0f);
        Ticket.Status status = new Ticket.Status("Waiting on you", "waiting_on_customer", null, false, 0L, 28, null);
        Boolean bool = Boolean.FALSE;
        Ticket ticket = new Ticket(ModuleRequestExtKt.CAPTURE_DELTA, "1200", "This is a ticket title", null, null, null, status, null, null, 0L, null, null, null, bool, 0L, 24504, null);
        Ticket.Status status2 = new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null);
        Boolean bool2 = Boolean.TRUE;
        List listOf = CollectionsKt.listOf(ticket, new Ticket("2", "1201", "Bug", null, null, null, status2, null, null, 0L, null, null, null, bool2, 0L, 24504, null), new Ticket("3", "1202", "Feature Request", null, null, null, new Ticket.Status("In progress", "in_progress", null, false, 0L, 28, null), null, null, 0L, null, null, null, bool2, 0L, 24504, null), new Ticket("4", "1204", "Unresolvable", null, null, null, new Ticket.Status("Resolved", "resolved", null, false, 0L, 28, null), null, null, 0L, null, null, null, bool, 0L, 24504, null));
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(673428457);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        RecentTicketsCardKt.RecentTicketsCard(d, "Recent tickets", listOf, (Function1) Q, sr8Var2, 3126, 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
