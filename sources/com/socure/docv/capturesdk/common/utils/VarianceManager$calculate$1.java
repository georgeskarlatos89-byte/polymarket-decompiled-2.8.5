package com.socure.docv.capturesdk.common.utils;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kw5(c = "com.socure.docv.capturesdk.common.utils.VarianceManager", f = "VarianceManager.kt", l = {106}, m = "calculate")
/* loaded from: classes5.dex */
public final class VarianceManager$calculate$1 extends q55 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VarianceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VarianceManager$calculate$1(VarianceManager varianceManager, Continuation<? super VarianceManager$calculate$1> continuation) {
        super(continuation);
        this.this$0 = varianceManager;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.calculate(null, null, this);
    }
}
