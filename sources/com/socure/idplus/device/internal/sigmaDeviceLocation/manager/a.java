package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ Ref.a a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Ref.a aVar, e eVar) {
        super(1);
        this.a = aVar;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.a = true;
        this.b.a((Location) obj);
        return Unit.INSTANCE;
    }
}
