package com.socure.idplus.device.internal.input.producer;

import android.os.SystemClock;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.socure.idplus.device.internal.thread.e eVar) {
        super(11, eVar);
        eVar.getClass();
        this.c = true;
    }

    public final void a(LifeCycleType lifeCycleType) {
        lifeCycleType.getClass();
        a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((LifeCycleType) obj);
        return Unit.INSTANCE;
    }
}
