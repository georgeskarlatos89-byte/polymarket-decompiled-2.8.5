package com.braze.push;

import defpackage.b69;
import defpackage.dmk;
import defpackage.kw5;
import defpackage.pm1;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@kw5(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class NotificationTrampolineActivity$onResume$7 extends zei implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationTrampolineActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTrampolineActivity$onResume$7(NotificationTrampolineActivity notificationTrampolineActivity, Continuation<? super NotificationTrampolineActivity$onResume$7> continuation) {
        super(1, continuation);
        this.this$0 = notificationTrampolineActivity;
    }

    public static /* synthetic */ String h() {
        return invokeSuspend$lambda$0();
    }

    private static final String invokeSuspend$lambda$0() {
        return "Delay complete. Finishing Notification trampoline activity now";
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationTrampolineActivity$onResume$7(this.this$0, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Unit> continuation) {
        return ((NotificationTrampolineActivity$onResume$7) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ResultKt.a(obj);
            b69.h(this.this$0, pm1.V, null, false, new Object(), 6);
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        dmk.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
        return invoke2(continuation);
    }
}
