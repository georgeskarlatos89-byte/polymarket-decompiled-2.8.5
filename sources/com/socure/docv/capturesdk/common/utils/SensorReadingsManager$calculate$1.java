package com.socure.docv.capturesdk.common.utils;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kw5(c = "com.socure.docv.capturesdk.common.utils.SensorReadingsManager", f = "SensorReadingsManager.kt", l = {197}, m = "calculate")
/* loaded from: classes5.dex */
public final class SensorReadingsManager$calculate$1 extends q55 {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SensorReadingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensorReadingsManager$calculate$1(SensorReadingsManager sensorReadingsManager, Continuation<? super SensorReadingsManager$calculate$1> continuation) {
        super(continuation);
        this.this$0 = sensorReadingsManager;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.calculate(this);
    }
}
