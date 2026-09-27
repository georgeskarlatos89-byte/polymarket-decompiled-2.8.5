package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.a4n;
import defpackage.h3b;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import defpackage.u2b;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements Function2<pq4, Integer, Unit> {
    final /* synthetic */ h3b $lazyPagingItems;

    public InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(h3b h3bVar) {
        this.$lazyPagingItems = h3bVar;
    }

    public static /* synthetic */ Unit a(Conversation conversation) {
        return invoke$lambda$2$lambda$1$lambda$0(conversation);
    }

    public static /* synthetic */ Unit b(h3b h3bVar, u2b u2bVar) {
        return invoke$lambda$2$lambda$1(h3bVar, u2bVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    private static final Unit invoke$lambda$2$lambda$1(h3b h3bVar, u2b u2bVar) {
        u2bVar.getClass();
        InboxContentScreenItemsKt.inboxContentScreenItems(u2bVar, h3bVar, new Object());
        return Unit.INSTANCE;
    }

    private static final Unit invoke$lambda$2$lambda$1$lambda$0(Conversation conversation) {
        conversation.getClass();
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
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(-614454342);
        boolean j = sr8Var2.j(this.$lazyPagingItems);
        h3b h3bVar = this.$lazyPagingItems;
        Object Q = sr8Var2.Q();
        if (j || Q == oq4.a) {
            Q = new b(h3bVar, 0);
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        a4n.a(null, null, null, false, null, null, null, false, null, (Function1) Q, sr8Var2, 0, 511);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
