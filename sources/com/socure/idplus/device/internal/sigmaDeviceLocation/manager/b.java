package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ e a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Context context) {
        super(0);
        this.a = eVar;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a(this.b);
        return Unit.INSTANCE;
    }
}
