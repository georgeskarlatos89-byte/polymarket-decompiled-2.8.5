package com.socure.idplus.device.internal.input.producer;

import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.socure.idplus.device.internal.thread.e eVar) {
        super(10, eVar);
        eVar.getClass();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocationEvent locationEvent = (LocationEvent) obj;
        locationEvent.getClass();
        a(locationEvent);
        return Unit.INSTANCE;
    }
}
