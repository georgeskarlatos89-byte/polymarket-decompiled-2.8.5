package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i extends Lambda implements Function1 {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(1);
        this.a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.socure.idplus.device.internal.network.a aVar = (com.socure.idplus.device.internal.network.a) obj;
        aVar.getClass();
        g gVar = this.a;
        SigmaDeviceError sigmaDeviceError = SigmaDeviceError.DataFetchError;
        String str = aVar.c;
        if (str == null) {
            str = "Unable to create session";
        }
        gVar.invoke(sigmaDeviceError, str);
        return Unit.INSTANCE;
    }
}
