package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"skip/lib/AsyncSequence$filter$1$makeAsyncIterator$1", "Lskip/lib/AsyncIteratorProtocol;", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequence$filter$1$makeAsyncIterator$1<Element> implements AsyncIteratorProtocol<Element> {
    final /* synthetic */ Function2<Element, Continuation<? super Boolean>, Object> $isIncluded;
    final /* synthetic */ AsyncIteratorProtocol<Element> $itr;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncSequence$filter$1$makeAsyncIterator$1(AsyncIteratorProtocol<Element> asyncIteratorProtocol, Function2<? super Element, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.$itr = asyncIteratorProtocol;
        this.$isIncluded = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:11:0x005a). Please report as a decompilation issue!!! */
    @Override // skip.lib.AsyncIteratorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object next(Continuation<? super Element> continuation) {
        AsyncSequence$filter$1$makeAsyncIterator$1$next$1 asyncSequence$filter$1$makeAsyncIterator$1$next$1;
        int i;
        Object obj;
        if (continuation instanceof AsyncSequence$filter$1$makeAsyncIterator$1$next$1) {
            asyncSequence$filter$1$makeAsyncIterator$1$next$1 = (AsyncSequence$filter$1$makeAsyncIterator$1$next$1) continuation;
            int i2 = asyncSequence$filter$1$makeAsyncIterator$1$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequence$filter$1$makeAsyncIterator$1$next$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = asyncSequence$filter$1$makeAsyncIterator$1$next$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = asyncSequence$filter$1$makeAsyncIterator$1$next$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj = asyncSequence$filter$1$makeAsyncIterator$1$next$1.L$0;
                            kotlin.ResultKt.a(obj2);
                            if (((Boolean) obj2).booleanValue()) {
                                return obj;
                            }
                            AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.$itr;
                            asyncSequence$filter$1$makeAsyncIterator$1$next$1.L$0 = null;
                            asyncSequence$filter$1$makeAsyncIterator$1$next$1.label = 1;
                            obj2 = asyncIteratorProtocol.next(asyncSequence$filter$1$makeAsyncIterator$1$next$1);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        kotlin.ResultKt.a(obj2);
                        if (obj2 == null) {
                            return null;
                        }
                        Function2<Element, Continuation<? super Boolean>, Object> function2 = this.$isIncluded;
                        asyncSequence$filter$1$makeAsyncIterator$1$next$1.L$0 = obj2;
                        asyncSequence$filter$1$makeAsyncIterator$1$next$1.label = 2;
                        Object invoke = function2.invoke(obj2, asyncSequence$filter$1$makeAsyncIterator$1$next$1);
                        if (invoke != u85Var) {
                            obj = obj2;
                            obj2 = invoke;
                            if (((Boolean) obj2).booleanValue()) {
                            }
                            AsyncIteratorProtocol<Element> asyncIteratorProtocol2 = this.$itr;
                            asyncSequence$filter$1$makeAsyncIterator$1$next$1.L$0 = null;
                            asyncSequence$filter$1$makeAsyncIterator$1$next$1.label = 1;
                            obj2 = asyncIteratorProtocol2.next(asyncSequence$filter$1$makeAsyncIterator$1$next$1);
                        }
                        return u85Var;
                    }
                } else {
                    kotlin.ResultKt.a(obj2);
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol22 = this.$itr;
                    asyncSequence$filter$1$makeAsyncIterator$1$next$1.L$0 = null;
                    asyncSequence$filter$1$makeAsyncIterator$1$next$1.label = 1;
                    obj2 = asyncIteratorProtocol22.next(asyncSequence$filter$1$makeAsyncIterator$1$next$1);
                }
            }
        }
        asyncSequence$filter$1$makeAsyncIterator$1$next$1 = new AsyncSequence$filter$1$makeAsyncIterator$1$next$1(this, continuation);
        Object obj22 = asyncSequence$filter$1$makeAsyncIterator$1$next$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = asyncSequence$filter$1$makeAsyncIterator$1$next$1.label;
        if (i == 0) {
        }
    }
}
