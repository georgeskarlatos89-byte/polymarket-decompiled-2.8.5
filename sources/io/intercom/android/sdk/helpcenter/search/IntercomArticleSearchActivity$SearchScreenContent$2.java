package io.intercom.android.sdk.helpcenter.search;

import defpackage.frm;
import defpackage.gdn;
import defpackage.iqd;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.kjc;
import defpackage.nk0;
import defpackage.nym;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.pqn;
import defpackage.rp4;
import defpackage.sje;
import defpackage.sp4;
import defpackage.sr8;
import defpackage.sv6;
import defpackage.t1k;
import defpackage.yr4;
import defpackage.zzm;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomArticleSearchActivity$SearchScreenContent$2 implements Function3<iqd, pq4, Integer, Unit> {
    final /* synthetic */ ArticleSearchState $articleSearchState;
    final /* synthetic */ Function1<String, Unit> $onArticleClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomArticleSearchActivity$SearchScreenContent$2(ArticleSearchState articleSearchState, Function1<? super String, Unit> function1) {
        this.$articleSearchState = articleSearchState;
        this.$onArticleClicked = function1;
    }

    public static /* synthetic */ Unit a() {
        return invoke$lambda$2$lambda$1$lambda$0();
    }

    private static final Unit invoke$lambda$2$lambda$1$lambda$0() {
        return Unit.INSTANCE;
    }

    public final void invoke(iqd iqdVar, pq4 pq4Var, int i) {
        int i2;
        iqdVar.getClass();
        if ((i & 6) == 0) {
            if (((sr8) pq4Var).h(iqdVar)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) == 18) {
            sr8 sr8Var = (sr8) pq4Var;
            if (sr8Var.F()) {
                sr8Var.Y();
                return;
            }
        }
        kjc e = frm.e(t1k.b(androidx.compose.foundation.layout.b.c, sv6.f(IntercomTheme.INSTANCE, pq4Var, IntercomTheme.$stable), nym.a), iqdVar);
        ArticleSearchState articleSearchState = this.$articleSearchState;
        Function1<String, Unit> function1 = this.$onArticleClicked;
        kc4 a = jc4.a(nk0.c, gdn.o, pq4Var, 0);
        sr8 sr8Var2 = (sr8) pq4Var;
        int hashCode = Long.hashCode(sr8Var2.T);
        sje n = sr8Var2.n();
        kjc e2 = pqn.e(pq4Var, e);
        sp4.h0.getClass();
        yr4 yr4Var = rp4.b;
        sr8 sr8Var3 = (sr8) pq4Var;
        sr8Var3.i0();
        if (sr8Var3.S) {
            sr8Var3.m(yr4Var);
        } else {
            sr8Var3.r0();
        }
        zzm.d(pq4Var, a, rp4.f);
        zzm.d(pq4Var, n, rp4.e);
        zzm.a(pq4Var, Integer.valueOf(hashCode), rp4.g);
        zzm.b(pq4Var, rp4.h);
        zzm.d(pq4Var, e2, rp4.d);
        sr8Var3.e0(-1961415711);
        Object Q = sr8Var3.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var3.o0(Q);
        }
        sr8Var3.s(false);
        IntercomArticleSearchScreenKt.IntercomArticleSearchScreen(articleSearchState, (Function0) Q, function1, pq4Var, 48);
        sr8Var3.s(true);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(iqd iqdVar, pq4 pq4Var, Integer num) {
        invoke(iqdVar, pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
