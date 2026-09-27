package skip.lib;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@kw5(c = "skip.lib.AsyncSequenceIterator", f = "Concurrency.kt", l = {851}, m = "hasNext")
/* loaded from: classes4.dex */
public final class AsyncSequenceIterator$hasNext$1 extends q55 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncSequenceIterator<Element> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncSequenceIterator$hasNext$1(AsyncSequenceIterator<Element> asyncSequenceIterator, Continuation<? super AsyncSequenceIterator$hasNext$1> continuation) {
        super(continuation);
        this.this$0 = asyncSequenceIterator;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.hasNext(this);
    }
}
