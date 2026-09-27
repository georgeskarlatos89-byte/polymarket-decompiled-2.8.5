package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kw5(c = "io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase", f = "FallbackPollingUseCase.kt", l = {32, 38}, m = "invoke")
/* loaded from: classes6.dex */
public final class FallbackPollingUseCase$invoke$1 extends q55 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FallbackPollingUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackPollingUseCase$invoke$1(FallbackPollingUseCase fallbackPollingUseCase, Continuation<? super FallbackPollingUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = fallbackPollingUseCase;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
