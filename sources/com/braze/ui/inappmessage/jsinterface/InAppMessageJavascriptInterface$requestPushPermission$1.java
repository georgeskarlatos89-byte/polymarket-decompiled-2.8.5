package com.braze.ui.inappmessage.jsinterface;

import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import defpackage.b69;
import defpackage.dmk;
import defpackage.g3j;
import defpackage.kw5;
import defpackage.lvn;
import defpackage.oje;
import defpackage.pm1;
import defpackage.t85;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@kw5(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", l = {51}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class InAppMessageJavascriptInterface$requestPushPermission$1 extends zei implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppMessageJavascriptInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface$requestPushPermission$1(InAppMessageJavascriptInterface inAppMessageJavascriptInterface, Continuation<? super InAppMessageJavascriptInterface$requestPushPermission$1> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessageJavascriptInterface;
    }

    public static /* synthetic */ String h() {
        return invokeSuspend$lambda$0();
    }

    private static final String invokeSuspend$lambda$0() {
        return "Requesting push prompt from Braze bridge html interface";
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessageJavascriptInterface$requestPushPermission$1(this.this$0, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Unit> continuation) {
        return ((InAppMessageJavascriptInterface$requestPushPermission$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (this.this$0.getWasCloseMessageCalled()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (g3j.b(2500L, anonymousClass1, this) == u85Var) {
                    return u85Var;
                }
            }
        }
        b69.h(this.this$0, pm1.V, null, false, new a(0), 6);
        oje.b(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
        return Unit.INSTANCE;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt85;", "", "<anonymous>", "(Lt85;)V"}, k = 3, mv = {2, 2, 0})
    @kw5(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", l = {54}, m = "invokeSuspend", v = 1)
    /* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends zei implements Function2<t85, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public static /* synthetic */ String h() {
            return invokeSuspend$lambda$0();
        }

        private static final String invokeSuspend$lambda$0() {
            return "Waiting for IAM to be fully closed before requesting push prompt";
        }

        @Override // defpackage.l81
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t85 t85Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // defpackage.l81
        public final Object invokeSuspend(Object obj) {
            t85 t85Var = (t85) this.L$0;
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
                b69.h(t85Var, pm1.V, null, false, new a(1), 6);
            }
            while (BrazeInAppMessageManager.INSTANCE.getInstance().isCurrentlyDisplayingInAppMessage()) {
                this.L$0 = null;
                this.label = 1;
                if (lvn.b(25L, this) == u85Var) {
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

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
        return invoke2(continuation);
    }
}
