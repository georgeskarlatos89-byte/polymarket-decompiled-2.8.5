package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ar extends zei implements Function4 {
    public /* synthetic */ qr k;
    public /* synthetic */ i07 l;
    public /* synthetic */ Object m;

    /* JADX WARN: Type inference failed for: r1v1, types: [ar, zei] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? zeiVar = new zei(4, (Continuation) obj4);
        zeiVar.k = (qr) obj;
        zeiVar.l = (i07) obj2;
        zeiVar.m = obj3;
        return zeiVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        qr qrVar = this.k;
        float c = ((h26) this.l).c(this.m);
        if (!Float.isNaN(c)) {
            qr.b(qrVar, c);
        }
        return Unit.INSTANCE;
    }
}
