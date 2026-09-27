package com.socure.idplus.device.internal.behavior.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends Lambda implements Function2 {
    public static final b a = new b();

    public b() {
        super(2);
    }

    public static void a(SigmaDeviceError sigmaDeviceError, String str) {
        sigmaDeviceError.getClass();
        str.getClass();
        Objects.toString(sigmaDeviceError);
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((SigmaDeviceError) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
