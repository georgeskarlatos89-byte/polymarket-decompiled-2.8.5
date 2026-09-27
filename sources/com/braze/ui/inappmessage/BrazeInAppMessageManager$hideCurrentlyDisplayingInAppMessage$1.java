package com.braze.ui.inappmessage;

import defpackage.dmk;
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
@kw5(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1", f = "BrazeInAppMessageManager.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1 extends zei implements Function2<t85, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessageViewWrapper $inAppMessageWrapperView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(IInAppMessageViewWrapper iInAppMessageViewWrapper, Continuation<? super BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1> continuation) {
        super(2, continuation);
        this.$inAppMessageWrapperView = iInAppMessageViewWrapper;
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(this.$inAppMessageWrapperView, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t85 t85Var, Continuation<? super Unit> continuation) {
        return ((BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ResultKt.a(obj);
            this.$inAppMessageWrapperView.close();
            return Unit.INSTANCE;
        }
        dmk.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t85 t85Var, Continuation<? super Unit> continuation) {
        return invoke2(t85Var, continuation);
    }
}
