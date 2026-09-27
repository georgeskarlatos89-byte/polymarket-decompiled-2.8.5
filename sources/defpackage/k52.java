package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class k52 extends zei implements Function2 {
    public final /* synthetic */ boolean k;
    public final /* synthetic */ x0h l;
    public final /* synthetic */ ca2 m;
    public final /* synthetic */ Function0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k52(boolean z, x0h x0hVar, ca2 ca2Var, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = x0hVar;
        this.m = ca2Var;
        this.n = function0;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new k52(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k52) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k) {
            this.l.a(true);
            this.m.a(DesignTokens.Haptic.warning);
            this.n.invoke();
        }
        return Unit.INSTANCE;
    }
}
