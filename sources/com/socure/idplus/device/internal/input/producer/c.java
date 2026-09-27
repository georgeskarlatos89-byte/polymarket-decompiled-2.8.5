package com.socure.idplus.device.internal.input.producer;

import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.socure.idplus.device.internal.thread.e eVar) {
        super(9, eVar);
        eVar.getClass();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputChangeEvent inputChangeEvent = (InputChangeEvent) obj;
        inputChangeEvent.getClass();
        a(inputChangeEvent);
        return Unit.INSTANCE;
    }
}
