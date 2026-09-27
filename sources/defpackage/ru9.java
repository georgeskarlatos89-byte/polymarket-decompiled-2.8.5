package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ru9 extends zei implements Function2 {
    public /* synthetic */ float k;

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ru9, zei] */
    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        ?? zeiVar = new zei(2, continuation);
        zeiVar.k = ((Number) obj).floatValue();
        return zeiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ru9) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        boolean z;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
