package com.braze.ui.inappmessage.utils;

import defpackage.b69;
import defpackage.dmk;
import defpackage.jj9;
import defpackage.kw5;
import defpackage.pm1;
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
@kw5(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {42}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends zei implements Function2<t85, Continuation<? super Unit>, Object> {
    final /* synthetic */ jj9 $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(jj9 jj9Var, Continuation<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> continuation) {
        super(2, continuation);
        this.$inAppMessageToPrepare = jj9Var;
    }

    public static /* synthetic */ String h() {
        return invokeSuspend$lambda$1();
    }

    public static /* synthetic */ String i() {
        return invokeSuspend$lambda$0();
    }

    private static final String invokeSuspend$lambda$0() {
        return "Cannot display the in-app message because the in-app message was null.";
    }

    private static final String invokeSuspend$lambda$1() {
        return "Caught error while preparing in app message in background";
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, continuation);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t85 t85Var, Continuation<? super Unit> continuation) {
        return ((BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        t85 t85Var = (t85) this.L$0;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.a(obj);
                } else {
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                ResultKt.a(obj);
                BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                jj9 access$prepareInAppMessage = BackgroundInAppMessagePreparer.access$prepareInAppMessage(backgroundInAppMessagePreparer, this.$inAppMessageToPrepare);
                if (access$prepareInAppMessage == null) {
                    b69.h(t85Var, pm1.W, null, false, new a(1), 6);
                } else {
                    this.L$0 = t85Var;
                    this.L$1 = null;
                    this.label = 1;
                    if (BackgroundInAppMessagePreparer.access$displayPreparedInAppMessage(backgroundInAppMessagePreparer, access$prepareInAppMessage, this) == u85Var) {
                        return u85Var;
                    }
                }
            }
        } catch (Exception e) {
            b69.h(t85Var, pm1.E, e, false, new a(2), 4);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t85 t85Var, Continuation<? super Unit> continuation) {
        return invoke2(t85Var, continuation);
    }
}
