package defpackage;

import com.polymarket.usviewmodels.PromptNotificationsViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vbd extends zei implements Function2 {
    public final /* synthetic */ PromptNotificationsViewModel k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbd(PromptNotificationsViewModel promptNotificationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.k = promptNotificationsViewModel;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new vbd(this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vbd) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.k.sendInput(PromptNotificationsViewModel.Input.onAppear);
        return Unit.INSTANCE;
    }
}
