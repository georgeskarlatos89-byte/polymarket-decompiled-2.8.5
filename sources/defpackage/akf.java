package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class akf extends zei implements Function3 {
    public /* synthetic */ boolean k;
    public /* synthetic */ List l;

    /* JADX WARN: Type inference failed for: r2v2, types: [akf, zei] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ?? zeiVar = new zei(3, (Continuation) obj3);
        zeiVar.k = booleanValue;
        zeiVar.l = (List) obj2;
        return zeiVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        boolean z = this.k;
        List list = this.l;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (!z && list != null) {
            if (list.isEmpty()) {
                return ni3.d;
            }
            return new oi3(list);
        }
        return ni3.b;
    }
}
