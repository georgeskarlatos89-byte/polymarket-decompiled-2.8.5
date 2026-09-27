package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ca8 extends zei implements Function2 {
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca8(Function1 function1, boolean z, float f, Continuation continuation) {
        super(2, continuation);
        this.k = function1;
        this.l = z;
        this.m = f;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new ca8(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ca8) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        float f;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        if (this.l) {
            f = this.m;
        } else {
            f = 0.0f;
        }
        this.k.invoke(new hy6(f));
        return Unit.INSTANCE;
    }
}
