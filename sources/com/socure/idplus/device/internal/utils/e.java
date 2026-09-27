package com.socure.idplus.device.internal.utils;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ com.socure.idplus.device.internal.viewModel.deviceV2.e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.socure.idplus.device.internal.viewModel.deviceV2.e eVar) {
        super(1);
        this.a = eVar;
    }

    public final void a(Throwable th) {
        th.getClass();
        Objects.toString(th);
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        this.a.a(null, a.OTHER);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
