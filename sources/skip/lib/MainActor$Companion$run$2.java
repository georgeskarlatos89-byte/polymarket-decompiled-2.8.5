package skip.lib;

import defpackage.dmk;
import defpackage.kw5;
import defpackage.t85;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lt85;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@kw5(c = "skip.lib.MainActor$Companion$run$2", f = "Concurrency.kt", l = {492}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActor$Companion$run$2<T> extends zei implements Function2<t85, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $body;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActor$Companion$run$2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super MainActor$Companion$run$2> continuation) {
        super(2, continuation);
        this.$body = function1;
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActor$Companion$run$2(this.$body, continuation);
    }

    public final Object invoke(t85 t85Var, Continuation<? super T> continuation) {
        return ((MainActor$Companion$run$2) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.a(obj);
                return obj;
            }
            dmk.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.ResultKt.a(obj);
        Function1<Continuation<? super T>, Object> function1 = this.$body;
        this.label = 1;
        Object invoke = function1.invoke(this);
        if (invoke == u85Var) {
            return u85Var;
        }
        return invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t85 t85Var, Object obj) {
        return invoke(t85Var, (Continuation) obj);
    }
}
