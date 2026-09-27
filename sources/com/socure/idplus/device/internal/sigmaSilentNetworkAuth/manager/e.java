package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.manager;

import defpackage.fq8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ fq8 a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function1 function1, f fVar) {
        super(1);
        this.a = (fq8) function1;
        this.b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, fq8] */
    public final void a(com.socure.idplus.device.internal.network.a aVar) {
        aVar.getClass();
        String str = aVar.c;
        com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
        this.a.invoke(f.a(this.b, aVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((com.socure.idplus.device.internal.network.a) obj);
        return Unit.INSTANCE;
    }
}
