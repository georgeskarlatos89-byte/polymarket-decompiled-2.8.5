package com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a implements Function1 {
    public final /* synthetic */ Function1 a;

    public a(Function1 function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((ResponseBody) obj).getClass();
        this.a.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
