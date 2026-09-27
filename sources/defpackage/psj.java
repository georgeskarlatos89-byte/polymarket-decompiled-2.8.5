package defpackage;

import com.polymarket.usviewmodels.USUserActivityViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class psj extends zei implements Function2 {
    public final /* synthetic */ USUserActivityViewModel k;
    public final /* synthetic */ USUserActivityViewModel.Activity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psj(USUserActivityViewModel uSUserActivityViewModel, USUserActivityViewModel.Activity activity, Continuation continuation) {
        super(2, continuation);
        this.k = uSUserActivityViewModel;
        this.l = activity;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new psj(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((psj) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.k.sendInput(USUserActivityViewModel.Input.INSTANCE.onWillDisplayActivity(this.l));
        return Unit.INSTANCE;
    }
}
