package io.intercom.android.sdk.survey.ui.questiontype.choice;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.hdi;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.sr8;
import defpackage.uwn;
import io.intercom.android.sdk.survey.SurveyUiColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$OtherOptionKt$lambda1$1 implements Function2<pq4, Integer, Unit> {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    public static /* synthetic */ Unit a() {
        return invoke$lambda$1$lambda$0();
    }

    public static /* synthetic */ Unit b(String str) {
        return invoke$lambda$3$lambda$2(str);
    }

    private static final Unit invoke$lambda$1$lambda$0() {
        return Unit.INSTANCE;
    }

    private static final Unit invoke$lambda$3$lambda$2(String str) {
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
        SurveyUiColors k = hdi.k(null, null, 3, null);
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.e0(-1133347294);
        Object Q = sr8Var2.Q();
        uwn uwnVar = oq4.a;
        if (Q == uwnVar) {
            Q = new Object();
            sr8Var2.o0(Q);
        }
        Function0 function0 = (Function0) Q;
        Object k2 = g.k(-1133346270, sr8Var2, false);
        if (k2 == uwnVar) {
            k2 = new b(0);
            sr8Var2.o0(k2);
        }
        sr8Var2.s(false);
        OtherOptionKt.m451OtherOptionYCJL08c(true, k, "none", function0, (Function1) k2, 0L, 0.0f, 0L, null, 0L, sr8Var2, 28038, 992);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(pq4 pq4Var, Integer num) {
        invoke(pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
