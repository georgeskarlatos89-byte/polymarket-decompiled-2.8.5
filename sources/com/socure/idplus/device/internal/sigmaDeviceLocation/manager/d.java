package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.a.a(location);
        }
        return Unit.INSTANCE;
    }
}
