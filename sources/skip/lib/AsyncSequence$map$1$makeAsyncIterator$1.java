package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [RE] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"skip/lib/AsyncSequence$map$1$makeAsyncIterator$1", "Lskip/lib/AsyncIteratorProtocol;", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequence$map$1$makeAsyncIterator$1<RE> implements AsyncIteratorProtocol<RE> {
    final /* synthetic */ AsyncIteratorProtocol<Element> $itr;
    final /* synthetic */ Function2<Element, Continuation<? super RE>, Object> $transform;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncSequence$map$1$makeAsyncIterator$1(AsyncIteratorProtocol<Element> asyncIteratorProtocol, Function2<? super Element, ? super Continuation<? super RE>, ? extends Object> function2) {
        this.$itr = asyncIteratorProtocol;
        this.$transform = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // skip.lib.AsyncIteratorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object next(Continuation<? super RE> continuation) {
        AsyncSequence$map$1$makeAsyncIterator$1$next$1 asyncSequence$map$1$makeAsyncIterator$1$next$1;
        Object obj;
        int i;
        if (continuation instanceof AsyncSequence$map$1$makeAsyncIterator$1$next$1) {
            asyncSequence$map$1$makeAsyncIterator$1$next$1 = (AsyncSequence$map$1$makeAsyncIterator$1$next$1) continuation;
            int i2 = asyncSequence$map$1$makeAsyncIterator$1$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequence$map$1$makeAsyncIterator$1$next$1.label = i2 - Integer.MIN_VALUE;
                obj = asyncSequence$map$1$makeAsyncIterator$1$next$1.result;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = asyncSequence$map$1$makeAsyncIterator$1$next$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.a(obj);
                            return obj;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.ResultKt.a(obj);
                } else {
                    kotlin.ResultKt.a(obj);
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.$itr;
                    asyncSequence$map$1$makeAsyncIterator$1$next$1.label = 1;
                    obj = asyncIteratorProtocol.next(asyncSequence$map$1$makeAsyncIterator$1$next$1);
                }
                if (obj != null) {
                    return null;
                }
                Function2<Element, Continuation<? super RE>, Object> function2 = this.$transform;
                asyncSequence$map$1$makeAsyncIterator$1$next$1.L$0 = null;
                asyncSequence$map$1$makeAsyncIterator$1$next$1.label = 2;
                Object invoke = function2.invoke(obj, asyncSequence$map$1$makeAsyncIterator$1$next$1);
                if (invoke == obj2) {
                    return obj2;
                }
                return invoke;
            }
        }
        asyncSequence$map$1$makeAsyncIterator$1$next$1 = new AsyncSequence$map$1$makeAsyncIterator$1$next$1(this, continuation);
        obj = asyncSequence$map$1$makeAsyncIterator$1$next$1.result;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = asyncSequence$map$1$makeAsyncIterator$1$next$1.label;
        if (i == 0) {
        }
        if (obj != null) {
        }
    }
}
