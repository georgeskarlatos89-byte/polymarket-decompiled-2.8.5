package com.socure.idplus.device.internal.input.producer;

import com.socure.idplus.device.internal.mediaDevice.model.MediaDeviceEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.socure.idplus.device.internal.thread.e eVar) {
        super(13, eVar);
        eVar.getClass();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MediaDeviceEvent mediaDeviceEvent = (MediaDeviceEvent) obj;
        mediaDeviceEvent.getClass();
        a(mediaDeviceEvent);
        return Unit.INSTANCE;
    }
}
