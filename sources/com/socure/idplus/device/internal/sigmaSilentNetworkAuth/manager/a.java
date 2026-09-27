package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ Function1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(1);
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((ResponseBody) obj).getClass();
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        this.a.invoke(com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.c.a);
        return Unit.INSTANCE;
    }
}
