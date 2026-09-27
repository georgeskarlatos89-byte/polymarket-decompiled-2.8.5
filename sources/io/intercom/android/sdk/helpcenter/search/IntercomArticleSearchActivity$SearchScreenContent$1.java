package io.intercom.android.sdk.helpcenter.search;

import defpackage.oq4;
import defpackage.pq4;
import defpackage.sqc;
import defpackage.sr8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomArticleSearchActivity$SearchScreenContent$1 implements Function2<pq4, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Function1<sqc, Unit> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public IntercomArticleSearchActivity$SearchScreenContent$1(Function0<Unit> function0, Function1<? super sqc, Unit> function1) {
        this.$onBackClick = function0;
        this.$onTextChanged = function1;
    }

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
        Function0<Unit> function0 = this.$onBackClick;
        Function1<sqc, Unit> function1 = this.$onTextChanged;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(-1252036924);
        Object Q = sr8Var2.Q();
        if (Q == oq4.a) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        sr8Var2.s(false);
        HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(function0, function1, (Function1) Q, sr8Var2, 384);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
