package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import io.intercom.android.sdk.metrics.MetricTracker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t3l extends ww8 {
    public final vpi a;

    public t3l(Context context, Looper looper, r64 r64Var, vpi vpiVar, gw4 gw4Var, eid eidVar) {
        super(context, looper, 270, r64Var, gw4Var, eidVar);
        this.a = vpiVar;
    }

    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof m3l) {
            return (m3l) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return w2l.c;
    }

    @Override // defpackage.z81
    public final Bundle getGetServiceRequestExtraArgs() {
        vpi vpiVar = this.a;
        vpiVar.getClass();
        Bundle bundle = new Bundle();
        String str = vpiVar.a;
        if (str != null) {
            bundle.putString(MetricTracker.Place.API, str);
        }
        return bundle;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.z81
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
