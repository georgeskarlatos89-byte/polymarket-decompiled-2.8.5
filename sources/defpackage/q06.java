package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q06 extends zei implements Function4 {
    public /* synthetic */ oui k;
    public /* synthetic */ String l;
    public /* synthetic */ boolean m;
    public final /* synthetic */ qqc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q06(qqc qqcVar, Continuation continuation) {
        super(4, continuation);
        this.n = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        q06 q06Var = new q06(this.n, (Continuation) obj4);
        q06Var.k = (oui) obj;
        q06Var.l = (String) obj2;
        q06Var.m = booleanValue;
        return q06Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        boolean z;
        oui ouiVar = this.k;
        String str = this.l;
        boolean z2 = this.m;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if ((ouiVar instanceof qui) && !z2 && !((Boolean) this.n.getValue()).booleanValue() && str.length() == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
