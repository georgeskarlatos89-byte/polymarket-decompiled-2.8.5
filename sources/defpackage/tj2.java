package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tj2 extends zei implements Function2 {
    public final /* synthetic */ u7g k;
    public final /* synthetic */ qqc l;
    public final /* synthetic */ qqc m;
    public final /* synthetic */ dpc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(u7g u7gVar, qqc qqcVar, qqc qqcVar2, dpc dpcVar, Continuation continuation) {
        super(2, continuation);
        this.k = u7gVar;
        this.l = qqcVar;
        this.m = qqcVar2;
        this.n = dpcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new tj2(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tj2) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        u7g u7gVar = u7g.Streak;
        qqc qqcVar = this.l;
        u7g u7gVar2 = this.k;
        if (u7gVar2 == u7gVar) {
        }
        qqcVar.setValue(u7gVar2);
        this.m.setValue(null);
        return Unit.INSTANCE;
    }
}
