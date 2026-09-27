package io.intercom.android.sdk.tickets;

import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressBannerKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$TicketProgressBannerKt$lambda1$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$TicketProgressBannerKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketProgressBannerKt$lambda1$1();

    public static /* synthetic */ Unit a() {
        return invoke$lambda$1$lambda$0();
    }

    private static final Unit invoke$lambda$1$lambda$0() {
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
        sr8Var2.e0(57238520);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new b(1);
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        TicketProgressBannerKt.TicketProgressBanner("API issue", (Function0) Q, true, null, sr8Var2, 438, 8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
