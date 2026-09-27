package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationServices;
import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import com.socure.idplus.device.internal.input.producer.f;
import defpackage.qmf;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e {
    public final com.socure.idplus.device.internal.thread.e a;
    public final boolean b;
    public final com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a c;
    public final f d;

    public e(com.socure.idplus.device.internal.thread.e eVar, boolean z) {
        eVar.getClass();
        this.a = eVar;
        this.b = z;
        this.c = new com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a();
        f fVar = new f(eVar);
        fVar.c = true;
        this.d = fVar;
    }

    public final void a(Location location) {
        boolean z;
        if (location == null) {
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return;
        }
        f fVar = this.d;
        float f = 1100.0f;
        if (!this.b && location.getAccuracy() < 1100.0f) {
            z = true;
        } else {
            z = false;
        }
        double latitude = location.getLatitude();
        if (z) {
            latitude = Math.rint(latitude * 100.0d) / 100.0d;
        }
        double d = latitude;
        double longitude = location.getLongitude();
        if (z) {
            longitude = Math.rint(longitude * 100.0d) / 100.0d;
        }
        double d2 = longitude;
        if (!z) {
            f = location.getAccuracy();
        }
        fVar.a(new LocationEvent(SystemClock.uptimeMillis(), d, d2, f, location.getAltitude(), com.socure.idplus.device.internal.viewModel.location.c.a(location, com.socure.idplus.device.internal.viewModel.location.a.VERTICAL_ACCURACY), location.getBearing(), com.socure.idplus.device.internal.viewModel.location.c.a(location, com.socure.idplus.device.internal.viewModel.location.a.BEARING_ACCURACY), location.getSpeed(), com.socure.idplus.device.internal.viewModel.location.c.a(location, com.socure.idplus.device.internal.viewModel.location.a.SPEED_ACCURACY)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    public final void a(Context context) {
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        boolean isProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
        ?? obj = new Object();
        if (isProviderEnabled && GoogleApiAvailability.e.b(context, com.google.android.gms.common.a.a) == 0) {
            com.socure.idplus.device.internal.viewModel.location.c.a(context, LocationServices.a(context), new a(obj, this));
        } else {
            obj.a = true;
            a(com.socure.idplus.device.internal.viewModel.location.c.a(context));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new qmf((Object) obj, this, context, 11), 5000L);
    }

    public static final void a(Ref.a aVar, e eVar, Context context) {
        if (aVar.a) {
            return;
        }
        eVar.a(com.socure.idplus.device.internal.viewModel.location.c.a(context));
    }
}
