package io.intercom.android.sdk.helpcenter.articles;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import defpackage.uwn;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$ReactionsComponentKt$lambda5$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda5$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda5$1();

    public static /* synthetic */ Unit a() {
        return invoke$lambda$5$lambda$4();
    }

    public static /* synthetic */ Unit b() {
        return invoke$lambda$3$lambda$2();
    }

    public static /* synthetic */ Unit c() {
        return invoke$lambda$1$lambda$0();
    }

    private static final Unit invoke$lambda$1$lambda$0() {
        return Unit.INSTANCE;
    }

    private static final Unit invoke$lambda$3$lambda$2() {
        return Unit.INSTANCE;
    }

    private static final Unit invoke$lambda$5$lambda$4() {
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
        ArticleViewState.ReactionState copy$default = ArticleViewState.ReactionState.copy$default(ArticleViewState.ReactionState.INSTANCE.getDefaultReactionState(), 0, ArticleViewState.Reaction.Neutral, 0, false, 13, null);
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(1121629440);
        Object Q = sr8Var2.Q();
        uwn uwnVar = oq4.a;
        if (Q == uwnVar) {
            Q = new a(6);
            sr8Var2.o0(Q);
        }
        Function0 function0 = (Function0) Q;
        Object k = g.k(1121630848, sr8Var2, false);
        if (k == uwnVar) {
            k = new a(7);
            sr8Var2.o0(k);
        }
        Function0 function02 = (Function0) k;
        Object k2 = g.k(1121632192, sr8Var2, false);
        if (k2 == uwnVar) {
            k2 = new a(8);
            sr8Var2.o0(k2);
        }
        sr8Var2.s(false);
        ReactionsComponentKt.ReactionsComponent(null, copy$default, function0, function02, (Function0) k2, sr8Var2, 28032, 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
