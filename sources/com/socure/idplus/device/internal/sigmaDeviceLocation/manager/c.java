package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends Lambda implements Function2 {
    public final /* synthetic */ Function2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function2 function2) {
        super(2);
        this.a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SigmaDeviceError sigmaDeviceError = (SigmaDeviceError) obj;
        String str = (String) obj2;
        sigmaDeviceError.getClass();
        str.getClass();
        this.a.invoke(sigmaDeviceError, str);
        return Unit.INSTANCE;
    }
}
