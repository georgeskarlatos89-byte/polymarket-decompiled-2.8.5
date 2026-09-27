package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [RE] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"skip/lib/AsyncSequence$flatMap$1$makeAsyncIterator$1", "Lskip/lib/AsyncIteratorProtocol;", "currentItr", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequence$flatMap$1$makeAsyncIterator$1<RE> implements AsyncIteratorProtocol<RE> {
    final /* synthetic */ AsyncIteratorProtocol<Element> $itr;
    final /* synthetic */ Function2<Element, Continuation<? super AsyncSequence<RE>>, Object> $transform;
    private AsyncIteratorProtocol<RE> currentItr;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncSequence$flatMap$1$makeAsyncIterator$1(AsyncIteratorProtocol<Element> asyncIteratorProtocol, Function2<? super Element, ? super Continuation<? super AsyncSequence<RE>>, ? extends Object> function2) {
        this.$itr = asyncIteratorProtocol;
        this.$transform = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007f -> B:12:0x0082). Please report as a decompilation issue!!! */
    @Override // skip.lib.AsyncIteratorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object next(Continuation<? super RE> continuation) {
        AsyncSequence$flatMap$1$makeAsyncIterator$1$next$1 asyncSequence$flatMap$1$makeAsyncIterator$1$next$1;
        int i;
        AsyncIteratorProtocol<RE> asyncIteratorProtocol;
        if (continuation instanceof AsyncSequence$flatMap$1$makeAsyncIterator$1$next$1) {
            asyncSequence$flatMap$1$makeAsyncIterator$1$next$1 = (AsyncSequence$flatMap$1$makeAsyncIterator$1$next$1) continuation;
            int i2 = asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label = i2 - Integer.MIN_VALUE;
                Object obj = asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.result;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.ResultKt.a(obj);
                                if (obj == null) {
                                    this.currentItr = null;
                                } else {
                                    return obj;
                                }
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            AsyncSequence$flatMap$1$makeAsyncIterator$1 asyncSequence$flatMap$1$makeAsyncIterator$1 = (AsyncSequence$flatMap$1$makeAsyncIterator$1) asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$1;
                            kotlin.ResultKt.a(obj);
                            asyncSequence$flatMap$1$makeAsyncIterator$1.currentItr = ((AsyncSequence) obj).makeAsyncIterator();
                        }
                    } else {
                        kotlin.ResultKt.a(obj);
                        if (obj == null) {
                            return null;
                        }
                        Function2<Element, Continuation<? super AsyncSequence<RE>>, Object> function2 = this.$transform;
                        asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$0 = null;
                        asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$1 = this;
                        asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label = 2;
                        Object invoke = function2.invoke(obj, asyncSequence$flatMap$1$makeAsyncIterator$1$next$1);
                        if (invoke != obj2) {
                            this.currentItr = ((AsyncSequence) invoke).makeAsyncIterator();
                        }
                        return obj2;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                }
                asyncIteratorProtocol = this.currentItr;
                if (asyncIteratorProtocol != null) {
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol2 = this.$itr;
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$0 = null;
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$1 = null;
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label = 1;
                    obj = asyncIteratorProtocol2.next(asyncSequence$flatMap$1$makeAsyncIterator$1$next$1);
                } else {
                    asyncIteratorProtocol.getClass();
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$0 = null;
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.L$1 = null;
                    asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label = 3;
                    obj = asyncIteratorProtocol.next(asyncSequence$flatMap$1$makeAsyncIterator$1$next$1);
                }
                return obj2;
            }
        }
        asyncSequence$flatMap$1$makeAsyncIterator$1$next$1 = new AsyncSequence$flatMap$1$makeAsyncIterator$1$next$1(this, continuation);
        Object obj3 = asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.result;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = asyncSequence$flatMap$1$makeAsyncIterator$1$next$1.label;
        if (i == 0) {
        }
        asyncIteratorProtocol = this.currentItr;
        if (asyncIteratorProtocol != null) {
        }
        return obj22;
    }
}
