package com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b implements Function1 {
    public final /* synthetic */ Function1 a;

    public b(Function1 function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.socure.idplus.device.internal.network.a aVar = (com.socure.idplus.device.internal.network.a) obj;
        aVar.getClass();
        this.a.invoke(aVar);
        return Unit.INSTANCE;
    }
}
