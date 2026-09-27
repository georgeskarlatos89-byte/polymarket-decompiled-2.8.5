package skip.lib;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@kw5(c = "skip.lib.AsyncSequence$map$1$makeAsyncIterator$1", f = "Concurrency.kt", l = {542, 543}, m = "next")
/* loaded from: classes4.dex */
public final class AsyncSequence$map$1$makeAsyncIterator$1$next$1 extends q55 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncSequence$map$1$makeAsyncIterator$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncSequence$map$1$makeAsyncIterator$1$next$1(AsyncSequence$map$1$makeAsyncIterator$1 asyncSequence$map$1$makeAsyncIterator$1, Continuation<? super AsyncSequence$map$1$makeAsyncIterator$1$next$1> continuation) {
        super(continuation);
        this.this$0 = asyncSequence$map$1$makeAsyncIterator$1;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.next(this);
    }
}
