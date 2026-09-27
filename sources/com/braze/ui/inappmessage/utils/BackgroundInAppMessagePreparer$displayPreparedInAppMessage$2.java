package com.braze.ui.inappmessage.utils;

import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import defpackage.b69;
import defpackage.dmk;
import defpackage.jj9;
import defpackage.kw5;
import defpackage.t85;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt85;", "", "<anonymous>", "(Lt85;)V"}, k = 3, mv = {2, 2, 0})
@kw5(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {280}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2 extends zei implements Function2<t85, Continuation<? super Unit>, Object> {
    final /* synthetic */ jj9 $inAppMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(jj9 jj9Var, Continuation<? super BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2> continuation) {
        super(2, continuation);
        this.$inAppMessage = jj9Var;
    }

    public static /* synthetic */ String h() {
        return invokeSuspend$lambda$0();
    }

    private static final String invokeSuspend$lambda$0() {
        return "Displaying in-app message.";
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this.$inAppMessage, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t85 t85Var, Continuation<? super Unit> continuation) {
        return ((BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.a(obj);
            } else {
                dmk.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.a(obj);
            b69.h(BackgroundInAppMessagePreparer.INSTANCE, null, null, false, new a(0), 7);
            BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
            jj9 jj9Var = this.$inAppMessage;
            this.label = 1;
            if (companion.displayInAppMessage(jj9Var, false, this) == u85Var) {
                return u85Var;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t85 t85Var, Continuation<? super Unit> continuation) {
        return invoke2(t85Var, continuation);
    }
}
