package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class io2 extends zei implements Function2 {
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ qqc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(boolean z, boolean z2, boolean z3, qqc qqcVar, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = qqcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new io2(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((io2) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        boolean z = false;
        if (!this.k && (this.l || this.m)) {
            z = true;
        }
        this.n.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
