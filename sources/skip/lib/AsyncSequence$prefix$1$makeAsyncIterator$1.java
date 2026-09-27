package skip.lib;

import defpackage.dmk;
import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: Add missing generic type declarations: [Element] */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"skip/lib/AsyncSequence$prefix$1$makeAsyncIterator$1", "Lskip/lib/AsyncIteratorProtocol;", "remaining", "", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncSequence$prefix$1$makeAsyncIterator$1<Element> implements AsyncIteratorProtocol<Element> {
    final /* synthetic */ AsyncIteratorProtocol<Element> $itr;
    private int remaining;

    public AsyncSequence$prefix$1$makeAsyncIterator$1(int i, AsyncIteratorProtocol<Element> asyncIteratorProtocol) {
        this.$itr = asyncIteratorProtocol;
        this.remaining = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // skip.lib.AsyncIteratorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object next(Continuation<? super Element> continuation) {
        AsyncSequence$prefix$1$makeAsyncIterator$1$next$1 asyncSequence$prefix$1$makeAsyncIterator$1$next$1;
        Object obj;
        int i;
        if (continuation instanceof AsyncSequence$prefix$1$makeAsyncIterator$1$next$1) {
            asyncSequence$prefix$1$makeAsyncIterator$1$next$1 = (AsyncSequence$prefix$1$makeAsyncIterator$1$next$1) continuation;
            int i2 = asyncSequence$prefix$1$makeAsyncIterator$1$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncSequence$prefix$1$makeAsyncIterator$1$next$1.label = i2 - Integer.MIN_VALUE;
                obj = asyncSequence$prefix$1$makeAsyncIterator$1$next$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = asyncSequence$prefix$1$makeAsyncIterator$1$next$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                    if (this.remaining == 0) {
                        return null;
                    }
                    AsyncIteratorProtocol<Element> asyncIteratorProtocol = this.$itr;
                    asyncSequence$prefix$1$makeAsyncIterator$1$next$1.label = 1;
                    obj = asyncIteratorProtocol.next(asyncSequence$prefix$1$makeAsyncIterator$1$next$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                if (obj != null) {
                    return null;
                }
                this.remaining--;
                return obj;
            }
        }
        asyncSequence$prefix$1$makeAsyncIterator$1$next$1 = new AsyncSequence$prefix$1$makeAsyncIterator$1$next$1(this, continuation);
        obj = asyncSequence$prefix$1$makeAsyncIterator$1$next$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = asyncSequence$prefix$1$makeAsyncIterator$1$next$1.label;
        if (i == 0) {
        }
        if (obj != null) {
        }
    }
}
