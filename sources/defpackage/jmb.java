package defpackage;

import com.polymarket.usviewmodels.USLiveTabViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jmb extends zei implements Function2 {
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ USLiveTabViewModel m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(boolean z, boolean z2, USLiveTabViewModel uSLiveTabViewModel, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = z2;
        this.m = uSLiveTabViewModel;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new jmb(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jmb) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k && !this.l) {
            this.m.sendInput(USLiveTabViewModel.Input.INSTANCE.getOnNearBottom());
        }
        return Unit.INSTANCE;
    }
}
