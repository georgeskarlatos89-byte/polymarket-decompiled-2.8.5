package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"skip/lib/AsyncSequence$prefix$2$makeAsyncIterator$1", "Lskip/lib/AsyncIteratorProtocol;", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequence$prefix$2$makeAsyncIterator$1<Element> implements AsyncIteratorProtocol<Element> {
    final /* synthetic */ AsyncIteratorProtocol<Element> $itr;
    final /* synthetic */ Function2<Element, Continuation<? super Boolean>, Object> $while_;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncSequence$prefix$2$makeAsyncIterator$1(AsyncIteratorProtocol<Element> asyncIteratorProtocol, Function2<? super Element, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.$itr = asyncIteratorProtocol;
        this.$while_ = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // skip.lib.AsyncIteratorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object next(Continuation<? super Element> continuation) {
        AsyncSequence$prefix$2$makeAsyncIterator$1$next$1 asyncSequence$prefix$2$makeAsyncIterator$1$next$1;
        Object obj;
        int i;
        Object obj2;
        if (continuation instanceof AsyncSequence$prefix$2$makeAsyncIterator$1$next$1) {
            asyncSequence$prefix$2$makeAsyncIterator$1$next$1 = (AsyncSequence$prefix$2$makeAsyncIterator$1$next$1) continuation;
            int i2 = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label = i2 - Integer.MIN_VALUE;
                obj = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj2 = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.L$0;
                            kotlin.ResultKt.a(obj);
                            if (((Boolean) obj).booleanValue()) {
                                return null;
                            }
                            return obj2;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.ResultKt.a(obj);
                } else {
                    kotlin.ResultKt.a(obj);
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.$itr;
                    asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label = 1;
                    obj = asyncIteratorProtocol.next(asyncSequence$prefix$2$makeAsyncIterator$1$next$1);
                }
                if (obj != null) {
                    Function2<Element, Continuation<? super Boolean>, Object> function2 = this.$while_;
                    asyncSequence$prefix$2$makeAsyncIterator$1$next$1.L$0 = obj;
                    asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label = 2;
                    Object invoke = function2.invoke(obj, asyncSequence$prefix$2$makeAsyncIterator$1$next$1);
                    if (invoke != u85Var) {
                        Object obj3 = obj;
                        obj = invoke;
                        obj2 = obj3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return u85Var;
                }
                return null;
            }
        }
        asyncSequence$prefix$2$makeAsyncIterator$1$next$1 = new AsyncSequence$prefix$2$makeAsyncIterator$1$next$1(this, continuation);
        obj = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = asyncSequence$prefix$2$makeAsyncIterator$1$next$1.label;
        if (i == 0) {
        }
        if (obj != null) {
        }
        return null;
    }
}
