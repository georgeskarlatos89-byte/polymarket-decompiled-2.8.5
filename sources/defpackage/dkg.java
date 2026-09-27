package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dkg extends zei implements Function2 {
    public /* synthetic */ Object k;
    public final /* synthetic */ otf l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(otf otfVar, float f, Continuation continuation) {
        super(2, continuation);
        this.l = otfVar;
        this.m = f;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        dkg dkgVar = new dkg(this.l, this.m, continuation);
        dkgVar.k = obj;
        return dkgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dkg) create((kkg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        this.l.a = ((kkg) this.k).a(this.m);
        return Unit.INSTANCE;
    }
}
