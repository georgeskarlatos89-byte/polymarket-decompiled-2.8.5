package defpackage;

import com.polymarket.usviewmodels.ComboBuilderEventListViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class te4 extends zei implements Function2 {
    public final /* synthetic */ ComboBuilderEventListViewModel k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te4(ComboBuilderEventListViewModel comboBuilderEventListViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.k = comboBuilderEventListViewModel;
        this.l = str;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new te4(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((te4) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.k.sendInput(ComboBuilderEventListViewModel.Input.INSTANCE.onEventWillDisplay(this.l));
        return Unit.INSTANCE;
    }
}
