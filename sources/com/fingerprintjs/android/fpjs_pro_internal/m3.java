package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m3 implements LocationListener {
    public /* synthetic */ f2 a;
    public /* synthetic */ o3 b;

    public static /* synthetic */ void a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i2);
        int i8 = ~(i2 | i4);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i2;
        int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
        int i13 = ~i4;
        int i14 = i12 | (~(i13 | i3 | i2));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = 1274019840 * i5;
        int i17 = ((-325058560) * i6) + ((-1660944384) * i) + i16 + ((-2001489518) * i15) + (i14 * (-2001489518)) + (2001489518 * i9) + ((-1019457937) * i2) + ((i3 * (-1019457937)) - 559939584);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i6, 1167700406, (1962400304 * i) + i3 + i2 + i5);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 1407582208, (i6 * (-873382486)) + (i * (-1621399344)) + (i5 * (-1629561329)) + (i15 * 910) + (i14 * 910) + (i9 * (-910)) + (i2 * (-1629562239)) + ((i3 * (-1629562239)) - 1134582380), -1895432192, (867827712 * a) + i17) != 1) {
            m3 m3Var = (m3) objArr[0];
            ((ax) m3Var.a).b((Location) objArr[1]);
            LocationManager a2 = o3.a(m3Var.b);
            a2.getClass();
            a2.removeUpdates(m3Var);
            return;
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        a(new Object[]{this, location}, i4.a(), -1888410409, 1888410409, i4.a(), i4.a(), i4.a());
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        a(new Object[]{this, str}, i4.a(), 2111490465, -2111490464, i4.a(), i4.a(), i4.a());
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
