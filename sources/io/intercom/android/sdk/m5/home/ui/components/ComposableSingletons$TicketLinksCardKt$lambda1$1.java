package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    public static /* synthetic */ Unit a(TicketType ticketType) {
        return invoke$lambda$1$lambda$0(ticketType);
    }

    private static final Unit invoke$lambda$1$lambda$0(TicketType ticketType) {
        ticketType.getClass();
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
        TicketType.Companion companion = TicketType.INSTANCE;
        HomeCards.HomeTicketLinksData homeTicketLinksData = new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, CollectionsKt.listOf(new TicketLink(1L, "Billing issue", "", 0, companion.getNULL()), new TicketLink(2L, "Bug", "", 1, companion.getNULL())));
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(-1344773304);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        TicketLinksCardKt.TicketLinksCard(homeTicketLinksData, (Function1) Q, sr8Var2, 48);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
