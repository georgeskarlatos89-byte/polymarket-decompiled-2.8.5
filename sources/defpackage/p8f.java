package defpackage;

import com.polymarket.usdependencies.USState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p8f extends zei implements Function2 {
    public final /* synthetic */ USState.UserAccountStatus k;
    public final /* synthetic */ qqc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8f(USState.UserAccountStatus userAccountStatus, qqc qqcVar, Continuation continuation) {
        super(2, continuation);
        this.k = userAccountStatus;
        this.l = qqcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new p8f(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p8f) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k == USState.UserAccountStatus.unauthenticated) {
            this.l.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
