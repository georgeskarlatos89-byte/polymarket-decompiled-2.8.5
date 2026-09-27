package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends Lambda implements Function1 {
    public static final e a = new e();

    public e() {
        super(1);
    }

    public static void a(com.socure.idplus.device.internal.network.a aVar) {
        aVar.getClass();
        com.socure.idplus.device.internal.logger.b.a("SigmaDeviceSessionManager", "Error uploading network data with error code: " + aVar.b + " and message: " + aVar.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((com.socure.idplus.device.internal.network.a) obj);
        return Unit.INSTANCE;
    }
}
