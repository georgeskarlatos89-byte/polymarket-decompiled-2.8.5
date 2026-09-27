package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r6h extends zei implements Function4 {
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ boolean m;

    /* JADX WARN: Type inference failed for: r4v2, types: [r6h, zei] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        ?? zeiVar = new zei(4, (Continuation) obj4);
        zeiVar.k = booleanValue;
        zeiVar.l = booleanValue2;
        zeiVar.m = booleanValue3;
        return zeiVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.m;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (z2 && z3 && z4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
