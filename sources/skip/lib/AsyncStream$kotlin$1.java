package skip.lib;

import defpackage.dmk;
import defpackage.eb8;
import defpackage.kw5;
import defpackage.u85;
import defpackage.zei;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Element", "Leb8;", "", "<anonymous>", "(Leb8;)V"}, k = 3, mv = {2, 2, 0})
@kw5(c = "skip.lib.AsyncStream$kotlin$1", f = "AsyncStream.kt", l = {217, 220}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AsyncStream$kotlin$1 extends zei implements Function2<eb8, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Element>, Object> $producer;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncStream$kotlin$1(Function1<? super Continuation<? super Element>, ? extends Object> function1, Continuation<? super AsyncStream$kotlin$1> continuation) {
        super(2, continuation);
        this.$producer = function1;
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsyncStream$kotlin$1 asyncStream$kotlin$1 = new AsyncStream$kotlin$1(this.$producer, continuation);
        asyncStream$kotlin$1.L$0 = obj;
        return asyncStream$kotlin$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(eb8 eb8Var, Continuation<? super Unit> continuation) {
        return ((AsyncStream$kotlin$1) create(eb8Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r7 == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:12:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.l81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eb8 eb8Var = (eb8) this.L$0;
        Object obj2 = u85.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                kotlin.ResultKt.a(obj);
                if (obj != null) {
                    this.L$0 = eb8Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
        kotlin.ResultKt.a(obj);
        Function1<Continuation<? super Element>, Object> function1 = this.$producer;
        this.L$0 = eb8Var;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        obj = function1.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(eb8 eb8Var, Continuation<? super Unit> continuation) {
        return invoke2(eb8Var, continuation);
    }
}
