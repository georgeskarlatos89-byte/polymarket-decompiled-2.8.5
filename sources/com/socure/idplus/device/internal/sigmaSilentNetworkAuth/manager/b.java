package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.manager;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, f fVar) {
        super(1);
        this.a = function1;
        this.b = fVar;
    }

    public final void a(com.socure.idplus.device.internal.network.a aVar) {
        aVar.getClass();
        Objects.toString(aVar);
        com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
        this.a.invoke(f.a(this.b, aVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((com.socure.idplus.device.internal.network.a) obj);
        return Unit.INSTANCE;
    }
}
