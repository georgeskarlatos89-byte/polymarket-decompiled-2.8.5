package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class do2 extends zei implements Function2 {
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ca2 l;
    public final /* synthetic */ nwh m;
    public final /* synthetic */ qqc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do2(boolean z, ca2 ca2Var, nwh nwhVar, qqc qqcVar, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = ca2Var;
        this.m = nwhVar;
        this.n = qqcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new do2(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((do2) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        nwh nwhVar = this.m;
        boolean booleanValue = ((Boolean) nwhVar.getValue()).booleanValue();
        qqc qqcVar = this.n;
        if (booleanValue != ((Boolean) qqcVar.getValue()).booleanValue()) {
            if (this.k) {
                this.l.a(DesignTokens.Haptic.heavy);
            }
            Boolean bool = (Boolean) nwhVar.getValue();
            bool.booleanValue();
            qqcVar.setValue(bool);
        }
        return Unit.INSTANCE;
    }
}
