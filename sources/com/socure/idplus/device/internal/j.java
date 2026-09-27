package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j extends Lambda implements Function2 {
    public final /* synthetic */ SessionTokenCallback a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SessionTokenCallback sessionTokenCallback) {
        super(2);
        this.a = sessionTokenCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.socure.idplus.device.internal.sigmaDeviceSession.b bVar = (com.socure.idplus.device.internal.sigmaDeviceSession.b) obj;
        bVar.getClass();
        ((SigmaDeviceConfigResponse) obj2).getClass();
        this.a.onComplete(bVar.a);
        return Unit.INSTANCE;
    }
}
