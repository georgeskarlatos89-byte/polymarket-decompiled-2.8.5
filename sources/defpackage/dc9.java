package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dc9 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc9(boolean z, Function1 function1, boolean z2, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = z;
        this.m = function1;
        this.n = z2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                return new dc9(this.l, this.m, this.n, continuation, 0);
            case 1:
                return new dc9(this.l, this.m, this.n, continuation, 1);
            case 2:
                return new dc9(this.l, this.m, this.n, continuation, 2);
            case 3:
                return new dc9(this.l, this.m, this.n, continuation, 3);
            default:
                return new dc9(this.l, this.m, this.n, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t85 t85Var = (t85) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
            case 0:
                return ((dc9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((dc9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((dc9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((dc9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((dc9) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        boolean z = this.n;
        Function1 function1 = this.m;
        boolean z2 = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (z2) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (z2) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (z2) {
                    function1.invoke(Boolean.valueOf(!z));
                }
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (z2) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            default:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (z2) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
        }
    }
}
