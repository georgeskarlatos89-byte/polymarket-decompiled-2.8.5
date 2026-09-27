package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kth extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ ca2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kth(int i, ca2 ca2Var, Continuation continuation) {
        super(2, continuation);
        this.k = i;
        this.l = ca2Var;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new kth(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kth) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.k > 0) {
            this.l.a(DesignTokens.Haptic.error);
        }
        return Unit.INSTANCE;
    }
}
