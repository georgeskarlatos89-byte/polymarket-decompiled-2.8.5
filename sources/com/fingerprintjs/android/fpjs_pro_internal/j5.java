package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.location.LocationManager;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class j5 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int j = 0;
    public static int k = 1;
    public final /* synthetic */ k5 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(k5 k5Var, String str) {
        super(1);
        this.h = k5Var;
        this.i = str;
    }

    public final Location a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        j = (k + 105) % 128;
        int i = k5.d + 63;
        k5.e = i % 128;
        int i2 = i % 2;
        k5 k5Var = this.h;
        if (i2 != 0) {
            LocationManager locationManager = k5Var.b;
            locationManager.getClass();
            Location lastKnownLocation = locationManager.getLastKnownLocation(this.i);
            int i3 = j;
            k = ((i3 ^ 73) + ((i3 & 73) << 1)) % 128;
            return lastKnownLocation;
        }
        LocationManager locationManager2 = k5Var.b;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        k = (j + 15) % 128;
        Location a = a(safeWithTimeoutProContext);
        int i = k + 33;
        j = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
        return a;
    }
}
