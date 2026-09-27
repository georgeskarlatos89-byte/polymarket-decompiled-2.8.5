package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SilentNetworkAuthCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.error.SilentNetworkAuthError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o extends Lambda implements Function2 {
    public final /* synthetic */ SilentNetworkAuthCallback a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SilentNetworkAuthCallback silentNetworkAuthCallback) {
        super(2);
        this.a = silentNetworkAuthCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        ((SigmaDeviceError) obj).getClass();
        str.getClass();
        this.a.onError(SilentNetworkAuthError.UnknownError, str);
        return Unit.INSTANCE;
    }
}
