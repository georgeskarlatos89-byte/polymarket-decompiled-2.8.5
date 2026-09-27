package skip.lib;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import skip.lib.InstantProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@kw5(c = "skip.lib.Clock", f = "Clock.kt", l = {37}, m = "measure$suspendImpl")
/* loaded from: classes4.dex */
public final class Clock$measure$1<I extends InstantProtocol> extends q55 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Clock<I> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clock$measure$1(Clock<I> clock, Continuation<? super Clock$measure$1> continuation) {
        super(continuation);
        this.this$0 = clock;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Clock.measure$suspendImpl(this.this$0, null, this);
    }
}
